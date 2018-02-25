import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream in = new LowerCaseInputStream(
				new BufferedInputStream(
					new FileInputStream("test.txt")
				)
			);

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
