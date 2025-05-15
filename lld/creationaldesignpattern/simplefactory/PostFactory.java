package lld.creationaldesignpattern.simplefactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {
    public static Post createPost(String post){
        switch (post){
            case "blog"-> {
                return new BlogPost();
            }
            case "news"-> {
                return new NewsPost();
            }
            case "product"->{
                return new ProductPost();
            }
            default -> throw new IllegalArgumentException("post unknown");
        }
    }

}
