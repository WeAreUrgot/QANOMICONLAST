package addon;

import java.io.IOException;

public class Jenkins {
    public static void main(String[] args) {
        try {
            Process proc = Runtime.getRuntime().exec(new String[]
                    {"cmd.exe", "/c", "start http://localhost:8080/"});
            proc.waitFor();
            proc.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}