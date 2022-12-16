class ParkingSystem {
    int a[] ;
    public ParkingSystem(int big, int medium, int small) {
        a = new int[3];
        a[0] = big;
        a[1] = medium;
        a[2] = small;
    }
    
    public boolean addCar(int carType) {
        if (a[carType - 1] <= 0) return false;
        a[carType - 1]--;
        return true;
       
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */