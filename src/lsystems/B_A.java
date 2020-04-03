package lsystems;

public class B_A extends LRule{

    private final char[] ruleOutput = {'A'};
    private final char rule = 'B';

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