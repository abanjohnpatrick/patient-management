package com.noir.patientservice.service;

import com.noir.patientservice.dto.PatientResponseDTO;
import com.noir.patientservice.mapper.PatientMapper;
import com.noir.patientservice.model.Patient;
import com.noir.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDTO).toList();

    }
}
