package piaps_lab5;

public class TabsInterpreter implements Interpreter {

	@Override
	public String interpret(String str) {
		// TODO Auto-generated method stub
		String result = str;
		while (result.contains("\t\t")) {
			result = result.replace("\t\t", "\t");
		}
		return result;
	}

}
