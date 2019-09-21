public class Customer {

    private final int id;
    private double time;
    private Status status;
    
    /** Constructor to initialise a Customer */
    public Customer(int id, double arrivalTime) {
        this.id = id;
        this.time = arrivalTime;
        this.status = Status.ARRIVES;
    }
    
    /** Getter for time */
    public double getTime() {
        return this.time;
    }

    /** Getter for ID */
    public double getId() {
        return this.id;
    }
    
    public Status getStatus() {
        return this.status;
    }

    public void setArrive() {
        this.status = Status.ARRIVES;
    }

    public void setWait() {
        this.status = Status.WAITS;
    }

    public void setTime(double time) {
        this.time = time;
    }

    /** Setter for status of this instant of Customer to be SERVED */
    public void setServed() {
        this.status = Status.SERVED;
    }

    public void setDone() {
        this.time += 1.0;
        this.status = Status.DONE;
    }
    
    /** Setter for status of this instant of Customer to be LEAVES */
    public void setLeaves() {
        this.status = Status.LEAVES;
    }

    public Boolean isServed() {
        if (this.status == Status.SERVED) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isDone() {
        if (this.status == Status.DONE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String output = new String();
        output = String.format("%.3f %d %s", this.time, this.id,
               this.status); 
        return output;
    }
}
