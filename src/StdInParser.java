import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class StdInParser extends Parser {
    @Override
    public int[] getHeader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> line;

        //System.out.println("input header:");
        line = reader.lines();

        return validateHeader(line.findFirst().orElse(""));
    }

    @Override
    public int[] getCommands() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> line;

        //System.out.println("input commands:");
        line = reader.lines();

        return validateCommands(line.findFirst().orElse(""));
    }

}
