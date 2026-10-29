public class Television {
    private int channel = 1;

    public void watch() {
        System.out.println("Watching channel " + channel);

        channel++;

        if (channel > 10) {
            channel = 1;
        }
    }
}
