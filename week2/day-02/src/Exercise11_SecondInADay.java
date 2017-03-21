/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise11_SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        System.out.println(24*60*60 - ((currentHours*60*60) + (currentMinutes*60) + currentSeconds));
        System.out.println(24*60*60);

    }
}
