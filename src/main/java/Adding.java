class Outside{
    int x=10;

    class Inside{
        int y=5;
    }
}
public class Adding {
    public static void main(String[] args) {

        Outside objOutside = new Outside();
        Outside.Inside objInside = objOutside.new Inside();
        System.out.println(objOutside.x + objInside.y);
    }
}

