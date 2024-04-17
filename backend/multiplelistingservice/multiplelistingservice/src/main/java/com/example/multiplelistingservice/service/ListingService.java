package com.example.multiplelistingservice.service;

import com.example.multiplelistingservice.model.Listing;
import com.example.multiplelistingservice.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListingService {

    private final ListingRepository listingRepository;

    @Autowired
    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    // Method to save a new listing
    public Listing saveListing(Listing listing) {
        return listingRepository.save(listing);
    }

    // Method to find a listing by its ID
    public Optional<Listing> findListingById(Long id) {
        return listingRepository.findById(id);
    }

    // Method to retrieve all listings
    public List<Listing> findAllListings() {
        return listingRepository.findAll();
    }

    // Method to delete a listing by its ID
    public void deleteListingById(Long id) {
        listingRepository.deleteById(id);
    }

    // Method to check if a listing with a given title exists
    public boolean doesListingWithTitleExist(String title) {
        return listingRepository.existsByTitle(title);
    }

    // You can add more methods here based on your application's requirements

}
