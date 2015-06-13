

public class ClassePublica {
	
	public static void main(String[] args) {
		
		ClasseTeste cp = new ClasseTeste(1);
		
		System.out.println(cp.metodo());
		
		System.out.println(cp.toString());
		
	}
	
}

class ClasseTeste {
	
	Integer numeroObjeto;
	Float numeroFloat;
	Character meuCaractere;
	Boolean minhaDecisao;
	
	public ClasseTeste (int numero) {
		this.numeroObjeto = numero;
	}
	
	String metodo() {
		return "Metodo da classe default";
	}
	
	@Override
	public String toString() {
		return "Minha classe com valor = " + this.numeroObjeto.toString();
	}
}

