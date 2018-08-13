public class TeaParty {
	private String name;
	private boolean isWorman;
	private boolean isKnighted;
	private String wo;


	
	 String welcome (String name, boolean isWoman, boolean isKnighted){
    	   this.name = name;
    	   this.isWorman = isWoman;
    	   this.isKnighted = isKnighted;
    	   
    	   if (isWoman) {
    		   wo = "Ms. ";
    		   if (isKnighted) {
    			   wo = "Lady ";
    		   }
    	   }
    	   
    	   
    	   else {
    		   wo = "Mr. ";
    		   if (isKnighted) {
    			   wo = "Sir ";
    		   }

    	   }
    	   
    	   return "Hello " + wo +  name;

    	   
    	   
       }

}
