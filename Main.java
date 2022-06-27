import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj zdanie do poprawy");
		String s =scanner.nextLine();
		System.out.println(replaceSpaces(s));

	}

  public static String replaceSpaces(String s) {
		if(s.length() == 0) {
			return null;
		}
		return s.replaceAll("\\s+", " ");
  }

}