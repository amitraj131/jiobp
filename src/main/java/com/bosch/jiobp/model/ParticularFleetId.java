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
@Table(name = "particular_fleet_id")

public class ParticularFleetId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_no")
    private String vehicleNo;

    //@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="Fleet", referencedColumnName = "fleetId")
    @Column(name = "fleet_id")
    private String fleetId;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "date")
    private String date;

    @Column(name ="battery_type")
    private String batteryType;

    @Column(name = "battery_installation_date")
    private String batteryInstallationDate;

    @Column(name = "battery_expiration_date")
    private String batteryExpirationDate;

    @Column(name = "breakdown_risk")
    private String breakdownRisk;
}
