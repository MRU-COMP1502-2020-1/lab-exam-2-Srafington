package lsystems;

public class A_AA extends LRule{

    private final char[] ruleOutput = {'A', 'A'};
    private final char rule = 'A';

    @Override
    public char getMatch() {
        // TODO Auto-generated method stub
        return rule;
    }

    @Override
    public char[] getBody() {
        // TODO Auto-generated method stub
        return ruleOutput;
    }
    

}