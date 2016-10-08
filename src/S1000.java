import java.io.*;

/**
 * Created by junes on 2016/10/8.
 */
public class S1000 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        in.nextToken();
        int a = (int)in.nval;

        in.nextToken();
        int b = (int)in.nval;

        out.println(a + b);

        out.flush();
    }
}
