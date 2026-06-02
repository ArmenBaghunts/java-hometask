public class Houses implements Comparable<Houses> {
        int area;
        int roomNumbers;
        String name;
    public Houses(int area,  int roomNumbers, String name) {
        this.area=area;
        this.roomNumbers=roomNumbers;
        this.name=name;
    }

    @Override
    public int compareTo(Houses o) {
        if (this.area>o.area)
        return 1;
        return  -1;

    }
}
