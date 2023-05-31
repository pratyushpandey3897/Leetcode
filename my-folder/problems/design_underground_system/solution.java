class UndergroundSystem {



    Map<Integer, Customer> passenger;
    Map<String, TravelInfo> avgTime;

    class Customer{
        String checkedInAt;
        int checkInTime;

        public Customer(String stationName, int time){
            this.checkedInAt = stationName;
            this.checkInTime= time;
        }

    }

    class TravelInfo {
        int totalTime;
        int count;

        public TravelInfo(int t, int count) {
            this.totalTime = t;
            this.count = count;
        }
    }
    

    public UndergroundSystem() {
        passenger = new HashMap<>();
        avgTime = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        
        passenger.put(id, new Customer(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Customer c = passenger.remove(id);

        String keyS = c.checkedInAt + ">"+ stationName;
        int travelTime = t - c.checkInTime;

        if (avgTime.containsKey(keyS)){
            TravelInfo travelInfo = avgTime.get(keyS);
            travelInfo.totalTime += travelTime;
            travelInfo.count++;
        } 
        else
            avgTime.put(keyS, new TravelInfo(travelTime, 1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String keyS = startStation + ">"+ endStation;
        TravelInfo t = avgTime.get(keyS);
        return (double) t.totalTime/t.count;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */