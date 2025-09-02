package com.cmed.prescription.controller;

import com.cmed.prescription.constant.ApiUrlConstant;
import com.cmed.prescription.dto.CreateUserReqDto;
import com.cmed.prescription.dto.LoginReqDto;
import com.cmed.prescription.dto.PrescriptionReqDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommonController {

    @PostMapping(value = ApiUrlConstant.LOGIN)
    public ResponseEntity<?> authLogin(@RequestBody @Valid LoginReqDto loginReqDto) {
        return null;
    }

    @PostMapping(value = ApiUrlConstant.USER_REGISTRATION)
    public ResponseEntity<?> createUser(@RequestBody @Valid CreateUserReqDto createUserReqDto) {
        return null;
    }

    @PostMapping(value = ApiUrlConstant.CREATE_PRESCRIPTION)
    public ResponseEntity<?> createPrescription(@RequestBody @Valid PrescriptionReqDto prescriptionReqDto) {
        return null;
    }

    @GetMapping(value = ApiUrlConstant.GET_PRESCRIPTION)
    public ResponseEntity<?> getPrescriptionById() {
        return null;
    }

    @GetMapping(value = ApiUrlConstant.GET_PRESCRIPTION_BY_ID)
    public ResponseEntity<?> getPrescriptionById(@RequestParam("id") Long id) {
        return null;
    }

    @PostMapping(value = ApiUrlConstant.UPDATE_PRESCRIPTION)
    public ResponseEntity<?> updatePrescription(@RequestBody PrescriptionReqDto prescriptionReqDto) {
        return null;
    }

    @DeleteMapping(value = ApiUrlConstant.DELETE_PRESCRIPTION)
    public ResponseEntity<?> deletePrescription(@RequestParam("id") Long id) {
        return null;
    }
}
