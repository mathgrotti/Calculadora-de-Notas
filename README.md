🧑🏻‍🎓Sistema de Gerenciamento de Notas de Alunos
| 
|  ☕Este é um projeto em Java que implementa um sistema simples de gerenciamento de notas de alunos.
|  Ele permite adicionar alunos, registrar notas, calcular médias, excluir alunos e salvar/carregar dados em um arquivo de texto.
|  Desenvolvido como prática para programação orientada a objetos (POO) e manipulação de arquivos.
|
|⚙️Funcionalidades
|  - Adicionar um novo aluno com nome e ID único.
|  - Registrar notas (0 a 100) para um aluno.
|  - Exibir a lista de alunos com IDs, nomes e médias.
|  - Salvar os dados em `alunos.txt`.
|  - Carregar os dados de `alunos.txt`.
|  - Excluir um aluno pelo ID.
|  - Menu interativo com validação de entrada.
|
|📲Requisitos
|  - Java JDK 8 ou superior (testado com Java 17).
|  - IntelliJ IDEA (recomendado) ou qualquer ambiente Java (Eclipse, NetBeans, terminal).
|
|▶️Como Executar
|1. Clone ou baixe este repositório:
|   ```bash
|    git clone https://github.com/mathgrotti/Calculadora-de-Notas.git
|     
|  Abra o projeto no IntelliJ IDEA:
|  Importe como projeto Java existente.
|  Compile e execute a classe Main.java:
|  No IntelliJ: Clique com o botão direito na classe > Run 'Main'.
|
|  No terminal:
|  Use o menu para interagir com o sistema.
|
|🧱Estrutura do Projeto
|  Aluno.java: Classe que representa um aluno, com atributos (nome, ID, notas) e métodos para manipular notas e calcular médias.
|  Main.java: Classe principal com o menu interativo e lógica do sistema (usa alunoList para gerenciar os alunos).
|
|✅Exemplo de Uso
|
|  Bem-vindo ao Sistema de Gerenciamento de Notas de Alunos!
|  
|  --------------------------------------------------
|  Sistema de Gerenciamento de Notas - Nova Sessão
|  --------------------------------------------------
|  
|  Menu:
|  1. Adicionar Aluno
|  2. Adicionar Nota
|  3. Exibir Alunos
|  4. Salvar em Arquivo
|  5. Carregar do Arquivo
|  6. Excluir Aluno
|  7. Sair
|  Escolha uma opção: 1
|  Digite o nome do aluno: João
|  Digite o ID do aluno: 101
|  
|  >>> Aluno adicionado com sucesso! <<<
|
|📝Notas
|  Mensagens do sistema são destacadas com bordas (>>> mensagem <<<) para melhor legibilidade.
|  Os dados são salvos em alunos.txt no formato id,nome,nota1,nota2,....
|  Entradas inválidas (ex.: texto no lugar de números) são tratadas com mensagens de erro.
