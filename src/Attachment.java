import java.io.File;


public class Attachment {
    private String name;
    private String attachmentpath;


    Attachment(String name, String attachmentpath){
        this.name = name;
        this.attachmentpath = attachmentpath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttachmentpath() {
        return attachmentpath;
    }

    public void setAttachmentpath(String attachmentpath) {
        this.attachmentpath = attachmentpath;
    }
}
