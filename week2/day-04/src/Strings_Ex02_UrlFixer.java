/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Strings_Ex02_UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String modified1 = url.replace("s/", "s:/");
    String modified2 = modified1.replace("bots", "odds");
    System.out.println(modified2);
  }
}
