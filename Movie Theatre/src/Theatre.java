import static jdk.internal.jimage.decompressor.CompressedResourceHeader.getSize;

public class Theatre {
    private IntegerSet seatsRemaining;
    private IntegerSet occupiedSeats;
    private IntegerSet aisleSeats;
    private int TotalRows;

    //Default
    Theatre() {
        seatsRemaining = new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
    }
    Theatre(int totalSeats, int[] firstRowAisleSeats, int rows) {
        seatsRemaining = new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for (int i = 0; i < totalSeats; i++) {
            seatsRemaining.insert(i + 1);
        }
        TotalRows = 10;

        for (int n : firstRowAisleSeats) {
            aisleSeats.insert(n);
        }
        TotalRows = rows;
    }

    //Requires: integer, seat number
    //Modifies: this
    //Effects: if the seat is remaining remove seat from IntegerSet and add it to occupied
    //integerset. Else do nothing
    public void purchaseSeat(int seatNum){
        if (seatsRemaining.contains(seatNum)) {
            occupiedSeats.insert(seatNum);
            seatsRemaining.remove(seatNum);
        }
    }

    //Effects: returns the remaining seats in the theatre
    public IntegerSet getSeatsRemaining(){
        return seatsRemaining;
    }

    //Requires: integer, seatNum
    //Effects: return true if seat is on an aisle, else return false
    public boolean isAisle(int SeatNum){
           int seatsPerRow = getSize() / TotalRows;
           return aisleSeats.contains(SeatNum % seatsPerRow);
    }

    //Requires: integer, seat number
    //Effects: returns true if seat is purchased, else returns false
     public boolean isPurchased (int num){
          return occupiedSeats.contains(num);
     }

      //Effects: returns number of remaining seats
     public int getSize(){
          return seatsRemaining.getsize();
     }
}


