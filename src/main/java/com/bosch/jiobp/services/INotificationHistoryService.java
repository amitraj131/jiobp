package com.bosch.jiobp.services;

import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.model.NotificationHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface INotificationHistoryService {

    public List<NotificationHistory> getNotificationHistory();

    public ResponseEntity<NotificationHistory> getNotificationHistoryById(String notificationId);

    public ResponseEntity<NotificationHistory> deleteNotification(String notificationId);

    List<NotificationHistory> getNotificationByFleetId(String query);


    //void deleteNotificationByVehicleNo(String query);

}
