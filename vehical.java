public class vehical {
    // inheritance class 

     int numberOfTires; // he defult kela tr apan twowheeler class madhe direct value set karu shakato pn private madhe nay check this in twowheeler class
    // this is setter method
    public void setNumofty(int numoftyers){
        this.numberOfTires=numoftyers;
    }

    public void commute(){
        System.out.printf("I am going from  place A to B using %d using tires\n",numberOfTires);

    }

    public vehical(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    // inheritance 
    

}
