package lab4.Calculator;

public class LogicalOp {

        public void countFromGivenNumber(int number){
            for (int i=number; i<= 100; i++){
                System.out.print(i+", ");
                }
        }

        public void countBackwardsFromGivenNumber(int number){
            for (int i=number; i>= -100; i--){
                System.out.print(i+", ");
                }
        }
        public void countFromAFirstGivenNumberToASecondGivenNumber (int first, int second){
            for (int i=first; i<=second; i++){
                System.out.print(i+", ");
            }
        }
        public void countFromSmallerNumberToBiggerNumber(int first, int second){
            if (first>=second){
                for (int i=second; i<=first; i++){
                    System.out.print(i+", ");
                }
            }else for (int i=first; i<=second; i++){
                System.out.print(i+", ");
            }
        }
        public void afisNrPareDeLa1La100(){
            for (int i=2; i<=100; i=i+2){
                System.out.print(i+", ");
            }
        }
        public void afisPare(int first, int second){
            for (int i=first; i<=second; i++){
                if (i%2==0){
                    System.out.print(i+", ");
                }
            }
        }
    public void afisImpare(int first, int second){
        for (int i=first; i<=second; i++){
            if (i%2==1){
                System.out.print(i+", ");
            }
        }
    }
    public void afisImpare2(){
        for (int i=1; i<=100; i=i+2){
            System.out.print(i+", ");
        }
    }
    public float sumFromAGiven(int numar){
            float sum=0;
            for (int i=numar; i<=100; i++){
                sum+=i;
            }
            return sum;
    }
    public float avaregeFromSum(int numar){
        float sum=0;
        int count=0;
        for (int i=numar; i<=100; i++){
            sum+=i;
            count++;
        }
        return (sum/count);
    }
    public void afisStelute(int num){
            for (int j=num; j>=1; j--){
            for (int i=1; i<=j; i++) {
                System.out.print("*");
                }
                System.out.println();
            }
    }
}
