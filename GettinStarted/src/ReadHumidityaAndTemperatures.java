

import com.phidget22.*;

public class ReadHumidityaAndTemperatures {
    public static void main(String[] args) throws Exception{

        // Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget.
        // This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Open | Open establishes a connection between your object and your physical Phidget.
        // You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget.
        // If your Phidget can't be found, an exception occurs.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        // Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while(true){
            // Get current humidity and temperature
            double humidity = humiditySensor.getHumidity();
            double temperature = temperatureSensor.getTemperature();

            // Only print humidity if it's above 30%, otherwise print "Humidity is low"
            if(humidity > 30) {
                System.out.println("Humidity: " + humidity + " %RH");
            } else {
                System.out.println("Humidity is low");
            }

            // Only print temperature if it's above 21°C, otherwise print "Room is too cold"
            if(temperature > 21) {
                System.out.println("Temperature: " + temperature + " °C");
            } else {
                System.out.println("Room is too cold");
            }

            // Sleep for 150ms before reading the values again
            Thread.sleep(150);
        }
    }
}
