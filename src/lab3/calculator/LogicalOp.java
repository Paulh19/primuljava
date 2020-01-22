package lab3.calculator;

import org.w3c.dom.ls.LSOutput;

public class LogicalOp {
    public int pr3(int x) {
        if ((x > 2 || x == 2) && (x < 8 || x == 8)) {
            return x;
        } else {
            return 0;
        }
    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return "Got to try some more";
        }
    }

    public String checkTextAndNumber(String text, int a) {
        if ((text.equals("FastTrackIT")) && (a <= 3)) {
            return (text + a);
        } else {
            if (!(text.equals("FastTrackIT")) && (a > 4) || (a == 4)) {
                return (a + text);
            }
            else return ("nici o conditie nu a fost indeplinita");
        }
    }
    public String chechForecast (int cm){
        if ((cm ==6) || (cm >= 8)) {
            return "The amount of snow this winter was (cm): "+cm;
        }else{
            return "The forecast snow is(cm):" +cm;
        }
    }
    public String checkNumber (int a) {
        if ((a > 3) && (a != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (a == 4) {
            return "The number is equal to 4";
        } else if (a <3){
            return "The number is lower than 3";
        }
        else { return "The number is 3";
    }

    }
    public String afisNumar(int a){
        switch (a){
            case 0: return "Numarul este 0";
            case 1: return "Numarul este 1";
            case 2: return "Numarul este 2";
            case 3: return "Numarul este 3"; //break;
            case 4: return "Numarul este 4"; //break;
            case 5: return "Numarul este 5"; //break;
            case 6: return "Numarul este 6"; //break;
            case 7: return "Numarul este 7"; //break;
            case 8: return "Numarul este 8"; //break;
            case 9: return "Numarul este 9"; //break;
            default: return "Numarul este mai mare decat 9";
        }
    }
    public boolean isNumberEven (int a){
        int x = a % 2;
        if (x==1) {
            return false;
        }else {
            return true;
        }
        }
        public boolean isEligibleToVote(int varsta){
        if (varsta>= 18) {
            return true;
        }
        else {
            return false;
        }

        }
        public int celMaiMare(int a, int b, int c) {
        if ((a>=b) && (a>=c)){
            return a;
            } else if ((b>=a) && (b>=c)){
            return b;
            }else return c;
        }
}
