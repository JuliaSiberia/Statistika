package ru.netology.stats.statistika.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long medSumSales(long[] sales) {
        long medSum = 0;
        for (long sale : sales) {
            medSum = medSum + sale;
        }
        medSum = medSum / sales.length;
        return medSum;
    }

    public long amountMonthLowerMedium(long[] sales) {
        long medSum = 0;
        long amountMonth = 0;
        for (long sale : sales) {
            medSum = medSum + sale;
        }
        medSum = medSum / sales.length;
        for (long sale : sales) {
            if (medSum > sale) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }

    public long amountMontUpMedium(long[] sales) {
        long medSum = 0;
        long amountMonth = 0;
        for (long sale : sales) {
            medSum = medSum + sale;
        }
        medSum = medSum / sales.length;
        for (long sale : sales) {
            if (medSum < sale) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}
