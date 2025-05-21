public class Resume {
    private String name;
    private String surname;
    private String email;
    private int phoneNumber;
    private String address;
    private String education;


    public Resume(int phoneNumber, String name, String surname, String email, String address, String education) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.education = education;
    }
}
public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}

public String getSurname(){
    return surname;
}

public void setSurname(String surname){
    this.surname = surname;
}

 public int getPhoneNumber(){
    return phoneNumber;
 }

 public void setPhoneNumber(int phoneNumber){
     this.phoneNumber=phoneNumber;
 }

 public String getAddress(){
    return address;
 }

 public void setAddress(String address){
    this.address= address;
 }

 public String getEducation(){
    return education;
 }
 public void setEducation(String education){
    this.education=education;
 }
public void displayResume() {
}


