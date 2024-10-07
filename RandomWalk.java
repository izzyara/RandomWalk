
public class RandomWalk{

public static int sumsteps = 0;
    public static void main (String[]args){
    
        int tests = 1;
        for (int x=1; x<=50; x++){
            System.out.print("Test " + tests + ": ");
            Walk();
            tests ++;
            }
        int average = sumsteps/50;
        System.out.print("Average steps taken: " + average);
        }

    public static void Walk(){
        int position = 0;
        int num;
        double forwardD = 3.5;
        double backwardD = -3.5;
        int steps = 0;
        while(position<=forwardD && position>=backwardD){
        num = (int)(Math.random()*2);
        if (num==0){
            position++;
            steps ++;
        }else if(num==1){
            position--;
            steps ++;
        }
    }
    sumsteps += steps;
    System.out.println("Steps taken: " + steps);

        }
    }
