# Jogo de Adivinhação em Java (versão 2) 🎢

Este é um jogo aprimorado de adivinhação de números, onde o jogador tenta adivinhar um número aleatório gerado pelo computador, com novos recursos para aumentar a diversão.

## 🗃 Descrição

O programa gera um número aleatório com base no nível de dificuldade escolhido pelo jogador. 
Você pode selecionar entre três níveis:

- **Fácil**: Números de 1 a 50.
- **Médio**: Números de 1 a 100.
- **Difícil**: Números de 1 a 200.

O jogador deve inserir palpites, e o programa informará se o número correto é maior ou menor que o palpite fornecido. Ao final, o programa exibe o menor número de tentativas alcançado durante o jogo e permite ao jogador decidir se deseja jogar novamente.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac adivinhaNumero2.java
   ```
4. Execute o programa:
   ```bash
   java adivinhaNumero2
   ```

## 🕹️ Como jogar

1. Escolha o nível de dificuldade:
   - **1** para Fácil (1 a 50).
   - **2** para Médio (1 a 100).
   - **3** para Difícil (1 a 200).
2. Insira seus palpites para tentar adivinhar o número aleatório.
3. Receba feedback se o número é **maior** ou **menor** que o palpite.
4. Acerte o número e veja o total de tentativas.
5. Escolha se deseja jogar novamente.

## 🗂 Estrutura do código

O código é composto por:

- Importação de bibliotecas:
  - `Scanner`: para capturar a entrada do usuário.
  - `Random`: para gerar o número aleatório.
- Menu inicial para seleção de dificuldade.
- Loop principal que permite repetir o jogo sem reiniciar o programa.
- Registro e exibição do menor número de tentativas alcançado.

## 🛠️ Melhorias futuras

- Adicionar cronômetro para calcular o tempo total de cada partida.
- Implementar opção de salvar o ranking em um arquivo externo.
- Personalizar mensagens de acordo com o nível de dificuldade.

## 📝 Licença

Este projeto é de código aberto. Sinta-se à vontade para usar, modificar e compartilhar.

---
Divirta-se jogando! 😄

