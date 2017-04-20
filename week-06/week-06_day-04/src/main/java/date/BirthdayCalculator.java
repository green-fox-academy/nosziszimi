package date;

import static java.time.temporal.ChronoUnit.YEARS;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/**
 * Created by Nóra on 2017. 04. 20..
 */
public class BirthdayCalculator implements BirthdayCalculatorWithLocalDate<LocalDate>  {
  @Override
  public LocalDate parseDate(String str) {
    // TODO - return with the parsed date; format is: yyyy-MM-dd
    return LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    // TODO - return the date formatted: month & day (MM. dd.)
    String string = date.getMonthValue() + ". " + date.getDayOfMonth() + ".";
    return string;
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    // TODO - return with true if today is the same month+day as date
    LocalDate d = LocalDate.now();
    return (date.getMonth().equals(d.getMonth()) && date.getDayOfMonth() == d.getDayOfMonth());
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    // TODO - return how many years age the input date 'birthday' was
    LocalDate d = LocalDate.now();
    return (d.getYear() - birthday.getYear());
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
    LocalDate today = LocalDate.now();
    if (today.getDayOfYear() == date.getDayOfYear()) {
      return 0;
    } else if (today.getDayOfYear() > date.getDayOfYear()) {
      return LocalDate.of(today.getYear(), 12, 31).getDayOfYear()
              - today.getDayOfYear() + date.getDayOfYear();
    } else {
      return date.getDayOfYear() - today.getDayOfYear();
    }
  }

  public static void main(String[] args) {
    new BirthdayCalculator().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}
