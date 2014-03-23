package beginning;

import java.util.Scanner;

/**
 * 描述
     小明又出问题了。妈妈认为聪明的小明应该更加用功学习而变的更加厉害，所以小明除了上学之外，还要参加妈妈为他报名的各科复习班。
     另外每周妈妈还会送他去学习朗诵、舞蹈和钢琴。但是小明如果一天上课超过八个小时就会不高兴，而且，上得越久就会越不高兴。假设小明不会因为其它事不高兴，并且她的不高兴不会持续到第二天。
     请你帮忙检查一下小明下周的日程安排，看看下周他会不会不高兴；如果会的话，哪天最不高兴。
     输入
     第一行输入N（0<N<100）表示测试数据组数，接下来每组测试数据输入包括七行数据，分别表示周一到周日的日程安排。每行包括两个小于10的非负整数，用空格隔开，
     分别表示津津在学校上课的时间和妈妈安排她上课的时间。
     输出
     每组测试数据输出包括一行，这一行只包含一个数字。如果不会不高兴则输出0，如果会则输出最不高兴的是周几(用1,2,3,4,5,6,7分别表示周一，周二，周三，周四，周五，周六，周日)。
      如果有两天或两天以上不高兴的程度相当，则输出时间最靠前的—天。
     样例输入
     1
     5 3
     6 2
     7 2
     5 3
     5 4
     0 4
     0 6
     样例输出
     3
 * Created by chenxiaoshun on 14-3-23.
 */
public class UnHappyXiaoMing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.valueOf(scanner.nextLine());
        int weekDays = 7;
        String[][] studyHoursArr = new String[count][weekDays];
        for (int i = 0; i < count; i ++) {
            for (int j = 0; j < weekDays; j ++) {
                studyHoursArr[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < count; i ++) {
            int maxHour = 0;
            int maxDay = 0;
            for (int j = 0; j < weekDays; j ++) {
                String[] hoursArr = studyHoursArr[i][j].split(" ");
                int studyHour = Integer.valueOf(hoursArr[0]) + Integer.valueOf(hoursArr[1]);
                if (studyHour > 8 && studyHour > maxHour) {
                    maxHour = studyHour;
                    maxDay = j + 1;
                }
            }

            System.out.println(maxDay);
        }
    }
}
