package com.application.NGO.Service;

import com.application.NGO.Model.Donation;
import com.application.NGO.Repository.DonationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    public Donation save(Donation donation) {
        return donationRepository.save(donation);
    }

    public List<Donation> findAll() {
        return donationRepository.findAll();
    }

    public List<Donation> findByDonor(Long donorId) {
        return donationRepository.findByDonorId(donorId);
    }
}
