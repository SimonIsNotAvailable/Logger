
import java.util.Date;

public class Logger {
    private static Logger logger = null;
    private Date start;
    private StringBuilder sb = new StringBuilder();
    private int msgNumber = 0;
    private Logger() {

        this.start = new Date();
    }
    public static Logger get() {
        if( logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public void log(String msg) {
        sb.append("[ " + start +
                " " + msgNumber++ +
                " ] " + msg + "\n");
    }
    public String toString(){
        return sb.toString();
    }
}
