public class example1 {
    public class Rectangle {
        private int width;
        private int height;
    
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    
        public int getHeight() {
            return height;
        }
    
        public void setHeight(int height) {
            this.height = height;
        }
    
        public int getWidth() {
            return width;
        }
    
        public void setWidth(int width) {
            this.width = width;
        }
    
        public int getArea() {
            return width * height;
        }
    
        public int getPerimeter() {
            return 2 * (width + height);
        }
    
        public void setSize(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
    
    public class Square {
        private Rectangle rectangle;
    
        //Compostion
        public Square(int side) {
            this.rectangle = new Rectangle(side, side);
        }
        public void setSize(int side) {
            rectangle.setSize(side, side);
        }
    }
}
