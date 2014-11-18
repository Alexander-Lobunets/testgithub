package ua.com.lohika.bsm.qa.blog;

import java.io.File;


public class Attachment {
    private String description;
    private String attachmentpath;


    Attachment(String description, String attachmentpath){
        this.description = description;
        this.attachmentpath = attachmentpath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachmentpath() {
        return attachmentpath;
    }

    public void setAttachmentpath(String attachmentpath) {
        this.attachmentpath = attachmentpath;
    }
}
