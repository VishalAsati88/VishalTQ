package test;

import java.util.Comparator;

public class SortByCities implements Comparator <Shipment> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Shipment o1, Shipment o2) {
		
		return o1.getAddr().getCity().compareToIgnoreCase(o2.getAddr().getCity())
		{
				if(o1.getShipDate().getClass()==o2.getShipDate().getClass())
					return 0;
			    else
					return -1;
	    }
	}

}
