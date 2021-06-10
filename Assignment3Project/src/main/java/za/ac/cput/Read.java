/**
 *
 * @author SMANGELE MABASO
 */
package za.ac.cput;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Read implements Serializable{
    
    private String firstName, surName,address, dateOfBirth;
    private double credit;
    private boolean canRent;
    private FileReader f;
    private BufferedReader br;
    private StringTokenizer tk;
    private FileOutputStream file;
    private ObjectOutputStream oi;
    private String junk;   

public void Read(String path) throws java.io.IOException {  

    ArrayList<Customer> cust= new ArrayList<Customer>();                   
    ArrayList<Supplier> sup = new ArrayList<Supplier> ();
try{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("CreateStakeholderSer.txt"));
    }	
    catch(FileNotFoundException e)
{
    System.out.println("File was not found...");
	e.printStackTrace();
		}
    catch(NotSerializableException e){
			System.out.println("Not serializable");
			e.printStackTrace();
		}
    catch(IOException e ){
			System.out.println("General error");
			e.printStackTrace();
		}
		br.close();
}

public void sortContents(List<Customer>array){
    for(int i=0;i<cust.size();i++)
{
 for(int j=0;j<cust.size();j++)
{  
if(cust.get(i).getId()>cust.get(j).getId))  
 {
 Customer c=cust.get(i);
 cust.set(i,cust.get(j));
 cust.set(j,c);
        }
    System.out.println("List is null was not sorted.");

        }      
    }
}
public void Age(){
 int age[]=new int[cust.size()];
 int r[] = new int[cust.size()];
 int rn[] = new int[cust.size()];
 
 for (int i=0;i<cust.size();i++)
 {
  LocalDate
   Id=LocalDate.parse(cust.get(i).getDateOfBirth());
  
  int year =Id.getYear();
  age[i]=2021-year;
 }
        }
public void FormatDate(){
String p="dd MM yyyy";
SimpleDateFormat sdf= new SimpleDateFormat(p,new Locale
("da", "DK"));
for (int i=0;i<cust.size();i++)
 {
cust.get(i).setDateOfBirth(sdf.format(cust.get(i)));
 }
}
public void writeCustomerFile(){
 
BufferedWriter bw= new BufferedWriter( new FileWriter"Customer.txt"));   
String
str="======================Customer====================================";        
  bw.writer(str);
  bw.newLine();
  str="ID\tName\tSurname\tDate of birth\tAge";
  bw.writer(str);
  bw.newLine();
str="==================================================================";
  bw.writer(str);
  bw.newLine();
  for (int i=0;i<cust.size();i++)
 {
 str = cust.get(i).getId()+"\t"+ cust.get(i).getFirstName()+"\t"+ cust.get(i).getSurName()+"\t"+ cust.get(i).getSurName()+"\t"+ cust.get(i).getDateOfBirth()+"\t"+ cust.get(i).getCredit()+"\t"+ cust.get(i).getCanRent());
  
  bw.writer(str);
  bw.newLine();
}}

public void CalculateRentAndNonRent(){
int r[] = new int[cust.size()];
int rn[] = new int[cust.size()];
 
for(int i=0;i<cust.size();i++)
{
r = r+1;
}
else
{
 nr = nr+1;
}
}


str="Number of customers who can rent:"+r;
  bw.writer(str);
  bw.newLine();
str="Number of customers who cannot rent:"+nr;
  bw.writer(str);
  bw.newLine();
  bw.close();


public void sortSuppppliersArray(){
ArrayList<Supplier> sup = new ArrayList<Supplier> ();
    for(int i=0;i<sup.size();i++){
    for(int j=1;j<sup.size();j++){
if(sup.get(i).getName().compareTo(sup.get(j).getName(),sup.get(i).getProductType()compareTo(sup.get(j).getProductType(), sup.get(i).getProductDescription()compareTo(sup.get(j).getProductDescription()));
{
Supplier s= sup.get(i);
sup.set(i,sup.get(j));
sup.set(j,s);
    }}
  }
}
public void writeSupplierFile(){
BufferedWriter bw= new BufferedWriter( new FileWriter"Customer.txt"));
ArrayList<Supplier> sup = new ArrayList<Supplier> ();
String
    str="==========Supplier=============";
    bw.write(str);
    bw.newLine();
str="ID\\tName\\tProd Type\\tDescription";
    bw.write(str);
    bw.newLine();
str="===========================";
    bw.write(str);
    bw.newLine();

for(int i=0;i<sup.size();i++){
bw.write(str);
bw.newLine();

str= sup.get(i).getStHolderId()+"\t"+ sup.get(i).getName()+"\t"+ sup.get(i).getProductType()+"\t"+ sup.get(i).getProductDescription());
bw.write(str);
bw.newLine();
    }
}
public void writeSerializable(String path,List<Customer> arr) throws java.io.IOException  { //(Serialized file, name of the array)

try{
    file = new FileOutputStream(path);
    oi = new ObjectOutputStream(file);

    oi.  writeObject(arr);
    System.out.println("Serializable was written...");
    file.close();
    oi.close();

}
    catch(IOException ee){
    ee.printStackTrace();
        }
    }
}   
