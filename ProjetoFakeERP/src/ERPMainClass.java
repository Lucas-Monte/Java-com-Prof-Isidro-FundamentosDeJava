public class ERPMainClass {
    public static void main(String[] args) {

        //simulando a chamada da Oracle
        InterfaceOracleERP ioer = new CalculadorDeImpostos();
        ioer.calculateTaxes("nf.xml");

        //simulando a chamada da Microsoft
        MSInterface msi = new CalculadorDeImpostos();
        msi.summarizeBill("bill.xml");

        //simulando a chamada da SAP
        InterfaceSAP isap = new CalculadorDeImpostos();
        isap.calculateTaxesAndSummarizeBill("nf011912.xml");
    }
}
