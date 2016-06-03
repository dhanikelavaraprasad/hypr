package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.cyb.tms.entity.TmsStoryMst;
import com.cyb.tms.entity.TmsUsers;
import com.cyb.tms.entity.UserStoryStaus;



public class TestUtil {

	public static void main(String[] args) {
		
		Session session = null;
		Transaction txn = null;
		
		try{
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = sf.openSession();
			txn = session.beginTransaction();
			
			/*TmsSprintMst sprint = (TmsSprintMst) session.createCriteria(TmsSprintMst.class, "sp")
	                .createAlias("tmsProject", "proj")
	                .add(Restrictions.eqProperty("sp.tmsProject", "proj.pid"))
	                .add(Restrictions.eq("proj.pid", new Long(1)))
	                .add(Restrictions.eq("sp.sprintStatus", "OPEN")).uniqueResult();
			System.out.println(sprint);*/
			
			/*@SuppressWarnings("unchecked")
			List<TmsUsers> users = session.createCriteria(TmsUsers.class, "tu")
					               .createAlias("tmsProject", "proj")
					               .add(Restrictions.eqProperty("tu.tmsProject", "proj.pid"))
				                   .add(Restrictions.eq("proj.pid", new Long(1)))
				                   .add(Restrictions.eq("tu.isActive", "ACTIVE")).list();*/
			
			/*System.out.println(users.size());*/
			
		@SuppressWarnings("unchecked")
		List<String> jiraIds = session.createCriteria(UserStoryStaus.class, "uss")
								.createAlias("tmsSprintMst", "sprint")
								.setProjection(Projections.projectionList().add(Projections.property("jiraId")))
								//.add(Restrictions.eqProperty("uss.tmsSprintMst", "sprint.sprintId"))
								.add(Restrictions.eq("sprint.sprintId", new Long(1))).list();
			
			
//			Criteria criteria = session.createCriteria(TmsStoryMst.class, "story");
//			criteria.createAlias("userStoryStatus", "uss");
//			criteria.add(Restrictions.eqProperty("uss.jiraId", "story.jiraId"));
//			criteria.add(Restrictions.eq("uss.tmsSprintMst", new Long(1)));
			System.out.println(jiraIds);
			
//			TmsProject project = new TmsProject();
//			project.setName("DOMO");
//			project.setStartDate(new Date());
//			
//			TmsUsers users = new TmsUsers();
//			users.setEmail("mitesha@cybage.com");
//			users.setIsActive("ACTIVE");
//			users.setPassword("12345");
//			users.setUserRole("DEVELOPER");
//			users.setUserName("mitesha");
//			users.setTmsProject(project);
//			
//			project.getTmsUserses().add(users);
//			session.save(project);
			txn.commit();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				session.flush();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			session = null;
			txn = null;
		}

	}

}
