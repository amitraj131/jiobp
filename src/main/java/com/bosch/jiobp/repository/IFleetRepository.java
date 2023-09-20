package com.bosch.jiobp.repository;

import com.bosch.jiobp.model.Fleet;
import com.bosch.jiobp.model.ParticularFleetId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IFleetRepository extends JpaRepository<Fleet, String> {

    @Query(value = "Delete f,pf,dev,notify from \n" +
            "fleet f \n" +
            "inner join particular_fleet_id pf ON f.fleet_id=pf.fleet_id\n" +
            "inner join deviation dev ON pf.fleet_id = dev.fleet_id\n" +
            "inner join vehicle_notification_history notify ON dev.fleet_Id = notify.fleet_Id\n" +
            "where f.fleet_id = :query;", nativeQuery = true)
     public ResponseEntity<Fleet> deleteAllByFleetId(@Param("query") String query);

}
