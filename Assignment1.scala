object Assignment1 {
   //Q1
   def celcius_to_fahrenheit(x:Double):Double=x*1.8+32;
   

   //Q2
   def calculate_volume(x:Double):Double=4 * 22 * x * x * x /(3*7);
   

   //Q3
  def findTotal(x:Int):Double={
       var n = x*24.95 * 40/100 + 3;
       if(n>50){
           return n + 0.75*(n-50);
       }
       return n;
   }
       
   //main
   def main(args: Array[String]):Unit={
      println(celcius_to_fahrenheit(35));
      println(calculate_volume(5.0));
      println(findTotal(60));
  }
}