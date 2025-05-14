import java.io.File;
 class ImageUploadTimeCalculator {
    public static void main(String[] args) {
       // Internet speed is 256kps (bits per second);
        int internetSpeedBps = 256;
        try {
             // Enter Path of the image file;
            String imagePath = "C:\\Users\\malti\\OneDrive\\Pictures\\gif.gif";
            File imageFile = new File(imagePath);
            long fileSizeBytes = imageFile.length(); // File size in bytes

        // Calculate upload time in seconds
            long fileSizeBits = fileSizeBytes * 8;      // Convert file size from bytes to bits
            double uploadTimeInSeconds = (double) fileSizeBits / internetSpeedBps;

            // Print results
            System.out.println("File Size: " + fileSizeBytes + " bytes");
            System.out.println("Internet Speed: " + internetSpeedBps + " bps");
            System.out.println("Estimated Upload Time: " + uploadTimeInSeconds + " seconds");
        } catch (Exception e) {
            System.out.println("Error reading image file: " + e.getMessage()+e.getLocalizedMessage());
        }
    }
}
