This project demonstrates how to use Saxon-HE (Saxon 9.9 or later) in Java to perform XML validation using XSLT and Schematron techniques. The validation is achieved by transforming an XML document through an XSLT stylesheet, which checks certain conditions in the XML data.

Features:
XML Validation with XSLT & Schematron:
The primary functionality of the project is to validate an XML document using a predefined XSLT stylesheet. The XSLT checks the length of elements and outputs errors for items that are too short.

External XML Input:
The XML data is read from an external file, allowing easy testing with different XML files. This flexibility enables validation of multiple XML documents against the same XSLT rules.

Java Integration with Saxon-HE:
The project uses Saxon-HE, a Java-based XSLT processor, to execute the transformation and validation. The Saxon processor runs the XSLT, and the result is printed out.

How to Use:
Clone the repository to your local machine.
Place the XML file (e.g., input.xml) and the XSLT file (e.g., schematron.xslt) in the same directory as the Java application.
Run the Java application to perform the validation. The application will read the XML file, apply the XSLT transformation, and output the results.
Example Command:

java -jar java-schematron-validation-0.0.1-SNAPSHOT.jar input.xml schematron.xslt

Modify XML or XSLT:
You can modify the XML input or the XSLT validation rules to suit your needs and rerun the validation process.

Files in the Repository:
schematron.xslt - The XSLT stylesheet used for validation.
input.xml - Sample XML data to be validated.
java-schematron-validation-0.0.1-SNAPSHOT.java - Java application that reads the XML, applies the XSLT transformation, and prints the validation results.
