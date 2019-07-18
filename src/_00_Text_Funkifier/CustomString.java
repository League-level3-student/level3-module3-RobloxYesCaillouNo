package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
		String output = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 4 == 0 || i % 4 == 1) {
				output += (s.charAt(i) + "").toUpperCase();
			} else {
				output += (s.charAt(i) + "").toLowerCase();
			}

		}

		return output;
	}

}
