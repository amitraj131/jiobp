package com.bosch.jiobp.repository;

import com.bosch.jiobp.model.Deviation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDeviationRepository extends JpaRepository<Deviation, String> {
    @Query("SELECT d FROM Deviation d WHERE " +
           // "d.fleetId LIKE CONCAT('%',:query, '%')" +
            "d.vehicleNo LIKE CONCAT('%', :query, '%')")
    List<Deviation> getDeviationByFleetId(String query);


    //@Modifying
    //boolean deleteDeviationByFleetId(String fleetId);

}
