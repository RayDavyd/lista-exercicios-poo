1 - tributos públicos deixam qualquer parte do código alterar o valor sem nenhuma regra. Com atributos privados, o acesso passa por métodos, e a classe controla o que entra e o que sai. Isso protege os dados e permite mudar o funcionamento interno sem quebrar o resto do programa.

Exemplo: o preço de um produto não pode ser negativo. Com o atributo público, qualquer um faz produto.preco = -50. Com o setter, a classe barra o valor inválido:

    public void setPreco(double preco) {
     if (preco >= 0) {
     this.preco = preco;
    }
}
 


2 - a) Informações relevantes de um livro: título, autor, ISBN, editora, ano de publicação, quantidade de exemplares e se está disponível ou emprestado.
 
b) Porque a classe Livro representa, no código, as características e comportamentos importantes de um livro, sem precisar representar todos os detalhes existentes em um livro físico.

c)

    emprestar(): marca o livro como emprestado.
    devolver(): marca o livro como disponível.
    verificarDisponibilidade(): diz se há exemplar para emprestar.
    exibirInfo(): mostra os dados do livro.


3 -