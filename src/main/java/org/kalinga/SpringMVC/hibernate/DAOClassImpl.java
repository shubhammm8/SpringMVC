package org.kalinga.SpringMVC.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class DAOClassImpl implements DAOClass{

	
	
	
	public void DeleteDetails(int id){
		Session session= hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		//Query q=session.createQuery("from Minds");
		Minds t=(Minds)session.get(Minds.class, id);
		
		session.delete(t);
		
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}
//	
//	
//	public void Insert(){
//		
//		Session session=hibernateUtility.getSessionFactory().openSession();
//		session.beginTransaction();
//		
//		Track track=new Track();
//		track.setTid(3);
//		track.setName("SAP");
//		
////		Track track1=new Track();
////		track1.setTid(2);
////		track1.setName("SAP");
//		
//		session.save(track);
//	//	session.save(track1);
//
//		
//		Lead lead=new Lead();
//		lead.setLid(3);
//		lead.setTr(track);
//		lead.setLname("Rounak");
//		
////		Lead lead1=new Lead();
////		lead1.setLid(2);
////		lead1.setTr(track1);
////		lead1.setLname("Satvender");
////		
//		session.save(lead);
//		//session.save(lead1);
//
//		Minds m1=new Minds();
//		Minds m2=new Minds();
//		Minds m3=new Minds();
//	
//		m1.setMid(4);
//		m1.setMname("Satvender");
//		m1.setLe(lead);
//		
//		m2.setMid(5);
//		m2.setMname("Reshav");
//		m2.setLe(lead);
//		
//		m3.setMid(6);
//		m3.setMname("xyz");
//		m3.setLe(lead);
//		
//		session.save(m1);
//		session.save(m2);
//		session.save(m3);
//
//		
//session.getTransaction().commit();
//	System.out.println("Done----------------------------something");
//
//	}
	public List<Minds> RetrieveDetails(){
		Session session= hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		List list=new ArrayList<Minds>();
		Query q3=session.createQuery("from Minds");
		List li=q3.list();
		Iterator it=li.iterator();
	System.out.println("TRack id"+"\t"+ "Track Name"+"\t"+"Lead"+"\t"+"Mid");
		while(it.hasNext()){
			Minds m=(Minds)it.next();
			list.add(m);
			System.out.println(" \t "+ m.getMname());
			
			
		}
		
		
		
		
		session.getTransaction().commit();
		session.close();
		return list;
		
		
	}

	public void UpdateDetails(int id,String name1){
		Session session= hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Minds t=(Minds)session.get(Minds.class, id);
		t.setMname(name1);
		session.update(t);
		
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Its done");
		
		
	}

//
//	@Override
//	public void getMindById(int id) {
//		Session session =hibernateUtility.getSessionFactory().openSession();
//		session.beginTransaction();
//		Query q=session.createQuery("from Minds");
//		List list=q.list();
//		Iterator i=list.iterator();
//		while(i.hasNext()){
//			Minds m=(Minds)i.next();
//			if(m.getMid()==id){
//	System.out.println("Trackid - "+m.getLe().getTr().getTid()+"   TrackName - "+m.getLe().getTr().getName()+"     Lead is  - "+m.getLe().getLname()+"    Mind Id is -- "+ m.getMname());
//break;
//			}
//			else{}
//			
//		}
//		
//		
//		
//		
//	}
//
//
	public Lead getLeadById(int id) {
		Session session =hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Lead mi=new Lead();
		List<Lead> list =session.createQuery("from Lead where lid='" + id +"'").list();
	System.out.println("Trackid - "+list.get(0).getTr().getTid());
			
			
		
		return list.get(0);// TODO Auto-generated method stub
		
	}


	@Override
	public List<Lead> getAllLead() {
		Session session =hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Query q=session.createQuery("from Lead");
		List list=q.list();
		List<Lead> li=new ArrayList<Lead>();
		Iterator i=list.iterator();
		while(i.hasNext()){
			Lead m=(Lead)i.next();
			li.add(m);
	System.out.println(" Lead id - "+m.getLid()+"     Lead is  - "+m.getLname());

			
			
			
		}
		return li;
		
	}

//
	@Override
	public List<Minds> getAllMinds() {
		
		
		Session session =hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		List<Minds> li=new ArrayList<Minds>();
		Query q=session.createQuery("from Minds");
		List list=q.list();
		Iterator i=list.iterator();
		while(i.hasNext()){
			
			Minds m=(Minds)i.next();
			li.add(m);
	System.out.println(" Minds id - "+m.getMid()+"     Mind is  - "+m.getMname());

			
			
			
		}
		return li;
		
	}
//
//
	@Override
	public List<Track> getAllTracks() {
		
		Session session =hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		List<Track> list1=new ArrayList<Track>();
		Query q=session.createQuery("from Track");
		List list=q.list();
		Iterator i=list.iterator();
		while(i.hasNext()){
			Track m=(Track)i.next();
			list1.add(m);
	System.out.println(" TRack id - "+m.getTid()+"     Track is  - "+m.getName());

			
			
			
		}
		return list1;
		
	}
//
//
	@Override
	public void InsertMinds(String z, String x, String c, int q, int w, int e) {
		Session session=hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		Track track=new Track();
		track.setTid(q);
		track.setName(z);
		

		
		session.save(track);
	

		
		Lead lead=new Lead();
		lead.setLid(w);
		lead.setTr(track);
		lead.setLname(x);
		
		session.save(lead);
		

		Minds m1=new Minds();
	
	
		m1.setMid(e);
		m1.setMname(c);
		m1.setLe(lead);
		
		session.save(m1);
		
		
session.getTransaction().commit();
System.out.println("Inserted");

	}
//	
//	

}
