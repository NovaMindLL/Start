public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Camry", 100f);
        car1.drive();
    }

    public static class Car {
        private String modelName; // марка машины
        private Float fuelQuantity; // количество топлива

        public Car(String modelName, Float fuelQuantity) {
            this.modelName = modelName;
            this.fuelQuantity = fuelQuantity;
        }

        public void drive() {
            System.out.println("Ну что " + getFuelQuantity() + ", " + getModelName() + " отвезет тебя куда угодно.");
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getModelName() {
            return modelName;
        }

        public void setFuelQuantity(Float fuelQuantity) {
            this.fuelQuantity = fuelQuantity;
        }

        public Float getFuelQuantity() {
            return fuelQuantity;
        }
    }
}
