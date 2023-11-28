import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String inn = scanner.next();
            if(!INNValidator.validateINN(inn)){
                throw new INNException("Wrong inn");
            }
        } catch (INNException e) {
            System.out.println(e.getMessage());
        }
    }
}