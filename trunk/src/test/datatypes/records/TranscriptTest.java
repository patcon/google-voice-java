package test.datatypes.records;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.techventus.server.voice.datatypes.records.Transcript;
import com.techventus.server.voice.datatypes.records.TranscriptElement;

/**
 * @author bFutral
 *
 */
public class TranscriptTest {
	
	Transcript testTranscript;
	Transcript testTranscript1;
	
	final TranscriptElement.RecognitionLevel testLevel = TranscriptElement.RecognitionLevel.HIGH;
	final TranscriptElement.RecognitionLevel testLevel1 = TranscriptElement.RecognitionLevel.MED1;

	final TranscriptElement testElement = new TranscriptElement("testText",
			"testID", testLevel);
	final TranscriptElement testElement1 = new TranscriptElement("testText1",
			"testID1", testLevel);
	
	@Before
	public void setUp() {
		
		final List<TranscriptElement> testList = new ArrayList<TranscriptElement>();
		testList.add(testElement);	
		
		testTranscript = new Transcript(testList);
		
		final List<TranscriptElement> testList1 = new ArrayList<TranscriptElement>();
		testList1.add(testElement);
		testList1.add(testElement1);
		
		testTranscript1 = new Transcript(testList1);
	}
	
	@Test
	public void testToStringOverrideOneElement() {
		
		Assert.assertEquals("testText", testTranscript.toString());
	}
	
	@Test
	public void testToStringOverrideTwoElements() {
		
		Assert.assertEquals("testText testText1", testTranscript1.toString());
	}

}
