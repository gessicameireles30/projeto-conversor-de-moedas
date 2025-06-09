# Conversor de Moedas 💱

Este é um projeto simples de **Conversor de Moedas** em Java, que utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio em tempo real.

## Funcionalidades

- Conversão entre as seguintes moedas:
  - Dólar americano (USD)
  - Real brasileiro (BRL)
  - Peso argentino (ARS)
  - Peso colombiano (COP)
  - Euro (EUR) 

- Interface de console simples.

## Tecnologias utilizadas

- Java 17+  
- API: [ExchangeRate-API](https://www.exchangerate-api.com/)  
- Biblioteca: Gson (para parsing de JSON)

## Como executar

1. Clone o repositório ou baixe o código.
2. Abra o projeto em sua IDE preferida (IntelliJ, Eclipse, VSCode...).
3. Insira sua chave da API em `ConversorDeMoedas.java` (já está configurada no código atual).
4. Execute a classe `Principal.java`.
5. Siga as instruções no terminal.

## Exemplo de uso

```text
===============================
Bem-vindo ao Conversor de Moedas!
===============================

1) Dólar >>> Peso argentino
2) Peso argentino >>> Dólar
3) Dólar >>> Real brasileiro
4) Real brasileiro >>> Dólar
5) Dólar >>> Peso colombiano
6) Peso colombiano >>> Dólar
7) Sair

Escolha uma opção:
