import java.util.Scanner;

public class Game {

    private int[][] field;

    public Game(int[][] field) {
        this.field = field;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int shot = field[first][second];

        if (shot == 0) {
            System.out.println("Вы не попали");
        }
        else {
            System.out.println("Вы попали");
        }
        //тут как-то нужно играть
    }

}
