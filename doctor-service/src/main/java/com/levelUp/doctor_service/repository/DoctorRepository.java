package com.levelUp.doctor_service.repository;

import com.levelUp.doctor_service.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
