package example;

class DataItem {
	public double dData; //one data item
	
	public DataItem(double dd) {
		dData = dd;
	}
	
	public void displayItem() {
		System.out.print("/"+dData);
	}
}
