public class TelevisionViewer {
    public static void main(String[] args) {
        Television television = new Television();

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            if (day % 2 == 1) {
                for (int i = 0; i < 3; i++) {
                    television.watch();
                }

                for (int i = 0; i < 3; i++) {
                    television.watch();
                }
            } else {
                for (int i = 0; i < 4; i++) {
                    television.watch();
                }
            }

            System.out.println("Falling asleep");
        }
    }
}
