package com.skcraft.launcher.model.minecraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.HashMap;

/**
 * @author barpec12
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Downloads {

    protected Artifact artifact;
    protected HashMap<String, Artifact> classifiers;
	
	protected Downloads(){};
	
	protected Downloads(String path, String url)
	{
		artifact = new Artifact(path, url);
	};

}
