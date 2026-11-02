[README.md](https://github.com/user-attachments/files/34271864/README.md)
# 🍽️ LuKiNey - Sistema de Gestão de Cardápio e Estoque

O **LuKiNey** é um sistema web moderno e responsivo desenvolvido para a gestão eficiente de cardápios, cadastro de pratos e acompanhamento de estoque de restaurantes em tempo real. A solução combina a solidez e segurança de uma API RESTful em Spring Boot (Java) com uma interface web reativa desenvolvida com React e Tailwind CSS.

---

## 💻 Tecnologias Utilizadas

### Backend
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA** (Persistência de Dados)
- **Spring Web** (API RESTful)
- **Hibernate ORM**
- **MySQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências e Build)

### Frontend
- **HTML5 / JavaScript (ES6+)**
- **React 18** (Renderização Reativa via CDN / Babel)
- **Tailwind CSS** (Estilização Moderna & Tema Escuro)
- **Design Tokens / Icons** (SVG Inline)

---

## 📂 Estrutura do Projeto

```text
LuKiNey/
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/com/juliaKarol/LuKiNey/
│   │   │   ├── Controller/
│   │   │   │   └── PratosController.java    # Endpoints REST (/api/pratos)
│   │   │   ├── Entity/
│   │   │   │   ├── Categoria.java           # Enum de categorias do cardápio
│   │   │   │   └── Prato.java               # Entidade principal do banco
│   │   │   ├── Repository/
│   │   │   │   └── PratosRepository.java    # Interface Spring Data JPA
│   │   │   ├── Service/
│   │   │   │   └── PratosService.java       # Regras de Negócio
│   │   │   └── LuKiNeyApplication.java      # Classe Principal Spring Boot
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index2.html.html         # Interface Frontend React
│   │       └── application.properties       # Configurações do Banco e Servidor
│   └── test/
│       └── java/com/juliaKarol/LuKiNey/
│           └── LuKiNeyApplicationTests.java
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

🗄️ Estrutura de Dados (Prato)A entidade Prato é mapeada no MySQL com a seguinte estrutura:AtributoTipo JavaTipo SQLDescriçãoidLongBIGINTChave primária gerada automaticamente (@GeneratedValue)nomeStringVARCHAR(255)Nome do prato ou bebidacategoriaCategoriaVARCHAR(50)Categoria (ENTRADA, PRATO_PRINCIPAL, SOBREMESA, BEBIDA, ACOMPANHAMENTO)precoBigDecimal / DoubleDECIMAL(10,2)Preço de venda em ReaistempoPreparoIntegerINTTempo estimado em minutosquantidadeEstoqueIntegerINTUnidades disponíveis em estoquedisponivelBooleanBOOLEANIndica se o item está ativo no cardápio (true/false)ingredientesStringTEXT / VARCHARLista de ingredientes principaisdescricaoStringTEXT / VARCHARDescrição detalhada comercial do prato⚙️ Configuração e Instalação1. Configuração do Banco de Dados (MySQL)Certifique-se de que o servidor MySQL está em execução na sua máquina. Crie a base de dados com o comando SQL:CREATE DATABASE lukiney;
Ajuste o arquivo src/main/resources/application.properties com as credenciais do seu MySQL local:spring.application.name=LuKiNey

# Configuração da Conexão MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/lukiney?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
🚀 Como Executar o BackendAbra o terminal no diretório raiz do projeto:cd LuKiNey
Execute o comando Maven Wrapper:Windows:.\mvnw.cmd spring-boot:run
Linux / Mac:./mvnw spring-boot:run
O Spring Boot iniciará a aplicação na porta 8080.🖥️ Acessando o FrontendCom o Spring Boot em execução, a interface web pode ser acessada diretamente no seu navegador:👉 http://localhost:8080/index2.html.htmlRecursos da Interface:Visualização do Cardápio: Exibição dos pratos em formato de cards com filtros em tempo real.Cadastro de Itens: Formulário completo para adicionar novos pratos ao estoque (método POST).Indicadores em Tempo Real: Alertas de itens indisponíveis e estoque crítico ($\le 5$ unidades).Filtros e Buscas: Busca por palavras-chave (nome do prato ou ingrediente) e por categoria.📡 Endpoints da API REST (/api/pratos)MétodoEndpointDescriçãoCorpo da Requisição (JSON)GET/api/pratosRetorna todos os pratos cadastrados—GET/api/pratos/{id}Retorna um prato específico pelo ID—POST/api/pratosCadastra um novo prato no bancoObjeto Prato em JSONPUT/api/pratos/{id}Atualiza dados de um prato existenteObjeto Prato em JSONDELETE/api/pratos/{id}Remove um prato pelo ID—Exemplo de JSON para Cadastro (POST){
  "nome": "Filé Mignon ao Molho Madeira",
  "categoria": "PRATO_PRINCIPAL",
  "preco": 54.90,
  "tempoPreparo": 25,
  "quantidadeEstoque": 30,
  "disponivel": true,
  "ingredientes": "Filé mignon, molho madeira, arroz e batata palha",
  "descricao": "Suculento filé mignon servido com molho madeira artesanal."
}
🛠️ Resolução de Problemas FrequentesUnknown database 'lukiney':Execute CREATE DATABASE lukiney; no seu MySQL ou garanta que a opção createDatabaseIfNotExist=true está presente na URL do application.properties.Erro de CORS ao cadastrar pratos:Certifique-se de que a anotação @CrossOrigin(origins = "*") está presente na classe PratosController.java.Erro ao converter JSON:Verifique se o campo categoria enviado pelo formulário bate exatamente com os valores do seu Enum em Java (ex.: PRATO_PRINCIPAL, BEBIDA, ENTRADA).👩‍💻 Autores & CréditosDesenvolvido por Julia Karol e equipe para o projeto LuKiNey.
