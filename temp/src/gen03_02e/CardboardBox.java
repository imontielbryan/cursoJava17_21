package gen03_02e;

public class CardboardBox<T extends Boxable> extends Box<T>{

    @Override
    public double getTotalWeight() {
        return super.getTotalWeight()+0.1;
    }
}
