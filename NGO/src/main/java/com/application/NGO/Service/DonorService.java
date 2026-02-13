package com.application.NGO.Service;

import com.application.NGO.Model.Donor;
import com.application.NGO.Repository.DonorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;

    public Donor save(Donor donor) {
        return donorRepository.save(donor);
    }

    public List<Donor> findAll() {
        return donorRepository.findAll();
    }

    public void delete(Long id) {
        donorRepository.deleteById(id);
    }
}
