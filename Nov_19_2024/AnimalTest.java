public class AnimalTest{
    public static void main(String[] args) {
        AnimalCatogry[] animals ={new Eagle(), new Frog(), new Beetle()};
        for(AnimalCatogry animal:animals){
            animal.eat();
        }
    }
}
