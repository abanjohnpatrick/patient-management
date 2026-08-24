package com.noir.patientservice.mapper;

import com.noir.patientservice.dto.PatientRequestDTO;
import com.noir.patientservice.dto.PatientResponseDTO;
import com.noir.patientservice.model.Patient;

import java.time.LocalDate;
import java.util.UUID;

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

    public static Patient toModel(PatientRequestDTO patientDto) {
        Patient patient = new Patient();

        patient.setName(patientDto.getName());
        patient.setEmail(patientDto.getEmail());
        patient.setAddress(patientDto.getAddress());
        patient.setRegisteredDate(LocalDate.parse(patientDto.getRegisteredDate()));
        patient.setDateOfBirth(LocalDate.parse(patientDto.getDateOfBirth()));
        return patient;
    }
}
