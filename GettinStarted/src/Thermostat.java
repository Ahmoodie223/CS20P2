
import com.phidget22.*;

public class Thermostat {
    public static void main(String[] args) throws Exception {

        // Create objects for the temperature sensor, LEDs, and buttons
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput();

        // Open connections to the devices
        temperatureSensor.open(1000);
        greenLED.open(0);  // Green LED on channel 0
        redLED.open(1);    // Red LED on channel 1
        greenButton.open(2); // Green button on channel 2
        redButton.open(3);   // Red button on channel 3

        // Initial set temperature (21°C)
        double setTemperature = 21.0;

        // Main loop
        while (true) {
            // Get the current temperature
            double currentTemperature = temperatureSensor.getTemperature();

            // Print the current and set temperatures every 10 seconds
            System.out.println("Current temperature: " + currentTemperature + "°C");
            System.out.println("Set temperature: " + setTemperature + "°C");

            // Check if the green button is pressed to increase set temperature
            if (greenButton.getState()) {
                setTemperature += 1.0;  // Increase set temperature by 1°C
                System.out.println("Green button pressed! Set temperature increased to: " + setTemperature + "°C");
                // Sleep briefly to avoid multiple increments from a single press
                Thread.sleep(500);
            }

            // Check if the red button is pressed to decrease set temperature
            if (redButton.getState()) {
                setTemperature -= 1.0;  // Decrease set temperature by 1°C
                System.out.println("Red button pressed! Set temperature decreased to: " + setTemperature + "°C");
                // Sleep briefly to avoid multiple decrements from a single press
                Thread.sleep(500);
            }

            // Check if the current temperature is within 2°C of the set temperature
            if (Math.abs(currentTemperature - setTemperature) <= 2) {
                // Turn on the green LED if within range
                greenLED.setState(true);
                redLED.setState(false);  // Turn off red LED
            } else {
                // Turn on the red LED if out of range
                greenLED.setState(false); // Turn off green LED
                redLED.setState(true);
            }

            // Sleep for 10 seconds before updating again
            Thread.sleep(10000);  // Sleep for 10 seconds
        }
    }
}
