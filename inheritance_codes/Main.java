package bitsoop.inheritance;

public class Main {
    public static void main(String[] args) {
        Root l1 = new Level1(), l2 = new Level2(), l3 = new Level3();
        System.out.println("l1.getId(): " + l1.getId());
        System.out.println("l2.getId(): " + l2.getId());
        System.out.println("l3.getId(): " + l3.getId());

        System.out.println("l1.getFinalId(): " + l1.getFinalId());
        System.out.println("l2.getFinalId(): " + l2.getFinalId());
        System.out.println("l3.getFinalId(): " + l3.getFinalId());

        System.out.println("l1.getOverriddenId(): " + l1.getOverriddenId());
        System.out.println("l2.getOverriddenId(): " + l2.getOverriddenId());
        System.out.println("l3.getOverriddenId(): " + l3.getOverriddenId());
    }
}

class Root {
    protected String myId;

    public String getId() {
        return this.myId;
    }

    final public String getFinalId() {
        return getOverriddenId();
    }

    String getOverriddenId() {
        return "Root";
    }
}

class Level1 extends Root {
    {
        myId = "Level1";
    }
}

class Level2 extends Level1 {
    {
        myId = "Level2";
    }

    public String getId() {
        return "MyLevel2";
    }
}

class Level3 extends Level2 {
    {
        myId = "Level3";
    }

    String getOverriddenId() {
        return super.getOverriddenId() + "Level3";
    }
}