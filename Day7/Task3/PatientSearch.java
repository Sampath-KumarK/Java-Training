
public class PatientSearch {
    public static void main(String[] args) {

        
        int[] patientIDs = { 1011, 1022, 1033, 1044, 1055 };

        int searchID = 1033; 
        boolean found = false;

        
        for (int id : patientIDs) {
            if (id == searchID) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Patient ID " + searchID +
                               " is AVAILABLE for treatment.");
        } else {
            System.out.println("Patient ID " + searchID +
                               " is NOT FOUND in the system.");
        }
    }
}
