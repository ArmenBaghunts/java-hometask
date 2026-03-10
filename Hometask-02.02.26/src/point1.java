class house{
    private int numberofroom;
    private boolean entryway=true;
    private int numberofrestroom;
    private int numberofbalcony;
    private float areaoflivingpart;
    private int address;

    house(int nroom, int nr,int nb,float s) {
        numberofroom=nroom;
        numberofrestroom=nr;
        numberofbalcony=nb;
        areaoflivingpart=s;

    }

    void method1() {

    }

    void method2() {

    }

}
public class point1 {
    public static void main(String[] args) {
    house house1=new house(3,1,1,70);
    house house2=new house(4,2, 1,90);
    house house3=new house(5,2,2,115);

    house1.method1();
    house2.method1();
    house3.method1();
    house1.method2();
    house2.method2();
    house3.method2();
    }
}