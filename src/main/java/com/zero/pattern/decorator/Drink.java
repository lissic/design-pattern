package main.java.com.zero.pattern.decorator;

/**
 * @author zero
 * @description Drink
 * @date 2022/5/8 21:23
 */
    public abstract class Drink {
        private String desc;
        private float price;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public abstract float cost();
    }
