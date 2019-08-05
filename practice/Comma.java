class Comma{
  public static void main(String[] args){
    int num = 120;
    int num1 = 1;
    int num2 = 2;
    int diff, big;

    if(num>0 && num%2 == 0) // num%2는 숫자, true는 숫자 아님 
      System.out.println("positive and even");

    if(num1>num2){
      big = num1; diff = num1-num2; // can't separate by using ,
    }
    else{
      big = num2; diff = num2-num1;
    }

    int num3 = 100; // 중간에 변수 선언 가능
    System.out.println(num3);
  }
}

// 3 things
