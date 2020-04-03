package lsystems;

import java.util.List;
import java.util.Set;

public class LLine {

	char line[];
	Set<LRule> rules;

	public LLine(char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}

	public void process() throws LSystemSymbolException, LSystemLengthException {
		// char newLine[] = {};
		if (line.length == 0) {
			throw new LSystemLengthException(0);
		}
		String newLine = "";
		for (char c : line) {
			boolean noRule = true;
			for (LRule rule : rules) {
				if (rule.getMatch() == c) {
					// newLine = joinArrays(newLine, rule.getBody());
					newLine += new String(rule.getBody());
					noRule = false;
				}
			}
			if (noRule) {
				throw new LSystemSymbolException(c);
			}
		}
		line = newLine.toCharArray();
	}

	// private char[] joinArrays(char[] arrayA, char[] arrayB) {
	// int aLen = arrayA.length;
	// int bLen = arrayB.length;
	// char[] output = new char[aLen + bLen];
	// System.arraycopy(arrayA, 0, output, 0, aLen);
	// System.arraycopy(arrayB, 0, output, aLen, bLen);
	// return output;
	// }

	// private char[] listToArray(List<Character> list) {
	// char[] newChars = new char[list.size()];
	// for (int i = 0; i < list.size(); i++) {
	// newChars[i] = list.get(i);
	// }
	// return newChars;
	// }

	public String toString() {

		return new String(line);
	}

}
