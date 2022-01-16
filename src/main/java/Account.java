public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() >= 3 && name.length() <= 19) {
            if (!name.startsWith(" ") && !name.endsWith(" ")) {
                if (name.replaceAll("[^ ]", "").length() == 1) {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

}