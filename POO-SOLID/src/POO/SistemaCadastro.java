package POO;

public class SistemaCadastro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.name = "Teste 3";
		livro.description = "Testando 123";
		livro.price = 40;
		livro.desconto(0.1);
		
		livro.detalhes();
		
		Livro outrolivro = new Livro();
		outrolivro.name = "Harry Potter";
		outrolivro.description = "Magia";
		outrolivro.price = 100;
		outrolivro.desconto(0.5);
		
		outrolivro.detalhes();
		
		Autor autor1 = new Autor();
		autor1.name = "Eduardo";
		autor1.email = "edurpj2@gmail.com";
		livro.autor = autor1;
		
		autor1.detalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.name = "Junior";
		outroAutor.email = "teste@gmail.com";
		outrolivro.autor = outroAutor;
		
		outroAutor.detalhes();
	}

}
