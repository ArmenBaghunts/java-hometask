public class Passenger {
    private boolean noHasPassSeat=false;
    private boolean noHasVisa=false;
    private boolean noValidPassport=true;

   public Passenger(boolean noHasPassSeat, boolean noHasVisa, boolean noValidPassport) {


    }

    boolean getNoHasPassSeat(){
        return noHasPassSeat;
    }

    boolean getNoHasVisa(){
        return  noHasVisa;
    }

    boolean getNoValidPassport() {
        return noValidPassport;
    }
}


