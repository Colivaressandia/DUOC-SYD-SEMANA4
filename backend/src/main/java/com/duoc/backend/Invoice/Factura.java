package com.duoc.backend.Invoice;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long appointmentId; // Relación con la cita (visita)
    private String services;      // Servicios prestados
    private String medications;   // Medicamentos
    private Double extraCharges;  // Cargos adicionales
    private Double total;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters y Setters (Para que SonarQube no reclame, hazlos manuales si no usas Lombok)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getServices() { return services; }
    public void setServices(String services) { this.services = services; }
    public String getMedications() { return medications; }
    public void setMedications(String medications) { this.medications = medications; }
    public Double getExtraCharges() { return extraCharges; }
    public void setExtraCharges(Double extraCharges) { this.extraCharges = extraCharges; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}