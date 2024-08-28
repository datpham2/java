import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // A blood type object
        BloodType bloodType = new BloodType("A", "+");

        // Get blood type compatibility
        BloodType[] compatibleBloodTypes = bloodType.getCompatibleBloodTypes();

        // Print compatible blood types
        System.out.println("Compatible blood types:");
        for (BloodType compatibleBloodType : compatibleBloodTypes) {
            System.out.println(compatibleBloodType);
        }
    }
}