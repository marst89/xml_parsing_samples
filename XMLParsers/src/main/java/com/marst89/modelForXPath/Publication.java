package com.marst89.modelForXPath;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name="crossref"/*, namespace="http://www.crossref.org/xschema/1.1"*/)
@XmlAccessorType(XmlAccessType.FIELD)
public class Publication {


	@XmlPath("journal/journal_article/doi_data/doi/text()")
	private String doi;

	@XmlPath("journal/journal_article/doi_data/resource/text()")
	private String url;
	
	@XmlPath("journal/journal_article/titles/title/text()")
	private String title;

	@XmlPath("journal/journal_article/publication_date[@media_type='print']/month/text(")
	private String printMonth;

	@XmlPath("journal/journal_article/publication_date[@media_type='print']/year/text()")
	private String printYear;

	@XmlPath("journal/journal_article/publication_date[@media_type='electronic']/month/text()")
	private String eMonth;

	@XmlPath("journal/journal_article/publication_date[@media_type='electronic']/year/text()")
	private String eYear;

	@XmlPath("journal/journal_issue/journal_volume/volume/text()")
	private String volume;

	@XmlPath("journal/journal_issue/issue/text()")
	private String issue;

	@XmlPath("journal/journal_article/pages/first_page/text()")
	private String firstPage;

	@XmlPath("journal/journal_article/pages/last_page/text()")
	private String lastPage;


	@XmlPath("journal/journal_metadata/issn[@media_type='print']/text()")
	private String issn;

	@XmlPath("journal/journal_metadata/issn[@media_type='electronic']/text()")
	private String eIssn;

	@XmlPath("journal/journal_metadata/full_title/text()")
	private String journalTitle;

	@XmlPath("journal/journal_metadata/abbrev_title/text()")
	private String journalAbbrevTitle;

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrintMonth() {
		return printMonth;
	}

	public void setPrintMonth(String printMonth) {
		this.printMonth = printMonth;
	}

	public String getPrintYear() {
		return printYear;
	}

	public void setPrintYear(String printYear) {
		this.printYear = printYear;
	}

	public String geteMonth() {
		return eMonth;
	}

	public void seteMonth(String eMonth) {
		this.eMonth = eMonth;
	}

	public String geteYear() {
		return eYear;
	}

	public void seteYear(String eYear) {
		this.eYear = eYear;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(String firstPage) {
		this.firstPage = firstPage;
	}

	public String getLastPage() {
		return lastPage;
	}

	public void setLastPage(String lastPage) {
		this.lastPage = lastPage;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String geteIssn() {
		return eIssn;
	}

	public void seteIssn(String eIssn) {
		this.eIssn = eIssn;
	}

	public String getJournalTitle() {
		return journalTitle;
	}

	public void setJournalTitle(String journalTitle) {
		this.journalTitle = journalTitle;
	}

	public String getJournalAbbrevTitle() {
		return journalAbbrevTitle;
	}

	public void setJournalAbbrevTitle(String journalAbbrevTitle) {
		this.journalAbbrevTitle = journalAbbrevTitle;
	}
}
