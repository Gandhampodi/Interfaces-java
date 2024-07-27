package Bank1;

public interface InterfaceDemo {
    public static void main(String agr[]) {
        Bankinterf hdfc = new Hdfc();
        hdfc.calulateInterest();
        hdfc.deposite();
        hdfc.withdarw();
        Bankinterf icici = new Icici();
        icici.withdarw();
        icici.deposite();
        icici.calulateInterest();


    }
}

class Hdfc implements Bankinterf {

    @Override
    public void deposite() {
        System.out.println("HDFC Bank deposite implementation");

    }

    @Override
    public void withdarw() {
        System.out.println("HDFC bank withdraw implementation");

    }

    @Override
    public void calulateInterest() {
        System.out.println("Hdfc bank calulateInterest implementation");

    }
}

class Icici implements Bankinterf {

    @Override
    public void deposite() {
        System.out.println("Icici bank deposite implementation");
    }

    @Override
    public void withdarw() {
        System.out.println("Icici bank withdraw implementation");

    }

    @Override
    public void calulateInterest() {
        System.out.println("Icici bank calculate interest implementation");

    }
}
