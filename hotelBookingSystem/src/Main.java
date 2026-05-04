
public class Main {
    public static void main(String[] args) {

     Room[] rooms = {new Room(1, false), new Room(2, false),
                new Room(3, false), new Room(4, true),
                new Room(5, false)};

     BookingService b = new BookingService();
     Guest g1 = new Guest(19);

        try {
            for (int i=0; i< rooms.length; i++) {
                b.bookRoom(g1, rooms[i]);
            }

        }
        catch(RoomUnavailableException e){
            System.out.println("This room is not free.");
        }
        catch(UnderAgeException e){
            System.out.println("You are under 18.");
        }

    }
}