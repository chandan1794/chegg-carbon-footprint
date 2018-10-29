public class Vehicle implements CarbonFootPrint {
    private int numberOfMiles;

    Vehicle(int distance) {
        numberOfMiles = distance;
    }

    @Override
    public int getCarbonFootPrint() {
        if (numberOfMiles >= 15000) {
            return 12;
        } else {
            if (numberOfMiles >= 10000) {
                return 10;
            } else {
                if (numberOfMiles >= 1000) {
                    return 6;
                } else {
                    if (numberOfMiles > 0) {
                        return 4;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}