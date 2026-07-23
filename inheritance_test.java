public class inheritance_test {
    public static void main(String[] args) {
        
        vehical vehicall = new vehical(2);

        twowheeler twowheelerr = new twowheeler();

        vehicall.commute();
        twowheelerr.commute();
        twowheelerr.balance();;

        motorcycle  motor = new motorcycle();
        motor.commute();;
        motor.balance();;
        motor.start();;

  
    }
}
// inheritance 