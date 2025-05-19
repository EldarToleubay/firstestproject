import java.util.HashMap;

//fixme: класстың атауы бас әріппен басталады
//fixme 2: дұрыс емес демейм, бірақ неге осы классты статик қылдым деген сұраққа жауап бере алуың керек
public class AccountUser {
public HashMap<String, String> accounts = new HashMap<>();





public void createAccount(String username, String password){
    accounts.put(username, password);
    System.out.println("Аккаунт құрылды");


}


}
        public void main() {
            AccountUser user = new AccountUser();
            user.createAccount("zhasbolatov@gmail.com","Sauat_2004");
            System.out.println(user.accounts );
        }


