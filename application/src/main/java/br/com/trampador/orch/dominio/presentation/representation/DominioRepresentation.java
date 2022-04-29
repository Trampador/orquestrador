package br.com.trampador.orch.dominio.presentation.representation;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class DominioRepresentation {
    private String id;
    private Integer version;

    @Deprecated
    public DominioRepresentation() {}
}
