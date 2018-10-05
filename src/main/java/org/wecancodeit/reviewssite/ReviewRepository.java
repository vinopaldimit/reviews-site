package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		String[] tags1 =  {"album","music","review"};
		addReview(new Review(1L, "This Album Is Bad", "/images/music.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
				"music", "Sheet music with ear buds draped over it.", "Sheet Music", tags1));
		
		String[] tags2 =  {"film","movie","review"};
		addReview(new Review(2L, "I Hate This Movie With A Burning Passion",
				"/images/film.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
				"Film", "An old camera.", "Camera", tags2));
	}

	public Collection<Review> getAllReviews() {
		return reviews.values();
	}

	public void addReview(Review review) {
		reviews.put(review.getId(), review);
	}

	public Review getReview(long id) {
		return reviews.get(id);
	}
}
