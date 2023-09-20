package com.bosch.jiobp.repository;

import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.model.NotificationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface INotificationHistoryRepository extends JpaRepository<NotificationHistory, String> {
    @Query("SELECT n FROM NotificationHistory n WHERE " +
            "n.fleetId LIKE CONCAT('%',:query, '%')")
    List<NotificationHistory> getNotificationByFleetId(String query);

//    @Query("DELETE nhr FROM NotificationHistory nhr WHERE " +
//            "nhr.vehicleNo LIKE CONCAT('%',:query, '%')")
//    void deleteNotificationByVehicleNo(String query);
}
