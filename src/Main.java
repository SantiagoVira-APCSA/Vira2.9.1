public class Main {
    public static void main(String[] args) {
//        Circle circ = new Circle(5);
//        System.out.println(circ.getInfo());
//        circ.setRadius(9.2);
//        System.out.println(circ.getInfo());
//
//        Circle circ2 = new Circle(5);
//        System.out.println(circ2.getInfo());
//        circ2.setRadius(5);
//        System.out.println(circ2.getInfo());
//
//        RightTriangle tri1 = new RightTriangle(3, 4);
//        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
//        double hyp1 = tri1.hypotenuse();
//        double hyp2 = tri2.hypotenuse();
//        System.out.println(hyp1);
//        System.out.println(hyp2);
//
//        RightTriangle tri3 = new RightTriangle(1, 1);
//        double hyp3 = tri3.hypotenuse();
//        System.out.println(hyp3);

//        int[][] nums = {{0, 6}, {1, 6}, {25, 30}, {100, 200}, {94, 132}, {1, 999}, {-15, 50}};
//
//        for(int i = 0; i<7; i++){
//            int max = nums[i][1], min = nums[i][0];
//            System.out.println("int randomNum = (int) (Math.random() * " + (max - min + 1) + ") + " + min + ";");
//        }

        LuckyNumbers lucky = new LuckyNumbers();
        String nums = lucky.getLuckyNumbers();
        System.out.println(nums);

        double sin30 = Math.sin(30);
        double sin60 = Math.sin(60);
        double sin90 = Math.sin(90);
        System.out.println(sin30);
        System.out.println(sin60);
        System.out.println(sin90);

    }
}