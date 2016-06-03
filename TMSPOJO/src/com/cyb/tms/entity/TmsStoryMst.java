package com.cyb.tms.entity;

// Generated Jun 2, 2016 11:52:50 PM by Hibernate Tools 3.4.0.CR1

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

/**
 * TmsStoryMst generated by hbm2java
 */
@Entity
@Table(name = "tms_story_mst", catalog = "taskmanagement")
public class TmsStoryMst implements java.io.Serializable {

	private Long storyId;
	private TmsModule tmsModule;
	private String jiraId;
	private int storyPoint;
	private Set<TmsSubtask> tmsSubtasks = new HashSet<TmsSubtask>(0);
	private Set<UserStoryStaus> userStoryStauses = new HashSet<UserStoryStaus>(
			0);

	public TmsStoryMst() {
	}

	public TmsStoryMst(String jiraId, int storyPoint) {
		this.jiraId = jiraId;
		this.storyPoint = storyPoint;
	}

	public TmsStoryMst(TmsModule tmsModule, String jiraId, int storyPoint,
			Set<TmsSubtask> tmsSubtasks, Set<UserStoryStaus> userStoryStauses) {
		this.tmsModule = tmsModule;
		this.jiraId = jiraId;
		this.storyPoint = storyPoint;
		this.tmsSubtasks = tmsSubtasks;
		this.userStoryStauses = userStoryStauses;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tmsStoryMst")
	public Set<UserStoryStaus> getUserStoryStauses() {
		return this.userStoryStauses;
	}

	public void setUserStoryStauses(Set<UserStoryStaus> userStoryStauses) {
		this.userStoryStauses = userStoryStauses;
	}

}
