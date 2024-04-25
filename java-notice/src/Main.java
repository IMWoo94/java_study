import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static InputStreamReader inputStreamReader;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			inputStreamReader = new InputStreamReader(System.in);
			try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
			) {
				BufferedReader br = new BufferedReader(inputStreamReader);
				String s = br.readLine();
				bw.write(s);
				bw.flush();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}