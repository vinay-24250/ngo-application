package com.application.NGO.Controller;

import com.application.NGO.Model.Donor;
import com.application.NGO.Service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/donors")
@RequiredArgsConstructor
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping
    public Donor create(@RequestBody Donor donor) {
        return donorService.save(donor);
    }

    @GetMapping
    public List<Donor> getAll() {
        return donorService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        donorService.delete(id);
    }
}

