public class BookingService {




    void bookRoom(Guest g, Room r) throws RoomUnavailableException, UnderAgeException {
        if (g.getAge() < 18) {
            throw new UnderAgeException(); }


            if (r.getRoomAvailable()) {throw new RoomUnavailableException();}

        if (g.getAge() < 18 && r.getRoomAvailable())  {
            System.out.println("The "+r.getRoomNumber()+"-th number is free. Please, enter that room");  }

        }
    }


