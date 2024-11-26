# SurdTech
## Descrição
SurdTech Uma plataforma inovadora para ensino de programação, projetada para ser totalmente acessível à comunidade surda. Oferece vídeos em Libras gerados por IA, legendas sincronizadas e recursos interativos para garantir aprendizado inclusivo. Além disso, instrutores podem criar cursos com ferramentas adaptadas, promovendo uma experiência completa para estudantes e professores.
## Tecnologias utilizadas
- **Java 17**: A linguagem de programação utilizada para desenvolver a lógica de backend da aplicação.
- **Spring Boot 3**: Framework para construção de aplicações Java, utilizado para criar a API RESTful do projeto.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar as informações da aplicação.
- **React**: Biblioteca JavaScript utilizada para construir a interface do usuário (front-end), proporcionando uma experiência interativa e dinâmica.

## Como Instalar
### Pré-requisitos
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Node.js](https://nodejs.org/) 
### Passo a Passo
1. **Clone o repositório**

Abra seu terminal e execute o seguinte comando para clonar o repositório:

 ```bash
git clone https://github.com/rodrigomirandaa/surdtech-backend.git
```
 ```bash
cd surdtech-backend
```

2. **Executar o Backend**
- Navegue até a pasta do backend e execute o seguinte comando:
```bash
mvn spring-boot:run
```

### Ambiente Local (PostgreSQL)

Para executar com PostgreSQL localmente:

1. Crie um banco de dados chamado `surdtech`
2. Configure o profile:
```properties
spring.profiles.active=test
```

3. Configure as seguintes variáveis de ambiente:
```bash
DB_HOST=seu_host
DB_NAME=surdtech
DB_PORT=5432
DB_USERNAME=postgres
DB_PASSWORD=sua_senha
```

## Ambiente Online

O backend está disponível online através do seguinte endpoint:

```
https://surdtech-backend.onrender.com/
```

### Notas Importantes

- Certifique-se de ter o PostgreSQL instalado localmente ao usar o profile `test`
- Todas as variáveis de ambiente são obrigatórias ao usar PostgreSQL
- O ambiente online já está configurado e pronto para uso
4. **Executar o Frontend**
- Navegue até a pasta do front-end e execute os seguintes comandos:
```bash
cd surd-tech-front-end
npm install
npm run dev
```
5. **Acessar a Aplicação**
- Abra seu navegador e acesse http://localhost:5173 para ver a aplicação em funcionamento.

6. **Acessar as rotas da aplicação (swagger)**
- Abra seu navegador e acesse http://localhost:8080/swagger-ui/index.html

### Observações
- Certifique-se de que o servidor do PostgreSQL esteja em execução antes de iniciar a aplicação.
- Verifique as dependências e versões para evitar conflitos.

## Responsáveis

### Equipe do Projeto

- **Andressa Mota**
  - **Github:** [Andressa Mota](https://github.com/andressamotaz)

- **Ana Beatriz**
  - **Github:** [Ana Beatriz](https://github.com/beatriz862)

- **Lucas Carneiro**
   - **Github:** [Lucas Carneiro](https://github.com/lucascarneiros)

- **Maria Helena**
   - **Github:** [Maria Helena](https://github.com/mhelenaas)

- **Rodolfo Rodrigo**
   - **Github:** [Rodolfo Rodrigo](https://github.com/rodolfoxyz)

- **Rodrigo Miranda**
   - **Github:** [Rodrigo Miranda](github.com/rodrigomirandaa)

- **Victor Costa**
  - **Github:** [Victor Costa](https://github.com/victorcosta213)

- **Vinicius Grillo**
  - **Github:** [Vinícius Grillo](https://github.com/viniciusgr63)

- **Salmo Thélio**
   - **Github:** [Salmo Thélio](https://github.com/trikest)
