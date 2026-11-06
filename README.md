# API REST de Gerenciamento de Produtos

API REST desenvolvida com **Java e Spring Boot**, com o objetivo de implementar operações de gerenciamento de produtos e aplicar conceitos fundamentais de desenvolvimento Backend.

O projeto utiliza uma arquitetura em camadas, persistência relacional com PostgreSQL e Spring Data JPA, seguindo uma estrutura que favorece a separação de responsabilidades e a manutenção do código.

## Tecnologias

| Tecnologia | Aplicação |
|---|---|
| Java 25 | Linguagem de programação |
| Spring Boot | Construção da aplicação e disponibilização da API |
| Spring Data JPA | Persistência e acesso a dados |
| Hibernate | Mapeamento objeto-relacional (ORM) |
| PostgreSQL | Banco de dados relacional |
| Maven | Gerenciamento de dependências e build |

## Funcionalidades

- Cadastro de produtos.
- Consulta de todos os produtos.
- Consulta de produto por identificador.
- Atualização de produtos.
- Exclusão de produtos.

## Arquitetura e organização

A aplicação foi estruturada utilizando o padrão de arquitetura em camadas, separando as responsabilidades de cada componente:

```text
src/main/java/com/exemplo/api_produtos/
│
├── controller/
│   └── ProdutoController.java
│
├── model/
│   └── Produto.java
│
├── repository/
│   └── ProdutoRepository.java
│
├── service/
│   └── ProdutoService.java
│
└── ApiProdutosApplication.java
```

**Responsabilidades das camadas:**

- **Controller:** gerenciamento das requisições HTTP e exposição dos endpoints REST.
- **Service:** implementação da lógica de negócio.
- **Repository:** operações de persistência e comunicação com o banco de dados.
- **Model:** representação da entidade de domínio Produto.

## Persistência de dados

A aplicação utiliza PostgreSQL como banco de dados relacional, integrado ao Spring Data JPA e Hibernate.

O mapeamento entre os objetos Java e as tabelas do banco de dados é realizado pelo Hibernate, enquanto o Spring Data JPA simplifica as operações de persistência.

## Executando o projeto

### Pré-requisitos

- Java 25 ou compatível com a configuração do projeto.
- Maven (ou Maven Wrapper).
- PostgreSQL.

### Configuração

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Crie um banco de dados PostgreSQL chamado `apiprodutos`.

3. Configure as credenciais de acesso ao banco no arquivo local `application-local.properties`, conforme a configuração de perfil da aplicação.

4. Execute a aplicação pela classe principal `ApiProdutosApplication` ou utilizando o Maven Wrapper:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

A aplicação estará disponível em:

```text
http://localhost:8080
```

## Objetivos de aprendizagem

Este projeto foi desenvolvido para consolidar conhecimentos em:

- Desenvolvimento de APIs REST com Java e Spring Boot.
- Organização de aplicações utilizando arquitetura em camadas.
- Integração entre aplicações Java e bancos de dados relacionais.
- Persistência de dados com Spring Data JPA e Hibernate.
- Gerenciamento de dependências e execução com Maven.

## Autor

Desenvolvido como projeto pessoal de estudos em desenvolvimento Backend com Java e Spring Boot.
