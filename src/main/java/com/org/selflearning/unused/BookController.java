//package com.org.selflearning.unused;
//
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.org.selflearning.util.CommonUtil;
//
//@RestController
//@RequestMapping("/book")
//public class BookController {
//
//	@Autowired
//	BookService bookService;
//	
//	@GetMapping("/list")
//	public Iterable<Book> viewBook(){
//		
//		return bookService.viewBook();
//	}
//	
//	
//	// URL parameters from request body
//	@PostMapping("/add")
//	public void addNewBook (@RequestBody Book b) {
//		
//		System.out.println("bName from browser/client side is "+b.getbName());
//		bookService.addNewBook(b);
//	}
//	
//	// http://localhost:9092/book/delete?id=12&bName=ABCD
//	@PostMapping("/delete")
//	public String deleteBook(@RequestParam("id") int bId, @RequestParam("bName") String bName) {
//		bookService.deleteBook(bId);
//		return null;
//	}
//	
//	@GetMapping("/json-list")
//	public String getBooksList(){
//		String resultStr = "";
//		try {
//			JSONObject resultJObj = bookService.getBooksList();
//			
//			if(resultJObj != null) {
//				resultStr = resultJObj.toString();
//			}
//		} catch (Exception e) {
////			e.printStackTrace();
//			CommonUtil.logErrorMessageInfile(e);
//		}
//		return  resultStr;		
//	}
//	
//	
//	@GetMapping("/authors-list")
//	public String getAuthorsList(){
//		String resultStr = "";
//		try {
//			JSONObject resultJObj = bookService.getAuthorList();
//			
//			if(resultJObj != null) {
//				resultStr = resultJObj.toString();
//			}
//		} catch (Exception e) {
////			e.printStackTrace();
//			CommonUtil.logErrorMessageInfile(e);
//		}
//		return  resultStr;		
//	}
//	@GetMapping("/booklocation")
//	public JSONObject  getBookLocation() {
//		
//		JSONObject str=bookService.getBookLocation();
//		return str;
//		
//	}
//}
