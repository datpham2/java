/**
 * The BloodType class represents a blood type with a specific blood group and rhesus factor.
 */
public class BloodType {
    private final String bloodGroup;
    private final String rhesusFactor;

    /**
     * Constructs a BloodType instance with the specified blood group and rhesus factor.
     *
     * @param bloodGroup the blood group (e.g., "A", "B", "AB", "O")
     * @param rhesusFactor the rhesus factor ("+" or "-")
     */
    public BloodType(String bloodGroup, String rhesusFactor) {
        this.bloodGroup = bloodGroup;
        this.rhesusFactor = rhesusFactor;
    }

    /**
     * Returns an array of BloodType objects that are compatible with this blood type.
     *
     * @return an array of compatible BloodType objects
     */
    public BloodType[] getCompatibleBloodTypes() {
        if (bloodGroup.equals("O") && rhesusFactor.equals("-")) {
            return new BloodType[] {
                    new BloodType("O", "-"),
                    new BloodType("A", "-"),
                    new BloodType("B", "-"),
                    new BloodType("AB", "-")
            };
        } else if (bloodGroup.equals("O") && rhesusFactor.equals("+")) {
            return new BloodType[] {
                    new BloodType("O", "+"),
                    new BloodType("A", "+"),
                    new BloodType("B", "+"),
                    new BloodType("AB", "+")
            };
        } else if (bloodGroup.equals("A") && rhesusFactor.equals("-")) {
            return new BloodType[] {
                    new BloodType("A", "-"),
                    new BloodType("AB", "-")
            };
        } else if (bloodGroup.equals("A") && rhesusFactor.equals("+")) {
            return new BloodType[] {
                    new BloodType("A", "+"),
                    new BloodType("AB", "+")
            };
        } else if (bloodGroup.equals("B") && rhesusFactor.equals("-")) {
            return new BloodType[] {
                    new BloodType("B", "-"),
                    new BloodType("AB", "-")
            };
        } else if (bloodGroup.equals("B") && rhesusFactor.equals("+")) {
            return new BloodType[] {
                    new BloodType("B", "+"),
                    new BloodType("AB", "+")
            };
        } else if (bloodGroup.equals("AB") && rhesusFactor.equals("-")) {
            return new BloodType[] {
                    new BloodType("AB", "-")
            };
        } else if (bloodGroup.equals("AB") && rhesusFactor.equals("+")) {
            return new BloodType[] {
                    new BloodType("AB", "+")
            };
        } else {
            return new BloodType[0];
        }
    }

    /**
     * Returns a string representation of the BloodType object.
     *
     * @return a string in the format "bloodGrouprhesusFactor"
     */
    @Override
    public String toString() {
        return bloodGroup + rhesusFactor;
    }
}