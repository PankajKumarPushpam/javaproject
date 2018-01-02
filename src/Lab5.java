class Lab5{  
   public static void main(String args[]){  
    MyThread th1=new MyThread();
    th1.setPriority(10);
  }
} 
class MyThread extends Thread{}