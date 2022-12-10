package piaps_lab5;

public class NewLineInterpreter implements Interpreter{

	@Override
	public String interpret(String str) {
		// TODO Auto-generated method stub
		String result = str;
        while (result.contains("\n\n")){
            result = result.replace("\n\n", "\n");
        }
        return result;
	}

}
