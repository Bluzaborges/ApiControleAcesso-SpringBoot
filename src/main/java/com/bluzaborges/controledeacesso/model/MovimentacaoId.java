package com.bluzaborges.controledeacesso.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class MovimentacaoId implements Serializable {
    private static final long serialVersionUID = 1110147895524007386L;
    private long id_Movimento;
    private long id_Usuario;
}
