public class Human {

    public void putOnAll() {
        jacket.putOn();
        pants.putOn();
        cap.putOn();
    }

    public void putOffAll() {
        jacket.putOff();
        pants.putOff();
        cap.putOff();
    }

    Jacket jacket = new Jacket(true);
    Pants pants = new Pants(false);
    Cap cap = new Cap(false);

}
