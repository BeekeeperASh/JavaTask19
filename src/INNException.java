public class INNException extends Exception{
    public INNException(String message){
        super(message);
    }

    public INNException(String message, Throwable err){
        super(message, err);
    }
}
