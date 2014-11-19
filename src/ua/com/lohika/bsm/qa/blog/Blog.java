package ua.com.lohika.bsm.qa.blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Blog {



    private List<Record> records;
    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public static void main(String[] args){
        Blog blog = new Blog();
        blog.go();
    }

    // return record
    Record getRecord(int id){
        return records.get(id);
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
        Scanner sc = new Scanner(System.in);
        String postAction = null;
        postAction = sc.next();
        switch (postAction){
            case "CREATE":
                System.out.println("Type post title");
                String title = sc.nextLine();
                sc.nextLine();
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

                break;

            case "GET":
                System.out.println("Please enter the specific Post ID ");
//                int id =
                break;

            case "EDIT":
                System.out.println("edit");

            case "DELETE":
                System.out.println("delete");
                break;

            case "ALL":
//                System.out.println("all");


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

    void go(){
        records = new ArrayList<>();
        while (true){

            mainMenu();
            mainMenuSwitch();



        }

    }

}
