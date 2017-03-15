/**
 * 
 */
package cn.shuyouliu.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zywx
 *
 */
public class StreamApi {
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

		@Override
		public String toString() {
			return "{author:"+this.author+",title:"+this.title+",tags:["+this.tags.toString()+"]}";
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StreamApi sa = new StreamApi();
		Article a =  sa.getFirstJavaArticle_v1();
		System.out.println(a);
		Optional<Article> b =  sa.getFirstJavaArticle();
		System.out.println(b);
	}

	public Article getFirstJavaArticle_v1() {
		for (Article article : articles) {
			if (article.getTags().contains("Tom")) {
				return article;
			}
		}

		return null;
	}
	public Optional<Article> getFirstJavaArticle() {  
	    return articles.stream()
	        .filter(article -> article.getTags().contains("Jerry"))
	        .findFirst();
	    }
	
	private  List<String > tags = new ArrayList<String>(Arrays.asList("Tom", "Jerry", "Mike"));
	private List<Article> articles = new ArrayList<StreamApi.Article>(Arrays.asList(new Article("t001","a001",tags),new Article("t002","a002",tags)));
	// 不能用 stream private  Article articles[] = {new Article("t001","a001",tags),new Article("t002","a002",tags)};

}

