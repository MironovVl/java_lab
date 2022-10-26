package n1;

public class Seasons {
    enum Season {
        WINTER(-10),
        SPRING(10),
        SUMMER(25),
        AUTUMN(5);
        private final double temperature;

        Season(double temperature) {
            this.temperature = temperature;
        }

        public String getDescription() {
            if (this.equals(SUMMER)) {
                return "Тёплое время года";
            }
            return "Холодное время года";
        }
    }

    public static String loveSeason(Season season) {
        switch (season) {
            case AUTUMN -> {
                return "Я люблю осень";
            }
            case SPRING -> {
                return "Я люблю весну";
            }
            case SUMMER -> {
                return "Я люблю лето";
            }
            case WINTER -> {
                return "Я люблю зиму";
            }
            default -> {
                return "Я ничего не люблю";
            }
        }

    }


    public static void main(String[] args) {
        for(Season season : Season.values()){
            System.out.println(season+" - средняя температура: "+season.temperature);
        }

    }

}
