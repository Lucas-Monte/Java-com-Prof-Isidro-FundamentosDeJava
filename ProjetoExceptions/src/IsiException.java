
//inicialmente vamos usar uma exceção não verificada
// public class IsiException extends RunTimeException
public class IsiException extends Exception {

    public IsiException(String mensagem) {
        super(mensagem);
    }
}
