public class Food implements CarbonFootPrint {
    private String type;
    private Boolean isPrePackaged;

    Food(String typeOfFood, Boolean isPrePackagedFood) {
        type = typeOfFood;
        isPrePackaged = isPrePackagedFood;
    }

    @Override
    public int getCarbonFootPrint() {
        int totalFootPrint = 0;

        if(isPrePackaged){
            totalFootPrint += 12;
        }

        if (type.equals("dailymeat")) {
            totalFootPrint += 10;
        } else {
            if (type.equals("fewtimesmeat")) {
                totalFootPrint += 8;
            } else {
                if (type.equals("vegetarian")) {
                    totalFootPrint += 4;
                } else {
                        totalFootPrint += 2;
                    }
                }
            }
        return totalFootPrint;
    }
}