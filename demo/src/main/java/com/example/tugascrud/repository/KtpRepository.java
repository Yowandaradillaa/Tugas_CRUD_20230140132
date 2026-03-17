package com.example.tugascrud.repository;

import com.example.tugascrud.entity.KTP;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KtpRepository extends JpaRepository<KTP, Integer> {
    Optional<KTP> findByNik(String nik);
}