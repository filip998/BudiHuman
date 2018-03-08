package vezbanje;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("uplate.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sum = 0;
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		while (true) {
			String x = null;
			try {
				x = buf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (x == null)
				break;
			int i;
			for (i = 0; i < x.length(); i++)
				if (x.charAt(i) == '\t')
					break;
			i++;
			StringBuilder s = new StringBuilder();
			for (int j = i; j < x.length() && x.charAt(j) != ','; j++)
				if (x.charAt(j) != '.')
					s.append(x.charAt(j));
			String p = s.toString();
			sum += Integer.parseInt(p);
		}
		System.out.println("Ukupno je sakupljeno: " + sum);
	}
}
