
public class publicc {

    public String color;

    public String model;

    private double fuellevel;

    long costOfpurches; //make defult 



    private int CngLevel;

    private int EngineNumber = 12345;

    private String FuleType ;

    private String CarColourMixedColor;


    // Getter Methods

    public int getCngLevel() {
        return CngLevel;
    }

    public int getEngineNum(){

        return EngineNumber;
    }

    // setter methods 

    void setFullType(String FuleTy){

        FuleTy=FuleType;
    }

    void CarColor(String Colour){

        Colour=CarColourMixedColor;
    }







     void setModel(String model) {
        this.model = model;
    }

    public long getCostOfpurches() {
        return costOfpurches;
    }

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
