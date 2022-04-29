package br.com.trampador.orch.dominio.camel.router;

import br.com.trampador.orch.dominio.camel.processor.DominioProcessor;
import br.com.trampador.orch.dominio.port.DominioRepository;
import lombok.AllArgsConstructor;
import org.apache.camel.builder.RouteBuilder;

@AllArgsConstructor
public class DominioRouter extends RouteBuilder {
    public static final String ROUTE_URI = "direct:orchestrationFlow";

    DominioRepository dominioRepository;

    @Override
    public void configure() {
        from(ROUTE_URI)
          .bean(dominioRepository)
          .process(new DominioProcessor());
    }
}
