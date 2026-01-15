import java.io.*;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        String nomeArquivo = "teste.txt";

        //escrevendo um arquivo texto - com 10 registros

//        try {
//            File f = new File(nomeArquivo);
//            FileWriter fw = new FileWriter(f, true);
//            PrintWriter pr = new PrintWriter(fw);
//
//            for (int i =31; i < 80; i++) {
//                Contato c = new Contato("Nome" + i, "email" + i + "email@.com", "98765432" + i);
//                pr.println(c);
//            }
//            pr.close();
//            fw.close();
//
//        } catch (IOException ex){
//            System.out.println("Erro ao gravar registros: " + ex.getMessage());
//        }

        //Criando um arquivo de leitura
        ArrayList<Contato> lista = new ArrayList<Contato>();
        try {
            File f = new File(nomeArquivo);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println("Lido = " + linha);
                String valores[] = linha.split(";");
                Contato c = new Contato(valores[0], valores[1], valores[2]);
                lista.add(c);
            }

            System.out.println(lista);
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("Erro ao ler registro " +  ex.getMessage());
        }
    }
}
