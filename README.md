🧑🏻‍🎓Sistema de Gerenciamento de Notas de Alunos <br><br>
 
  ☕Este é um projeto em Java que implementa um sistema simples de gerenciamento de notas de alunos. <br>
  Ele permite adicionar alunos, registrar notas, calcular médias, excluir alunos e salvar/carregar dados em um arquivo de texto. <br>
  Desenvolvido como prática para programação orientada a objetos (POO) e manipulação de arquivos. <br><br>

⚙️Funcionalidades <br>
  - Adicionar um novo aluno com nome e ID único. <br>
  - Registrar notas (0 a 100) para um aluno. <br>
  - Exibir a lista de alunos com IDs, nomes e médias. <br>
  - Salvar os dados em `alunos.txt`. <br>
  - Carregar os dados de `alunos.txt`. <br>
  - Excluir um aluno pelo ID. <br>
  - Menu interativo com validação de entrada. <br><br>

📲Requisitos <br>
  - Java JDK 8 ou superior (testado com Java 17). <br>
  - IntelliJ IDEA (recomendado) ou qualquer ambiente Java (Eclipse, NetBeans, terminal).

▶️Como Executar <br>
1. Clone ou baixe este repositório: <br>
   ```bash <br>
    git clone https://github.com/mathgrotti/Calculadora-de-Notas.git
     
  Abra o projeto no IntelliJ IDEA: <br>
  Importe como projeto Java existente. <br>
  Compile e execute a classe Main.java: <br>
  No IntelliJ: Clique com o botão direito na classe > Run 'Main'. <br><br>

  No terminal: <br> 
  Use o menu para interagir com o sistema. <br><br>

🧱Estrutura do Projeto <br>
  Aluno.java: Classe que representa um aluno, com atributos (nome, ID, notas) e métodos para manipular notas e calcular médias. <br>
  Main.java: Classe principal com o menu interativo e lógica do sistema (usa alunoList para gerenciar os alunos). <br><br>

✅Exemplo de Uso <br> <br>

  Bem-vindo ao Sistema de Gerenciamento de Notas de Alunos! <br> <br>
  
  -------------------------------------------------- <br>
  Sistema de Gerenciamento de Notas - Nova Sessão <br>
  -------------------------------------------------- <br> <br>
  
  Menu: <br>
  1. Adicionar Aluno <br>
  2. Adicionar Nota <br>
  3. Exibir Alunos <br>
  4. Salvar em Arquivo <br>
  5. Carregar do Arquivo <br>
  6. Excluir Aluno <br>
  7. Sair <br>
  Escolha uma opção: 1 <br>
  Digite o nome do aluno: João <br>
  Digite o ID do aluno: 101 <br><br>
  
  >>> Aluno adicionado com sucesso! <<< <br><br>

📝Notas <br>
  Mensagens do sistema são destacadas com bordas (>>> mensagem <<<) para melhor legibilidade. <br>
  Os dados são salvos em alunos.txt no formato id,nome,nota1,nota2,.... <br>
  Entradas inválidas (ex.: texto no lugar de números) são tratadas com mensagens de erro.
