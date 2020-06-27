
 
public class ExampleJava 
{
	public static Object add(Object num1,Object num2)
	{
		if(num1  instanceof Character  || num2 instanceof Character)
		{
			return ((Character)num1).charValue()+((Character)num2).charValue();
			
		}
		if(num1  instanceof Byte || num2 instanceof Byte)
		{
			return ((Number)num1).byteValue()+((Number)num2).byteValue();
		}
		if(num1  instanceof Short || num2 instanceof Short)
		{
			return ((Number)num1).shortValue()+((Number)num2).shortValue();
		}
		if(num1  instanceof Integer || num2 instanceof Integer)
		{
			return ((Number)num1).intValue()+((Number)num2).intValue();
		}
		if(num1  instanceof Float || num2 instanceof Float)
		{
			return ((Number)num1).floatValue()+((Number)num2).floatValue();
		}
		if(num1  instanceof Double  || num2 instanceof Double)
		{
			return ((Number)num1).doubleValue()+((Number)num2).doubleValue();
		}
		if(num1  instanceof Long  || num2 instanceof Long)
		{
			return ((Number)num1).longValue()+((Number)num2).longValue();
		}
		if(num1  instanceof String  || num2 instanceof String)
		{
			return String.valueOf(num1)+String.valueOf(num2);
		}
		return "invalid operands for mathematical operator [+]";
	}
	public static void main(String[] args)
	{
		
		Object Result=add(10l,20l);
		System.out.println(Result);
		
		
	}

}
