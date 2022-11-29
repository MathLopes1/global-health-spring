![saude](https://user-images.githubusercontent.com/70352508/180573477-7902d1e8-a5f4-46c2-9a8a-bb25ca659203.jpg)

<h1 align="center">
   <a href="https://www.java.com/pt-BR/"><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" /></a>
  <a href="https://maven.apache.org/"><img src="https://img.shields.io/badge/Apache-CA2136?style=for-the-badge&logo=apache&logoColor=white" /></a>
  <a href="https://www.docker.com/"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" /></a>
</h1>

## Descrição do Projeto
API Rest Global Health feita utilizando Spring Boot e suas bibliotecas.


## 📖 Índice
  <ul>
    <li>
      <a href="#rota-cadastro">Rota de cadastro de usuários</a> <br>
      <sup>Rota para o cadastramento de usuário com email e cpf válidos.</sup>
    </li>
    <li>
      <a href="#rota-login">Rota de Login</a> <br>
      <sup>Rota para realização de autenticação do usuário.</sup>
    </li>
     <li>
      <a href="#rota-paciente">Rotas de pacientes</a> <br>
      <sup>Rotas privadas para cadastro de pacientes.</sup>
    </li>
  </ul>
<br>

### Pré-requisitos 
> Para usar esta API é preciso instalar as seguintes ferramentas:
- [Apache Maven](https://maven.apache.org)
- [Java](https://jdk.java.net/17/)
> Para testar as rotas você pode usar:
- [Postman](https://www.postman.com)


### Rodando o Back End (servidor)

```bash
# Clone este repositório
 git clone https://github.com/MathLopes1/global-health-spring.git

# Acesse a pasta do projeto 
 cd global-health

# Faça o build
./mvnw spring-boot:run
           
# Ou execute o arquivo .bat
./HealthRun.bat   
            
# O servidor iniciará na porta: 5000 
```

<a name="rota-cadastro"></a>
### 🧑 ROTA DE CADASTRO DE USUÁRIO - (PÚBLICA)
### REQUEST - (POST)
> Para cadastrar pacientes.

> POST - `localhost:5000/api/users`

Exemplo de body:
```json
{
    "email": "matheus@gmail.com",
    "password": "2255636698",
    "cpf": "19673323046"
}
```

<a name="rota-login"></a>
### 🔒 ROTA DE LOGIN - GERAR TOKEN (PÚBLICA)
### REQUEST - (POST)
> Para autenticar usuário.

> POST - `localhost:5000/api/login`

Exemplo de body:
```json
{
    "email": "matheus@gmail.com",
    "password": "2255636698"
}
```

<a name="rota-paciente"></a>
### 👨‍💼 ROTAS DE PACIENTES (PRIVADAS)
### REQUEST - (POST)
> Para cadastrar pacientes.

> POST - `localhost:5000/api/patient`

Exemplo de body:
```json
{
    "name": "Matheus Lopes da Silva",
    "healthInsuranceCardId": "62dabab25d042a616cdbe249",
    "address": "Rua Ledinha, 17"
}
```

### REQUEST - (GET) 
> Para listar todos os pacientes

> GET - `localhost:5000/api/patient`

### REQUEST - (GET) 
> Para listar um paciente por id

> GET - `localhost:5000/api/patient/:patientId`


### REQUEST - (PUT)
> Para atualizar um paciente

> PUT - `localhost:5000/api/patient/:patientId`

Exemplo de body:
```json
{
    "name": "Matheus Lopes da Silva",
}
```


### REQUEST - (DELETE)

> Para deletar um paciente

> DELETE - `localhost:5000/api/patient/:patientId`

## 👨‍💻 Autor

<div align=left>

 <table>
  <tr align=center>
    <th><strong> 💻Matheus Lopes </strong></th>
  </tr>
   <td>
      <a href="https://github.com/MathLopes1">
        <img width="168" height="140" src="https://avatars.githubusercontent.com/u/70352508?v=4" > <p align="left">
</p></a>
    <p align="center">Developer</p>
    </td>
  </tr>
</table>
</div>

<div align=left>
 
<br>
                 
---
 
## 📝 LICENÇA

Esse repositório está licenciado pela **MIT LICENSE**. Para mais informações detalhadas, leia o arquivo [LICENSE](./LICENSE) contido nesse repositório.
