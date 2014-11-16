import java.util.Date;

/**
 * Created by lobunets on 15.11.2014.
 */
public class Comment extends Record{



    Comment(Date postdate, String body, String postername){
        this.postdate = postdate;
        this.body = body;
        this.postername = postername;

    }


}
