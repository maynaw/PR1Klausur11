package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0' },
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0' },
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H' },
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0' },
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H' },
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0' },
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0' },
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0' },

    };

    public void print() {
        for(int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType){
        return 0; // TODO IMPLEMENT ME
    }

    public int[] countObstaclesPerRow(int row){
        return null; // TODO IMPLEMENT ME
    }
    public int energyNeededInRow(int row){
        return 0; // TODO IMPLEMENT ME
    }


    public int ableToFinishHiking(int points){
        return 0; // TODO IMPLEMENT ME
    }
}
