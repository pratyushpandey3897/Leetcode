class Logger {

    Map<String, Integer> logmap;
    public Logger() {
        logmap = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (logmap.containsKey(message)){
            if (timestamp >= logmap.get(message) +10 ){
                logmap.put(message, timestamp);
                return true;
            } else {
                return false;
            } 
        } 

        logmap.put(message, timestamp);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */