package POO;

public class Livro {
	
	String name;
	String description;
	double price;
	Autor autor;
	
	void detalhes() {
		System.out.println("Detalhes do livro");
		System.out.println("Nome: " + name);
		System.out.println("Descri��o: " + description);
		System.out.println("Pre�o: " + price);
		//autor.detalhes();
		System.out.println("___");
		
		
	}
	
	public void desconto(double porcent) {
		this.price -= this.price * porcent;
	}
}
