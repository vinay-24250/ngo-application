package com.application.NGO.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "donations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String purpose;

    @ManyToOne
    @JoinColumn(name = "donor_id")
    private Donor donor;
}
