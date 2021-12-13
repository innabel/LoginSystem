import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    IDandPasswords() {
        loginInfo.put("Bro", "123");
        loginInfo.put("Peter", "cups");
        loginInfo.put("Ann", "abc123");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }

} // end of class
