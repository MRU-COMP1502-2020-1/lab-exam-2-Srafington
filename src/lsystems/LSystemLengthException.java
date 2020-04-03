package lsystems;

public class LSystemLengthException extends Exception {

    /**
     * Autogenerated Field
     */
    private static final long serialVersionUID = -1926630726794879978L;

    private int length;
    
    
    public LSystemLengthException(int length) {
        this.length = length;
     }
     
     public int getLength() {
        return length;
     }
}