package edu.kis.vh.nursery;

public class    DefaultCountingOutRhymer {
    public static final int ARRAY_S = 12;
    public static final int DEFAULT_NEGATIVE_VALUE = -1;
    public static final int ARRAY_S_PLUS_DEFAULT_NEGATIVE_VALUE = 11;
    private int[] numbers = new int[ARRAY_S];

    public static int getArraySize() {
        return ARRAY_SIZE;
    }

    public static int getDefaultNegativeValue() {
        return DEFAULT_NEGATIVE_VALUE;
    }

    public static int getArraySizePlusDefaultNegativeValue() {
        return ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE;
    }

    public int getTotal() {
        return total;
    }
    public int total = DEFAULT_NEGATIVE_VALUE;
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == DEFAULT_NEGATIVE_VALUE;
        }
        
            public boolean isFull() {
                return total ==ARRAY_S_PLUS_DEFAULT_NEGATIVE_VALUE;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT_NEGATIVE_VALUE;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_NEGATIVE_VALUE;;
                        return numbers[total--];
                    }

}
