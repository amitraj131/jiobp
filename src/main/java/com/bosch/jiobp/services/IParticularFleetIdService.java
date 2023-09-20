package com.bosch.jiobp.services;

import com.bosch.jiobp.model.ParticularFleetId;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IParticularFleetIdService {

    List<ParticularFleetId> getVehiclesByFleetId(String query);
    public ResponseEntity<ParticularFleetId> deleteParticularFleetVehicle(String vehicleNo);

}
