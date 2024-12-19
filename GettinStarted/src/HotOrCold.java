
import com.phidget22.*;

public class HotOrCold {
    public static void main(String[] args) throws Exception {

        // Create the TemperatureSensor and DigitalOutput objects for controlling LEDs
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();  // Green LED as a digital output
        DigitalOutput redLED = new DigitalOutput();    // Red LED as a digital output

        // Open connections to the devices
        temperatureSensor.open(1000);
        greenLED.open(0);  // Assuming the green LED is on channel 0
        redLED.open(1);    // Assuming the red LED is on channel 1

        // Initially, turn off both LEDs
        greenLED.setState(false);
        redLED.setState(false);

        // Main loop to check temperature and control LEDs
        while (true) {
            // Get the current temperature
            double temperature = temperatureSensor.getTemperature();

            // Output the temperature
            System.out.println("Current temperature: " + temperature + "°C");

            // Check temperature range and control LEDs
            if (temperature >= 20 && temperature <= 24) {
                // Turn on the green LED if the temperature is between 20°C and 24°C
                greenLED.setState(true);
                redLED.setState(false); // Turn off red LED
            } else {
                // Turn on the red LED if the temperature is outside the range
                greenLED.setState(false); // Turn off green LED
                redLED.setState(true);
            }

            // Sleep for 1 second before checking again
            Thread.sleep(1000);
        }
    }
}
