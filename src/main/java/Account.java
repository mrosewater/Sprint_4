public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        boolean isValid = false;
        if (name.length() >= 3 && name.length() <= 19) {
            if (!name.startsWith(" ") && !name.endsWith(" ")) {
                if (name.replaceAll("[^ ]", "").length() == 1) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

}