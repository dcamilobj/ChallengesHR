package challenges;

public class ChocolateFeast {
    // Complete the chocolateFeast function below.
    // n -> money
    // c -> chocolates cost
    // m -> wrappers necessary to get one more chocolate
    static int chocolateFeast(int n, int c, int m) {
        int numberOfWrappers = (n/c);
        int chocolates = (n/c);
        while (m<=numberOfWrappers){
            int newWrappers  =  numberOfWrappers%m;
            newWrappers  += numberOfWrappers/m;
            chocolates += numberOfWrappers/m;
            numberOfWrappers = newWrappers;
        }
        return chocolates;
    }
}
