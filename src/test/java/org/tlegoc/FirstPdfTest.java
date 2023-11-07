package org.tlegoc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.itextpdf.text.Document;

public class FirstPdfTest extends TestCase
{
    Document doc = new Document();

    public FirstPdfTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(FirstPdfTest.class);
    }

    /**
     * Not so rigourous test :-(
     */
    public void testPDF1()
    {
        FirstPdf.addMetaData(doc);
        assertTrue(true);
    }
}
