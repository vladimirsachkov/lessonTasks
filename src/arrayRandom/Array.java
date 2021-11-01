package arrayRandom;

public class Array {
    private int ArraySize;
    private int minN;
    private int maxN;

    public Array(int arraySize, int minN, int maxN) {
        ArraySize = arraySize;
        this.minN = minN;
        this.maxN = maxN;
    }

    public int getArraySize() {
        return ArraySize;
    }

    public int getMinN() {
        return minN;
    }

    public int getMaxN() {
        return maxN;
    }
}
