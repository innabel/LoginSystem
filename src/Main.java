public class Main {
    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        Login loginPage = new Login(idandPasswords.getLoginInfo());

    }
}
