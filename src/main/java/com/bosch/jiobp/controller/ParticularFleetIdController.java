package com.bosch.jiobp.controller;


import com.bosch.jiobp.model.ParticularFleetId;
import com.bosch.jiobp.repository.IParticularFleetIdRepository;
import com.bosch.jiobp.services.IParticularFleetIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("fleets")
public class ParticularFleetIdController {

    @Autowired
    private IParticularFleetIdRepository particularFleetIdRepository;

    @Autowired
    private IParticularFleetIdService particularFleetIdService;

    @DeleteMapping("{fleetId}/{vehicleNo}")
    public ResponseEntity<ParticularFleetId> deleteParticularFleetVehicle(@PathVariable String vehicleNo) {
        return particularFleetIdService.deleteParticularFleetVehicle(vehicleNo);
    }

    @GetMapping("{fleetId}")
    public List<ParticularFleetId> getVehiclesByFleetId(@RequestParam("query") String query){
        return particularFleetIdService.getVehiclesByFleetId(query);
    }
}