package matrices;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int[][]m = new int[3][3];
		
		int num = 0;
		boolean repetido = false;
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				
				num = (int) (Math.random()*9+1);
				m[i][j] = num;
				
				
				
					
				}
				
				//System.out.print(m[i][j] + " ");
			}
			boolean enc = false;
			int numero=0;
			 for(int i=0;i<m.length && !enc;i++){
                 if(num==m[i][0]){
                     enc=true;
                 }
             }
              
             //Sino lo agregamos
             if(!enc){
                 m[numero++][0] = num;
             
		}
		
	}

}
