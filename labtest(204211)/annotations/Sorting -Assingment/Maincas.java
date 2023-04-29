public class Maincas{
      // caseconsturuction  
      // declaring data , option before creating function
      
      String data;
      String[] options;
	private String cacon(){
        String output="";
        int i,alpa;
        int len = data.length();
        
        if(this.options[1].equals("upper")){
            for(i=0;i<len;i++){
                alpa=(int)(this.data.charAt(i));
                if(alpa>=97 && alpa<=122){
                    alpa-=32;
                    output+=(char)(alpa);
                }
                else
                    output+=(char)(alpa);  
            }
        }
        else{
            for(i=0;i<len;i++){
                alpa=(int)(this.data.charAt(i));
                if(alpa>=65 && alpa<=90){
                    alpa+=32;
                    output+=(char)(alpa);
                }
                else
                    output+=(char)(alpa);
                
            }
        }
        return output;
    }
}
