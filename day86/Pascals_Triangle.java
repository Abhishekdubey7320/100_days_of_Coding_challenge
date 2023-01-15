
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row= new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    row.add(1);
    res.add(row);
    if(numRows==1)
    return res;

    row= new ArrayList<>();
    row.add(1);
    row.add(1);
    res.add(row);
    
    if(numRows==2)
    return res;
    
    for(int i=2;i<numRows;i++)
    {
    	row= new ArrayList<>();
    	List<Integer> previous = res.get(i-1);

        //inserting 1st index with 1 
    	row.add(1);
    	
        //loop for sum 
    	for(int j=0;j<previous.size()-1;j++)
    	{
    		int sum=previous.get(j)+previous.get(j+1);
    		row.add(sum);
    	}
    	
        //inserting last index with 1
    	row.add(1);
    	
    	
    	res.add(row);
    }
  
return res;
    }
}
