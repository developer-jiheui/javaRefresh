package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  // field
  private List<Product> products;
//  private Product[] products;  // 카트에 담은 물건들
 // private int count;           // 카트에 담은 물건의 개수
  
  // constructor
  public Cart(int cartSize){
    products = new ArrayList<>(cartSize);
  }

  // method
  public List<Product> getProducts() {
    return products;
  }
  public void setProducts(List<Product> products) {
    this.products = products;
  }
//  public int getCount() {
//    return products.size();
//  }
//  public void setCount(int count) {
//    this.count = count;
//  }

  // 물건 담기
  public void addProduct(Product product) {
    
    // 카트가 꽉 찬 경우
    if(products.add(product)) {
      System.out.println("카트가 가득 찼습니다.");
      return;
    }
    
    // 담을 물건이 없는 경우
    if(product == null) {
      System.out.println("카트에 담을 물건이 없습니다.");
      return;
    }
    
    products.add(product);
    
  }
  
  // 물건 바꾸기
  public void changeProduct(int idx, Product product) {
    
    // 카트가 비어 있는 경우
    if(products.remove(idx)== null) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }
    
    // 바꿀 물건이 없는 경우
    if(product == null) {
      System.out.println("바꿀 물건이 없습니다.");
      return;
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.size()) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }
    
    products.set(idx,product);
    
  }
  
  
  // 물건 빼기
  public void removeProduct(int idx) {
    
    // 카트가 비어 있는 경우
    if(products.remove(idx)==null) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.size()) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }
    
    /*
     * 물건이 5개(count)인 경우로 가정
     * 
     * 삭제할 idx  복사할 요소의 개수 (count - idx - 1)
     * 0            4
     * 1            3
     * 2            2
     * 3            1
     * 4            0
     */

    products.remove(idx);
    
  }
  
}
