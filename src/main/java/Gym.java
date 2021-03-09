public class Gym {
    public static void main(String[] args) {
        int day = 1;

        switch(day){
            case 1:
                System.out.println("Chest Day");
                break;
            case 2:
                System.out.println("Back Day");
                break;
            case 3:
                System.out.println("Leg Day");
            default:
                System.out.println("It's Rest Day");
        }
    }
}
