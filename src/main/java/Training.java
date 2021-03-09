public class Training implements UpperBody1{
    public static void main(String[] args) {
        UpperBody objPush = new UpperBody();
        objPush.Arms();
        System.out.println(bicep);

    }


    @Override
    public void Arms() {
        System.out.println("time to curl");
    }

    @Override
    public void curl() {
        System.out.println("heavy");

    }
}
