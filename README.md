 💱 Conversor de Moedas

Projeto desenvolvido como parte do Challenge da Alura utilizando Java.

O sistema realiza conversões de moedas em tempo real utilizando uma API de câmbio.

---

 🚀 Funcionalidades

- Conversão de:
  - USD → BRL
  - BRL → USD
  - USD → ARS
  - ARS → USD
  - USD → COP
  - COP → USD
- Consumo de API externa
- Tratamento de JSON com Gson
- Menu interativo via console

---

🛠️ Tecnologias utilizadas

- Java 17
- Maven
- Gson
- HttpClient
- API ExchangeRate

---

📂 Estrutura do Projeto

src  
 └── main  
      └── java  
           └── org.example  
                ├── Main.java  
                ├── Conversor.java  
                └── ConsultaMoeda.java  

---

🔑 Configuração da API Key

Para utilizar o projeto:

1. Crie uma conta na ExchangeRate API
2. Gere sua API Key
3. Substitua no arquivo ''ConsultaMoeda.java'':
private final String apiKey = "SUA_CHAVE_AQUI";

▶️ Como executar

1. Clone o repositório
2. Abra no IntelliJ
3. Execute a classe Main
4. Escolha uma opção no menu
5. Digite o valor para conversão

📌 Exemplo de uso
Escolha uma opção: 2
Digite o valor: 100
Valor convertido: 19,31 USD
