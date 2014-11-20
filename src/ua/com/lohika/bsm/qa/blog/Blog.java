package ua.com.lohika.bsm.qa.blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Blog {

    private List<Record> records;
    private Scanner sc;
    PostActions postActions;

    public static void main(String[] args){
        Blog blog = new Blog();
        blog.go();
    }

    public void mainMenu(){
        System.out.println("==========================");
        System.out.println("Create new Post (CREATE)");
        System.out.println("Get a specific Post (GET)");
        System.out.println("Edit Post (EDIT)");
        System.out.println("Delete post (DELETE)");
        System.out.println("Get all Posts (ALL)");
        System.out.println("Exit (EXIT)");
        System.out.println("==========================\n");
    }

    public void mainMenuSwitch(){
        sc = new Scanner(System.in);
        String postAction = null;
        postAction = sc.next();
        switch (postAction){
            case "CREATE":
                postActions.createPost(sc, records);
                break;
            case "GET":
                postActions.getPost(sc, records);
                break;
            case "EDIT":
                //not implemented yet
                System.out.println("edit");
            case "DELETE":
                postActions.deletePost(sc, records);
                break;
            case "ALL":
                //not implemented yet
                Iterator<Record> iterRecords = records.iterator();
                while(iterRecords.hasNext()){
                    System.out.println(iterRecords.next());
                }
                break;
            case "EXIT":
                System.out.println("\n Thank you. Bye!!!");
                System.exit(0);
            default:
                System.out.printf("Incorrect value \"%s\". \nPlease try again\n", postAction);
        }
    }

    private void go(){
        records = new ArrayList<>();
        postActions = new PostActions();
        while (true){
            mainMenu();
            mainMenuSwitch();
        }

    }

}
