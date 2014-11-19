package ua.com.lohika.bsm.qa.blog;

import java.util.List;


public class Post extends Record {

    private String title;
    private List<Comment> comments; // comments list



    private List<Attachment> attachments;
//    List<Object> objects;

    Post(String title,
         String body,
         String username,
         List<Attachment> attachments)
    {

        this.title = title;
        this.body = body;
        this.username = username;
        this.recordDate = getRecordDate();
        this.comments = null;
        this.attachments = null;
    }


    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void addAttachment(List<Attachment> attachments) {
        this.attachments = attachments;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
