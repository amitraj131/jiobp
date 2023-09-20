package com.bosch.jiobp.controller;


import com.bosch.jiobp.model.Deviation;
import com.bosch.jiobp.repository.IDeviationRepository;
import com.bosch.jiobp.services.IDeviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("fleets")
public class DeviationController {

    @Autowired
    private IDeviationRepository deviationRepository;

    @Autowired
    private IDeviationService deviationService;

//    @DeleteMapping("notification/{notificationId}")
//    public ResponseEntity<NotificationHistory> deleteNotification(@PathVariable String notificationId){
//        return notificationHistoryService.deleteNotification(notificationId);

    @GetMapping("{fleetId}/{vehicleNo}")
    public List<Deviation> getDeviationByFleetId(@RequestParam("query") String query){
        return deviationService.getDeviationByFleetId(query);
    }
}