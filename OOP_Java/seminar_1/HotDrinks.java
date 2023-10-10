package OOP_Java.seminar_1;

public class HotDrinks extends Product {

    private int volume;
    private int temperature;


    public HotDrinks(String name,  double price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
   
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks { name = " + super.getName() + " / " + "price = " + super.getPrice() + 
         " / " + "volume = " + volume + " / "  + "temperature = " + temperature + " }\n";
    }

    
    
}
