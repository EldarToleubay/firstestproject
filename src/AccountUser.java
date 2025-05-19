import java.util.HashMap;

public static class accountUser {
public HashMap<String, String> accounts = new HashMap<>();


public void createAccount(String username, String password){
    accounts.put(username, password);
    System.out.println("Аккаунт құрылды");


};


}

public void main() {
    accountUser user = new accountUser();
    user.createAccount("zhasbolatov@gmail.com","Sauat_2004");
    System.out.println(user.accounts );
}
