package br.com.trampador.orch.dominio.mapper;

import br.com.trampador.orch.dominio.domain.Dominio;
import br.com.trampador.orch.dominio.presentation.representation.DominioRepresentation;

public class DominioMapper {
    public static DominioRepresentation toRepresentation(Dominio dominio) {
        DominioRepresentation representation = new DominioRepresentation(dominio.getId(), dominio.getVersion());
        return representation;
    }
}
