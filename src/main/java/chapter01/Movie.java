package chapter01;

/**
 * Created by Wayne on 2016. 8. 23..
 *
 */
public class Movie {
	public static final int CHILDNERS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
}
