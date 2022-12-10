package piaps_lab5;

// дефис-интерпритатор
public class HyphenInterpreter implements Interpreter {

        @Override
        public String interpret(String str) {
                // TODO Auto-generated method stub
                String result = str;
                while (result.contains(" - ")) {
                        result = result.replace(" - ", " — ");
                }
                return result;
        }

}
