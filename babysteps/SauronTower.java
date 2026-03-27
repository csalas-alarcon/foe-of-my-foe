// SauronTower.java
package babysteps;

import java.util.Scanner;

public class SauronTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Talk, I'll copy you: ");
        String text = input.nextLine();

        System.out.println("You said: \n" + text);

        input.close();
    }
}
