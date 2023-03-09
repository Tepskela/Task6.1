package ru.netology.stats;


public class StatsService {

    public long summa(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale = allSale + sale;
        }
        return allSale;
    }

    public long average(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale = allSale + sale;
        }
        return allSale / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int quantityMonthHigherAverage(long[] sales) {
        int counter = 0;
        long avarageSale = average(sales);
        for (long sale : sales) {
            if (sale < avarageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int quantityMonthLowAverage(long[] sales) {
        int counter = 0;
        long avarageSale = average(sales);
        for (long sale : sales) {
            if (sale > avarageSale) {
                ;
                counter++;
            }
        }
        return counter;
    }
}


