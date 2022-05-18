package POO;

public class SistemaCadastro {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor();
		autor1.name = "Eduardo";
		autor1.email = "edurpj2@gmail.com";
		
		Livro livro = new Livro();
		livro.name = "Teste 3";
		livro.description = "Testando 123";
		livro.price = 40;
		livro.desconto(0.1);
		
		livro.autor = autor1;
		livro.detalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.name = "Junior";
		outroAutor.email = "teste@gmail.com";
		
		Livro outrolivro = new Livro();
		outrolivro.name = "Harry Potter";
		outrolivro.description = "Magia";
		outrolivro.price = 100;
		outrolivro.desconto(0.5);
		
		outrolivro.autor = outroAutor;
		outrolivro.detalhes();
	}

}
