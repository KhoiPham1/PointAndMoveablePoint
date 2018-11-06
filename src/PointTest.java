public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point);
        point.setX(2.34f);
        point.setY(3.43f);
        System.out.println(point);
        point.setXY(2.34f,3.3f);
        System.out.println(point);
    }
}
