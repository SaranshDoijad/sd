package password_generator;

class Crypto
{
    static char alpha[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','@','#','$','%','^','&','*','/','?'}; 
    static int key = 24;
    
    public static String encrypt(String ptext)
    {
        String ctext=" ";
        int value;
        

        for(int i=0;i<ptext.length();i++)
        {
            for(int j=0;j<alpha.length;j++)
            {
                if(alpha[j] == ptext.charAt(i))
                {
                    value=(j+key)% alpha.length;
                    ctext= ctext +alpha[value]; 
                }
            }
        }

//        System.out.println("encrypt"+ctext);
        return ctext;
//        decrypt(ctext,key);
    }

    public static String decrypt(String ctext)
    {
        String ptext =" ";
        int value;

        for(int i=0;i<ctext.length();i++)
        {
            for(int j=0;j<alpha.length;j++)
            {
                if(alpha[j] == ctext.charAt(i))
                {
                    value=j-key;
                    if(value<0)
                    {
                        value=value+alpha.length;
                    }
                    else
                    {
                        value=(j-key)%alpha.length;
                    }
				
                    ptext=ptext+alpha[value];
                }
            }
        }

//        System.out.println("encrypt"+ptext); 
        return ptext;
    }

//    public static void main(String [] args)
//    {
//        String ptext;
//        int key;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter the string for encryption ::"); 
//        ptext = sc.nextLine();
//
//        System.out.print("enter the key ::");
//        key= sc.nextInt();
//
//        encrypt(ptext,key);
//
//
//    }
}