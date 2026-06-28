class My_Thread implements Runnable {

    // Method to start Thread
    public void run() {

        String str = "Thread is Running Successfully";
        System.out.println(str);
    }

}

class ABC {

    public static void main(String[] args) {

        My_Thread g1 = new My_Thread();

        // initializing Thread Object
        Thread t1 = new Thread(g1);

        // Running Thread
        t1.start();
    }
}
