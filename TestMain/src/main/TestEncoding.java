package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class TestEncoding {

	public static void textReader() {
		//
		String path = "E:/pager_60.xml";
		File file = new File(path);
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			InputStream instream = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(instream, "utf-8"));
			InputSource is = new InputSource(reader);
			Document document = builder.parse(is);
			// 文档的根元素 pager 试卷信息
			Element pager = document.getDocumentElement();
			 String fvalue = new String(pager.getAttribute("ccontent").getBytes("gb2312"),"UTF-8");
			 System.out.println(fvalue);

		} catch (FileNotFoundException | ParserConfigurationException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String str = "116行测试卷";
		try {
			String uu;
			uu = new String(str.getBytes(), "UTF-8");
			System.out.println(uu);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
//		textReader();
		
		
	}

}
