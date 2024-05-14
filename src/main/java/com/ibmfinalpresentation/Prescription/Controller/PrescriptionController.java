package com.ibmfinalpresentation.Prescription.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import com.ibmfinalpresentation.Prescription.Model.Prescription;
import com.ibmfinalpresentation.Prescription.ServiceImpl.PrescriptionServiceImpl;
import com.ibmfinalpresentation.Prescription.model.Prescription;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionServiceImpl prescriptionService;

    @PostMapping("/add")
    public ResponseEntity<Prescription> addPrescription(@RequestBody Prescription prescription) {
        Prescription addedPrescription = prescriptionService.addPrescription(prescription);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedPrescription);
    }
}
