package CustomException;

public class InsuficiantBalanceException extends Exception {
    InsuficiantBalanceException(String msg){
        super(msg);
    }
}
