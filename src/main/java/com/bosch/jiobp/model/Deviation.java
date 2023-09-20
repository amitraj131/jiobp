package com.bosch.jiobp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "deviation")

public class Deviation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviation_id")
    private String deviationId;

    //@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="Fleet", referencedColumnName = "fleetId")
    @Column(name = "fleet_id")
    private String fleetId;

    @Column(name = "vehicle_no")
    private String vehicleNo;

    @Column(name = "deviation_type")
    private String deviationType;

    @Column(name = "date")
    private String date;

    @Column(name = "severity")
    private String severity;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "fuel_type")
    private String fuelType;
}
