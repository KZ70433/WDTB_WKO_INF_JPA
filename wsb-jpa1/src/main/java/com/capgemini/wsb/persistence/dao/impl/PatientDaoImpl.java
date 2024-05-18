package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @Override
    public List<PatientEntity> findPatientsByLastName(String lastName) {
        String hql = "FROM PatientEntity p WHERE p.lastName = :lastName";
        TypedQuery<PatientEntity> query = entityManager.createQuery(hql, PatientEntity.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsWitMoreThanXvisit(int x) {
        String hql = "SELECT p FROM PatientEntity p " +
                "JOIN VisitEntity v ON p.id = v.patientEntity.id " +
                "GROUP BY p.id " +
                "HAVING COUNT(v.id) > :visitCount";
        TypedQuery<PatientEntity> query = entityManager.createQuery(hql, PatientEntity.class);
        query.setParameter("visitCount", (long) x);
        return query. getResultList();
    }

    @Override
    public List<PatientEntity> findSmallerAge(int age){
        String hql = "SELECT p FROM PatientEntity p WHERE p.age < :age";
        TypedQuery<PatientEntity> query = entityManager.createQuery(hql, PatientEntity.class);
        query.setParameter("age", age);
        return query. getResultList();
    }

    @Override
    public List<VisitEntity> findVisitsById(Long patientId) {
        String hql = "SELECT v FROM VisitEntity v WHERE v.patientEntity.id = :patientId";
        TypedQuery<VisitEntity> query = entityManager.createQuery(hql, VisitEntity.class);
        query.setParameter("patientId", patientId);
        return query.getResultList();

    }
}
