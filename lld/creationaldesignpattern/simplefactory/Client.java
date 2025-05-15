package lld.creationaldesignpattern.simplefactory;

public class Client {

	public static void main(String[] args) {
		var post = PostFactory.createPost("product");
		System.out.println(post);
	}

}
