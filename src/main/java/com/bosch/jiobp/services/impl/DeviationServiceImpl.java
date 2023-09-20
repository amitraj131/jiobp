package com.bosch.jiobp.services.impl;

import com.bosch.jiobp.model.Deviation;
import com.bosch.jiobp.repository.IDeviationRepository;
import com.bosch.jiobp.services.IDeviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviationServiceImpl implements IDeviationService {
    @Autowired
    private IDeviationRepository deviationRepository;

    @Override
    public List<Deviation> getDeviationByFleetId(String query) {
        List<Deviation> deviations = deviationRepository.getDeviationByFleetId(query);
        return deviations;
    }
}