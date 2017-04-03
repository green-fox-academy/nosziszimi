import java.util.List;

/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_13_Blog {
  List<BlogPost> blogPosts;

  public void add(BlogPost blogPost) {
    blogPosts.add(blogPost);
  }

  public void delete(int index) {
    blogPosts.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    blogPosts.set(index, blogPost);
  }

}
