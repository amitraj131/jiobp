package com.bosch.jiobp.repository;

import com.bosch.jiobp.model.ParticularFleetId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IParticularFleetIdRepository extends JpaRepository<ParticularFleetId, String> {
    @Query("SELECT p FROM ParticularFleetId p WHERE " +
            "p.fleetId LIKE CONCAT('%',:query, '%')")
    List<ParticularFleetId> getVehiclesByFleetId(String query);

    @Modifying
    boolean deleteParticularFleetIdByFleetId(String fleetId);

}
