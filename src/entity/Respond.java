package entity;

public class Respond extends User{
    private boolean respond;

    public Respond(boolean respond) {
        this.respond = respond;
    }


    public boolean getRespond() {
        return respond;
    }

    public void setRespond(boolean respond) {
        this.respond = respond;
    }
}
