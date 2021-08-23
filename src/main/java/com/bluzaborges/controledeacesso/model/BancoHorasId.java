package com.bluzaborges.controledeacesso.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoHorasId implements Serializable {
    private static final long serialVersionUID = -637018809489152388L;
    private long idBancoHoras;
    private long idMovimento;
    private long idUsuario;
}