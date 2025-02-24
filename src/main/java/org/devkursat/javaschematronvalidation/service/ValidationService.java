package org.devkursat.javaschematronvalidation.service;

import net.sf.saxon.s9api.*;
import org.springframework.stereotype.Service;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class ValidationService {

    private String readXmlFile(String filePath) throws Exception {
        return Files.readString(Path.of(filePath), StandardCharsets.UTF_8);
    }

    public void validateXmlWithXslt(String xmlFilePath, String xsltFilePath) throws Exception {
        Processor processor = new Processor(false);

        String xmlText = readXmlFile(xmlFilePath);
        XdmNode document = processor.newDocumentBuilder().build(new XmlSource(xmlText));

        XsltCompiler compiler = processor.newXsltCompiler();

        XsltExecutable executable = compiler.compile(new File(xsltFilePath));

        Xslt30Transformer transformer = executable.load30();

        StringWriter resultWriter = new StringWriter();
        Serializer serializer = processor.newSerializer(resultWriter);

        transformer.transform(document.asSource(), serializer);

        String output = resultWriter.toString();
        System.out.println(output);
    }

    private static class XmlSource extends StreamSource {
        public XmlSource(String xmlContent) {
            super(new java.io.StringReader(xmlContent));
        }
    }
}
