//WAP to perform CRUD operation on Product database based on choice given by user using switch case.
//Using JDBC
package com.jdbcexample;

//start the program 
//import scanner
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//create class ProductCRUD
public class ProductCRUD {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Step 1
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        // Step 2
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "root");

        // Step 3
        Statement stmt = connection.createStatement();

        Scanner sc = new Scanner(System.in);

        int operation;

        do 
        {
            System.out.println("Available Operations:");
            System.out.println("1. Create product");
            System.out.println("2. Read products");
            System.out.println("3. Update product");
            System.out.println("4. Delete product");
            System.out.println("5. Exit");
            
            System.out.print("Please Enter a Operation number you want to Perform: ");
            operation = sc.nextInt();
            
            sc.nextLine(); 
            switch (operation) 
            {
                case 1:
                	System.out.print("Enter product id: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter product name: ");
                    String pname = sc.next();
                    System.out.print("Enter product category: ");
                    String category = sc.next();
                    System.out.print("Enter product price: ");
                    int price = sc.nextInt();
                    
                    String createSql = "INSERT INTO products (pid, pname, category, price) VALUES ( ?, ?, ?, ?)";
                    
                    try (PreparedStatement createStatement = connection.prepareStatement(createSql)) 
                    {
                    	createStatement.setInt(1, pid);
                    	
                        createStatement.setString(2, pname);
                       
                        createStatement.setString(3, category);
                        
                        createStatement.setInt(4, price);
                        
                        int rowsAffected = createStatement.executeUpdate();
                     
                        if (rowsAffected > 0) 
                        {
                            System.out.println("Product added successfully.");
                        } else 
                        {
                            System.out.println("Failed to add product.");
                        }
                    }
                    break;

                case 2:
                    String readSql = "SELECT * FROM products";
                   
                    try (Statement readStatement = connection.createStatement()) 
                    {
                        ResultSet resultSet = readStatement.executeQuery(readSql);

                        while (resultSet.next()) 
                        {
                            int productId = resultSet.getInt("pid");
                            String productName = resultSet.getString("pname");
                            String productCategory = resultSet.getString("category");
                            int productPrice = resultSet.getInt("price");
                            
                            
                            System.out.println(
                                    "ID: " + productId + ", Name: " + productName + ", category: " + productCategory + ", Price: " + productPrice);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID to update: ");
                    int productIdToUpdate = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println("Choose what to update:");
                    System.out.println("1. Update product name");
                    System.out.println("2. Update category");
                    System.out.println("3. Update price");
                    
                    System.out.print("Enter your choice: ");
                    int updateChoice = sc.nextInt();
                    sc.nextLine(); 

                    String updateSql;
                    PreparedStatement updateStatement;
                    
                    switch (updateChoice) 
                    {
                        case 1:
                            System.out.print("Enter new product name: ");
                            String newProductName = sc.nextLine();
                            

                            updateSql = "UPDATE products SET pname = ? WHERE pid = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newProductName);
                            break;

                        case 2:
                             System.out.print("Enter new category: ");
                             String newCategory = sc.nextLine();

                             updateSql = "UPDATE products SET categorydesc = ? WHERE pid = ?";
                             updateStatement = connection.prepareStatement(updateSql);
                             updateStatement.setString(1, newCategory);
                             break;

                        case 3:
                            System.out.print("Enter new price: ");
                            int newPrice = sc.nextInt();
                            
                            updateSql = "UPDATE products SET price = ? WHERE pid = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setInt(1, newPrice);
                            break;
                        default:
                            System.out.println("Invalid choice for update. Please try again.");
                            continue; 
                    }

                    updateStatement.setInt(2, productIdToUpdate);
                    int rowsAffected = updateStatement.executeUpdate();
                    
                    if (rowsAffected > 0) 
                    {
                        System.out.println("Product updated successfully.");
                    } else 
                    {
                        System.out.println("Product not found or update failed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter product ID to delete: ");
                    int productIdToDelete = sc.nextInt();

                    String deleteSql = "DELETE FROM products WHERE pid = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) 
                    {
                        deleteStatement.setInt(1, productIdToDelete);
                        int rowsAffected1 = deleteStatement.executeUpdate();
                        if (rowsAffected1 > 0) 
                        {
                            System.out.println("Product deleted successfully.");
                        } else 
                        {
                            System.out.println("Product not found or delete failed.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (operation != 5);

        sc.close();
        stmt.close(); //close statement
        connection.close(); //close the connection
    }
}
//end of the program