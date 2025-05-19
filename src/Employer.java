public class Employer  extends User{


    private MessageService messageService;
    private String companyName;
    private String  postedJob;

    public Employer(String companyName, String postedJob) {
        this.companyName = companyName;
        this.postedJob = postedJob;
    }

    public Employer(){}

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPostedJob() {
        return postedJob;
    }

    public void setPostedJob(String postedJob) {
        this.postedJob = postedJob;
    }

    public void sendMessageToUser(String message){
        messageService.sendMessage(message);
    }
    public void receiveMessageFromUser(String message){
        messageService.receiveMessage(message);
    }

}
