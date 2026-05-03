
public class ParcelTracking {
    public static void main(String[] args) {

       
        String[] parcels = {
            "TRK1001", "TRK1002", "TRK1003",
            "TRK1004", "TRK1005"
        };

        
        parcels[2] = "TRK9999";

        
        System.out.println("--- Parcel Tracking List ---");
        for (int i = 0; i < parcels.length; i++) {
            System.out.println("Parcel " + (i + 1) + ": " + parcels[i]);
        }
    }
}