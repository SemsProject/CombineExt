package de.unirostock.sems.cbext.formatizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;

import org.sbolstandard.core.SBOLFactory;
import org.sbolstandard.core.SBOLValidationException;

import de.binfalse.bflog.LOGGER;
import de.unirostock.sems.cbext.FormatParser;

/**
 * The Class SbolFormatizer to recognize sbol files.
 */
public class SbolFormatizer extends FormatParser {
	
	/* (non-Javadoc)
	 * @see de.unirostock.sems.cbext.FormatParser#getPriority()
	 */
	@Override
	public int getPriority() {
		return 100;
	}

	/* (non-Javadoc)
	 * @see de.unirostock.sems.cbext.FormatParser#checkFormat(java.io.File, java.lang.String)
	 */
	@Override
	public URI checkFormat(File file, String mimeType) {
		
		// mime type check
		if (mimeType == null || mimeType.equals("application/xml") == false )
			return null;
		
		try {
			SBOLFactory.read (new FileInputStream (file));
			return buildUri (IDENTIFIERS_BASE, "sbol");
		}
		catch (IOException | SBOLValidationException e) {
			LOGGER.info (e, "file ", file, " seems to be no sbol file..");
		}
		
		// no format could be guessed
		return null;
	}

}
