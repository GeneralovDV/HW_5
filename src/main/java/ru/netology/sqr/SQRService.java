package ru.netology.sqr;

public class SQRService {

    public int calculate(int borderMin, int borderMax) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= borderMin && i * i <= borderMax) {
                count++;
            }
        }
        return count;
    }
}
