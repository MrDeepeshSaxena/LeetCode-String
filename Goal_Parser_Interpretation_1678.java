public class Goal_Parser_Interpretation_1678 {

    public String interpret(String command) {
        String formattedString = command.replace("()", "o").replace("(", "").replace(")", "");
        return formattedString;
    }
}

