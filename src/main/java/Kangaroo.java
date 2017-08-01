import java.util.Scanner;

public class Kangaroo {

    private int startLocation;
    private int movingSpeed;

    public Kangaroo(int startLocation, int movingSpeed) {
        this.startLocation = startLocation;
        this.movingSpeed = movingSpeed;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstKangarooStartLocation = in.nextInt();
        int firstKangarooSpeed = in.nextInt();

        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        int secondKangarooStartLocation = in.nextInt();
        int secondKangarooSpeed = in.nextInt();

        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String result = kangaroo(firstKangaroo, secondKangaroo);
        System.out.println(result);
    }

    public static String kangaroo(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
        if (isOneOfKangarooAheadAndFaster(firstKangaroo, secondKangaroo)) {
            return "NO";
        } else {
            if (isFirstKangarooAheadButSlower(firstKangaroo, secondKangaroo)) {
                return isKangarooMeetPossible(firstKangaroo, secondKangaroo);

            } else {
                return isKangarooMeetPossible(secondKangaroo, firstKangaroo);
            }
        }
    }


    private static String isKangarooMeetPossible(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
        int firstKangarooCurrentLocation = firstKangaroo.getStartLocation();
        int secondKangarooCurrentLocation = secondKangaroo.getStartLocation();

        while (firstKangarooCurrentLocation <= secondKangarooCurrentLocation) {
            if (firstKangarooCurrentLocation == secondKangarooCurrentLocation) {
                return "YES";
            } else {
                firstKangarooCurrentLocation += firstKangaroo.getMovingSpeed();
                secondKangarooCurrentLocation += secondKangaroo.getMovingSpeed();
            }
        }
        return "NO";
    }

    private static boolean isOneOfKangarooAheadAndFaster(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
        if (
                (firstKangaroo.getStartLocation() > secondKangaroo.getStartLocation()
                        && firstKangaroo.getMovingSpeed() > secondKangaroo.getMovingSpeed())
                        ||
                        (secondKangaroo.getStartLocation() > firstKangaroo.getStartLocation()
                                && secondKangaroo.getMovingSpeed() > firstKangaroo.getMovingSpeed())) {
            return true;
        }
        return false;
    }

    private static boolean isFirstKangarooBehindButFaster(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
        return firstKangaroo.getStartLocation() < secondKangaroo.getStartLocation()
                && firstKangaroo.getMovingSpeed() > secondKangaroo.getMovingSpeed();
    }

    private static boolean isFirstKangarooAheadButSlower(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
        return firstKangaroo.getStartLocation() < secondKangaroo.getStartLocation()
                && firstKangaroo.getMovingSpeed() > secondKangaroo.getMovingSpeed();
    }


    public int getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(int startLocation) {
        this.startLocation = startLocation;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed;
    }

    @Override
    public String toString() {
        return "Kangaroo { " +
                "startLocation = " + startLocation +
                ", movingSpeed = " + movingSpeed +
                " }";
    }
}