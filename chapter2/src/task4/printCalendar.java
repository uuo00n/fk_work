package task4;
//code by 2023511593黄俊博

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class printCalendar {

    public static void printCalendar() {
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();

        // 获取当前月份的第一天和最后一天
        LocalDate firstDayOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());

        // 获取当前月份第一天是周几
        DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();

        // 计算前面需要补的空格数
        int leadingSpaces = (7 - firstDayOfWeek.getValue() + 1) % 7; // 假设周日为一周的第一天，值为7

        // 初始化一个二维数组来存储日历的每一天
        String[][] calendarGrid = new String[6][7]; // 假设最多6行，每周7天

        // 填充空格和日期
        int currentWeek = 0;
        int currentDay = leadingSpaces;
        for (int day = 1; day <= lastDayOfMonth.getDayOfMonth(); day++) {
            calendarGrid[currentWeek][currentDay] = String.format("%2d", day);
            currentDay++;
            if (currentDay == 7) { // 换行
                currentWeek++;
                currentDay = 0;
            }
        }
        System.out.println("code by 2023511593黄俊博");
        System.out.println("当前日期为：" + currentDate);
        // 打印日历标题
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 打印日历的每一天
        for (String[] week : calendarGrid) {
            for (String day : week) {
                // 如果位置是null（即没有日期），则打印空格
                System.out.print(day != null ? day + " " : "   ");
            }
            System.out.println(); // 每行结束后换行
        }
    }

    public static void main(String[] args) {
        printCalendar();
    }
}