package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class PatientDaoTest {
    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testfindPatientsByLastName(){
        // given
        //when
        List<PatientEntity> patients = patientDao.findPatientsByLastName("Kowalski");
        // then
        assertThat(patients).isNotNull();
        assertThat(patients.get(0).getLastName()).isEqualTo("Kowalski");
    }

    @Test
    public void testfindPatientsWitMoreThanXvisit(){
        //given
        //when
        List<PatientEntity> patientsWitMoreThanXvisit = patientDao.findPatientsWitMoreThanXvisit(1);
        //then
        assertThat(patientsWitMoreThanXvisit).isNotNull();
        assertThat(patientsWitMoreThanXvisit.size()).isEqualTo(1);
    }

    @Test
    public void testfindSmallerAge(){
        //given
        //when
        List<PatientEntity> patientsWithSmallerAge = patientDao.findSmallerAge(41);
        //then
        assertThat(patientsWithSmallerAge).isNotNull();
        assertThat(patientsWithSmallerAge.size()).isEqualTo(3);
    }
}