package br.com.trampador.orch.dominio.domain;

import lombok.*;

/**
 * Classe de entidade de dominio <code>Dominio</code>.
 */
@Data
@AllArgsConstructor
public class Dominio {
    private String id;
    private Integer version;
}
