package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientDao patientDao;

    public PatientServiceImpl(PatientDao pPatientDao) {
        patientDao = pPatientDao;
    }

    @Override
    public PatientTO findById(Long id) {
        return null;
    }

    @Override
    public List<PatientTO> findByLastName(String lastName) {
        List<PatientEntity> patients = patientDao.findPatientsByLastName(lastName);
        List<PatientTO> patientTOList = new ArrayList<>();
        for(PatientEntity patient : patients){
            patientTOList.add(PatientMapper.mapToTO(patient));
        }
        return patientTOList;
    }

    @Override
    public List<PatientTO> findfindPatientsWitMoreThanXvisit(int x) {
        List<PatientEntity> patientsWitMoreThanXvisit = patientDao.findPatientsWitMoreThanXvisit(x);
        List<PatientTO> patientTOList = new ArrayList<>();
        for(PatientEntity patient : patientsWitMoreThanXvisit){
            patientTOList.add(PatientMapper.mapToTO(patient));
        }
        return patientTOList;
    }

    @Override
    public List<PatientTO> findSmallerAge(int age){
        List<PatientEntity> findSmallerAge = patientDao.findSmallerAge(age);
        List<PatientTO> patientTOList = new ArrayList<>();
        for(PatientEntity patient : findSmallerAge){
            patientTOList.add(PatientMapper.mapToTO(patient));
        }
        return patientTOList;
    }

    @Override
    public List<VisitTO> findVisitsById(Long id) {
        List<VisitEntity> visitsById = patientDao.findVisitsById(id);
        List<VisitTO> visitTOList = new ArrayList<>();
        for(VisitEntity visit : visitsById){
            visitTOList.add(VisitMapper.mapToTO(visit));
        }
        return visitTOList;
    }

}
