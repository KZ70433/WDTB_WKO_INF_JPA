package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Transactional
    @Test
    void findVisitsById() {
        //give
        //when
        List<VisitTO> visitsById = patientService.findVisitsById(1L);
        //then
        assertThat(visitsById).isNotNull();
        assertThat(visitsById.size()).isEqualTo(2);
    }
}