package com.noir.patientservice.mapper;

import com.noir.patientservice.dto.PatientResponseDTO;
import com.noir.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDto = new PatientResponseDTO();
        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.getName());
        patientDto.setEmail(patient.getEmail());
        patientDto.setAddress(patient.getAddress());
        patientDto.setDateofBirth(patient.getDateOfBirth().toString());
        return patientDto;
    }
}
