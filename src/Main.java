public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        UserInterface ui = new UserInterface(database);
        ui.startProgram();
    }
}