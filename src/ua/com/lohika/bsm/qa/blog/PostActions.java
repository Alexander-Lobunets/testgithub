package ua.com.lohika.bsm.qa.blog;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostActions {



    public void createPost(Scanner sc, List<Record> records){
        System.out.println("Type post title");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Type post body text");
        String body = sc.nextLine();
        System.out.println("Type your username");
        String username = sc.nextLine();
        List<Attachment> attachments = new ArrayList<>();
        Record post = new Post(title, body, username, attachments);

        System.out.println(records);
        records.add(post);
        System.out.println(records);
        System.out.println("The post created successfully");
    }


    public void getPost(Scanner sc, List<Record> records){
        System.out.println("Please enter the specific Post ID ");
        int id = 0;
        boolean incorrectID = true;
        while(incorrectID) {
            id = sc.nextInt();
            if ((records.size() - 1) < id) {
                System.out.printf("The post with ID %d doesn't exist.\n", id);
            } else {
                incorrectID = false;
            }
        }
        Post postget = (Post) records.get(id);
        System.out.println("Title: " + postget.getTitle());
        System.out.println("Body: " + postget.getBody());
        System.out.println("Date: + " + postget.getRecordDate());
        System.out.println("Created by " + postget.getUsername());
        /** must be implemented later
         * System.out.println("Comments:"  );
         System.out.println("Attachments: "); */
    }


    public void deletePost(Scanner sc, List<Record> records){
        System.out.println("Please enter the specific Post ID ");
        int id = 0;
        boolean incorrectID = true;
        while(incorrectID) {
            id = sc.nextInt();
            if ((records.size() - 1) < id) {
                System.out.printf("The post with ID %d doesn't exist.\n", id);
            } else {
                incorrectID = false;
            }
        }
        records.remove(id);
        System.out.printf("The Post with ID %d deleted", id );

    }



}
