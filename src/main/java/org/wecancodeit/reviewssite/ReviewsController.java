package org.wecancodeit.reviewssite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReviewsController {
	
	private ReviewRepository reviewRepo = new ReviewRepository();
	
	@GetMapping("/reviews")
	public String courses(Model model) {
		model.addAttribute("reviews", reviewRepo.getAllReviews());
        return "reviews";
    }
	
    @GetMapping("/reviews/{id}")
    public String course(@PathVariable(value = "id") Long id, Model model) {
    	model.addAttribute("review", reviewRepo.getReview(id));
        return "review";
    }

}
