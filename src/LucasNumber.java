/**
 * The LucasNumber class represents an object that calculates and stores a Lucas number with a specified index.
 */
public class LucasNumber {
    private int index;
    private long value;

    /**
     * Constructor for the LucasNumber class.
     *
     * @param index The index of the Lucas number.
     */
    public LucasNumber(int index) {
        this.index = index;
        this.value = calculateLucas(index);
    }

    /**
     * Calculates the Lucas number with the specified index.
     *
     * @param n The index of the Lucas number.
     * @return The value of the Lucas number.
     */
    private long calculateLucas(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 2, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    /**
     * Gets the index of the Lucas number.
     *
     * @return The index of the Lucas number.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Gets the value of the Lucas number.
     *
     * @return The value of the Lucas number.
     */
    public long getValue() {
        return value;
    }

    /**
     * Checks if the Lucas number is of the form w^2 + 1.
     *
     * @return true if the Lucas number is of the form w^2 + 1; otherwise, false.
     */
    public boolean isSquarePlusOne() {
        long w =(long) Math.sqrt(value - 1);
        return w * w + 1 == value;
    }

    /**
     * Gets the value of "w" corresponding to the Lucas number.
     *
     * @return The value of "w" for the Lucas number.
     */
    public long getW() {
        return (long) Math.sqrt(value - 1);
    }
}
