package com.cmed.prescription.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PrescriptionReqDto {

    private String patientName;

    private LocalDate prescriptionDate;
}
