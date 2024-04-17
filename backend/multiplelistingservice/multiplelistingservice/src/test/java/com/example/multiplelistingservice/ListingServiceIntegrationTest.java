// package com.example.multiplelistingservice;

// import com.example.multiplelistingservice.model.Listing;
// import com.example.multiplelistingservice.repository.ListingRepository;
// import com.example.multiplelistingservice.service.ListingService;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.transaction.annotation.Transactional;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// @SpringBootTest
// public class ListingServiceIntegrationTest {

// @Autowired
// private ListingService listingService;

// @Autowired
// private ListingRepository listingRepository;

// @Test
// @Transactional
// public void testSaveListing() {
// // Create a new listing
// Listing listing = new Listing("Test Listing", "Test Description", 100.0);

// // Save the listing
// Listing savedListing = listingService.saveListing(listing);

// // Verify that the listing was saved
// assertEquals("Test Listing", savedListing.getTitle());
// assertEquals("Test Description", savedListing.getDescription());
// assertEquals(100.0, savedListing.getPrice());
// }

// @Test
// @Transactional
// public void testFindListingById() {
// // Create a new listing
// Listing listing = new Listing("Test Listing", "Test Description", 100.0);
// Listing savedListing = listingRepository.save(listing);

// // Find the listing by ID
// Long id = savedListing.getId();
// Listing foundListing = listingService.findListingById(id).orElse(null);

// // Verify that the correct listing was found
// assertEquals(savedListing, foundListing);
// }

// // Add more test methods to validate other functionalities of the
// ListingService
// }
