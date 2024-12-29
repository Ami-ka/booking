
public class Main {
    public static void main(String[] args) {
        Room firstRoom = new Room(1, 1000, RoomType.BASIC);

        Hotel.roomAdd(firstRoom);

        Hotel.showHotelINFO();
    }
}
