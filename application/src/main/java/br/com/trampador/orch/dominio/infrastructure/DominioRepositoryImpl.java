package br.com.trampador.orch.dominio.infrastructure;

import br.com.trampador.orch.dominio.domain.Dominio;
import br.com.trampador.orch.dominio.port.DominioRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DominioRepositoryImpl implements DominioRepository {
  @Override
  public Dominio getDominio() {
    return new Dominio("id", 1);
  }
}
