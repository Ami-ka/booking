public class Main {
    public static void main(String[] args) {
        Room myRoom = new Room(1);
        System.out.println(myRoom.get_roomNum());
        myRoom.set_roomNum(0);;
        System.out.println(myRoom.get_roomNum());
    }
}
