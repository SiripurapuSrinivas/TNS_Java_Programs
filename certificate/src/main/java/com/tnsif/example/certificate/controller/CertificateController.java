package com.tnsif.example.certificate.controller;


import com.tnsif.example.certificate.model.Certificate;
import com.tnsif.example.certificate.services.CertificateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    @Autowired
    private CertificateServices certificateService; // Fixed name to match service class

    // Create a certificate
    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return certificateService.saveCertificate(certificate);
    }

    // Get all certificates
    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateService.getAllCertificates();
    }

    // Get certificate by ID
    @GetMapping("/{id}")
    public Optional<Certificate> getCertificateById(@PathVariable Long id) {
        return certificateService.getCertificateById(id);
    }

    // Delete certificate by ID
    @DeleteMapping("/{id}")
    public String deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
        return "Certificate deleted successfully!";
    }
}
