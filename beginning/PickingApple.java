package beginning;

import java.util.Scanner;

/**
 * 描述
     小明家的院子里有一棵苹果树，每到秋天树上就会结出10个苹果。苹果成熟的时候，小明就会跑去摘苹果。小明有个30厘米高的板凳，当她不能直接用手摘到苹果的时候，就会踩到板凳上再试试。
     　　现在已知10个苹果到地面的高度，以及小明把手伸直的时候能够达到的最大高度，请帮小明算一下她能够摘到的苹果的数目。假设她碰到苹果，苹果就会掉下来。
     输入
     第一行输入N（0<N<100）表示测试数据组数，接下来每组测试输入包括两行数据。第一行包含10个100到200之间（包括100和200）的整数（以厘米为单位）分别表示10个苹果到地面的高度，
    两个相邻的整数之间用一个空格隔开。第二行只包括一个100到120之间（包含100和120）的整数（以厘米为单位），表示小明把手伸直的时候能够达到的最大高度。
     输出
     输出包括一行，这一行只包含一个整数，表示小明能够摘到的苹果的数目。
     样例输入
     1
     100 200 150 140 129 134 167 198 200 111
     110
     样例输出
     5
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-26
 * Time: 下午3:23
 * To change this template use File | Settings | File Templates.
 */
public class PickingApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.valueOf(scanner.nextLine());
        String[] values = new String[count];
        for (int i = 0; i < count; i ++) {
            values[i] = scanner.nextLine();
        }

        for (int i = 0; i < values.length; i ++) {
            if (i % 2 == 0) {
                String[] value = values[i].split(" ");

            }
        }
    }
}
