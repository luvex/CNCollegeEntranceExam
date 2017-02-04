package org.unice.fr.rdf;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;

public class DownloadPaper {
	
	private String yearUrl;
	
	public DownloadPaper(String url)
	{
		this.yearUrl=url;
	}
	
	public void changeUrl(String url)
	{
		this.yearUrl=url;
	}
	
	public void Download()
	{
		
	}

}
