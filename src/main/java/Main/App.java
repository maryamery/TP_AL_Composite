package Main;

import Composite.Category;
import Composite.Component;
import Composite.Product;

public class App {
	public static void main(String[] args) throws Exception {
		Category category1 = new Category("category1");
		Category category1_1 = new Category("category1_1");
		Category category1_2 = new Category("category1_2");
		Product product1_3 = new Product("product1_3");

		Category category1_2_1 = new Category("category1_2_1");
		Product product1_2_1_1 = new Product("product1_2_1_1");

		category1.addComponent(category1_1);
		category1.addComponent(category1_2);
		category1.addComponent(product1_3);

		category1_2.addComponent(category1_2_1);
		category1_2_1.addComponent(product1_2_1_1);

		// Show the View before Delete
		category1.view();
		// Delete Category1_2
		category1_2.deleteCategory();
		// Show the View after Delete
		category1.view();
	}
}
