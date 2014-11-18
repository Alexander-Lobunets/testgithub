package ua.com.lohika.bsm.qa.blog;

import java.util.Date;


public abstract class Record {

    String body;
    String recorddate;
    String username;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRecorddate() {
        Date date = new Date();
        return date.toString();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
