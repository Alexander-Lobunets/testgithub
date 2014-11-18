package ua.com.lohika.bsm.qa.blog;

import java.util.Date;


public class Comment extends Record{



    Comment(Date postdate, String body, String postername){
        this.postdate = postdate;
        this.body = body;
        this.postername = postername;

    }


}
