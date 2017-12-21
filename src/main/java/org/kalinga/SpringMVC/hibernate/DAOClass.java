package org.kalinga.SpringMVC.hibernate;

import java.util.List;

public interface DAOClass {

//	public  void Insert();
	public  List<Minds> RetrieveDetails();
	public  void UpdateDetails(int id,String name1);
	public  void DeleteDetails(int id);
//	public  void getMindById(int i); 
	public  Lead getLeadById(int i); 
	public  List<Lead> getAllLead();
	public  List<Minds> getAllMinds();
	public  List<Track> getAllTracks();
	public  void InsertMinds(String z,String x,String c,int q,int w,int e);
	
}
