package br.com.fiapride.main;
 
import br.com.fiapride.model.Garrafa;
 
public class SistemaPrincipal {
 
	public static void main(String[] args) {
		
	Garrafa minhaGarrafa = new Garrafa();
	minhaGarrafa.capacidadeEmMl = (int) 1000;
	minhaGarrafa.cor = "Azul";
	
	Garrafa garrafaDaLaryssa = new Garrafa();
	garrafaDaLaryssa.capacidadeEmMl = (int) 500;
	garrafaDaLaryssa.cor = "Rosa";
	System.out.println("Minha garrafa é: " + minhaGarrafa.cor);
	System.out.println("A garrafa da Laryssa é: " + garrafaDaLaryssa.cor);
	System.out.println("Minha garrafa é: " + minhaGarrafa.capacidadeEmMl);
	System.out.println("A garrafa da Laryssa é: " + garrafaDaLaryssa.capacidadeEmMl);
 
	}
 
}