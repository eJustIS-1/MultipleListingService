package com.example.multiplelistingservice.repository;

import com.example.multiplelistingservice.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ListingRepository extends JpaRepository<Listing, Long> {

    // Custom query methods (if needed)

    // Example of a custom query method to find listings by title
    List<Listing> findByTitle(String title);

    // Example of a custom query method to find listings by description
    List<Listing> findByDescription(String description);

    // Example of a custom query method to find listings by price less than a
    // certain value
    List<Listing> findByPriceLessThan(double price);

    // Example of a custom query method to find listings by price greater than a
    // certain value
    List<Listing> findByPriceGreaterThan(double price);

    // Example of a custom query method to find listings by title and description
    List<Listing> findByTitleAndDescription(String title, String description);

    // Example of a custom query method to find a single listing by title
    Optional<Listing> findFirstByTitle(String title);

    // Example of a custom query method to check if a listing with a given title
    // exists
    boolean existsByTitle(String title);

    // You can add more custom query methods here as needed
}
