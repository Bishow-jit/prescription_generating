package com.cmed.prescription.entity;

import com.cmed.prescription.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "prescription_tbl")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "prescriptionDate")
    private LocalDate prescriptionDate;

    @Column(name = "patientName")
    private String patientName;

    @Column(name = "patientAge")
    private Integer patientAge;

    @Column(name = "patientGender")
    @Enumerated(EnumType.STRING)
    private Gender patientGender;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "medicines")
    private String medicines;

    @Column(name = "nextVisitDate")
    private LocalDate nextVisitDate;
}
