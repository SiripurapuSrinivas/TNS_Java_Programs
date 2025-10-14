package com.tnsif.example.certificate.services;


import com.tnsif.example.certificate.model.Certificate;
import com.tnsif.example.certificate.repo.CertificateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateServices {

    @Autowired
    private CertificateRepo certificateRepo;

    // Save or add a single certificate
    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepo.save(certificate);
    }

    // Get all certificates
    public List<Certificate> getAllCertificates() {
        return certificateRepo.findAll();
    }

    // Get certificate by ID
    public Optional<Certificate> getCertificateById(Long id) {
        return certificateRepo.findById(id);
    }

    // Delete certificate by ID
    public void deleteCertificate(Long id) {
        certificateRepo.deleteById(id);
    }

    // Update certificate by ID
    public Certificate updateCertificate(Long id, Certificate certificateDetails) {
        Optional<Certificate> optionalCertificate = certificateRepo.findById(id);

        if (optionalCertificate.isPresent()) {
            Certificate existingCertificate = optionalCertificate.get();

            // Update fields
            existingCertificate.setCollege(certificateDetails.getCollege());
            existingCertificate.setYear(certificateDetails.getYear());

            return certificateRepo.save(existingCertificate);
        } else {
            return null; // or throw a custom exception
        }
    }
}
