package piaps_lab5;

public class ExtraSpaceInterpreter implements Interpreter {

	@Override
	public String interpret(String str) {
		// TODO Auto-generated method stub
		String result = str;
		if(result.contains(" ,")) {
			result = result.replace(" ,", ",");
		}
		if(result.contains(" .")) {
			result = result.replace(" " + ".", ".");
		}
		if(result.contains("( ")) {
			result = result.replace("( ", "(");
		}
		if(result.contains(" )")) {
			result = result.replace(" )", ")");
		}
		while(result.contains("  ")) {
			result = result.replace("  ", " ");
		}
		return result;
	}

}
