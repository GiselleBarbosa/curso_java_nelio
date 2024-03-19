package outros_exemplos;

public class String_funcoes {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();

		String s03 = original.trim();

		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);

		String s06 = original.replace('a', '@');
		String s07 = original.replace("abc", "123");

		int i = original.indexOf("bc");

		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "batata laranja morango";
		String[] vetor = s.split(" ");
		String word1 = vetor[0];
		String word2 = vetor[1];
		String word3 = vetor[2];
		System.out.println("word1 " + word1);
		System.out.println("word2 " + word2);
		System.out.println("word3 " + word3);
	}

}
