# API de Produtos

API REST desenvolvida com Java e Spring Boot para gerenciamento de produtos, com operações de cadastro, consulta, atualização e exclusão.

## Tecnologias

- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

## Funcionalidades

- Cadastrar produtos.
- Listar produtos.
- Atualizar produtos.
- Excluir produtos.

## Endpoints

| Método | Rota | Descrição |
|---|---|---|
| POST | `/produtos` | Cadastrar produto |
| GET | `/produtos` | Listar produtos |
| PUT | `/produtos/{id}` | Atualizar produto |
| DELETE | `/produtos/{id}` | Excluir produto |

## Executando o projeto

1. Clone o repositório.
2. Crie um banco de dados PostgreSQL chamado `apiprodutos`.
3. Configure as credenciais do banco no arquivo `application-local.properties`.
4. Execute a aplicação pela classe `ApiProdutosApplication`.

A API estará disponível em `http://localhost:8080`.

## Autor

Projeto pessoal desenvolvido para praticar desenvolvimento Backend com Java e Spring Boot.
