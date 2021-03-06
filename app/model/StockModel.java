package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model.Finder;

import play.db.ebean.Model;
@Entity
@Table(name="public.stock")
public class StockModel extends Model {
	
	
		@Id
			int id;
		@Column(name="quantity")
		int quantity;
		
			@Column(name="code")
			String code;

			@Column(name="category")
			String category;
			public String getCode() {
				return code;
			}
			public void setCode(String code) {
				this.code = code;
			}
			
			public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
			public int getId() {
				return id;
			}	
			public StockModel( int quantity,String code ,String category) {
				
				this.code=code;
				this.quantity=quantity;
				this.category=category;
				
			}
			public StockModel( int quantity,String code) {
				
				this.code=code;
				this.quantity=quantity;
				
				
			}
			public static Finder<String,StockModel> find=new Finder<>(String.class,StockModel.class);


}
