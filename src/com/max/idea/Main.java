package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner sc = new Scanner(System.in);


        int n = 0;
        do
        {
            String s = sc.nextLine();
            if(s.equals("Подсказка"))
            {
                if(n == 0)
                {
                    System.out.println("Какой это вирус?");
                    s = sc.nextLine();
                }
                else
                {
                    System.out.println("Подсказка недоступна");
                    s = sc.nextLine();
                }
            }
            if(s.equals("Заархивированный вирус"))
            {
                System.out.println("Правильно!");
                break;
            }
            if(n == 1 || n == 0)
            {
                System.out.println("Подумай еще!");
            }
            if(n == 2)
            {
                System.out.println("Обидно, приходи в другой раз");
            }
            n++;
        }
        while(n < 3);

        sc.close();
    }
}

