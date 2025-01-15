package dev.usamaidrsk.movies.reviews;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

@Service
public class ReviewService {

    @Autowired
    private final ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(String reviewBoday, String imbId) {
      Review review = new Review(reviewBoday);

      reviewRepository.insert(review);
      mongoTemplate.update(Movie.class).matching(query(where("imdbId").is(imbId));

      return review;
    }

    // public void deleteReview(String id) {
    //     reviewRepository.deleteById(id);
    // }

    // public Review getReviewById(String id) {
    //     return reviewRepository.findById(id).orElse(null);
    // }
}
