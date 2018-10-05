## Controller
- ReviewsController
	- annotation
	- route reviews
	- route review

## Model
- Review
	- id
	- title
	- image url
	- review category
	- content
	- optional
		- date
		- desc
		- tags (searchable?)
	- accessor methods
- ReviewRepository
	- stores reviews in a map
	- get collection
	- get specific review
	- proper annotations

## View
- reviews
	- shows all reviews
- review
	- shows all details
	- shows picture