package bitsoop.inheritance;

class Box {

    double width;
    double height;
    double depth;
    private String k1 = "xyz";

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
