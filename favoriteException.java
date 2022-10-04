public class favoriteException extends Exception{
    public favoriteException(String message){
        super(message);
    }
    public String outofBound(){
        return "Not in the LOOP";
    }
    public String negativeIndex(){
        return "The Index is not Negative";
    }
}