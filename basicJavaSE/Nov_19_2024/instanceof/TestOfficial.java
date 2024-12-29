class Official{
    public String getRole(){
        return "Public official";
    }
}
class President extends Official{
    @Override
    public String getRole(){
        return "President.";
    }        
}
public class TestOfficial{
    public static void main(String[] args) {
        Official president = new President();
        if (president instanceof Official){
            System.out.println("President is Official.");
        }else{
            System.out.println("President is not Ofificial.");
        }
        System.out.println("Role:"+ president.getRole());

    }
}
