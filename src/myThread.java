class myThread extends Thread {

    // initiated run method for Thread
    public void run() {

        String str = "Thread Started Running...";
        System.out.println(str);
    }
}

class Geeks {

    public static void main(String args[]) {

        myThread t1 = new myThread();
        t1.start();
    }
}

