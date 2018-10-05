package org.wecancodeit.reviewssite;


public class Review {
	Long id;
	String title, imageUrl, content, category;
	
	public Review(Long id, String title, String imageUrl, String content, String category) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.content = content;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getContent() {
		return content;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Review other = (Review) obj;
		if (this.id.equals(other.getId())) {
			return true;
		}
		return false;
	}
	
	
}
