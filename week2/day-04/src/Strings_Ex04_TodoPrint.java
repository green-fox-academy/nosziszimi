/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Strings_Ex04_TodoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    String myToDo = "My todo: \n";
    String games = " - Download games\n";
    String diablo = "\t - Diablo";

    todoText = myToDo + todoText + games + diablo;

    System.out.println(todoText);
  }
}
