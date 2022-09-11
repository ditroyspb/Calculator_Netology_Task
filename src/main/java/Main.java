public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int c = calc.devide.apply(a, b);
        if ( c == 0) {
            System.out.println("Невозможная операция: деление на ноль.");;
        } else {
            calc.println.accept(c);
        }

// изначальный код работать не будет, так как
// происходит деление на ноль. Можно добавить тернарный
// оператор в классе Calculator с условием возвращения 0, если y == 0.
// С учетом того, что с == 0 возможно только в случае, если y == 0,
// можно в классе Main также задать условие о выводе в консоль информации
// о невозможной операции.
    }
}
