package piaps_lab5;

public class TextInterpreter implements Interpreter {
	private Interpreter extraSpaceInterpreter;
	private Interpreter hyphenInterpreter;
	private Interpreter quotesInterpreter;
	private Interpreter tabsInterpreter;
	private Interpreter newlineInterpreter;

	@Override
	public String interpret(String str) {
		// TODO Auto-generated method stub
		String result = str;
		result = this.hyphenInterpreter.interpret(result);
		result = this.extraSpaceInterpreter.interpret(result);
		result = this.quotesInterpreter.interpret(result);
		result = this.tabsInterpreter.interpret(result);
		result = this.newlineInterpreter.interpret(result);
		
		return result;
	}

	public TextInterpreter() {
		super();
		this.extraSpaceInterpreter = new ExtraSpaceInterpreter();
		this.hyphenInterpreter = new HyphenInterpreter();
		this.quotesInterpreter = new QuotesInterpreter();
		this.tabsInterpreter = new TabsInterpreter();
		this.newlineInterpreter = new NewLineInterpreter();
	}
}
