public final class MathUtils {
    private MathUtils() { } // cannot create instances

    public static int clamp(int value, int min, int max) {
        if (min > max) throw new IllegalArgumentException("min must be ≤ max");
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }
}
