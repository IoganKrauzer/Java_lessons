package OOP_Java.seminar_2;

public class Human extends Actor {

    @Override
    public String getName() {
        return super.name;
    }
      
        public Human(String name) {
            super(name);
        }



        @Override
        public void setMakeorder(boolean makeOrder) {
            super.isMakeOrder = makeOrder;
        }

        @Override
        public void setTakeOrder(boolean takeOrder) {
            super.isTakeOrder = takeOrder;
 
        }

        @Override
        public boolean isMakeOrder() {
            return super.isMakeOrder;

        }

        @Override
        public boolean isTakeOrder() {

            return super.isTakeOrder;
        }



}
