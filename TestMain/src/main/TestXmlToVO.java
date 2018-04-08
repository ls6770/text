package main;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestXmlToVO {
	
	public void xmlToVO(){
		
		
		
	}
	
	public static void main(String[] args) {
		String path = "C://bst//syncrecord//saveRecord_1//export1.xml";
		File file = new File(path);
		if(!file.exists()){
			System.out.println("没有找到xml文件！");
			return ;
		}
		
		// 创建DocumentBuilderFactory的对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();   
        try {
	      //创建DocumentBuilder对象
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        //通过documentBuilder对象 的parser方法加载books。xml文件到当前项目下
	        Document document = db.parse(path);
	      //获取所有book节点的集合
            NodeList booklist = document.getElementsByTagName("node");
            System.out.println("一共有"+booklist.getLength()+"本书");
            
            Node node = booklist.item(0);
            System.out.println(node.getAttributes().getNamedItem("iid").getTextContent());
	        
//          //打印document节点     
//            printNode(document,0);  
//            
//          //获取文档的根元素，赋值给rootElement变量     
//            Element rootElement = document.getDocumentElement();    
	        
		} catch (ParserConfigurationException e) {
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

	
	public static void printNode(Node node,int count) {     
        if (node != null) {     
            String tmp = "";     
            for(int i = 0 ; i < count ; i++) tmp += "  ";     
            //获取node节点的节点类型，赋值给nodeType变量     
            int nodeType = node.getNodeType();     
            switch (nodeType) {     
                case Node.ATTRIBUTE_NODE: tmp += "ATTRIBUTE";break;     
                case Node.CDATA_SECTION_NODE: tmp += "CDATA_SECTION";break;     
                case Node.COMMENT_NODE:tmp += "COMMENT";break;     
                case Node.DOCUMENT_FRAGMENT_NODE:tmp += "DOCUMENT_FRAGMENT";break;     
                case Node.DOCUMENT_NODE:tmp += "DOCUMENT";break;     
                case Node.DOCUMENT_TYPE_NODE:tmp += "DOCUMENT_TYPE";break;     
                case Node.ELEMENT_NODE:tmp += "ELEMENT";break;     
                case Node.ENTITY_NODE:tmp += "ENTITY";break;     
                case Node.ENTITY_REFERENCE_NODE:tmp += "ENTITY_REFERENCE";break;     
                case Node.NOTATION_NODE:tmp += "NOTATION";break;     
                case Node.PROCESSING_INSTRUCTION_NODE:tmp += "PROCESSING_INSTRUCTION";break;     
                case Node.TEXT_NODE:tmp += "TEXT";break;     
                default:return;//invalid node type.     
            }     
                 
            System.out.println(tmp+" ("+node.getNodeName()+","+node.getNodeValue()+")");     
            /*    
             * node.getAttributes()方法返回    
             * 包含node节点的属性的 NamedNodeMap（如果它是 Element）    
             */    
            NamedNodeMap attrs = node.getAttributes();     
            if(attrs != null)     
                for(int i = 0 ; i < attrs.getLength() ; i++){     
                    printNode(attrs.item(i),count+1);     
                }     
            /*    
             * node.getChildNodes()方法返回    
             * 包含node节点的所有子节点的 NodeList。    
             */    
            NodeList childNodes = node.getChildNodes();     
            for(int i = 0 ; i < childNodes.getLength() ; i++){     
                printNode(childNodes.item(i),count+1);     
            }     
        }     
    }     
}
