package com.bosch.jiobp.services.impl;

import com.bosch.jiobp.exception.ResourceNotFoundException;
import com.bosch.jiobp.model.NotificationHistory;
import com.bosch.jiobp.repository.INotificationHistoryRepository;
import com.bosch.jiobp.services.INotificationHistoryService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class NotificationHistoryServiceImpl implements INotificationHistoryService {

    @Autowired
    private INotificationHistoryRepository notificationHistoryRepository;

    @Override
    public List<NotificationHistory> getNotificationHistory() {
        return notificationHistoryRepository.findAll();
    }

    @Override
    public ResponseEntity<NotificationHistory> getNotificationHistoryById(String notificationId) {
        NotificationHistory notificationHistory = notificationHistoryRepository.findById(notificationId)
                .orElseThrow(() -> new ResourceNotFoundException("Fleet not exist with id:" + notificationId));
        return ResponseEntity.ok(notificationHistory);
    }

    @Override
    public ResponseEntity<NotificationHistory> deleteNotification(String notificationId) {
        NotificationHistory notificationHistory = notificationHistoryRepository.findById(notificationId)
                .orElseThrow(() -> new ResourceNotFoundException("Fleet not exist with id: " + notificationId));

        notificationHistoryRepository.delete(notificationHistory);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public List<NotificationHistory> getNotificationByFleetId(String query) {
        List<NotificationHistory> notifications = notificationHistoryRepository.getNotificationByFleetId(query);
        return notifications;
    }

//    void deleteNotificationByVehicleNo(String query) {
//        NotificationHistory notify = notificationHistoryRepository.deleteNotificationByVehicleNo(query);
//
//    }
}
