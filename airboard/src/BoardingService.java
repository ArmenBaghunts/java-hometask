public class BoardingService {

void boardPassenger(Passenger p) throws ExpiredPassportException, NoVisaException, InvalidBoardingPassException, MostCriticalException  {
    if(p.getNoValidPassport() && p.getNoHasVisa() && p.getNoHasPassSeat() || (p.getNoValidPassport() && p.getNoHasVisa())
            || p.getNoHasVisa() && p.getNoHasPassSeat() || p.getNoValidPassport() && p.getNoHasVisa())
    {throw new MostCriticalException();}
    if (p.getNoValidPassport()) {throw new ExpiredPassportException();}
        if (p.getNoHasVisa()) {throw new NoVisaException();}
        if(p.getNoHasPassSeat()) {throw new InvalidBoardingPassException();}

    }
}
