class Box {

    private double width;
    double height;
    double depth;
    private String k1 = "xyz";

    public void getWidth(){
        System.out.println(this.width);
    }

    Box(Box ob) { //copy constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        System.out.println(k1);
        return width * height * depth;
    }
}


class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
    void compute() {
        volume();
    }
}

public class box_ex {

    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        weightbox.getWidth();
        Box plainbox = new BoxWeight(3, 5, 7, 8.37);
        double vol;

        vol = plainbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        plainbox = weightbox; //why is this line required


        vol = plainbox.volume();
        System.out.println("Volume of plainbox is " + vol);

        //System.out.println("Weight of plainbox is" + plainbox.weight);
    }
}

