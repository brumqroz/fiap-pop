package br.com.fiapride.main;
 
import br.com.fiapride.model.Garrafa;
 
public class SistemaPrincipal {
 
	public static void main(String[] args) {
		
	Garrafa minhaGarrafa = new Garrafa();
	minhaGarrafa.nivelVedação = (int) 10;
	minhaGarrafa.Material = "Inox";
	
	Garrafa garrafaDaLaryssa = new Garrafa();
	garrafaDaLaryssa.nivelVedação = (int) 4;
	garrafaDaLaryssa.Material = "Plástico";
	System.out.println("Minha garrafa é: " + minhaGarrafa.Material);
	System.out.println("A garrafa da Laryssa é: " + garrafaDaLaryssa.Material);
	System.out.println("Minha garrafa tem nível de vedação: " + minhaGarrafa.nivelVedação);
	System.out.println("A garrafa da Laryssa tem nível de vedação: " + garrafaDaLaryssa.nivelVedação);
 
	}
 
}