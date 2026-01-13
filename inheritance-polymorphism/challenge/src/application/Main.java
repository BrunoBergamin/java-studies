package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Título: ");
            String title = sc.nextLine();
            System.out.print("URL do vídeo: ");
            String url = sc.nextLine();
            if (ch == 'c') {
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                list.add(new Video(url, seconds, title));
            } else {
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                list.add(new Task(url, title, questionCount));
            }
        }
        double total = 0;
        System.out.println();
        for (Lesson lesson : list) {
            total += lesson.duration();
        }
        System.out.printf("DURAÇÃO TOTAL DO CURSO = %.2f segundos%n", total);

        sc.close();

    }
}