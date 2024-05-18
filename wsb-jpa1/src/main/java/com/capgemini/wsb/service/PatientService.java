package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.dao.PatientDao;

import java.util.List;

public interface PatientService {

    public PatientTO findById(final  Long id);
    public List<PatientTO> findByLastName(String lastName);
    public List<PatientTO> findfindPatientsWitMoreThanXvisit(int x);
    public List<PatientTO> findSmallerAge(int age);
    public List<VisitTO> findVisitsById(Long id);
}
