public class TestFruit{
    public static void main(String[] args) {
        Fruit   apple = new Fruit("apple",2.5,1000);
        PackedFruit packedApple = new PackedFruit("apple", 2.5, 1000, 200);

        System.out.println(apple);
        System.out.println(packedApple);
    }

}
