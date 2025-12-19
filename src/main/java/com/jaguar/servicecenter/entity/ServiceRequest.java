package com.jaguar.servicecenter.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNumber;

    private String customerName;

    private String issueDescription;

    @Enumerated(EnumType.STRING)
    private ServiceStatus status;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "assigned_technician_id")
    private User assignedTechnician;
}
