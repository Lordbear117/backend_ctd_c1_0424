package com.backend.test;

import com.backend.entity.Medicamento;
import com.backend.repository.impl.MedicamentoDaoH2;
import com.backend.service.impl.MedicamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {
    private MedicamentoService medicamentoService;


    @Test
    void deberiaInsertarUnMedicamentoYRetornarElIdEnH2(){
        //arrange
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2());
        Medicamento medicamentoAPersistir = new Medicamento(2558, "Aspirina", "Bayer", 50, 1500);

        //act
        Medicamento medicamentoPersistido = medicamentoService.registrarMedicamento(medicamentoAPersistir);

        //assert
        assertNotNull(medicamentoPersistido.getId());

    }

}