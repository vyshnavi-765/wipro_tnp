import java.util.ArrayList;

public class VideoStore {

    // Stores all videos
    private ArrayList<Video> store;

    // Constructor
    public VideoStore() {
        store = new ArrayList<>();
    }

    // Add a new video
    public void addVideo(String name) {
        Video v = new Video(name);
        store.add(v);
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    // Check out a video
    public void doCheckout(String name) {

        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Return a video
    public void doReturn(String name) {

        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Receive rating
    public void receiveRating(String name, int rating) {

        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Display Inventory
    public void listInventory() {

        if (store.isEmpty()) {
            System.out.println("No videos available.");
            return;
        }

        System.out.printf("%-20s %-10s %-10s\n",
                "Video Name", "Checked Out", "Rating");

        for (Video v : store) {

            System.out.printf("%-20s %-10s %-10d\n",
                    v.getName(),
                    v.getCheckout() ? "Yes" : "No",
                    v.getRating());
        }
    }
}