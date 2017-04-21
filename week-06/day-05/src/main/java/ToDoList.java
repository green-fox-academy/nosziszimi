import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Nóra on 2017. 04. 06..
 */
public class ToDoList {
  Path path;
  File file;
  ArrayList<ToDo> tasks;
  ArrayList<String> linesOfFile;

  public ToDoList() {
    path = Paths.get("src/main/resources/tasks.csv");
    file = new File(String.valueOf(path));
    tasks = new ArrayList<>();
    linesOfFile = new ArrayList<>();
  }

  void readInFile() {
    try {
      Scanner fileScanner = new Scanner(file);
      while (fileScanner.hasNext()) {
        linesOfFile.add(fileScanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  void linesToTodo() {
    ToDo.counter = Integer.parseInt(linesOfFile.get(0));
    String[] columns;
    for (int i = 1; i < linesOfFile.size(); i++) {
      columns = linesOfFile.get(i).split(";");
      tasks.add(new ToDo(columns[0], columns[1], Integer.parseInt(columns[2])));
    }
  }

  void listOfToDoFromFile() {
    readInFile();
    linesToTodo();
  }

  void writeListToFile() {
    List<String> lines = new ArrayList<>();
    for (int j = 0; j < tasks.size(); j++ ) {
      String check;
      String line;
      if (tasks.get(j).isDone) {
        check = "[x]";
      } else {
        check = "[ ]";
      }
      line = check + ";" + tasks.get(j).task + ";" + tasks.get(j).id;
      lines.add(line);
      lines.add(0, Integer.toString(ToDo.counter));
      try {
        Files.write(path, lines);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  void list() {
    listOfToDoFromFile();
    String check;
    int i = 1;
    System.out.println();
    if (tasks.size() > 0) {
      for (ToDo todo : tasks) {
        if (todo.isDone) {
          check = "[x]";
        } else {
          check = "[ ]";
        }
        System.out.println(i + " - " + "id: " + todo.id+ " " + check + " " + todo.task);
        i++;
      }
    } else {
      System.out.println("No todos for today! :)");
    }
  }

  void add(String[] args) {
    listOfToDoFromFile();
    if (args.length >= 2) {
      tasks.add(new ToDo(args[1]));
    } else {
      System.out.println();
      System.out.println("Unable to add: no task provided");
    }
    writeListToFile();
  }

  void check(String[] args) {
    listOfToDoFromFile();
    try {
      int index = Integer.parseInt(args[1]);
      tasks.get(index - 1).isDone = true;
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println();
      System.out.println("Unable to check: no index provided");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println();
      System.out.println("Unable to check: index is out of bound");
    } catch (NumberFormatException ex) {
      System.out.println();
      System.out.println("Unable to check: index is not a number");
    }
    writeListToFile();
  }

  void remove(String[] args) {
    listOfToDoFromFile();
    try {
      int index = Integer.parseInt(args[1]);
      tasks.remove(index-1);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println();
      System.out.println("Unable to remove: no index provided");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println();
      System.out.println("Unable to remove: index is out of bound");
    } catch (NumberFormatException ex) {
      System.out.println();
      System.out.println("Unable to remove: index is not a number");
    }
    writeListToFile();
  }
}

