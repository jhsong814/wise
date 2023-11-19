package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = this.sc.nextLine().trim();


            if (command.equals("종료")) {
                break;

            }

            else if(command.equals("등록")){
                System.out.printf("명언: ");
                String content = this.sc.nextLine().trim();

                System.out.printf("작가: ");
                String author = this.sc.nextLine();

                System.out.println("1번 명언이 등록되었습니다.");
            }


        }

    }
}
