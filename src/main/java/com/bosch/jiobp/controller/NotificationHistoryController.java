package com.bosch.jiobp.controller;

import com.bosch.jiobp.exception.ResourceNotFoundException;
import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.model.NotificationHistory;
import com.bosch.jiobp.repository.INotificationHistoryRepository;
import com.bosch.jiobp.services.INotificationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/fleets")
public class NotificationHistoryController {

    @Autowired
    private INotificationHistoryRepository notificationHistoryRepository;

    @Autowired
    private INotificationHistoryService notificationHistoryService;

    @GetMapping("notification")
    public List<NotificationHistory> getNotificationHistory(){
        return notificationHistoryService.getNotificationHistory();
    }

    @GetMapping("notification/{notificationId}")
    public ResponseEntity<NotificationHistory> getNotificationHistoryById(@PathVariable  String notificationId){
        return notificationHistoryService.getNotificationHistoryById(notificationId);
    }

    @DeleteMapping("notification/{notificationId}")
    public ResponseEntity<NotificationHistory> deleteNotification(@PathVariable String notificationId){
        return notificationHistoryService.deleteNotification(notificationId);
    }

    @GetMapping("{fleetId}/vehicles")
    public List<NotificationHistory> getNotificationByFleetId(@RequestParam("query") String query){
        return notificationHistoryService.getNotificationByFleetId(query);
    }


//    @DeleteMapping("deleteNotificationOf")
////    public ResponseEntity<NotificationHistory> delete(@RequestParam("query") String query){
////        return notificationHistoryService.deleteNotificationByVehicleNo(query);
////    }
}