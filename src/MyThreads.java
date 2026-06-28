class MyThreads extends Thread {

    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        System.out.println("t1 priority:" + t1.getPriority());
        System.out.println("t2 priority:" + t2.getPriority());
        t1.start();
        t2.start();
    }

    public void run() {
        System.out.println(getName() + " is running with priority" + getPriority());
    }
}

