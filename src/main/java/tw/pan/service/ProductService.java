package tw.pan.service;

import java.util.List;

import tw.pan.model.Product;

public interface ProductService {

	//查詢出menu所需之資料 => 產品名稱，產品售價，圖片
	public String getProductAll() throws Exception;
	
	public String getProductByMain(String p_main) throws Exception;
	
	public String getProductByMainAndDetail(String p_main,String p_detail) throws Exception;
	
	public String getProductByName(String p_name) throws Exception;
}
