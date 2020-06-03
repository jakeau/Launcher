package com.skcraft.launcher.model.minecraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author barpec12
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artifact {

    protected String path;
    protected String url;
		
	protected Artifact(){};
	
	protected Artifact(String path, String url)
	{
		this.path = path;
		this.url = url;
	};
}
