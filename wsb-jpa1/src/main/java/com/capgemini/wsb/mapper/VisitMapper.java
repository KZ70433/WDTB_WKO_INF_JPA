package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public class VisitMapper {

    public static VisitTO mapToTO(final VisitEntity visitEntity){
        if (visitEntity == null){
            return null;
        }
        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setDoctorEntity(visitEntity.getDoctorEntity());
        visitTO.setPatientEntity(visitEntity.getPatientEntity());
        visitTO.setMedicalTreatmentEntities(visitEntity.getMedicalTreatmentEntities());
        visitTO.setTime(visitEntity.getTime());
        return visitTO;
    }
    public static VisitEntity mapToEntity(final VisitTO visitTO){

        if (visitTO == null)
        {
            return null;
        }
        VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitTO.getId());
        visitEntity.setDescription(visitTO.getDescription());
        visitEntity.setDoctorEntity(visitTO.getDoctorEntity());
        visitEntity.setPatientEntity(visitTO.getPatientEntity());
        visitEntity.setMedicalTreatmentEntities(visitTO.getMedicalTreatmentEntities());
        visitEntity.setTime(visitTO.getTime());
        return visitEntity;
    }
}
