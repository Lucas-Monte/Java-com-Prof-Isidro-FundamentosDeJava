public class CalculadorDeImpostos implements InterfaceOracleERP, InterfaceSAP, MSInterface {

    //aqui temos efitivamente as regras do "segredo do negocio"
    public void calcularImposto(String documentoFiscal){
        System.out.println("Processando arquivo...");
        System.out.println("Calculando imposto do documento " + documentoFiscal);
        System.out.println("Gravando em BD");
        System.out.println("Emitindo guias");
        System.out.println("------> FIM");
    }

    @Override
    public void calculateTaxes(String doc) {
        //chamar o meu metodo de negocio
        this.calcularImposto(doc);
    }

    @Override
    public void calculateTaxesAndSummarizeBill(String doc) {
        //chamar o meu metodo de negocio
        this.calcularImposto(doc);
    }

    @Override
    public void summarizeBill(String doc) {
        //chamar o meu metodo de negocio
        this.calcularImposto(doc);
    }
}
