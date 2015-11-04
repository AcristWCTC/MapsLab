/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author Adam
 */
public class Car implements Comparable {
    
    private int vin;

    public int compareTo(Object o) {
        Car targetCar = (Car)o;
        final int EQUAL = 0;
        final int BEFORE = -1;
        final int AFTER = 1;
        
        if(this.equals(targetCar)){
            return EQUAL;
        } else if(targetCar.getVin() < this.getVin()){
            return BEFORE;
        } else {
            return AFTER;
        }
          
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.vin;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.vin != other.vin) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
