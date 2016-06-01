package com.cyb.tms.entity;
// Generated Jun 1, 2016 11:50:09 AM by Hibernate Tools 4.3.1.Final

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
 * TmsModule generated by hbm2java
 */
@Entity
@Table(name = "tms_module", catalog = "TaskManagement")
public class TmsModule implements java.io.Serializable {

	private Long id;
	private TmsProject tmsProject;
	private String moduleDescription;
	private String moduleName;
	private Set<TmsStoryMst> tmsStoryMsts = new HashSet<TmsStoryMst>(0);

	public TmsModule() {
	}

	public TmsModule(TmsProject tmsProject, String moduleDescription, String moduleName,
			Set<TmsStoryMst> tmsStoryMsts) {
		this.tmsProject = tmsProject;
		this.moduleDescription = moduleDescription;
		this.moduleName = moduleName;
		this.tmsStoryMsts = tmsStoryMsts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECT_ID")
	public TmsProject getTmsProject() {
		return this.tmsProject;
	}

	public void setTmsProject(TmsProject tmsProject) {
		this.tmsProject = tmsProject;
	}

	@Column(name = "MODULE_DESCRIPTION", length = 100)
	public String getModuleDescription() {
		return this.moduleDescription;
	}

	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}

	@Column(name = "MODULE_NAME", length = 45)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tmsModule")
	public Set<TmsStoryMst> getTmsStoryMsts() {
		return this.tmsStoryMsts;
	}

	public void setTmsStoryMsts(Set<TmsStoryMst> tmsStoryMsts) {
		this.tmsStoryMsts = tmsStoryMsts;
	}

}
