public class Main {
    public static void main(String[] args) {
        Parser parser = new StdInParser();
        int[] finalCoords;
        int[] commands;
        int[] header;
        Table table;

        header = parser.getHeader();
        if (header == null) return;
        table = new Table(header[0], header[1], header[2], header[3]);

        commands = parser.getCommands();
        if (commands == null) return;

        CommandInterpreter commandInterpreter = new CommandInterpreter();
        finalCoords = commandInterpreter.runCommands(table, commands);

        System.out.println(finalCoords[0] + "," + finalCoords[1]);
    }
}