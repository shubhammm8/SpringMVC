package org.kalinga.SpringMVC.Service;

import java.util.List;

import org.kalinga.SpringMVC.hibernate.AllClass;
import org.kalinga.SpringMVC.hibernate.Lead;
import org.kalinga.SpringMVC.hibernate.Minds;
import org.kalinga.SpringMVC.hibernate.Track;
import org.springframework.beans.factory.annotation.Autowired;

public interface DAOService {
	
	
	public  List<Track> getAllTracks();
	public  List<Minds> RetrieveDetails();
	public  void InsertMinds(AllClass a);
	public List<Lead> getAllLeads();
	public List<Minds> getAllMinds();
	public Lead getLeadById(AllClass a);
	public void UpdateDetails(AllClass a);
	public  void DeleteDetails(AllClass a);
	
}
