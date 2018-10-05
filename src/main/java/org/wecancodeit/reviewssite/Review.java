package org.wecancodeit.reviewssite;


public class Review {
	Long id;
	String title, imageUrl, content, category, desc, imageCaption, imageDesc, tagString;
	String[] tags; //there is probably a better way to do this, oops

	//not used, kept for testing
	public Review(Long id, String title, String imageUrl, String content, String category) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.content = content;
		this.category = category;
		this.desc = content.substring(0, 40);
		this.imageDesc = "";
		this.imageCaption = "";
	}
	
	public Review(Long id, String title, String imageUrl, String content, String category, String imageDesc, String imageCaption, String[] tags) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.content = content;
		this.category = category;
		this.desc = content.substring(0, 40);
		this.imageDesc = imageDesc;
		this.imageCaption = imageCaption;
		this.tags = tags;
		this.tagString = tagToString();
	}
	
	public String getTagString() {
		return tagString;
	}
	
	public String getImageCaption() {
		return imageCaption;
	}

	public String getImageDesc() {
		return imageDesc;
	}

	public String tagToString() {
		String tagString = "";
		for(int i = 0; i < tags.length - 1; i++) {
			tagString += tags[i] + ", ";
		}
		tagString += tags[tags.length - 1];
		return tagString;
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
	
	public String getDesc() {
		return desc;
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
