package com.cyb.tms.entity;
// Generated Jun 1, 2016 11:50:09 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TmsStoryMst generated by hbm2java
 */
@Entity
@Table(name = "tms_story_mst", catalog = "TaskManagement")
public class TmsStoryMst implements java.io.Serializable {

	private Long storyId;
	private TmsModule tmsModule;
	private TmsStatusMst tmsStatusMst;
	private TmsUsers tmsUsers;
	private Date assignedDate;
	private Date createdDate;
	private String jiraId;
	private int storyPoint;
	private Set<TmsSubtask> tmsSubtasks = new HashSet<TmsSubtask>(0);

	public TmsStoryMst() {
	}

	public TmsStoryMst(TmsStatusMst tmsStatusMst, TmsUsers tmsUsers, Date assignedDate, Date createdDate, String jiraId,
			int storyPoint) {
		this.tmsStatusMst = tmsStatusMst;
		this.tmsUsers = tmsUsers;
		this.assignedDate = assignedDate;
		this.createdDate = createdDate;
		this.jiraId = jiraId;
		this.storyPoint = storyPoint;
	}

	public TmsStoryMst(TmsModule tmsModule, TmsStatusMst tmsStatusMst, TmsUsers tmsUsers, Date assignedDate,
			Date createdDate, String jiraId, int storyPoint, Set<TmsSubtask> tmsSubtasks) {
		this.tmsModule = tmsModule;
		this.tmsStatusMst = tmsStatusMst;
		this.tmsUsers = tmsUsers;
		this.assignedDate = assignedDate;
		this.createdDate = createdDate;
		this.jiraId = jiraId;
		this.storyPoint = storyPoint;
		this.tmsSubtasks = tmsSubtasks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "STORY_ID", unique = true, nullable = false)
	public Long getStoryId() {
		return this.storyId;
	}

	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MODULE_ID")
	public TmsModule getTmsModule() {
		return this.tmsModule;
	}

	public void setTmsModule(TmsModule tmsModule) {
		this.tmsModule = tmsModule;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATUS_ID", nullable = false)
	public TmsStatusMst getTmsStatusMst() {
		return this.tmsStatusMst;
	}

	public void setTmsStatusMst(TmsStatusMst tmsStatusMst) {
		this.tmsStatusMst = tmsStatusMst;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ASSIGNED_TO", nullable = false)
	public TmsUsers getTmsUsers() {
		return this.tmsUsers;
	}

	public void setTmsUsers(TmsUsers tmsUsers) {
		this.tmsUsers = tmsUsers;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ASSIGNED_DATE", nullable = false, length = 10)
	public Date getAssignedDate() {
		return this.assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", nullable = false, length = 10)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "JIRA_ID", nullable = false, length = 45)
	public String getJiraId() {
		return this.jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	@Column(name = "STORY_POINT", nullable = false)
	public int getStoryPoint() {
		return this.storyPoint;
	}

	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tmsStoryMst")
	public Set<TmsSubtask> getTmsSubtasks() {
		return this.tmsSubtasks;
	}

	public void setTmsSubtasks(Set<TmsSubtask> tmsSubtasks) {
		this.tmsSubtasks = tmsSubtasks;
	}

}
