package de.alexanderkrause.jersey.extension.loremipsum.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.svenjacobs.loremipsum.LoremIpsum;

@Path("extension/loremipsum")
public class LoremIpsumResource {
	
	@GET
	@Path("/show")
	public String show() {
		final LoremIpsum loremIpsum = new LoremIpsum();
		return loremIpsum.getParagraphs(1);
	}

}
