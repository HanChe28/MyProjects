import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main (String [] args) {
        ArrayList<String> tasks = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while(true) {
            System.out.println("Enter task to add to list (or type 'quit' to exit");
            input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            tasks.add(input);
            System.out.println("Task added to your list.");
        }

        System.out.println("/nYour to-do list: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + "  " + tasks.get(i));
        }
    }
}
