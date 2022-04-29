# Serviço Stateless de Dominio 

Esse projeto foi gerado utilizando o modelo de microserviços Stateless.

`[INSIRA DESCRICAO DO PROJETO AQUI]`

# Pré Requisitos
Para que seja possível rodar essa aplicação é necessário atender alguns requisitos básicos.
  
- Java 8+
- Maven 3.3+

# Compilando e inicializando
Assim como todo projeto *Maven*, é necessário primeiramente realizarmos a geração dos fontes. Conforme o exemplo abaixo:
  
```bash
mvn clean install
```

Certifique-se de o repositório do Maven está corretamente configurado. Após os fontes terem sido gerados, basta executar o comando abaixo para inicializar a aplicação:
  
```
$ java -jar docker/sboot-orquestrador-orch-orch-dominio.jar
```

Ou, se tiver importado por meio do IntelliJ, via classe `Application.java`.
Para validar se a aplicação inicializou com sucesso é necessario chamar o endpoint do *actuator* através do *link* abaixo:

```
http://localhost:9090/actuator/health
```

# Mostrando endpoints expostos
Assim que o projeto estiver sendo executado, é possível verificar as APIs expostas acessando a URL: 

```
http://localhost:8080/swagger-ui.html
```
# Documentação

Abaixo uma lista de links relevantes: 

## Onboarding
- [Onboarding](https://confluence.bvnet.bv/pages/viewpage.action?pageId=28034212)
- [Aplicação de referência](https://confluence.bvnet.bv/pages/viewpage.action?pageId=28031877)
- [Documentação de referência](https://confluence.bvnet.bv/pages/viewpage.action?pageId=28037982)

## Arquitetural
- [Modelo arquitetural](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24159348)
- [Stack de tecnologias](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24159474)
- [Scaffolding](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24161123)

## Padrões
- [Estrutura de projeto](https://confluence.bvnet.bv/pages/viewpage.action?pageId=28028893)
- [Design RESTful](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24160873)
- [Documentação de serviço](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24161113)
- [Testes automatizados](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24160414)

## Capacidades adicionais
- [Lista de capacidades adicionais](https://confluence.bvnet.bv/pages/viewpage.action?pageId=24160353)

# Suporte
```
Plugin Detail: br.com.votorantim.arqt:scaffolding-plugin:1 | Template: stateless
```