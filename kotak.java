public class kotak{
	public static void main(String [] args){
        
        int baris = 5;
        int kolom = 3;
   
        
        for(int i=0; i<baris; i++){
            System.out.print("*");
        }
       
        System.out.println(""); 
        for(int z=0; z<kolom;z++){
            System.out.print("*");   
            for(int x=0; x<(baris-2); x++){
                System.out.print(" ");
                if(x==(baris-3)){
                    System.out.print("*");
                }
            }
                System.out.println("");
        }
      
        for(int y=0; y<baris; y++){
            System.out.print("*");
        }
        
        System.out.println("");
    }
}