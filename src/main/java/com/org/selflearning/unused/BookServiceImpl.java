//package com.org.selflearning.unused;
//
//import java.util.Iterator;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.org.selflearning.util.CommonUtil;
//
//@Service
//public class BookServiceImpl implements BookService {
//
//	@Autowired
//	BookDao bookDao;
//
//	@Override
//	public Iterable<Book> viewBook() {
//		// SELECT * FROM book; 
//		
//		return bookDao.findAll();
//	}
//
//	@Override
//	public ResponseEntity<?> addNewBook(Book book) {
//
//		bookDao.save(book);
//		
//		return new ResponseEntity<Book>(book, HttpStatus.OK);
//	}
//
//	@Override
//	public void deleteBook(int bId) {
//		// Optional<Book> b1=bookRepo.findById(bId);
//		bookDao.deleteById(bId);
//	}
//
//	@Override
//	public JSONObject getBooksList() {
//		JSONObject finalResultJObj = new JSONObject();
//		JSONArray jArray = new JSONArray();
//
//		try {
//			// List<Book> booksList = (List<Book>) bookRepo.findAll();
//			Iterable<Book> booksList = bookDao.findAll();
//
//			Iterator<Book> iter = booksList.iterator();
//			while (iter.hasNext()) {
//				Book bk = iter.next();
//				JSONObject tempJObj = new JSONObject();
//				tempJObj.put("boofgfufukid", bk.getbId());
//				tempJObj.put("author", bk.getAuthor());
//				tempJObj.put("price", bk.getPrice());
//				
//				jArray.put(tempJObj); // 0, 1, 2
//			}
////				JSONObject tempJObj = new JSONObject();
////				tempJObj.put("bookid", bk.getbId());
////				tempJObj.put("author", bk.getAuthor());
////				tempJObj.put("price", bk.getPrice());
////				jArray.put(tempJObj);
//
////			 for(Object s:booksList) {
////				tempJObj = new JSONObject();
////				tempJObj.put("bookid", "2");
////				tempJObj.put("author", "PQR");
////				tempJObj.put("price", "50");
////				jArray.put(tempJObj);
////				
////				tempJObj = new JSONObject();
////				tempJObj.put("bookid", "3");
////				tempJObj.put("author", "STU");
////				tempJObj.put("price", "25");
////				jArray.put(tempJObj);
////				
//
//			finalResultJObj.put("success", true);
//			finalResultJObj.put("message", "BooksList is successfully placed");
//			finalResultJObj.put("booksList", jArray);
//			finalResultJObj.put("totalCountOfBooks", jArray.length());
//
//			// System.out.println("JObj===> " + tempJObj.toString());
//		} catch (JSONException je) {
//			// e.printStackTrace();
//			// db entry code
//			// json return code.
//			finalResultJObj.put("success", false);
//			finalResultJObj.put("errorMsg", "JSON_Exception");
//			CommonUtil.logErrorMessageInfile(je);
//		} catch (Exception je) {
//			// e.printStackTrace();
//			// db entry code
//			// json return code.
//			finalResultJObj.put("success", false);
//			finalResultJObj.put("errorMsg", "NOrmal_Exception");
//			CommonUtil.logErrorMessageInfile(je);
//		}
//		return finalResultJObj;
//	}
//
//	@Override
//	public JSONObject getAuthorList() {
//		JSONObject finalResultJObj = new JSONObject();
//		JSONArray jArray = new JSONArray();
//		JSONObject tempJObj = new JSONObject();
//
//		try {
//			// List<Book> booksList = (List<Book>) bookRepo.findAll();
//			Iterable<Book> booksList = bookDao.findAll();
//			Iterator<Book> itr = booksList.iterator();
//			while (itr.hasNext())
//				;
//			Book bk = itr.next();
//			tempJObj = new JSONObject();
//			tempJObj.put("bookid", bk.getbId());
//			tempJObj.put("author", bk.getAuthor());
//			tempJObj.put("price", bk.getPrice());
//			jArray.put(tempJObj);
//
//			finalResultJObj.put("success", true);
//			finalResultJObj.put("message", "AuthorList is successfully placed");
//			finalResultJObj.put("authorsList", jArray);
//			finalResultJObj.put("totalCountOfAuthors", jArray.length());
//
//			// System.out.println("JObj===> " + tempJObj.toString());
//		} catch (JSONException je) {
//			// e.printStackTrace();
//			// db entry code
//			// json return code.
//			CommonUtil.logErrorMessageInfile(je);
//		}
//		return finalResultJObj;
//	}
//
//	public JSONObject getBookLocation() {
//	
//		JSONObject jTemp= new JSONObject();
//		//JSONArray jArray = new JSONArray();
//		try {
//			Iterable<Book>booksList = bookDao.findAll();
//			Iterator<Book>itr =booksList.iterator();
//			while(itr.hasNext());
//				Book bk = itr.next();
//			jTemp = new JSONObject();
//			jTemp.put("BookLocation",bk.getBookLocation());
//		}catch(Exception e) {
//			System.out.println("Exception ala re getBookLocation in serviceimpl");
//		}
//		return jTemp;
//}
//}
