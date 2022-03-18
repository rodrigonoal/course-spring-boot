# Uma Aplicação Spring Boot

Esta e uma aplicaçao criada por meio do Spring Initilizr.

https://start.spring.io/

### Resources

Onde ficam os controladores.

### Domain

Onde configuramos as entidades do banco de dados (os objetos que serão convertidos em tabelas).

### Services

Operações e consultas para os controladores.
Obs: Não tem contato com database ou REST.

### Repository

Ela terá operações de consulta, criação, edição e deleção de linhas no banco de dados.

### Para rodar o db local

```
Url:
http://localhost:8080/h2-console/

Datasource:
jdbc:h2:mem:testdb
```