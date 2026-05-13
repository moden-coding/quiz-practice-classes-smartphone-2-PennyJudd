public class Smartphone {
    private boolean isOn;
    private String brand = "";
    private int batteryPercentage = 0;
    private int storageCapacity = 0;
    private String model = "";
    
    public Smartphone(String brand, String model, int storageCapacity, int batteryPercentage){
        isOn = false;
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.batteryPercentage = batteryPercentage;
    }
    public void turnOn(){
        if (batteryPercentage > 0){
            isOn = true;

        }
        else if (batteryPercentage == 0){
            isOn = false;

        }
    }
    public void turnOff(){
        isOn= false;
    }
    public void chargePhone(int chargeAmount){
        batteryPercentage = batteryPercentage + chargeAmount;
        if (batteryPercentage > 100){
            batteryPercentage = 100;
        }
    }
    public String toString(){
        return "Brand: " + brand + ", Model:" + model + ", Storage Capacity: " + storageCapacity + ", Battery Percentage: " + batteryPercentage + ", On/Off: " + isOn;

    }
    
}
