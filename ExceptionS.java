public class ExceptionS extends Exception{
    public ExceptionS(String message){
        super(message);
    }
    public String outofBound(){
        return "Negative varia";
    }
    public String negativeIndex(){
        return "This is not allowed";
    }
}