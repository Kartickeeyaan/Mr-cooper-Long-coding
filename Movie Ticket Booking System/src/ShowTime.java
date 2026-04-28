public class ShowTime {
    int showtimeId;
    int movieId;
    int screenId;
    float startTime;
    float endTime;
    int pricing;
    public ShowTime(int showtimeId, int movieId, int screenId, float startTime, float endTime, int pricing){
        this.showtimeId = showtimeId;
        this.movieId = movieId;
        this.screenId = screenId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pricing = pricing;
    }
    public int getAvailableSeats(boolean[][] available){

    }
    public boolean isFull(boolean[][] seats){
        boolean flag = true;
        for(int i = 0 ; i < seats.length ; i ++){
            for(int j = 0 ; j < seats[0].length; j++){
                if(seats[i][j] == false){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public boolean hasStarted(float startTime , float currentTime){
        if(currentTime > startTime){
            return true;
        }
        return false;
    }
}
