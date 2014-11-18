package blog.qa.bsm.lohika.com;

import java.util.List;


public class Post extends Record {

    String caption;
    List<Comment> comments; // comments list
    List<String> pictures;
    List<Attachment> attachments;


}
