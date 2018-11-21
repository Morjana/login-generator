package geco;

/**
 *
 */
public class PasswordGeneration {

    public PasswordGeneration(){

    }

    public String getRandomPassword(){
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int charLength = chars.length();
            StringBuilder  pass = new StringBuilder (charLength);
            for (int x = 0; x < 8; x++) {
                int i = (int) (Math.random() * charLength);
                pass.append(chars.charAt(i));
            }
    return pass.toString();

    }
}
