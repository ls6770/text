package main;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String m = sdf.format(new Date().getTime());
		String m = sdf.format(Long.parseLong("2000000000000"));
			Date date = sdf.parse(m);
			System.out.println(date);
//////			
//		String m = "ed3c8ea7f24b487b9c681";
//		String k = m.substring(20,m.length());
//		System.out.println(k);
		
//		Date date = new Date("2018-01-25 23:31:28");
//		Date m = sdf.parse("2018-01-25 23:31:28");
//		plusDay(7,"2018-01-25 23:31:28");
//		System.out.println(m);
		
////			
////			Date date = new Date();
////			System.out.println(new Date().getTime());
//			
	}

	
//	public static void main(String[] args) {  
//        List<User> list = new ArrayList<User>();  
//        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();    
//        User u = new User();
//        u.setName("12321");  
//        u.setDate( new Date());  
//        User u1 = new User();  
//        u1.setName("12322");  
//        u1.setDate( new Date());  
//        User u2 = new User();  
//        u2.setName("12323");  
//        u2.setDate( new Date());  
//        list.add(u);list.add(u1);list.add(u2);  
//        System.out.println(gson.toJson(list));  
//        Type listType = new TypeToken<List<User>>(){}.getType();        
//    
//        List<User> users = gson.fromJson(gson.toJson(list), listType);        
//        for(User m : users){  
//            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(m.getDate()));  
//        }  
////         String json = "{\"name\":\"12345\",\"date\":\"2013-01-04 10:30:30\"}";  
//         String json = "[{\"addDate\"=\"2017-12-26 16:27:18\", \"ichapterid\"=\"1.0\", \"iid\"=\"1.0\", \"iversion\"=\"1.0\", \"page_category_id\"=\"1.0\", pagertype=1.0, pagertypeid=1.0, questionid=1.0, questiontype=1, uid=1.0}, {\"addDate\"=\"2017-12-26 16:27:26\", ichapterid=1.0, iid=2.0, iversion=1.0, page_category_id=1.0, pagertype=1.0, pagertypeid=1.0, questionid=11.0, questiontype=1, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=2.0, iid=3.0, iversion=2.0, page_category_id=2.0, pagertype=22.0, pagertypeid=2.0, questionid=2.0, questiontype=2, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=1.0, iid=4.0, iversion=1.0, page_category_id=1.0, pagertype=1.0, pagertypeid=1.0, questionid=1.0, questiontype=1, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=1.0, iid=5.0, iversion=1.0, page_category_id=1.0, pagertype=1.0, pagertypeid=1.0, questionid=11.0, questiontype=1, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=2.0, iid=6.0, iversion=2.0, page_category_id=2.0, pagertype=22.0, pagertypeid=2.0, questionid=2.0, questiontype=2, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=1.0, iid=7.0, iversion=1.0, page_category_id=1.0, pagertype=1.0, pagertypeid=1.0, questionid=1.0, questiontype=1, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=1.0, iid=8.0, iversion=1.0, page_category_id=1.0, pagertype=1.0, pagertypeid=1.0, questionid=11.0, questiontype=1, uid=1.0}, {addDate=2017-12-26 16:27:26, ichapterid=2.0, iid=9.0, iversion=2.0, page_category_id=2.0, pagertype=22.0, pagertypeid=2.0, questionid=2.0, questiontype=2, uid=1.0}]";  
//        //Gson gson = new Gson();  
//          
//        System.out.println(gson.toJson(u));  
//        CollectVO[] uu =  gson.fromJson(json, CollectVO[].class);  
//        List<CollectVO> cc = Arrays.asList(uu);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cc.get(0).getAddDate()));  
//  
//    } 
	
	/**
	 * 指定日期加上天数后的日期
	 * 
	 * @param num
	 *            为增加的天数
	 * @param newDate
	 *            创建时间
	 * @return
	 * @throws ParseException
	 */
	public static String plusDay(int num, String newDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currdate = format.parse(newDate);
		System.out.println("现在的日期是：" + currdate);
		Calendar ca = Calendar.getInstance();
		ca.setTime(currdate);
		ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
		currdate = ca.getTime();
		String enddate = format.format(currdate);
		System.out.println("增加天数以后的日期：" + enddate);
		return enddate;
	}
}
