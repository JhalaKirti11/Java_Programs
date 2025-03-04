package Inheritance;

class Bank{
    public double getInterestRate(){
        return 0.0;
    }
}

class SBI extends Bank{
    public double getInterestRate(){
        return 6.5;
    }
}

class HDFC extends Bank{
    public double getInterestRate(){
        return 4.3;
    }
}

class ICICI extends Bank{
    public double getInterestRate(){
        return 5.8;
    }
}

public class BankInheritanceExample {
    public static void main(String[] args){
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("The interest rate of SBI is "+ sbi.getInterestRate());
        System.out.println("The interest rate of HBFC bank is "+ hdfc.getInterestRate());
        System.out.println("The interest rate of ICICI bank is "+ icici.getInterestRate());
    }
}
