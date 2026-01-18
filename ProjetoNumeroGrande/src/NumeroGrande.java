public class NumeroGrande {
    private int casas;
    private int[] digitos;

    public NumeroGrande(int casas) {
        this.casas = casas;
    }

    public  NumeroGrande() {

    }

    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }


    public void setValorString(String num) {
        if (this.casas != 0 && num.length() > this.casas) {
            System.out.println("Numero de casas ultrapassado.");
        } else {
            digitos = new int[num.length()];

            for (int i = 0; i < num.length(); i++) {
                digitos[i] = num.charAt(i) - '0';
            }
        }
    }

    public NumeroGrande soma(NumeroGrande n2) {
       int i = this.digitos.length - 1;
       int j = n2.digitos.length - 1;

       int sobra = 0;
       String res = "";
       while (i >= 0 || j >= 0 || sobra > 0) {
           int a = (i >= 0) ? this.digitos[i] : 0;
           int b = (j >= 0) ? n2.digitos[j] : 0;

           int soma = a + b + sobra;
           sobra = soma /10;
           res = (soma % 10) + res;

           i--;
           j--;
       }

       NumeroGrande resultado = new NumeroGrande();
       resultado.setValorString(res);
       return resultado;
    }
    public void exibeValor() {
        for (int digito : this.digitos) {
            System.out.print(digito);
        }
        System.out.print("\n");
    }

}
