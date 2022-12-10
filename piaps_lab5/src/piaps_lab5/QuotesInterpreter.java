package piaps_lab5;

public class QuotesInterpreter implements Interpreter {

	@Override
	public String interpret(String str) {
		// TODO Auto-generated method stub
		String result = str;
		if(result.contains("“")) {
			result = result.replaceAll("“", "«");
		}
		if(result.contains("”")) {
			result = result.replaceAll("”", "»");
		}
		int flag = 0;
		while (result.contains("\"")) {
			if(flag == 0) {
				result = result.replaceFirst("\"", "«");
				flag = 1;
			}
			else {
				result = result.replaceFirst("\"", "»");
				flag = 0;
			}
		}
		return result;
	}

}
