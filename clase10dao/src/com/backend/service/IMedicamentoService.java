package com.backend.service;

import com.backend.entity.Medicamento;

public interface IMedicamentoService {
    Medicamento registrarMedicamento(Medicamento medicamento);
    Medicamento buscarMedicamentoPorId(Long id);
}
