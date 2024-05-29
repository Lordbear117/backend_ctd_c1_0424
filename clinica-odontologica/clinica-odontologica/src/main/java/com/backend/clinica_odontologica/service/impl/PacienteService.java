package com.backend.clinica_odontologica.service.impl;

import com.backend.clinica_odontologica.dto.entrada.PacienteEntradaDto;
import com.backend.clinica_odontologica.dto.salida.PacienteSalidaDto;
import com.backend.clinica_odontologica.entity.Paciente;
import com.backend.clinica_odontologica.repository.IDao;
import com.backend.clinica_odontologica.service.IPacienteService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PacienteService implements IPacienteService {
    //se mapea de DTO a entidad y viceversa
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    @Override
    public PacienteSalidaDto registrarPaciente(PacienteEntradaDto pacienteEntradaDto) {
        //logica de negocio
        //mapeo de dto a entidad
        //pacienteIDao.registrar(paciente);
        //mapeo de entidad a dto
        return null;
    }

    @Override
    public List<PacienteSalidaDto> listarPacientes() {
        //pacienteIDao.listarTodos()

        //mapeo de lista de entidades a lista de dtos
        return null;
    }
}
