public class Seat {
    int seatId;
    int row;
    int number;
    String catagory;
    boolean status;
    String lockExpire;
    public Seat(int seatId, int row, int number, String catagory, boolean status, String loncExpire){
        this.seatId = seatId;
        this.row = row;
        this.number = number;
        this.catagory = catagory;
        this.status = status;
        this.lockExpire = false;
    }
    public boolean lock(boolean lock){
        return lock;
    }
    public boolean release(boolean lock){
        if(lock == true){
            lock = false;
        }
        return lock;

    }
    public boolean book(boolean[][] seats){

    }
    public boolean isLocked(boolean lock){
        return lock;
    }

}
