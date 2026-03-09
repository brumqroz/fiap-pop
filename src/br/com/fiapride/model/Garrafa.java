package br.com.fiapride.model;

public class Garrafa {
    public String material;
    public String formato;
    public int nivelVedacao;
    
    //meus métodos  adicionados
    public int capacidadeMaxima = 750;
    public int volumeAtual = 0; //garrafa inicialmente

    //Método 1: Apresenta volume com base na ação "encher".
    public void encher(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade para encher deve ser maior que zero.");
        } else if (volumeAtual + quantidade > capacidadeMaxima) {
            System.out.println("Capacidade máxima é " + capacidadeMaxima + "ml.");
        } else {
            volumeAtual += quantidade;
            System.out.println("Você encheu " + quantidade + "ml. Volume atual: " + volumeAtual + "ml.");
        }
    }

    // Método 2: Altera volume atual com base na ação "beber".
    public void beber(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade para beber deve ser maior que zero.");
        } else if (quantidade > volumeAtual) {
            System.out.println("Não há líquido suficiente na garrafa para beber" + quantidade + "ml.");
        } else {
            volumeAtual -= quantidade;
            System.out.println("Você bebeu " + quantidade + "ml. Volume atual: " + volumeAtual + "ml.");
        }
    }
}

//Formato  e material sendo String: "Cilíndrico", "Prisma", "Inox", "Plástico"... Porque são textos no código.
//Vedação sendo int porque geralmente calculamos nível em números inteiros" 750ml, 200ml..."
//Adição de mais dois métodos "beber" e "encher", que implicam em mudança nos atributos.