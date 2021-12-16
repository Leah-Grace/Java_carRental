
public class Cars {
    private int year;
    private String make;
    private String model;
    private double gasTankCapacity;
    private boolean electric;
    private int identifier;

    public Cars(int year, String make, String model, double gasTankCapacity, boolean electric, int identifier ) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.gasTankCapacity = gasTankCapacity;
        this.electric = electric;
        this.identifier = identifier;
    };
    public String getMake() {
        return this.make;
    }
    public int getId(){
        return this.identifier;
    }
    public int getYear(){
        return this.year;
    }
}
