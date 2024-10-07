
public class RandomWalk{


    public static void main (String[]args){
    
        int tests = 1;
        for (int x=1; x<=50; x++){
            Walk();
            tests ++;
            System.out.println("Test " + tests + " : ");
            }
        }


    public static void Walk(){
        int position = 0;
        int num;
        double forwardD = 3.5;
        double backwardD = -3.5;
        int steps = 0;

        while(position<=forwardD || position>=backwardD){
        num = (int)(Math.random()*2);
        if (num==0){
            position++;
            steps ++;
        }else if(num==1){
            position--;
            steps ++;
        }
    }
    System.out.print("Steps taken: " + steps);

        }
    }
