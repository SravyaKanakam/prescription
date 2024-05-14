package com.ibmfinalpresentation.Prescription.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.ibmfinalpresentation.Prescription.model.Prescription;
import com.ibmfinalpresentation.Prescription.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl
{	

    @Autowired
    PrescriptionRepository prescriptionRepository;
    
    
	    private final Logger LOG = LoggerFactory.getLogger(this.getClass());



	    public Prescription addPrescription(Prescription prescription) 
	    {
	        LOG.info(prescription.toString());
	        return prescriptionRepository.save(prescription);
	    }
	} 
	  


