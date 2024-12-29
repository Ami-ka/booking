

public class Room extends Hotel {
    private int roomNum;
    private double price;
    private BookStatus bookStatus = BookStatus.available;
    private RoomType roomType; 


   
    public Room(int roomNum, double price, RoomType roomType){
        this.roomNum = roomNum;
        this.price = price;
        this.roomType = roomType;
    }




    
    
    public void setBookStatus(BookStatus newStatus){
        this.bookStatus = newStatus;
    }

    //getters:
    public RoomType get_roomType(){
        return roomType;
    }

    public int get_roomNum(){
        return roomNum;
    }

    public double get_price(){
        return price;
    }

    public BookStatus get_bookStatus(){
        return bookStatus;
    }

}