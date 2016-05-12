//package stepDefinition;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//public class SampleWriteAndReadFile {
//
//	public SampleWriteAndReadFile() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//
//	public static void main(String a[]) {
//
//		Map<String, Object> valueMap = new HashMap<String, Object>();
//		valueMap.put("DataFileId", "12345");
//		valueMap.put("TemplateId", "23456");
//
//		FileOutputStream fos;
//		try {
//			fos = new FileOutputStream("sample.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(valueMap);
//            oos.close();
//            fos.close();
//		} catch (IOException  e) {
//			e.printStackTrace();
//		}
//
//		
//		
//		//Read file sample.txt
//		HashMap<Integer, String> map = null;
//	      try
//	      {
//	         FileInputStream fis = new FileInputStream("sample.txt");
//	         ObjectInputStream ois = new ObjectInputStream(fis);
//	         map = (HashMap) ois.readObject();
//	         ois.close();
//	         fis.close();
//	      }catch(IOException ioe)
//	      {
//	         ioe.printStackTrace();
//	         return;
//	      }catch(ClassNotFoundException c)
//	      {
//	         System.out.println("Class not found");
//	         c.printStackTrace();
//	         return;
//	      }
//	      System.out.println("Deserialized HashMap..");
//	      // Display content using Iterator
//	      Set set = map.entrySet();
//	      Iterator iterator = set.iterator();
//	      while(iterator.hasNext()) {
//	         Map.Entry mentry = (Map.Entry)iterator.next();
//	         System.out.print("key: "+ mentry.getKey() + " & Value: ");
//	         System.out.println(mentry.getValue());
//	      }		
//	}
//}
