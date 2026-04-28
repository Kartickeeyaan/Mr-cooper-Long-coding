public class ETicket {
    private int ticketId;
    private int bookingId;
    String qrCode;
    int[] seats;
    String showDetails;
    public ETicket(int ticketId, int bookingId , String qrCode, int[] seats, String showDetails){
        this.ticketId = ticketId;
        this.bookingId = bookingId;
        this.qrCode = qrCode;
        this.seats = seats;
        this.showDetails = showDetails;
    }
    public void generate(){

    }
    public validate(){

    }

}
