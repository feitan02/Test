package com.Hospital.Hospital.LogInternacoes;

import com.Hospital.Hospital.GerarID.EntityId;
import com.Hospital.Hospital.Leito.Leito;
import com.Hospital.Hospital.Paciente.Paciente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "logInternacoes")
public class LogInternacoes extends EntityId {
    @Column(name = "dataInternamento")
    private Date dataInternamento;
    @Column(name = "dataAlta")
    private Date dataAlta;
    @JoinColumn(name = "leito_id")
    List<Leito> LeitoList;
    @JoinColumn(name = "paciente_id")
    List<Paciente> PacienteList;
}