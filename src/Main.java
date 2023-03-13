public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int ticketPrice = 10000;
        int variableForCalculatingTheBonus = 20;

        System.out.println("За полёт Вам начислены мили:");
        System.out.println((ticketPrice / variableForCalculatingTheBonus) + " миль");
    }
}