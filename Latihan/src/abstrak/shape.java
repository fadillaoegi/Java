package abstrak;


abstract class shape {

   public String color ;
   
//   Method abstract
   abstract double GetArea ();
   
//   Method non-abstract
   public String GetColor (){
       
       return color;
   }
    
}
