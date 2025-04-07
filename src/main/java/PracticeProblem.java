public class PracticeProblem {

	public static void bubbleSortString(String[] strings) {
		int n = strings.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		String[] arr = {"Lamborighini", "Ferrari", "Porsche", "Mclaren", "BMW"};
		bubbleSortString(arr);
		for (String word : arr) {
			System.out.println(word + " ");
		}
	}

}

	