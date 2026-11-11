class InterfaceDemo{
    public static void main(String[] args){
        Square s = new Square();
        s.input();
        s.disp();
        Shape ref ;
        ref = s;
        ref.input();
        ref.disp();

    }
}
interface Shape{
    public void abstract input();
    public void abstract disp();
}
class Square implements Shape{
    @Override
    public void input(){
        System.out.println("Input");
    }
    @Override
    public void disp(){
        System.out.println("display");
    }
}

