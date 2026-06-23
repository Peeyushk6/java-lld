package BuilderDp.OrderDesign;

public class Order {

    private final int orderId;
    private final double amount;
    private final String email;
    private final long phoneNo;

    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.amount = builder.amount;
        this.email = builder.email;
        this.phoneNo = builder.phoneNo;
    }

    public int getOrderId() {
        return orderId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    static class Builder{
        private int orderId;
        private  double amount;
        private  String email;
        private  long phoneNo;

        public Builder setOrderId(int orderId){
            this.orderId = orderId;
            return this;
        }

        public Builder setAmount(double amount){
            this.amount = amount;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPhoneNo(long phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public Order build(){

            if(orderId <= 0){
                throw new IllegalArgumentException("Invalid Order Id");
            }

            if(amount <= 0){
                throw new IllegalArgumentException("Amount must be positive");
            }

            return new Order(this);
        }
    }

}
