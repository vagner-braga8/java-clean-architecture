![Programação-Arquitetura Java](https://github.com/jacqueline-oliveira/3698-java-clean-architecture/assets/66698429/0191ea20-432f-4583-a391-f01558004fb9)
![](https://img.shields.io/github/license/alura-cursos/android-com-kotlin-personalizando-ui)

# CodeChella

App de simulação de um site para venda de ingressos de eventos diversos

## 🔨 Objetivos do projeto

- Conhecer os diferentes tipos de arquitetura de software;
- Aprender os princípios da Clean Architecture;
- Implementar um projeto com separação de responsabilidades e isolamento do domínio;
- Entender sobre entidades, objetos de valor, casos de uso, repositórios e controladores;
- Analisar os prós e contras de arquiteturas que utilizam muitas camadas de abstração.

## 🛠️ **Configuração do projeto**

Este projeto utiliza um banco de dados PostgreSQL. Para rodá-lo, siga os seguintes passos:

### ⚙️ **Passo 1: Rodando o PostgreSQL com Docker**
Execute o seguinte comando para iniciar o banco de dados PostgreSQL:

```bash
  docker run --name codechella_db \
  -e POSTGRES_USER=postgress \
  -e POSTGRES_PASSWORD=1234 \
  -e POSTGRES_DB=codechella_db \
  -p 5432:5432 \
  -d postgres:latest

```
### 🔗 **Passo 2: Configurando a Conexão na Aplicação**
Após o banco de dados estar rodando, a aplicação precisa estar configurada para se conectar a ele. No arquivo de configuração da sua aplicação (application.properties),
use as seguintes configurações:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/codechella_db
spring.datasource.username=postgress
spring.datasource.password=1234
```
**Dica:** Para uma configuração mais segura e flexível, é recomendável usar variáveis de ambiente para armazenar informações sensíveis, como credenciais do banco de dados. O exemplo acima foi apenas ilustrativo. Você pode configurar as variáveis de ambiente e usá-las da seguinte maneira:
```bash
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
```

### **🌐 Passo 3: Verificando a Conexão com o Banco de Dados**
Para verificar se o container está rodando corretamente, use:
```bash
docker ps
```
Se o container não estiver ativo, inicie-o com:
```bash
docker start codechella_db
```    