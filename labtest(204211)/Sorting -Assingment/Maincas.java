public class Maincas{
      // caseconsturuction
	private String cacon(){
        String output="";
        int a,alpa;
        if(this.options[1].equals("upper")){
            for(a=0;i<this.data.length();a++){
                alpa=(int)(this.data.charAt(a));
                if(alpa>=97 && alpa<=122){
                    alpa-=32;
                    output+=(char)(alpa);
                }
                else
                    output+=(char)(alpa);  
            }
        }
        else{
            for(a=0;i<this.data.length();a++){
                alpa=(int)(this.data.charAt(a));
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
