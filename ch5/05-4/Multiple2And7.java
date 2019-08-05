class Multiple2And7{
  public static void main(String[] args){
    int n, s;

    n = 1000; s = 0;

    while(n>=14){
      if(n%2==0 && n%7==0){
        s += n;
        System.out.print(n + " ");
      }
      n--;
    }
    System.out.println("\n" + s);
  }
}
