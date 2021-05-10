# DSVendas
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/gabrielpereiram10/dsvendas/blob/master/LICENSE)

# Sobre o projeto

https://gabriel-dsvendas.netlify.app

DSVendas é uma aplicação full stack web construída durante a **Semana Spring React**, envento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

Aplicação para análise de desempenho em vendas.

## Layout
![Home Page](https://github.com/gabrielpereiram10/dsvendas/blob/master/assets/dsvendas-home-page.png)

![Dashborad](https://github.com/gabrielpereiram10/dsvendas/blob/master/assets/dsvendas-dashboard.png)

## Modelo conceitual
![Model](https://github.com/gabrielpereiram10/dsvendas/blob/master/assets/model.png)

## Padrão de camadas
![Structure](https://github.com/gabrielpereiram10/dsvendas/blob/master/assets/structure.png)

# Tecnologias utilizadas
## Backend
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Frontend
- HTML / CSS (Bootstrap) / TypeScript
- ReactJs
- Apex Charts
## Implantação em produção
- Backend: Heroku
- Frontend: Netlify
- Banco de dados: PostgreSQL

# Como executar o projeto

## Backend
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/gabrielpereiram10/dsvendas.git

# entrar na pasta do projeto back-end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Frontend
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/gabrielpereiram10/dsvendas.git

# entrar na pasta do projeto front-end
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```
