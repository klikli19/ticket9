public class Main {
    public static void main(String[] args) {

        try {
            throw new MyException("Выброшено исключение");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}