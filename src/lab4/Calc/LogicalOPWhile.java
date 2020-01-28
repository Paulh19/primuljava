package lab4.Calc;

import com.sun.source.tree.WhileLoopTree;

public class LogicalOPWhile {
    public void countTo100FromGivenNumber(int number) {
        while (number <= 100) {
            System.out.print(number + ", ");
            number++;
        }
    }

    public void countFromGivenNumbertoMinus100(int number) {
        while (number >= -100) {
            System.out.print(number + ", ");
            number--;
        }
    }

    public void countFromAGivenNumberToTheSecondGivenNumber(int first, int second) {
        while (first <= second) {
            System.out.print(first + ", ");
            first++;
        }
    }

    public void countFromFirstToSecondWithVerification(int first, int second) {
        if (first <= second) {
            while (first <= second) {
                System.out.print(first + ", ");
                first++;
            }
        } else
            while (second <= first) {
                System.out.print(second + ", ");
                second++;
            }
    }

    public void allEvenNumbersFrom1To100() {
        int counter = 2;
        while (counter <= 100) {
            System.out.print(counter + ", ");
            counter += 2;
        }
    }

    public void allEvenNumbers2(int first, int second) {
        while (first <= second) {
            if (first % 2 == 0) {
                System.out.print(first + ", ");
            }
            first++;
        }
    }

    public void allOddNumbersFrom1To100() {
        int counter = 1;
        while (counter <= 100) {
            System.out.print(counter + ", ");
            counter += 2;
        }
    }

    public void allOddNumbers2(int first, int second) {
        while (first <= second) {
            int x = first % 2;
            if (!(x == 0))
            // de ce nu merege x==1?
            // si imi arata numai numerele impare pozitive
            {
                System.out.print(first + ", ");
            }
            first++;
        }
    }

    public void mediaSiSumaNumerelorIntregiDinIntervalul111Si8899() {
        int counter = 0;
        int num = 111;
        float sum = 0;
        float average = 0;
        while (num <= 8899) {
            sum += num;
            num++;
            counter++;
        }
        System.out.println("Suma este: " + sum);
        average = sum / counter;
        System.out.println("Media este: " + average);
    }

    public float mediaNrDivizibileCu7DintrunInterval(int first, int second) {
        int counter = 0;
        float sum = 0;
        while (first <= second) {
            if (first % 7 == 0) {
                sum += first;
                counter++;
            }
            first++;
        }
        return sum / counter;
    }

    public void primele20Fibonacci() {
        int first = 0;
        int second = 1;
        int urm = 0;
        int counter = 0;
        System.out.print("0, 1, ");
        while (counter < 18) {
            urm = first + second;
            System.out.print(urm + ", ");
            first = second;
            second = urm;
            counter++;
        }
    }

    public void CozaLozaWoza() {
        int counter = 1;
        while (counter <= 110) {
            if ((counter % 3 == 0) && (counter % 5 == 0) && (counter % 7 == 0)) {
                System.out.print("CozaLozaWoza ");
            } else if ((counter % 7 == 0) && (counter % 5 == 0)) {
                System.out.print("WozaLoza ");
            } else if ((counter % 3 == 0) && (counter % 5 == 0)) {
                System.out.print("CozaLoza ");
            } else if ((counter % 3 == 0) && (counter % 7 == 0)) {
                System.out.print("CozaWoza ");
            } else if (counter % 5 == 0) {
                System.out.print("Loza ");
            } else if (counter % 7 == 0) {
                System.out.print("Woza ");
            } else if (counter % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(counter + " ");
            }
            if (counter % 11 == 0) {
                System.out.println();
            }
            counter++;
        }
    }
   /* public void cozaLozaWozaWithCase()
            //nu merge si imi zice:boolean cannot be converted to int
    {
        int counter=1;
        while (counter<=35)
        {
            switch (counter)
            {
                case ((counter % 3 == 0) && (counter % 5 == 0) && (counter % 7 == 0)): System.out.print("CozaLozaWoza "); break;
                case ((counter % 3 == 0) && (counter % 5 == 0)) : System.out.print("CozaLoza "); break;
                case ((counter % 3 == 0) && (counter % 7 == 0)) : System.out.print("CozaWoza "); break;
                case ((counter % 5 == 0) && (counter % 7 == 0)) : System.out.print("LozaWoza "); break;
                case (counter % 7 == 0) : System.out.print("Woza "); break;
                case (counter % 5 == 0) : System.out.print("Loza "); break;
                case (counter % 3 == 0) : System.out.print("Coza "); break;
                default: System.out.print(counter + " ");
            }
            if (counter % 11 == 0)
            {
                System.out.println();
            }
            counter++;
        }
    }*/
}
