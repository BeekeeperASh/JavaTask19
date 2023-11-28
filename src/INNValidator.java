public class INNValidator {

    public static boolean validateINN(String inn) {
        // Проверка на длину ИНН
        if (inn.length() != 10 && inn.length() != 12) {
            return false;
        }

        // Проверка на наличие только цифр
        if (!inn.matches("\\d+")) {
            return false;
        }

        return true;
    }
}
