package piaps_lab5;

public class Program {

	public static void main(String[] args) {
		String inputString = "Zankoku na tenshi no you ni\n"
				+ "Shonen yo , shinwa ni nare ...\n"
				+ "\n"
				+ "Aoi kaze ga - ima mune no doa wo tataitemo ,\n"
				+ "Watashi dake wo tada mitsumete\n"
				+ "Hohoenderu   “Anata”\n"
				+ "\"Sotto\" Fureru mono\n"
				+ "Motomeru koto ni                 muchuu de,\n"
				+ "Unmei sae mada shiranai 							itaikena hitom";

		TextInterpreter inter = new TextInterpreter();

		String result = inter.interpret(inputString);

		System.out.println(result);
	}

}
