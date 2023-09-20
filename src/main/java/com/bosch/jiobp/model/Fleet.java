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
@Table(name = "fleet")
public class Fleet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fleet_id")
    private String fleetId;

    @Column(name = "fleet_name")
    private String fleetName;

    @Column(name = "fleet_size")
    private String fleetSize;

    @Column(name = "date_time")
    private String dateTime;
}