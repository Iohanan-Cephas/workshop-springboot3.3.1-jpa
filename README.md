# Projeto de E-commerce

Este projeto é uma aplicação de e-commerce desenvolvida com Spring Boot. A aplicação permite gerenciar categorias, produtos, usuários, pedidos e itens de pedido. Além disso, possui uma configuração para inicializar o banco de dados com dados de teste.

## Estrutura do Projeto

### 1. **Entidades**

- **Category**: Representa uma categoria de produtos.
- **Product**: Representa um produto disponível para compra.
- **User**: Representa um usuário da aplicação.
- **Order**: Representa um pedido realizado por um usuário.
- **OrderItem**: Representa um item específico em um pedido.
- **Payment**: Representa o pagamento associado a um pedido.

### 2. **Enumerações**

- **OrderStatus**: Define o status de um pedido (e.g., WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).

### 3. **Repositórios**

- **CategoryRepository**: Interface para operações CRUD na entidade `Category`.
- **OrderRepository**: Interface para operações CRUD na entidade `Order`.
- **ProductRepository**: Interface para operações CRUD na entidade `Product`.
- **UserRepository**: Interface para operações CRUD na entidade `User`.
- **OrderItemRepository**: Interface para operações CRUD na entidade `OrderItem`.

### 4. **Serviços**

- **CategoryService**: Serviço para operações relacionadas a categorias.
- **OrderService**: Serviço para operações relacionadas a pedidos.
- **ProductService**: Serviço para operações relacionadas a produtos.
- **UserService**: Serviço para operações relacionadas a usuários.

### 5. **Controladores (Resources)**

- **CategoryResource**: Controlador para gerenciar requisições HTTP relacionadas a categorias.
- **OrderResource**: Controlador para gerenciar requisições HTTP relacionadas a pedidos.
- **ProductResource**: Controlador para gerenciar requisições HTTP relacionadas a produtos.
- **UserResource**: Controlador para gerenciar requisições HTTP relacionadas a usuários.

### 6. **Exceções**

- **ResourceNotFoundException**: Exceção lançada quando um recurso não é encontrado.
- **DatabaseException**: Exceção lançada em caso de erro com o banco de dados.

### 7. **Configuração de Teste**

- **TestConfig**: Configuração para inicializar o banco de dados com dados de teste quando o perfil "test" está ativo.

## Configuração e Execução

### Requisitos

- Java 17 ou superior
- Maven
- Spring Boot

### Inicialização

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Iohanan-Cephas/workshop-springboot3.3.1-jpa.git
   ```

2. **Navegue até o diretório do projeto:**
   ```bash
   cd workshop-springboot3.3.1-jpa
   ```

3. **Construa o projeto:**
   ```bash
   mvn clean install
   ```

4. **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

5. **Para executar com o perfil de teste e inicializar o banco de dados com dados de teste:**
   ```bash
   mvn spring-boot:run -Dspring-boot.run.profiles=test
    ```

## Endpoints Disponíveis

### Categorias

- **`GET /categories`**
  - **Descrição**: Lista todas as categorias.
  - **Resposta**: Lista de objetos `Category`.

- **`GET /categories/{id}`**
  - **Descrição**: Retorna uma categoria pelo ID.
  - **Parâmetros**: 
    - `id` (Long): ID da categoria.
  - **Resposta**: Objeto `Category`.

### Produtos

- **`GET /products`**
  - **Descrição**: Lista todos os produtos.
  - **Resposta**: Lista de objetos `Product`.

- **`GET /products/{id}`**
  - **Descrição**: Retorna um produto pelo ID.
  - **Parâmetros**:
    - `id` (Long): ID do produto.
  - **Resposta**: Objeto `Product`.

### Usuários

- **`GET /users`**
  - **Descrição**: Lista todos os usuários.
  - **Resposta**: Lista de objetos `User`.

- **`GET /users/{id}`**
  - **Descrição**: Retorna um usuário pelo ID.
  - **Parâmetros**:
    - `id` (Long): ID do usuário.
  - **Resposta**: Objeto `User`.

- **`POST /users`**
  - **Descrição**: Cria um novo usuário.
  - **Corpo da Requisição**: Objeto `User` com os dados do novo usuário.
  - **Resposta**: Objeto `User` criado.

- **`PUT /users/{id}`**
  - **Descrição**: Atualiza um usuário existente.
  - **Parâmetros**:
    - `id` (Long): ID do usuário.
  - **Corpo da Requisição**: Objeto `User` com os dados atualizados.
  - **Resposta**: Objeto `User` atualizado.

- **`DELETE /users/{id}`**
  - **Descrição**: Deleta um usuário pelo ID.
  - **Parâmetros**:
    - `id` (Long): ID do usuário.
  - **Resposta**: `204 No Content`.

### Pedidos

- **`GET /orders`**
  - **Descrição**: Lista todos os pedidos.
  - **Resposta**: Lista de objetos `Order`.

- **`GET /orders/{id}`**
  - **Descrição**: Retorna um pedido pelo ID.
  - **Parâmetros**:
    - `id` (Long): ID do pedido.
  - **Resposta**: Objeto `Order`.

## Estrutura do Banco de Dados

O banco de dados possui as seguintes tabelas e relações:

- **tb_category**: Tabela para categorias.
- **tb_product**: Tabela para produtos.
- **tb_user**: Tabela para usuários.
- **tb_order**: Tabela para pedidos.
- **tb_order_item**: Tabela para itens de pedido.
- **tb_payment**: Tabela para pagamentos.

### Relacionamentos

- **Category** pode ter muitos **Product**.
- **Product** pode estar em muitas **Category** (relação muitos-para-muitos).
- **User** pode ter muitos **Order**.
- **Order** pode ter muitos **OrderItem**.
- **OrderItem** está associado a um **Product** e a um **Order**.
- **Order** pode ter um **Payment**.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias ou correções. Faça um fork do repositório, crie uma branch para suas alterações e envie um pull request.