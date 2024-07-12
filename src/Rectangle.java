public class Rectangle {
public int length;
public int width;
    public Rectangle(int height, int width) {
        this.length = height;
        this.width = width;
    }

    public int getAcreage(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (this.length + this.width) * 2;
    }

    public String getDisplay(){
        return "Hình chữ nhật có chiều dài là " + this.length + " và chiều rộng là " + this.width;
    }

    public String getImage(){
        StringBuilder image = new StringBuilder();
        for(int i = 0; i <= this.width - 1; i++){
            for(int j = 0; j <= this.length - 1; j++){
                image.append("*");
            }
            image.append("\n");
        }
        return image.toString();
    }

}
