import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 03. 27..
 */
public class Ex_01_Lotto {
  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>();
    try {
      Path path = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(path);
      for (String line : lines){
        String[] csvColums = line.split(";");
        numbers.add(csvColums[11]);
        numbers.add(csvColums[12]);
        numbers.add(csvColums[13]);
        numbers.add(csvColums[14]);
        numbers.add(csvColums[15]);
      }
      numbers.toString()
    }
    catch (Exception e) {
      e.printStackTrace();
    }

  }
}