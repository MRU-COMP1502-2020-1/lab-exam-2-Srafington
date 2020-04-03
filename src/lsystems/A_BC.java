package lsystems;

public class A_BC extends LRule{

    private final char[] ruleOutput = {'B', 'C'};
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