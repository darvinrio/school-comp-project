import java.io.*;
public class converter
{
    public static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public static int c,ch,n;
    public static void main() throws Exception
    {       
        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        System.out.println("|   *****  *******  **    *   *          *   ******    ****    *********  ******  ****           ***     ***      |");
        System.out.println("|  *       *     *  * *   *    *        *    *         *   *       *      *       *   *          ***    *****     |");
        System.out.println("| *        *     *  *  *  *     *      *     ******    *   *       *      ******  *   *          ***   *******    |");
        System.out.println("| *        *     *  *   * *      *    *      ******    ****        *      ******  ****         *******   ***      |");
        System.out.println("|  *       *     *  *    **       *  *       *         * *         *      *       * *           *****    ***      |");
        System.out.println("|   *****  *******  *     *        **        ******    *  *        *      ******  *  *           ***     ***      |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        System.out.println("                                                                                                          V 1.0.0  ");
        converter.options();
    }

    public static void options() throws Exception
    {
        System.out.println("Enter :");
        System.out.println(" 1 - Linear conversions");
        System.out.println(" 2 - Area conversions");
        System.out.println(" 3 - Mass conversions");
        System.out.println(" 4 - Currency conversions");
        System.out.println(" 5 - Temperature conversions");
        System.out.println(" 6 - Volume conversions");
        System.out.println("Enter your Choice:");
        c=Integer.parseInt(br.readLine());
        switch (c)
        {
            case 1:
            length();
            break;
            case 2:
            area();
            break;
            case 3:
            mass();
            break;
            case 4:
            coin();
            break;
            case 5:
            temp();
            break;
            case 6:
            vol();
            break;
            default:
            System.out.println("Wrong Choice");
            exiter();            
        }
    }

    public static void length()throws Exception
    {
        System.out.println("Linear Conversions:");
        System.out.println("*******************");
        System.out.println("");
        System.out.println("Enter :");
        System.out.println(" 1 - Inches to Centimetres");
        System.out.println(" 2 - Feet to Inches");
        System.out.println(" 3 - Yards to Metres");
        System.out.println(" 4 - Rods to Metres");
        System.out.println(" 5 - Feet to Metres");
        System.out.println(" 6 - Miles to Kilometres");
        System.out.println(" 7 - Kilometres to Miles");
        System.out.println(" 8 - Inches to Metres");
        System.out.println(" 9 - Fathoms to Metres");
        System.out.println("10 - Nautical Miles to Kilometres");
        System.out.println(" Enter Your Choice:");
        ch =Integer.parseInt(br.readLine());
        switch (ch)
        {
            case 1:
            System.out.println("Inches to Centimetres");
            System.out.println(" Enter Length in Inches");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Centimetres="+(n*2.54));
            break;
            case 2:
            System.out.println("Feet to Inches");
            System.out.println(" Enter Length in Feet");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Inches="+(n*12));
            break;
            case 3:
            System.out.println("Yards to Metres");
            System.out.println(" Enter Length in Yards");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Metres="+(n*0.9144));
            break;
            case 4:
            System.out.println("Rods to Metres");
            System.out.println(" Enter Length in Rods");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Metres="+(n*0.199));
            break;  
            case 5:
            System.out.println("Feet to Metres");
            System.out.println(" Enter Length in Feet");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Metres="+(n*0.3048));
            break;
            case 6:
            System.out.println("Miles to Kilometres");
            System.out.println(" Enter Length in Miles");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Kilometres="+(n*1.61));
            break;
            case 7:
            System.out.println("Kilometres to Miles");
            System.out.println(" Enter Length in Kilometres ");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Miles="+(n/1.61));
            break;
            case 8:
            System.out.println("Inches to Metres");
            System.out.println(" Enter Length in Inches");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Metres="+(n));
            break;
            case 9:
            System.out.println("Fathoms to Metres");
            System.out.println(" Enter Length in Fathoms");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Metres="+(n/1.829));
            break;
            case 10:
            System.out.println("Nautical Miles to Kilometres ");
            System.out.println(" Enter Length in Nautical Miles ");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Length in Kilometres="+(n*1.852));
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println("Do you want stop the program?");
            System.out.println("If so type 1 ");
            System.out.println("If you want restart \"Linear Conversions\" type any digit ");
            int e=Integer.parseInt(br.readLine());
            if(e==1)
            {
                System.out.println("Click on close button");
            }
            else
            {
                System.out.println("Program Reloaded:");
                length();
            }

        }
    } 

    
public static void area()throws Exception
    {
        System.out.println("Area Conversions:");
        System.out.println("");
        System.out.println("Enter:");
        System.out.println(" 1 - Square Inch to Square Centimetre");
        System.out.println(" 2 - Square Foot to Square Metre");
        System.out.println(" 3 - Square Yard to Square Metre");
        System.out.println(" 4 - Square Mile to Square Kilometre");
        System.out.println(" 5 - Hectare to Square Kilometre");
        System.out.println(" 6 - Acre to Hectare");
        System.out.println(" 7 - Acre to Square Kilometre");
        System.out.println("Enter your choice:");
        switch (Integer.parseInt(br.readLine()))
        {
            case 1:
            System.out.println("Square Inch to Square Centimetre");
            System.out.println(" Enter Area in Square Inches:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Square Centimetres="+(n*6.4516));
            break;
            case 2:
            System.out.println("Square Foot to Square Metre");
            System.out.println(" Enter Area in Square Feet:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Square Metres="+(n*0.0929));
            break;
            case 3:
            System.out.println("Square Yard to Square Metre");
            System.out.println(" Enter Area in Square Yard:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Square Metre="+(n*0.83613));
            break;
            case 4:
            System.out.println("Square Mile to Square Kilometre");
            System.out.println(" Enter Area in Square Miles:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Square Kilometres="+(n*2.58999));
            break;
            case 5:
            System.out.println("Hectare to Square Kilometre");
            System.out.println(" Enter Area in Hectare:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Square Kilometre="+(n*0.00386*2.58999));
            break;
            case 6:
            System.out.println("Acre to Hectare");
            System.out.println(" Enter Area in Acre:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Hectare="+(n*0.40469));
            break;
            case 7:
            System.out.println("Acre to Square Kilometre");
            System.out.println(" Enter Area in Acre:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Area in Square Kilometre="+(n*0.00405));
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println("Do you want stop the program?");
            System.out.println("If so type 1 ");
            System.out.println("If you want restart \"Area Conversions\" type any digit ");
            int e=Integer.parseInt(br.readLine());
            if(e==1)
            {
                System.out.println("Click on close button");
            }
            else
            {
                System.out.println("Program Reloaded:");
                mass();
            }

        }
    }

    public static void mass()throws Exception
    {
        System.out.println("Mass Conversions:");
        System.out.println("*******************");
        System.out.println("");
        System.out.println("Enter:");
        System.out.println(" 1 - Ounce to Gram");
        System.out.println(" 2 - Pound to Kilogram");
        System.out.println(" 3 - Stone to Kilogram");
        System.out.println(" 4 - Hundred Weight (UK) to Kilogram");
        System.out.println(" 5 - Hundred Weight (USA) to Kilogram");
        System.out.println(" 6 - Short Ton to Kilogram");
        System.out.println(" 7 - Long Ton to Kilogram");
        System.out.println(" 8 - Metric Ton to Kilogram");
        System.out.println("Enter your Choice :");
        switch(Integer.parseInt(br.readLine()))
        {
            case 1:
            System.out.println("Ounce to Gram");
            System.out.println(" Enter Mass in Ounces:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Gram ="+(n*28.34952));
            break;
            case 2:
            System.out.println("Pound to Kilogram");
            System.out.println(" Enter Mass in Pound:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*0.45359));
            break;
            case 3:
            System.out.println("Stone to Kilogram");
            System.out.println(" Enter Mass in Stone:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*6.35029));
            break;
            case 4:
            System.out.println("Hundred Weight (UK) to Kilogram");
            System.out.println(" Enter Mass in Hundred Weight (UK):");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*50.80235));
            break;
            case 5:
            System.out.println("Hundred Weight (USA) to Kilogram");
            System.out.println(" Enter Mass in Hundred Weight (USA):");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*45.35924));
            break;
            case 6:
            System.out.println("Short Ton to Kilogram");
            System.out.println(" Enter Mass in Short Ton:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*907.18));
            break;
            case 7:
            System.out.println("Long Ton to Kilogram");
            System.out.println(" Enter Mass in Long Ton:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*1016.05));
            break;
            case 8:
            System.out.println("Metric Ton to Kilogram");
            System.out.println(" Enter Mass in Metric Ton:");
            n=Integer.parseInt(br.readLine());
            System.out.println(" Mass in Kilogram ="+(n*1000));
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println("Do you want stop the program?");
            System.out.println("If so type 1 ");
            System.out.println("If you want restart \"Mass Conversions\" type any digit ");
            int e=Integer.parseInt(br.readLine());
            if(e==1)
            {
                System.out.println("Click on close button");
            }
            else
            {
                System.out.println("Program Reloaded:");
                mass();
            }

        }
    }

    public static void temp()throws Exception
    {
        System.out.println(" Temperature Conversions:");
        System.out.println(" ************************");
        System.out.println("");
        System.out.println("Enter:");
        System.out.println(" 1 - Celsius to Fahrenheit");
        System.out.println(" 2 - Fahrenheit to Celsius");
        System.out.println(" 3 - Celsius to Kelvin");
        System.out.println(" 4 - Fahrenheit to Kelvin");
        System.out.println(" 5 - Rankine to Celsius");
        System.out.println(" 6 - Rankine to Fahrenheit");
        System.out.println(" 7 - Rankine to Kelvin");
        System.out.println(" 8 - Reaumur to Celsius");
        System.out.println(" 9 - Reaumur to Fahrenheit");
        System.out.println("10 - Reaumur to Kelvin");
        System.out.println("Enter Your Choice:");
        switch(Integer.parseInt(br.readLine()))
        {
            case 1 :
            System.out.println("Celsius to Fahrenheit");
            System.out.println(" Enter Temperature in Celsius:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Fahrenheit="+((n*1.8)+32));
            break;
            case 2 :
            System.out.println("Fahrenheit to Celsius");
            System.out.println(" Enter Temperature in Fahrenheit:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Celsius="+((n-32)/1.8));
            break;
            case 3 :
            System.out.println("Celsius to Kelvin");
            System.out.println(" Enter Temperature in Celsius:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Kelvin="+(n+273.15));
            break; 
            case 4 :
            System.out.println("Fahrenheit to Kelvin");
            System.out.println(" Enter Temperature in Fahrenheit:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Kelvin="+((n+459.67)/1.8));
            break;
            case 5 :
            System.out.println("Rankine to Celsius");
            System.out.println(" Enter Temperature in  Rankine:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Celsius="+(((n-32)-459.67)/1.8));
            break;
            case 6 :
            System.out.println("Rankine to Fahrenheit");
            System.out.println(" Enter Temperature in  Rankine:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Fahrenheit="+((n-459.67)));
            break;
            case 7 :
            System.out.println("Rankine to Kelvin");
            System.out.println(" Enter Temperature in  Rankine:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Kelvin="+(n/1.8));
            break;
            case 8 :
            System.out.println("Reaumur to Celsius");
            System.out.println(" Enter Temperature in  Reaumur:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Celsius="+(n*1.25));
            break;
            case 9 :
            System.out.println("Reaumur to Fahrenheit");
            System.out.println(" Enter Temperature in  Reaumur:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Fahrenheit="+(n*1.25));
            break;
            case 10 :
            System.out.println("Reaumur to Kelvin");
            System.out.println(" Enter Temperature in  Reaumur:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Temperature in Kelvin="+(n*1.25));
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println("Do you want stop the program?");
            System.out.println("If so type 1 ");
            System.out.println("If you want restart \"Temperature Conversion\" type any digit ");
            int e=Integer.parseInt(br.readLine());
            if(e==1)
            {
                System.out.println("Click on close button");
            }
            else
            {
                System.out.println("Program Reloaded:");
                temp();
            }
        }
    }

    public static void vol()throws Exception
    {
        System.out.println("Volume conversions:");
        System.out.println("*******************");
        System.out.println("");
        System.out.println("Enter:");
        System.out.println(" 1 - Cubic Feet to Cubic Inches");
        System.out.println(" 2 - Cubic Feet to Cubic Yards");
        System.out.println(" 3 - Cubic Feet to Gallons");
        System.out.println(" 4 - Cubic Yards to Cubic Feet");
        System.out.println(" 5 - Cubic Yards to Gallons");
        System.out.println(" 6 - Quarts to Pints");
        System.out.println(" 7 - Quarts to Gallons");
        System.out.println(" 8 - Gallons to Pints");
        System.out.println(" 9 - Gallons to Quarts");
        System.out.println("10 - Gallons to Cubic Feet");
        System.out.println("Enter your Choice:");
        switch(Integer.parseInt(br.readLine()))
        {
            case 1:
            System.out.println("Cubic Feet to Cubic Inches");
            System.out.println(" Enter Volume in Cubic Feet:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Volume in Cubic Inches="+(n*1728));
            break;
            case 2:
            System.out.println("Cubic Feet to Cubic Yards");
            System.out.println(" Enter Volume in Cubic Feet:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Volume in Cubic Yards="+(n*0.04));
            break;
            case 3:
            System.out.println("Cubic Feet to Gallons");
            System.out.println(" Enter Volume in Cubic Feet:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Volume in Gallons="+(n*7.48));
            break;
            case 4:
            System.out.println("Cubic Yards to Cubic Feet");
            System.out.println(" Enter Volume in :");
            n =Integer.parseInt(br.readLine());
            System.out.println("Volume in Cubic Feet="+(n*27));
            break;
            case 5:
            System.out.println("Cubic Yards to Gallons");
            System.out.println(" Enter Volume in Cubic Yards:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Volume in Gallons="+(n*202));
            break;
            case 6:
            System.out.println("Quarts to Pints");
            System.out.println(" Enter Volume in Quarts:");
            n =Integer.parseInt(br.readLine());
            System.out.println("Volume in Pints="+(n*2));
            break;
            case 7:
            System.out.println("Quarts to Gallons");
            System.out.println(" Enter Volume in Quarts:");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Volume in Gallons="+(n*0.25));
            break;
            case 8:
            System.out.println("Gallons to Pints");
            System.out.println(" Enter Volume in Gallons:");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Volume in Pints="+(n*8));
            break;
            case 9:
            System.out.println("Gallons to Quarts");
            System.out.println(" Enter Volume in Gallons:");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Volume in Quarts="+(n*4));
            break;
            case 10:
            System.out.println("Gallons to Cubic Feet");
            System.out.println(" Enter Volume in Gallons:");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Volume in Cubic Feet="+(n*0.13));
            break;
            default:
            System.out.println("Wrong Choice");
            System.out.println("Do you want stop the program?");
            System.out.println("If so type 1 ");
            System.out.println("If you want restart \"Volume Conversions\" type any digit ");
            int e=Integer.parseInt(br.readLine());
            if(e==1)
            {
                System.out.println("Click on close button");
            }
            else
            {
                System.out.println("Program Reloaded:");
                vol();
            }
        }
    }


    public static void coin()throws Exception
    {
        System.out.println("Currency conversions:");
        System.out.println("                  as on September 13,2013");
        System.out.println("********************");
        System.out.println("");
        System.out.println("Enter:");
        System.out.println(" 1 - U.S Dollar to Indian Rupees");
        System.out.println(" 2 - Euro to Indian Rupees");
        System.out.println(" 3 - Pound Sterling to Indian Rupees");
        System.out.println(" 4 - Japanese Yen to Indian Rupees");
        System.out.println(" 5 - Swiss Franc to Indian Rupees");
        System.out.println(" 6 - Singaporean Dollar to Indian Rupees");
        System.out.println(" 7 - Australian Dollar to Indian Rupees");
        System.out.println(" 8 - Canadian Dollar to Indian Rupees");
        System.out.println(" 9 - Swedish Kroner to Indian Rupees");
        System.out.println("10 - Danish Kroner to Indian Rupees");
        System.out.println("11 - New Zealand Dollar to Indian Rupees");
        System.out.println("12 - Hongkong Dollar to Indian Rupees");
        System.out.println("13 - Malaysian Ringitt to Indian Rupees");
        System.out.println("14 - Kuwaiti Dinar to Indian Rupees");
        System.out.println("15 - UAE Dirham to Indian Rupees");
        System.out.println("16 - Bahraini Dinar to Indian Rupees");
        System.out.println("17 - Qatari Riyal to Indian Rupees");
        System.out.println("18 - Saudi Riyal to Indian Rupees");
        System.out.println("19 - Omani Riyal to Indian Rupees");
        System.out.println("Enter Choice:");
        switch(Integer.parseInt(br.readLine()))
        {
            case 1 :
            System.out.println("U.S Dollar to Indian Rupees");
            System.out.println(" Enter amount in U.S.Dollar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*63.30));
            break;  
            case 2 :
            System.out.println("Euro to Indian Rupees");
            System.out.println(" Enter amount in Euro");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*84.16));
            break;  
            case 3 :
            System.out.println("Pound Sterling to Indian Rupees");
            System.out.println(" Enter amount in Pound Sterling");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*100.03));
            break;  
            case 4 :
            System.out.println("Japanese Yen to Indian Rupees");
            System.out.println(" Enter amount in Japanese Yen");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*0.6368));
            break;  
            case 5 :
            System.out.println("Swiss Franc to Indian Rupees");
            System.out.println(" Enter amount in Swiss Franc");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*68.05));
            break;  
            case 6 :
            System.out.println("Singaporean Dollar to Indian Rupees");
            System.out.println(" Enter amount in Singaporean Dollar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*49.93));
            break; 
            case 7 :
            System.out.println("Australian Dollar to Indian Rupees");
            System.out.println(" Enter amount in Australian Dollar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*58.55));
            break;  
            case 8 :
            System.out.println("Canadian Dollar to Indian Rupees");
            System.out.println(" Enter amount in Canadian Dollar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*61.34));
            break;  
            case 9 :
            System.out.println("Swedish Kroner to Indian Rupees");
            System.out.println(" Enter amount in Swedish Kroner");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*9.69));
            break;  
            case 10 :
            System.out.println("Danish Kroner to Indian Rupees");
            System.out.println(" Enter amount in Danish Kroner");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*11.28));
            break;  
            case 11 :
            System.out.println("New Zealand Dollar to Indian Rupees");
            System.out.println(" Enter amount in New Zealand Dollar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*51.52));
            break;  
            case 12 :
            System.out.println("Hongkong Dollar to Indian Rupees");
            System.out.println(" Enter amount in Hongkong Dollar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*8.16));
            break;  
            case 13 :
            System.out.println("Malaysian Ringitt to Indian Rupees");
            System.out.println(" Enter amount in Malaysian Ringitt");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*19.30));
            break;  
            case 14 :
            System.out.println("Kuwaiti Dinar to Indian Rupees");
            System.out.println(" Enter amount in Kuwaiti Dinar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*222.2));
            break;  
            case 15 :
            System.out.println("UAE Dirham to Indian Rupees");
            System.out.println(" Enter amount in UAE Dirham");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*17.23));
            break;
            case 16 :
            System.out.println("Bahraini Dinar to Indian Rupees");
            System.out.println(" Enter amount in Bahraini Dinar");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*167.61));
            break;  
            case 17 :
            System.out.println("Qatari Riyal to Indian Rupees");
            System.out.println(" Enter amount in Qatari Riyal");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*17.44));
            break;  
            case 18 :
            System.out.println("Saudi Riyal to Indian Rupees");
            System.out.println(" Enter amount in Saudi Riyal");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*16.91));
            break;  
            case 19 :
            System.out.println("Omani Riyal to Indian Rupees");
            System.out.println(" Enter amount in Omani Riyal");
            n =Integer.parseInt(br.readLine());
            System.out.println(" Amount in Indian Rupees ="+(n*163.93));
            break;  
            default:
            System.out.println("Wrong Choice");
            System.out.println("Do you want stop the program?");
            System.out.println("If so type 1 ");
            System.out.println("If you want restart \"Currency Conversions\" type any digit ");
            int e=Integer.parseInt(br.readLine());
            if(e==1)
            {
                System.out.println("Click on close button");
            }
            else
            {
                System.out.println("Program Reloaded:");
                coin();
            }
        
        }
    }

    public static void exiter()throws Exception
    {
        System.out.println("Do you wonna stop the program?");
        System.out.println("If so type 1 ");
        System.out.println("If you wonna restart type any digit ");
        int e=Integer.parseInt(br.readLine());
        if(e==1)
        {
            System.out.println("Click on close button");
        }
        else
        {
            System.out.println("Program Reloaded:");
            options();
        }
    }
}
