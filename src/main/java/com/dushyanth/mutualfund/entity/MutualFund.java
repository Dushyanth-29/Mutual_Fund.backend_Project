package com.dushyanth.mutualfund.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MutualFund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fundName;
    private String category;
    private String riskLevel;
    private double nav;
    private double returnsPercentage;
    private double minimumSip;
}