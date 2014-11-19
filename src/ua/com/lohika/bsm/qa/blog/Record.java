package ua.com.lohika.bsm.qa.blog;

import java.util.Date;


public abstract class Record {

    String body;
    String recordDate;
    String username;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRecordDate() {
        Date date = new Date();
        recordDate = date.toString();
    }

    public String getRecordDate() {
        return recordDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
