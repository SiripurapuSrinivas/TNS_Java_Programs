package com.tnsif.example.certificate.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.example.certificate.model.Certificate;

@Repository  // optional but recommended
public interface CertificateRepo extends JpaRepository<Certificate, Long> {
    // No extra code needed
}