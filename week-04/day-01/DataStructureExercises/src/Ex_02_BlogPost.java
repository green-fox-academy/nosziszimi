/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_02_BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public Ex_02_BlogPost (String title, String authorName, String publicationDate, String text) {
    this.authorName = authorName;
    this.publicationDate = publicationDate;
    this.text = text;
    this.title = title;
  }

  public static void main(String[] args) {
    Ex_02_BlogPost post1 = new Ex_02_BlogPost("Lorem Ipsum", "John Doe",
            "2000.05.04", "Lorem ipsum dolor sit amet.");
    Ex_02_BlogPost post2 = new Ex_02_BlogPost("Wait but why", "Tim Urban",
            "2010.10.10", " A popular long-form, stick-figure-illustrated blog about almost everything.");
    Ex_02_BlogPost post3 = new Ex_02_BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump",
            "William Turton", "2017.03.28",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                    "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he " +
                    "wasn’t really into the whole organizer profile thing.");
  }
}
