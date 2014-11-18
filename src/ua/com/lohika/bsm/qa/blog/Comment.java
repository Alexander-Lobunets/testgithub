package ua.com.lohika.bsm.qa.blog;

import java.util.Date;


public class Comment extends Record{



    Comment(String postdate, String body, String username){
        this.recorddate = postdate;
        this.body = body;
        this.username = username;

    }


}
