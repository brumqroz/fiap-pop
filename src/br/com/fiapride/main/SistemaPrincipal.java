package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Garrafa minhaGarrafa = new Garrafa();
        minhaGarrafa.nivelVedacao = 10;
        minhaGarrafa.material = "Inox"; 
        minhaGarrafa.capacidadeMaxima = 750;
        minhaGarrafa.volumeAtual = 0;

        Garrafa garrafaDaLaryssa = new Garrafa();
        garrafaDaLaryssa.nivelVedacao = 4;
        garrafaDaLaryssa.material = "Plástico";

        System.out.println("Minha garrafa é: " + minhaGarrafa.material);
        System.out.println("A garrafa da Laryssa é: " + garrafaDaLaryssa.material);
        System.out.println("Minha garrafa tem nível de vedação: " + minhaGarrafa.nivelVedacao);
        System.out.println("A garrafa da Laryssa tem nível de vedação: " + garrafaDaLaryssa.nivelVedacao);

        // teste dos novos  métodos
        System.out.println("Utilização do método:");
        
        System.out.print("Quantos ml você quer colocar na garrafa? ");
        int quantidadeParaEncher = leitor.nextInt(); 
        minhaGarrafa.encher(quantidadeParaEncher); 

        if (quantidadeParaEncher > minhaGarrafa.capacidadeMaxima) {
            System.out.println("A garrafa transbordou, sistema encerrado.");
            leitor.close();
            return; //encerra se transbordar.
        }
        
        System.out.print("\nQuantos ml você quer beber agora? ");
        int quantidadeParaBeber = leitor.nextInt(); 
        minhaGarrafa.beber(quantidadeParaBeber);  

        leitor.close();
    }
}