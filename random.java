public class random {
    public static void main(String[] args){

        // double ran = Math.random();

        // double sum = ran +1;
        // System.out.println(sum);


        // String name = "mizan";
        // if(name.equals("mizan")){
        //     System.out.print("Right");
        // } else{
        //     System.out.print("Wrong");
        // }



        int beerNum = 10;
        String word = "bottles";

        while (beerNum > 0){

            if(beerNum == 1){
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");

            beerNum = beerNum - 1;

            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else{
                System.out.println("No more bottles of beer on the wall.");
            }

            // beerNum --;

        }

    }
}
