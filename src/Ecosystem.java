import java.util.Arrays;
import java.util.Random;

public class Ecosystem {
    int rows = 20;
    int cols = 20;
    int[][] map = new int[rows][cols];
    Random rand = new Random();

    public Ecosystem(){
        PlaceFood();
    }

    public void PlaceFood(){
        // Escolha uma posição aleatória no mapa
        int row = rand.nextInt(rows);
        int col = rand.nextInt(cols);

        // Verifique se a posição escolhida está vazia
        if (map[row][col] == 0) {
            // Coloque a comida na posição escolhida
            map[row][col] = 1;
        } else {
            System.out.println("A posição (" + row + ", " + col + ") já está ocupada");
        }
    }

    @Override
    public String toString() {
        return "Ecosystem [map=" + Arrays.toString(map) + "]";
    }
}
