package com.application.NGO.Controller;

import com.application.NGO.Model.Donation;
import com.application.NGO.Service.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/donations")
@RequiredArgsConstructor
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping
    public Donation create(@RequestBody Donation donation) {
        return donationService.save(donation);
    }

    @GetMapping
    public List<Donation> getAll() {
        return donationService.findAll();
    }

    @GetMapping("/donor/{donorId}")
    public List<Donation> getByDonor(@PathVariable Long donorId) {
        return donationService.findByDonor(donorId);
    }
}
