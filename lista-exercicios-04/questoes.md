1 - a) Verdadeira. Construtores não são membros herdados. Cada classe define os seus próprios construtores. A subclasse pode chamar o construtor da superclasse (com super(...)), mas não o herda.

b) Falsa. “Tem um” é composição: uma classe guarda outro objeto como atributo.

c) Falsa. Isso é sobrescrita . Sobrecarga é ter métodos com o mesmo nome, mas parâmetros diferentes.


2 - O protected deixa a subclasse usar os atributos direto, o que simplifica o código, mas quebra o encapsulamento e deixa as subclasses dependentes da implementação da superclasse. O private protege os dados e permite mudar a superclasse sem afetar ninguém, exigindo métodos de acesso. Por isso, o mais recomendado é usar private com métodos get/set.

3 - Quando você cria um objeto da subclasse, o construtor dela chama primeiro o da superclasse, com super(...) ou de forma automática, quando o compilador coloca um super() por conta própria. Isso é obrigatório porque só a superclasse sabe preparar a parte que a subclasse herdou, e sem isso o objeto ficaria bagunçado.