package org.example.javatask.sqrt;
public class SqrtService {
    public int calcSqrt(int x) {
        for (int i = 1; i <= 25; ++i) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}
