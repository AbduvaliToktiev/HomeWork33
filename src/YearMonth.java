public enum YearMonth {
    JANUARY("Январь", 0),
    FEBRUARY("Февраль", 0),
    MARCH("Март", 1),
    APRIL("Апрель", 1),
    MAY("Май", 1),
    JUNE("Июнь", 0),
    JULY("Июль", 0),
    AUGUST("Август", 0),
    SEPTEMBER("Сентябрь", 1),
    OCTOBER("Октябрь", 1),
    NOVEMBER("Ноябрь", 1),
    DECEMBER("Декабрь", 0);

    private String translate;
    private int number;

    public int getNumber() {
        return number;
    }

    public String getTranslate() {
        return translate;
    }

    YearMonth(String translate, int number) {
        this.translate = translate;
    }
}
