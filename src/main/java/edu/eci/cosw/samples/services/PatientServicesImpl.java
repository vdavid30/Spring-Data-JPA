package edu.eci.cosw.samples.services;

import edu.eci.cosw.jpa.sample.model.Paciente;
import edu.eci.cosw.samples.persistence.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServicesImpl implements PatientServices{
    @Autowired
    public PatientServicesImpl(){

    }


    @Override
    public Paciente getPatient(int id, String tipoid) throws ServicesException {
        return null;
    }

    @Override
    public List<Paciente> topPatients(int n) throws ServicesException {
        return null;
    }
}
