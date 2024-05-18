package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long>
{
    public List<PatientEntity> findPatientsByLastName(String lastName);
    public List<PatientEntity> findPatientsWitMoreThanXvisit(int x);
    public List<PatientEntity> findSmallerAge(int age);

    public List<VisitEntity> findVisitsById(Long id);
}
