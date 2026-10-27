import java.util.Scanner;
public class CustPay {
    public static void main(String[] args) {
        int shirtPrice, shirtNo, shoePrice, shoeNo, score;
        double finalPay, returnMoney;
        final double DI = 0.8;
        Scanner in = new Scanner(System.in);
        System.out.print("请输入衬衣的价格：");
        shirtPrice = in.nextInt();
        System.out.print("请输入衬衣的数量：");
        shirtNo = in.nextInt();
        System.out.print("请输入运动鞋的价格：");
        shoePrice = in.nextInt();
        System.out.print("请输入运动鞋的数量：");
        shoeNo = in.nextInt();
        
        finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo) * DI;
        returnMoney = 1000 - finalPay;
        score = (int) finalPay / 100 * 3;

        System.out.println("\n****************消费单******************");
        System.out.println("购买物品\t单价\t数量\t金额");
        System.out.println("衬衣\t\t￥" + shirtPrice + "\t" + shirtNo + "\t￥" + (shirtPrice * shirtNo));
        System.out.println("运动鞋\t\t￥" + shoePrice + "\t" + shoeNo + "\t￥" + (shoePrice * shoeNo));
        System.out.println("折扣：\t\t8折");
        System.out.println("金额总计:\t￥" + (double) Math.round(finalPay * 100) / 100);
        System.out.println("实际付费:\t￥1000");
        System.out.println("找零:\t\t￥" + (double) Math.round(returnMoney * 100) / 100);
        System.out.println("本次购物所获的积分是： " + score);
        System.out.println("****************************************");
        in.close();
    }
}
