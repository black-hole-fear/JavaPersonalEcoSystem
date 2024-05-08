public class App {
    public static void main(String[] args) throws Exception {
        Ecosystem map = new Ecosystem();
        for (int i = 0; i < map.rows; i++) {
            for (int j = 0; j < map.cols; j++) {
                System.out.print(map.map[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
