package org.wecancodeit.reviewssite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	@Test
	public void shouldGetCollection() {
		ReviewRepository underTest = new ReviewRepository();
		Collection<Review> result = underTest.getAllReviews();
		assertThat(result, hasItems(new Review(1L, "This Album Is Bad",
				"https://farm3.staticflickr.com/3441/5771025070_4572fee0c4_o.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
				"music"),
				new Review(2L, "I Hate This Movie With A Burning Passion",
						"https://farm2.staticflickr.com/7083/7307394870_cafbae7e58_o.jpg",
						"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
						"Film")));
	}

	@Test
	public void shouldGetReview() {
		ReviewRepository underTest = new ReviewRepository();
		Review result = underTest.getReview(1L);
		assertThat(result, is(equalTo(new Review(1L, "This Album Is Bad",
				"https://farm3.staticflickr.com/3441/5771025070_4572fee0c4_o.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
				"music"))));
	}

}
