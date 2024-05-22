import java.util.Arrays;

public abstract class Parser {
    public abstract int[] getHeader();
    public abstract int[] getCommands();

    public int[] validateHeader(String input){
        String regex = "([0-9]+)(,[0-9]+){3}";
        int[] header = null;

        if (!input.matches(regex)) {
            System.err.println("incorrect header provided");
        } else {
            header = Arrays.stream(input.split(",", 4)).mapToInt(Integer::parseInt).toArray();
            if (header[2] >= header[0] || header[3] >= header[1]) {
                System.err.println("incorrect header provided");
                header = null;
            }
        }

        return header;
    }

    public int[] validateCommands(String input){
        String regex = "(" + Constants.COMMAND_RANGE + ")(," + Constants.COMMAND_RANGE + ")*";
        int[] commands = null;

        if (!input.matches(regex)) {
            System.err.println("incorrect commands provided");
        } else {
            commands = Arrays.stream(input.split(",")).mapToInt(command -> Integer.parseInt(command.trim())).toArray();
        }

        return commands;
    }

}
