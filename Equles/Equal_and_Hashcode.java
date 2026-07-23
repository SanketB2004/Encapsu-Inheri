package Equles; 

public class Equal_and_Hashcode {
    public static void main(String[] args) {
        
        person person1 = new person("Prashant", 31, "001");
       
        person person2 = new person("Prashant", 30, "001");

        if (person1.equals(person2)) {
            System.out.println("Equles");
        }else {

            System.out.println("Not Equls");
        }



    }
}
