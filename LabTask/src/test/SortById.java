package test;

import java.util.Comparator;

public class SortById implements Comparator <Shipment> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Shipment m1, Shipment m2) {
		if(m1.getShipId()==m2.getShipId())
	   {
		 return m1.getCust_name().compareToIgnoreCase(m2.getCust_name());
			
			
			
		/*if(m1.getShipDate().getDd()==m2.getShipDate().getDd())
			 return 0;
		 else if(m1.getShipDate().getDd()>m2.getShipDate().getDd())
			 return 1;
		 else
			 return -1;*/
	  }
		else if(m1.getShipId()>m2.getShipId())
			return 1;
		else
		    return -1;
	}

}
