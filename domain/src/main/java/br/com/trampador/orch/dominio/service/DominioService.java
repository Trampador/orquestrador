package br.com.trampador.orch.dominio.service;

import br.com.trampador.orch.dominio.domain.Dominio;
import br.com.trampador.orch.dominio.camel.CamelContextWrapper;
import br.com.trampador.orch.dominio.camel.router.DominioRouter;
import org.apache.camel.ProducerTemplate;

/**
 * Classe de servico de dominio.
 */
public class DominioService {
    private final ProducerTemplate template;

    public DominioService(CamelContextWrapper wrapper) {
        this.template = wrapper.createProducerTemplate();
    }

    public Dominio getDominio() {
        return template.requestBody(DominioRouter.ROUTE_URI, "", Dominio.class);
    }
}
