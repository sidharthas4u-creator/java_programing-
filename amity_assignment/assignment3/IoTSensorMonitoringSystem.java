import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Thread 2: Calculates the square of an even number
class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("[SquareCalculator] Even number " + number + " -> Square = " + square);
    }
}

// Thread 3: Calculates the cube of an odd number
class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("[CubeCalculator]   Odd number  " + number + " -> Cube   = " + cube);
    }
}

// Thread 1: Generates a random number every second and delegates to the appropriate thread
class RandomNumberGenerator extends Thread {
    private int count;

    public RandomNumberGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println("\n--- IoT Sensor Simulation Started ---");

        for (int i = 1; i <= count; i++) {
            int num = random.nextInt(20) + 1; // Generates a random number between 1 and 20
            System.out.println("\n[Sensor Reading #" + i + "] Generated: " + num);

            if (num % 2 == 0) {
                SquareCalculator sqThread = new SquareCalculator(num);
                sqThread.start();
            } else {
                CubeCalculator cubeThread = new CubeCalculator(num);
                cubeThread.start();
            }

            try {
                Thread.sleep(1000); // Wait 1 second before generating the next reading
            } catch (InterruptedException e) {
                System.out.println("[Sensor] Simulation interrupted.");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("\n--- IoT Sensor Simulation Completed ---\n");
    }
}

public class IoTSensorMonitoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== IoT Sensor Monitoring System ===");
            System.out.println("1. Start Simulation");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter number of sensor readings to generate: ");
                        int readings = sc.nextInt();
                        if (readings <= 0) {
                            System.out.println("Please enter a positive number of readings.\n");
                            break;
                        }
                        RandomNumberGenerator generator = new RandomNumberGenerator(readings);
                        generator.start();
                        generator.join(); // Wait for simulation to finish before showing the menu again
                        break;

                    case 2:
                        running = false;
                        System.out.println("Exiting IoT Sensor Monitoring System...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select 1 or 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number (1 or 2).\n");
                sc.nextLine(); // Clear invalid input from buffer
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
                Thread.currentThread().interrupt();
            }
        }
        sc.close();
    }
}
