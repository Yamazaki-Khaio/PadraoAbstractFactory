package AbstractFactoryComUso;

import AbstractFactorySemUso.Cor;
import AbstractFactorySemUso.Preto;
import AbstractFactorySemUso.Branco;



public class CorFactory implements AbstractFactory<Cor>{

    @Override
    public Cor criar(String tipo) {
        if("Preto".equalsIgnoreCase(tipo)) {
            return new Preto();
        } else if("Branco".equalsIgnoreCase(tipo)) {
            return new Branco();
        }
        return null;
    }
}
