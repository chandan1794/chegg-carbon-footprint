public class Building implements CarbonFootPrint {
    private String type;

    Building(String t){
        type = t;
    }

    @Override
    public int getCarbonFootPrint() {
        if(type.equals("large")) {
            return 20;
        } else {
            if(type.equals("medium")) {
                return 15;
            } else {
                if(type.equals("small")) {
                    return 10;
                } else {
                    return 4;
                }
            }
        }
    }
}
