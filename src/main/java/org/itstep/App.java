package org.itstep;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Пишите ваш код здесь
        Command commandHelp = new Command() {
            @Override
            public void execute(String... args) {
                System.out.println("Help executed");
            }
        };

        Command commandNow = new Command() {
            @Override
            public void execute(String... args) {
                System.out.println(System.currentTimeMillis());
            }
        };

        Command commandExit = new Command() {
            @Override
            public void execute(String... args) {
                System.out.println("Goodbye!");
            }
        };

        Command commandEcho = new Command() {
            @Override
            public void execute(String... args) {
                for (int i = 1; i <args.length ; i++) {
                    if (i<args.length-1){
                        System.out.print(args[i]+" ");
                    }else {
                        System.out.print(args[i]);
                    }

                }
            }
        };

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arrStr = str.split(" ");

        if (arrStr[0].equals("exit")){
            commandExit.execute(arrStr);
        } else if (arrStr[0].equals("echo")) {
            commandEcho.execute(arrStr);
        } else if (arrStr[0].equals("help")) {
            commandHelp.execute(arrStr);
        } else if (arrStr[0].equals("now")) {
            commandNow.execute(arrStr);
        }
    }
}
