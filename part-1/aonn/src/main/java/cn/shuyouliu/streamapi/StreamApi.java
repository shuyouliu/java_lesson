/**
 * 
 */
package streamapi;


/**
 * @author zywx
 *
 */
public class StreamApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StreamApi sa = new StreamApi();
		Article a =  sa.getFirstJavaArticle_old();
		System.out.println(a);
	}

	public Article getFirstJavaArticle() {
		for (Article article : articles) {
			if (article.getTags().contains("Java")) {
				return article;
			}
		}

		return null;
	}

}

private class Article {

	private final String title;
	private final String author;
	private final List<String> tags;

	private Article(String title, String author, List<String> tags) {
		this.title = title;
		this.author = author;
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public List<String> getTags() {
		return tags;
	}
}