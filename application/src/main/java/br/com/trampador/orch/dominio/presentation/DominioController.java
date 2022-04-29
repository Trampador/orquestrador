package br.com.trampador.orch.dominio.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.trampador.orch.dominio.mapper.DominioMapper;
import br.com.trampador.orch.dominio.service.DominioService;
import br.com.trampador.orch.dominio.presentation.representation.DominioRepresentation;

/**
 * Adaptador para HTTP do dominio <code>Dominio</code>.
 */
@RestController
@RequestMapping(value = "/v1/dominio")
public class DominioController {
    @Autowired
    private DominioService dominioService;

    @GetMapping
    public ResponseEntity<DominioRepresentation> getDominio() {
        return ResponseEntity.ok(DominioMapper.toRepresentation(dominioService.getDominio()));
    }
}
