import javax.swing.JOptionPane;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Solution {

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(() -> JOptionPane.showMessageDialog(null, "Get back to work!"), 0, 2, TimeUnit.HOURS);
    }

}
