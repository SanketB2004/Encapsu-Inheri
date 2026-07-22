
public class publicc {

    public String color;

    public String model;

    private double fuellevel;

    long costOfpurches; //make defult 


    public publicc(){

    }

    public publicc(String color, String model, double fuellevel, long costOfpurches) {
        this.color = color;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costOfpurches = costOfpurches;
    }




    @Override
    public String toString() {
        return "publicc [color=" + color + ", model=" + model + ", fuellevel=" + fuellevel + ", costOfpurches="
                + costOfpurches + "]";
    }

}
