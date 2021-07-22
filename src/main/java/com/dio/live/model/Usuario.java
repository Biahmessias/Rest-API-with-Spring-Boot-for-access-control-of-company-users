package com.dio.live.model;


import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table
@Audited
public class Usuario {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;

    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;

    private BigDecimal tolerancia;

    private LocalDateTime inicioJornada;

    private LocalDateTime finalJornada;

}