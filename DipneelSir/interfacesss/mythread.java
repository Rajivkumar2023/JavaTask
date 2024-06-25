// Extending 'Thread ' class

class mythread extends Thread{
    public void run(){
        System.out.println("Thread is running very fastttttt....");
    }
    public void start(){
        run();
    }
    public static void main(String args[]){
        mythread t = new mythread();
        t.start();
    }
}
