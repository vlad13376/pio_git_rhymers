package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int ARRAYSIZE = 12;
    public static final int MINUS_ODIN = -1;
    public static final int SIZEMINUSODIN = 11;
    private int[] numbers = new int[ARRAYSIZE];
    public int total = MINUS_ODIN;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == MINUS_ODIN;
        }
        
            public boolean isFull() {
                return total == SIZEMINUSODIN;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return MINUS_ODIN;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return MINUS_ODIN;
                        return numbers[total--];
                    }

}
