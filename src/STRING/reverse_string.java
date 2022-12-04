package STRING;

public class reverse_string {
             public static void main(String[] args) {
            		String message = "Hello";
            		String reverseM="";
            	//	String reversed=new String();
            		char[] messageArray=message.toCharArray();
            		for(int i=messageArray.length-1;i>=0;i--) {
            			//System.out.print(messageArray[i]);	
            			reverseM = reverseM.concat(messageArray[i]+"");
            		}
            		//System.out.println(Arrays.toString(messageArray));
            		
            		System.out.println("reverse " +reverseM);
            		
            	}

            }
				
			

         