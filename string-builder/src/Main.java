import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesone!");

        Post p1 = new Post("I'm going to visit this wonderful country!",
                12,
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand");

        p1.addComment(c1);
        p1.addComment(c2);


        System.out.println(p1);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post("Good night guys",
                5,
                sdf.parse("28/07/2018 23:14:19"),
                "See you tomorrow");

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}