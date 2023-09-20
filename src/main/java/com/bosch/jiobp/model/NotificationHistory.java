package com.bosch.jiobp.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle_notification_history")

public class NotificationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notification_id")
    private String notificationId;

    @Column(name = "notification_type")
    private String notificationType;

    @Column(name = "notification_level")
    private String notificationLevel;

    @Column(name = "vehicle_no")
    private String vehicleNo;

    @Column(name = "vehicle_type")
    private String vehicleType;

    //@CreationTimestamp
    @Column(name ="Date")
    private String date;

    //@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="Fleet", referencedColumnName = "fleetId")
    @Column(name = "fleet_id")
    private String fleetId;
}
