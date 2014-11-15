import java.util.Date;


public abstract class Record {

    String body;
    Date postdate;
    String postername;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public String getPostername() {
        return postername;
    }

    public void setPostername(String postername) {
        this.postername = postername;
    }


}
