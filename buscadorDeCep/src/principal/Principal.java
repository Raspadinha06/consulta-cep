package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCEP consultaCep = new ConsultaCEP();

        System.out.println("Digite o CEP desejado: ");
        var cep = leitura.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
