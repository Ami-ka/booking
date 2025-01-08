import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hotel.set_HotelINFO("Cool hotel", "boba street 35");
        Room firstRoom = new Room(1, 1000, RoomType.BASIC);
        Room secondRoom = new Room(2, 2000, RoomType.VIP);
        Room thirdRoom = new Room(3, 500, RoomType.ECONOM);
        Room fourthRoom = new Room(4, 1000, RoomType.BASIC);
        Room fifthRoom = new Room(5, 1000, RoomType.BASIC);
        Hotel.roomAdd(firstRoom);
        Hotel.roomAdd(secondRoom);
        Hotel.roomAdd(thirdRoom);
        Hotel.roomAdd(fourthRoom);
        Hotel.roomAdd(fifthRoom);
        
        User firstUser =  new User("first", "user");
        Hotel.registration(firstUser);
        Scanner scanner = new Scanner(System.in);

        boolean x = true;
        while(x){
            System.out.println("are you registered?\n yes/no");
        String yesNo = scanner.nextLine();
        
        if(yesNo.equals("yes")){
            System.out.println("Enter your login: ");
            String login = scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.nextLine();
            User user = new User(login, password);
            if(Hotel.login(user) == "login sucessful"){
                x = false;
            }
        }
        else{
            System.out.println("Enter new login: ");
            String newlogin = scanner.nextLine();
            System.out.println("Enter new password: ");
            String newpassword = scanner.nextLine();
            User newUser = new User(newlogin, newpassword);
            Hotel.registration(newUser);
        }
        }

        
        





        System.out.println("\n");
        Hotel.showHotelINFO();

        System.out.println("Do you want book a room? \nyes/no");
        String yesNo = scanner.nextLine();
        if(yesNo.equals(yesNo)){
            System.out.println("Which room do you want book?\n(put room number)");
            int roomNum = scanner.nextInt();
            Hotel.booking(roomNum);
        }
        scanner.close();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        Hotel.showHotelINFO();
        
        
    }
}
