# JoKenPo (Pedra, Papel e Tesoura)

Um jogo de "Pedra, Papel e Tesoura" (Rock, Paper, Scissors) simples, feito em Java para o console, aplicando os conceitos de Programação Orientada a Objetos, encapsulamento e tratamento de exceções.

## 📋 Sobre o projeto

O jogo permite que o usuário jogue contra o computador (PC), que escolhe sua opção aleatoriamente. A cada rodada, o resultado é exibido e o jogador pode escolher continuar jogando ou encerrar.

## 🎮 Como jogar

1. O programa exibe as opções disponíveis:
   ```
   [0] Rock
   [1] Paper
   [2] Scissors
   ```
2. Digite o número correspondente à sua jogada.
3. O resultado da rodada (vitória, derrota ou empate) é exibido.
4. Você é perguntado se deseja jogar novamente (`true` ou `false`).

## 🕹️ Exemplo de execução

```
***************
*** JOKENPO ***
***************

[0] Rock
[1] Paper
[2] Scissors
>>> ENTER: 1

*** PLAYER: Paper
*** PC: Rock
*** PLAYER WON

>>> PLAY AGAIN? (true/false): true
```

## 🗂️ Estrutura do projeto

```
src/
├── application/
│   └── Program.java     # Classe principal, controla o fluxo do jogo
└── entities/
    └── JoKenPo.java      # Classe que representa o jogo e suas regras
```

### `JoKenPo`

Classe responsável pelo estado e pelas regras do jogo:

- `options` — opções disponíveis (Rock, Paper, Scissors).
- `pc` — jogada escolhida pelo computador.
- `player` — jogada escolhida pelo usuário.
- `nextGame` — indica se uma nova rodada deve começar.

Principais métodos:

| Método | Descrição |
|---|---|
| `showOptions()` | Exibe as opções disponíveis para o jogador. |
| `showWin()` | Exibe o resultado da rodada e chama `win()`. |
| `win()` | Contém a lógica de quem venceu a rodada. |
| `nextGameQuestion()` | Pergunta se o jogador deseja jogar novamente. |

### `Program`

Classe principal (`main`), responsável por:

- Ler as entradas do usuário via `Scanner`.
- Gerar a jogada aleatória do PC via `Random`.
- Controlar o laço do jogo (`do-while`) até o jogador decidir parar.
- Tratar exceções de entrada inválida (`InputMismatchException`).

## ⚙️ Tecnologias

- Java 21+ (uso de `void main()` sem argumentos e `IO.println`, recursos de preview do Java moderno)

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/jokenpo.git
   cd jokenpo
   ```
2. Compile e execute com o JDK instalado (habilitando os recursos de preview, se necessário):
   ```bash
   javac --release 21 --enable-preview src/application/Program.java src/entities/JoKenPo.java -d out
   java --enable-preview -cp out application.Program
   ```
   > Ajuste a versão do JDK/flags de preview de acordo com a versão do Java utilizada no seu ambiente.

## ⚠️ Observações conhecidas

Esta versão do projeto possui algumas limitações lógicas conhecidas (mantidas intencionalmente nesta etapa do desenvolvimento):

- Entradas inválidas para a jogada do usuário são reportadas, mas a rodada continua mesmo assim.
- Exceções em `showWin()` são silenciadas sem feedback ao usuário.
- O jogo pode encerrar de forma inesperada dependendo da entrada informada em "jogar novamente".

## 📄 Licença

Este projeto está disponível para fins de estudo e aprendizado.
