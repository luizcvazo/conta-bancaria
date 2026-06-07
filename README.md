# 🏦 Conta Bancária

Simulação de uma conta bancária desenvolvida em Java, com suporte a operações financeiras e controle de cheque especial. Projeto desenvolvido como exercício prático do Santander Bootcamp 2026.

## 📋 Funcionalidades

- [x] Consultar saldo atual
- [x] Consultar limite e uso do cheque especial
- [x] Depositar dinheiro
- [x] Sacar dinheiro
- [x] Pagar boleto
- [x] Verificar se está usando cheque especial
- [x] Cobrança automática de taxa ao usar cheque especial

## 📐 Regras de Negócio

- O cheque especial é definido no momento da criação da conta:
  - Depósito inicial de até R$500,00 → cheque especial de R$50,00
  - Depósito inicial acima de R$500,00 → cheque especial de 50% do valor depositado
- O saldo total disponível é a soma do saldo + limite do cheque especial
- Ao usar o cheque especial, uma taxa de 20% sobre o valor usado é cobrada no próximo depósito

## 🛠️ Tecnologias Utilizadas

- **Java** — Lógica e orientação a objetos
- **Git & GitHub** — Versionamento de código
- **IntelliJ IDEA** — Ambiente de desenvolvimento

## 📂 Estrutura do Projeto

```
src/
 ├── ContaBancaria.java   → Classe com atributos, regras e operações da conta
 └── Main.java            → Menu interativo e fluxo principal
```

## 🚀 Como executar

**Pré-requisitos:** Java 11 ou superior instalado.

```bash
# Clone o repositório
git clone https://github.com/luizcvazo/conta-bancaria.git

# Acesse a pasta
cd conta-bancaria

# Compile
javac src/*.java -d out

# Execute
java -cp out Main
```

## 🖥️ Como usar

Ao iniciar o programa, informe o depósito inicial e o sistema calculará automaticamente o limite do cheque especial. Em seguida, o menu interativo será exibido:

```
=== Banco ===
1 - Consultar Saldo
2 - Consultar cheque especial
3 - Depositar
4 - Sacar
5 - Pagar boleto
6 - Verificar uso do cheque especial
0 - Sair
```

## 📚 Sobre o projeto

Exercício prático do **Santander Bootcamp 2026 — Java Back-End**, com foco em orientação a objetos, encapsulamento, lógica de negócio e menus interativos em Java.

## 👨‍💻 Autor

**Luiz Carlos Vazo**
Estudante de Engenharia de Software | Java Back-End | Design Gráfico & UX

[![LinkedIn](https://img.shields.io/badge/LinkedIn-luizcarlosvazo-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/luizcarlosvazo/)
[![GitHub](https://img.shields.io/badge/GitHub-luizcvazo-black?style=flat&logo=github)](https://github.com/luizcvazo)
