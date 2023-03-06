package aplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\subdir").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int valorTotal = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, valorTotal));

				itemCsv = br.readLine();
			}
	}   
}
}
