import java.io.*;
import java.util.ArrayList;

public class DataOutputStreamExample {
	public static void main(String[] args) throws IOException {
		OutputStream outname = new FileOutputStream(args[0]);
		BufferedWriter out = null;

		try {
			out = new BufferedWriter(new OutputStreamWriter(outname, "EUC_JP"));

			for (int i = 0; i <= 100; i++) {
				out.write("" + i);
				//out.writeInt(i);
				out.newLine();
			}

		} catch (IOException ioe) {
			// do nothing
		} finally {
			if (out != null)
				out.close();
		}

		BufferedReader in = null;

		ArrayList<Integer> list = new ArrayList<Integer>();

		try {
			in = new BufferedReader(new FileReader(args[0]));
			String str;
			while ((str = in.readLine()) != null) {
				list.add(Integer.parseInt(str));
			}
		} catch (IOException ioe) {
			// do nothing
		} finally {
			if (in != null)
				in.close();
		}

	}
}
