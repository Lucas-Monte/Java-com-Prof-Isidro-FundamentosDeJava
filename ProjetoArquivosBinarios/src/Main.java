import java.io.*;

public class Main {
    public static void main(String[] args) {
        String nomeArquivo = "dados.bin";

//        try {
//
//            File f = new File(nomeArquivo);
//            FileOutputStream fo = new FileOutputStream(f);
//           ObjectOutputStream out = new ObjectOutputStream(fo);
//
//            for (int i = 0; i < 30; i++) {
//                Produto p = new Produto(i, "Produto - " + i, i*10);
//                out.writeObject(p);
//
//            }
//
//            out.close();
//            fo.close();
//
//
//        } catch (IOException ex) {
//            System.out.println("Erro ao gravar registros " + ex.getMessage());
//            ex.printStackTrace();
//        }
        try{
            File f = new File(nomeArquivo);
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(fi);

            Produto p;
            while ((p = (Produto) in.readObject()) != null) {
                System.out.println(p);
            }

            in.close();
            fi.close();

        } catch (EOFException ex) {
            System.out.println("Fim do arquivo!");
        }
        catch (IOException ex) {
            System.out.println("Erro ao ler registros " + ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Erro ao converter bytes lidos " + ex.getMessage());
        }


    }
}
