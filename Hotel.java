import java.util.ArrayList;

abstract class Hotel {
    private static String name;
    private static String address;
    private static ArrayList<Room> rooms = new ArrayList<>();



    public static void roomAdd(Room room){
        rooms.add(room);
    };


    static void showHotelINFO(){
        System.out.println("Hotel: " + name);
        System.out.println("Hotel address: " + address);
        System.out.println("Amount of rooms: " + rooms.size() + "\n");
        System.out.println("Rooms:\n");

        for(Room i : rooms){
            System.out.println("Room number: " + i.get_roomNum() );
            System.out.println("Room price per night: " + i.get_price() + "kzt");
            System.out.println("Room status: " + i.get_bookStatus());
            System.out.println("Room type: " + i.get_roomType());
        }

        
    }

    public void set_HotelINFO(String name, String address){
        Hotel.name = name;
        Hotel.address = address;
    }
}   



