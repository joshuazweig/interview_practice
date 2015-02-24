import java.lang.Exception;
public class NumToEng
{
    public String ThreeToEng(String x) //throws DataFormatException
    {
        String section = "";
        if(x.length() != 3)
        {
            //throw new DataFormatException("Length Not of 3");
            return "";
        }
       

        
        for(int i = 0; i < x.length(); i++)
        {
            String temp = String.valueOf(section.charAt(i));
            int value = Integer.parseInt(temp);
            
            if(i == 0 && !temp.equals(nums[0]))
            {
                temp += nums[value] + bigWords[1];
            }
            
            
            
            if (x.substring(1).equals("10"))
            {
            
            }
        }
        return section;
    }
    
    
    
    String [] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    String [] tens = {""};
    String [] nums = {"0","1","2","3","4","5","6","7","8","9","10"};
    String [] bigWords = {"","Hundred", "Thousand","Million","Billion"};
}