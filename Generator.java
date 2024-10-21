import java.util.Random;
public class Generator {
    private int length;
    private String password;
    String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
    String[] syms = {"!","@","#","$","%","^","&","*","(",")"};
    String[] chars = {"a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "x", "c", "v", "b", "n", "m"};
    public Generator(int length) {
        this.length = length;
        password = "";
    }
    public String getPassword() {
        password();
        return password;
    }
    public void password() {
        Random rand = new Random();
        int num;
        int place;
        password = "";
        for(int i = 0; i < length; i++) {
            num = rand.nextInt(3) + 1;
            place = rand.nextInt(10);
            if(num == 1) {
                password += nums[place];
            } else if (num == 2) {
                password += syms[place];
            } else {
                place = rand.nextInt(chars.length);
                password += chars[place];
            }
        }
    }
}
