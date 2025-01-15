package dev.usamaidrsk.movies.reviews;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    // public void deleteReview(String id) {
    //     reviewRepository.deleteById(id);
    // }

    // public Review getReviewById(String id) {
    //     return reviewRepository.findById(id).orElse(null);
    // }
}
