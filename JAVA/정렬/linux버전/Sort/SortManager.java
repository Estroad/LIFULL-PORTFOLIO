package Sort;
public class SortManager
{

	final static int MAX_CNT=100;
	 static data[] infoStorage=new data[MAX_CNT];
	 static int curCnt=0;
	
	
	
	
	public static int searchA(String name)
	{
		for(int idx=0; idx<curCnt; idx++)
		{
			data curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
	public static int searchU(int number)
	{
		for(int idx=0; idx<curCnt; idx++)
		{
			data curInfo=infoStorage[idx];
			if(number == curInfo.number)
				return idx;
		}
		return -1;
	}
}
