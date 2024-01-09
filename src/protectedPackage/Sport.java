package protectedPackage;

class Sport {
    protected void display() {
        System.out.println("Which sport do you play?");
    }
}
class Cricket extends Sport {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.display();
    }
}