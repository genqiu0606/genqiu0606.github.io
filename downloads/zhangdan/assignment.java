public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // 默认会员折扣为八折
    final double DISCOUNT = 0.8;

    // 输入商品价格和数量
    System.out.println("请输入衬衣的价格：");
    double shirtPrice = input.nextDouble();

    System.out.println("请输入衬衣的数量：");
    int shirtNumber = input.nextInt();

    System.out.println("请输入运动鞋的价格：");
    double shoePrice = input.nextDouble();

    System.out.println("请输入运动鞋的数量：");
    int shoeNumber = input.nextInt();

    // 自动计算商品小计、总额、实付金额和优惠金额
    double shirtTotal = shirtPrice * shirtNumber;
    double shoeTotal = shoePrice * shoeNumber;
    double total = shirtTotal + shoeTotal;
    double payment = total * DISCOUNT;
    double saving = total - payment;

    // 打印消费单，金额保留两位小数
    System.out.println();
    System.out.println("********消费单********");
    System.out.println();
    System.out.println("购买物品\t单价\t\t数量\t小计");
    System.out.printf("衬衣\t\t￥%.2f\t%d\t￥%.2f%n", shirtPrice, shirtNumber, shirtTotal);
    System.out.printf("运动鞋\t\t￥%.2f\t%d\t￥%.2f%n", shoePrice, shoeNumber, shoeTotal);
    System.out.println();
    System.out.printf("商品总额：￥%.2f%n", total);
    System.out.println("会员折扣：" + DISCOUNT + "（八折）");
    System.out.printf("优惠金额：￥%.2f%n", saving);
    System.out.printf("实付金额：￥%.2f%n", payment);
    System.out.println();
    System.out.println("********************");

    input.close();
}
