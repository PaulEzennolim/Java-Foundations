import javax.swing.JOptionPane;

public class AminoAcidProperties {
    public static void main(String[] args) {
        // Prompt user for input
        String input = JOptionPane.showInputDialog("Enter a single letter code for an amino acid:");

        // Ensure the input is not empty and only one character
        if (input != null && input.length() == 1) {
            // Get the first character of the input
            char aminoAcidCode = Character.toUpperCase(input.charAt(0));

            // Determine the properties based on the amino acid code
            String aminoAcidName;
            String acidityBasicity;

            switch (aminoAcidCode) {
                case 'A':
                    aminoAcidName = "ALANINE";
                    acidityBasicity = "NEUTRAL";
                    break;
                case 'E':
                    aminoAcidName = "GLUTAMIC ACID";
                    acidityBasicity = "ACIDIC";
                    break;
                case 'G':
                    aminoAcidName = "GLYCINE";
                    acidityBasicity = "NEUTRAL";
                    break;
                case 'H':
                    aminoAcidName = "HISTIDINE";
                    acidityBasicity = "BASIC";
                    break;
                case 'K':
                    aminoAcidName = "LYSINE";
                    acidityBasicity = "BASIC";
                    break;
                case 'F':
                    aminoAcidName = "PHENYLALANINE";
                    acidityBasicity = "NEUTRAL";
                    break;
                default:
                    aminoAcidName = "UNKNOWN";
                    acidityBasicity = "UNKNOWN";
            }

            // Display the result
            JOptionPane.showMessageDialog(null, "The amino acid is " + aminoAcidName +
                    "\nThe acidity or basicity is " + acidityBasicity);
        } else {
            // Display error message for invalid input
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a single character.");
        }
    }
}
