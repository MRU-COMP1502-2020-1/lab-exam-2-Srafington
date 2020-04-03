package lsystems;

public class A_Q extends LRule{

    private final char[] ruleOutput = {'Q'};
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