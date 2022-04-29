package br.com.trampador.orch.dominio.config;

import br.com.trampador.orch.dominio.port.DominioRepository;
import br.com.trampador.orch.dominio.camel.CamelContextWrapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.apache.camel.builder.RouteBuilder;
import br.com.trampador.orch.dominio.service.DominioService;
import br.com.trampador.orch.dominio.camel.router.DominioRouter;
import org.springframework.web.client.RestTemplate;

/**
 * Classe base de configuracao.
 */
@Configuration
public class DominioConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CamelContextWrapper camelContextWrapper(RouteBuilder... routes) throws Exception {
        return new CamelContextWrapper(routes);
    }

    @Bean
    public DominioService dominioService(CamelContextWrapper camelContextWrapper) {
        return new DominioService(camelContextWrapper);
    }

    @Bean
    public DominioRouter dominioRouter(DominioRepository dominioRepository) {
        return new DominioRouter(dominioRepository);
    }
}
