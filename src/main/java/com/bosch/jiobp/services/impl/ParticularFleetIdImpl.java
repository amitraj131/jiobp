package com.bosch.jiobp.services.impl;

import com.bosch.jiobp.exception.ResourceNotFoundException;
import com.bosch.jiobp.model.ParticularFleetId;
import com.bosch.jiobp.repository.IParticularFleetIdRepository;
import com.bosch.jiobp.services.IParticularFleetIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticularFleetIdImpl implements IParticularFleetIdService {
    @Autowired
    private IParticularFleetIdRepository particularFleetIdRepository;


    @Override
    public List<ParticularFleetId> getVehiclesByFleetId(String query) {
            List<ParticularFleetId> particularFleetIds =particularFleetIdRepository.getVehiclesByFleetId(query);
            return particularFleetIds;
    }

    @Override
    public ResponseEntity<ParticularFleetId> deleteParticularFleetVehicle(String vehicleNo) {
            ParticularFleetId particularFleetId = particularFleetIdRepository.findById(vehicleNo)
                    .orElseThrow(() -> new ResourceNotFoundException("Vehicle not exist with id: " + vehicleNo));

        particularFleetIdRepository.delete(particularFleetId);

            return new ResponseEntity<>(HttpStatus.OK);
        }
    }