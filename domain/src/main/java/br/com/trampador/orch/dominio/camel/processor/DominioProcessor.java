package br.com.trampador.orch.dominio.camel.processor;

import br.com.trampador.orch.dominio.domain.Dominio;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DominioProcessor implements Processor {
  public static final String DOMINIO = "dominio";
  @Override
  public void process(Exchange exchange) throws Exception {
    Dominio dominio = exchange.getIn().getBody(Dominio.class);
    exchange.setProperty(DOMINIO, dominio);
    exchange.getOut().setBody(dominio);
  }
}
