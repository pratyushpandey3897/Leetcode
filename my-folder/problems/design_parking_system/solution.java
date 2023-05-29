class ParkingSystem {

    int bigSlot;
    int mediumSlot;
    int smallSlot;
    public ParkingSystem(int big, int medium, int small) {
        this.bigSlot = big;
        this.smallSlot = small;
        this.mediumSlot = medium;

    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1: if (bigSlot > 0) {
                        bigSlot--;
                        return true;
                        } 
                        else 
                        return false;
            
            case 2: if (mediumSlot > 0) 
                        {
                        mediumSlot--;
                        return true;
                        }
                    else 
                        return false;
            case 3: if (smallSlot > 0){
                        smallSlot--;
                        return true;
                        }
                    
                    else
                    return false;
        }

        return false;

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */