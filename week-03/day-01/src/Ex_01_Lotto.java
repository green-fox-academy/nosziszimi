import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Nóra on 2017. 03. 27..
 */
public class Ex_01_Lotto {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(path);
      for (String line : lines){
        String[] array = line.split(";");
        System.out.println(array[11]);
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }

  }
}