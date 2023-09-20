package com.bosch.jiobp.services;

import com.bosch.jiobp.model.Deviation;
import com.bosch.jiobp.model.ParticularFleetId;

import java.util.List;

public interface IDeviationService {

    List<Deviation> getDeviationByFleetId(String query);

}
