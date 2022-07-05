package AbstractFactorySemUso;

public class TestSemAbstractFactory {
	
    public static void main(String[] args) {
    	Cachorro gato = new Gato();
	Preto preto = new Preto();
    	
    


        String resultado = String.format("Um %s da cor %s e  faz %s", cachorro.getAnimal(), preto.getCor(), cachorro.fazSom());

        System.out.println(resultado);
    }

}
