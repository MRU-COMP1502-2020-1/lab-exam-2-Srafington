package lsystems;

public class C_BA extends LRule{

    private final char[] ruleOutput = {'B', 'A'};
    private final char rule = 'C';

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