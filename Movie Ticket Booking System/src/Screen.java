public class Screen {
    int screenId;
    String name;
    int totalSeats;
    boolean[][] seatLayout;
    public Screen(int screenId,String name, int totalSeats, boolean[][] seatLayout){
        this.screenId = screenId;
        this.name = name;
        this.totalSeats = totalSeats;
        this.seatLayout = seatLayout;
    }
    public boolean[][] getSeatMap(boolean seatLayout){

    }
    public boolean[][] lockSeat(boolean[][] seatLayout){

    }
}
