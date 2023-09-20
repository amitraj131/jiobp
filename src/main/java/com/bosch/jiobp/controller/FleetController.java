package com.bosch.jiobp.controller;

import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.model.NotificationHistory;
import com.bosch.jiobp.model.ParticularFleetId;
import com.bosch.jiobp.repository.IFleetRepository;
import com.bosch.jiobp.services.IFleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/fleets")
public class FleetController {

    @Autowired
    private IFleetRepository fleetRepository;

    @Autowired
    private IFleetService fleetService;

    @GetMapping
    public List<Fleet> getAllFleet(){
        return fleetService.getAllFleet();
    }

//    @GetMapping("{fleetId}")
//    public ResponseEntity<Fleet> getFleetById(@PathVariable  String fleetId){
//        return fleetService.getFleetById(fleetId);
//    }
    @DeleteMapping("{fleetId}")
    public ResponseEntity<Fleet> deleteFleet(@PathVariable String fleetId){
        return fleetService.deleteFleet(fleetId);
    }

    @DeleteMapping("allDelete/{fleetId}")
    public ResponseEntity<Fleet> deleteAllByFleetId(@RequestParam("query") String query){
        return fleetService.deleteAllByFleetId(query);
    }


//    @GetMapping("fleets")
//    public List<Fleet> getAllFleetss(){
//        return fleetService.getFleetss();
//    }

}
