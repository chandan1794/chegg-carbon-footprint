public class Waste implements CarbonFootPrint {
    private String type;

    Waste(String typeOfRecycle) {
        type = typeOfRecycle;
    }

    @Override
    public int getCarbonFootPrint() {
        if (type.equals("none")) {
            return 12;
        } else {
            if (type.equals("one")) {
                return 8;
            } else {
                if (type.equals("two")) {
                    return 4;
                } else {
                    return 0;
                }
            }
        }
    }
}
