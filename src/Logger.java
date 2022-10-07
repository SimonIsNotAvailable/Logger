public class Logger {
    private static Logger logger = null;
    private long start;
    private Logger() {
        this.start = System.currentTimeMillis();
    }
    public static Logger get() {
        if( logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public void append(String toAppend) {
        logger.append(toAppend);
    }
    public String toString(){
        return "Start time :" + start + " ";
    }
}
