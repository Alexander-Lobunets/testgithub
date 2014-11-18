package blog.qa.bsm.lohika.com;

import java.util.List;
import java.util.Scanner;


public class Blog {


    private List<Record> records;
//    enum POST {CREATE, GET, EDIT, DELETE, ALL, EXIT}


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

    public void addRecord(){



    }






    public void mainMenu(){
        System.out.println("==========================");
        System.out.println("Create new blog.qa.bsm.lohika.com.Post (CREATE)");
        System.out.println("Get a specific blog.qa.bsm.lohika.com.Post (GET)");
        System.out.println("Edit blog.qa.bsm.lohika.com.Post (EDIT)");
        System.out.println("Delete post (DELETE)");
        System.out.println("Get all Posts (ALL)");
        System.out.println("Exit (EXIT)");
        System.out.println("==========================\n");
    }

    void go(){
        while (true){
            mainMenu();
            Scanner sc = new Scanner(System.in);
            String postAction = null;
            postAction = sc.next();
            switch (postAction){
                case "CREATE":
                    System.out.println("create");
                    break;

                case "GET":
                    System.out.println("get");
                    break;

                case "EDIT":
                    System.out.println("edit");

                case "DELETE":
                    System.out.println("delete");
                    break;

                case "ALL":
                    System.out.println("all");
                    break;

                case "EXIT":
                    System.out.println("\n Thank you. Bye!!!");
                    System.exit(0);

                default:
                    System.out.printf("Incorrect value \"%s\". \nPlease try again\n", postAction);


            }


        }

    }

}
