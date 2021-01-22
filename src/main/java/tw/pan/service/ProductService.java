package tw.pan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.pan.dao.ProductSelectDao;
import tw.pan.model.Product;

@Service("productService")
public class ProductService {

	@Autowired
	private ProductSelectDao pSDao;
	public ProductService(ProductSelectDao pSDao) {
		this.pSDao = pSDao;
	}

	public List<Product> selectAll(){
		return pSDao.selectAll();
	}
}
