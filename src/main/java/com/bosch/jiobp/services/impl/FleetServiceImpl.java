package com.bosch.jiobp.services.impl;

import com.bosch.jiobp.exception.ResourceNotFoundException;
import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.model.NotificationHistory;
import com.bosch.jiobp.model.ParticularFleetId;
import com.bosch.jiobp.repository.IDeviationRepository;
import com.bosch.jiobp.repository.IFleetRepository;
import com.bosch.jiobp.repository.IParticularFleetIdRepository;
import com.bosch.jiobp.services.IFleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FleetServiceImpl implements IFleetService {
    @Autowired
    private IFleetRepository fleetRepository;

    @Autowired
    private IDeviationRepository deviationRepository;

    @Autowired
    private IParticularFleetIdRepository particularFleetIdRepository;

    @Override
    public List<Fleet> getAllFleet() {
        return fleetRepository.findAll();
    }

//    @Override
//    public ResponseEntity<Fleet> getFleetById(String fleetId) {
//        Fleet fleet = fleetRepository.findById(fleetId)
//                .orElseThrow(() -> new ResourceNotFoundException("Fleet not exist with id:" + fleetId));
//        return ResponseEntity.ok(fleet);
//    }

//    @Override
//    public ResponseEntity<Fleet> deleteAllByFleetId(String fleetId) {
//        Fleet fleet = fleetRepository.findById(fleetId)
//                .orElseThrow(() -> new ResourceNotFoundException("Fleet not exist with id: " + fleetId));
//        fleetRepository.delete(fleet);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//      @Override
//      public ResponseEntity<Fleet> deleteAllByFleetId(String query) {
//         ResponseEntity<Fleet> fleets = fleetRepository.deleteAllByFleetId(query);
//          return new ResponseEntity<>(HttpStatus.OK);
//}
//    @Override
//    public List<NotificationHistory> getNotificationByFleetId(String query) {
//        List<NotificationHistory> notifications = notificationHistoryRepository.getNotificationByFleetId(query);
//        return notifications;
//    }


    @Override
    public ResponseEntity<Fleet> deleteFleet(String fleetId) {
        Fleet fleet = fleetRepository.findById(fleetId)
                .orElseThrow(() -> new ResourceNotFoundException("Fleet not exist with id: " + fleetId));

        fleetRepository.delete(fleet);

        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @Override
//    public ResponseEntity<Fleet> deleteAllByFleetId(String fleetId) {
//
//        return null;
//    }

    @Override
    @Transactional
    public ResponseEntity<Fleet> deleteAllByFleetId(String query) {
        ResponseEntity<Fleet> fleets = fleetRepository.deleteAllByFleetId(query);

        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @Override
//    public List<Fleet> getFleetss() {
//        return fleetRepository.getFleetss();
//    }


}

