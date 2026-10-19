public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
    final double DISCOUNT = 0.8;

    // 价格 数量 
    System.out.println("请输入衬衣的价格：");
    int shirtPrice = input.nextInt();

    System.out.println("请输入衬衣的数量：");
    int shirtNumber = input.nextInt();

    System.out.println("请输入运动鞋的价格：");
    int shoePrice = input.nextInt();

    System.out.println("请输入运动鞋的数量：");
    int shoeNumber = input.nextInt();

    // 小费单
    System.out.println();
    System.out.println("********消费单********");
    System.out.println();
    System.out.println("购买物品\t单价\t数量");
    System.out.println("衬衣\t\t￥" + shirtPrice + "\t" + shirtNumber);
    System.out.println("运动鞋\t\t￥" + shoePrice + "\t" + shoeNumber);
    System.out.println("折扣\t\t" + DISCOUNT);
    System.out.println();
    System.out.println("********************");

    input.close();
}
