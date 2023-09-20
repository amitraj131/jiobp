package com.bosch.jiobp.services;

import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.repository.IFleetRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public interface IFleetService {

    public List<Fleet> getAllFleet();
    public ResponseEntity<Fleet> deleteFleet(String fleetId);
    public ResponseEntity<Fleet> deleteAllByFleetId(String fleetId);
    //public List<Fleet> getFleetss();
}
