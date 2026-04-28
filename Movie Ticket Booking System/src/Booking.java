public class Booking {
    private int bookingId;
    private int customerId;
    int showtimeId;
    int[] seats;
    int amount;
    boolean status;
    public Booking(int bookingId, int customerId, int showtimeId, int[] seats, int amount, boolean status){
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.showtimeId = showtimeId;
        this.seats = seats;
        this.amount = amount;
    }
    public boolean confirm(int booking){

    }
    public void cancle(boolean status){

    }
    public void generateETicket(){

    }
}
