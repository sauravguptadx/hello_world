/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author TWICE
 */
public class HierarchyDirectory {
    String directoryName;
    ArrayList<String> dir_files;
    int num_dir_files;
    HashMap<String,Integer> collection;
    HashMap<String, HierarchyDirectory> hmapdirec;
    HierarchyDirectory subdirectories;
    HierarchyDirectory subdirecarray[];
    Scanner sc;
    
    public HierarchyDirectory(String dirName)
    {
        directoryName = dirName;
        dir_files = new ArrayList<>();
        collection = new HashMap<>();
        hmapdirec = new HashMap<>();
        sc = new Scanner(System.in);
        subdirecarray = new HierarchyDirectory[100];
    }
    public void addFiles_Recurse(HierarchyDirectory root)
    {
        String dirName = root.directoryName;
        System.out.println("You are now under directory  " + dirName);
        System.out.println("Enter the number of dir/files in  " + dirName);
        int n = sc.nextInt();
        num_dir_files = n;
        int ftype;
        String fileName = "";
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter whether child  "  + (i+1) + " for directory  " + dirName + "  is file or directory. 1 for directory, 0 for file");
            ftype = sc.nextInt();
            
            if(ftype == 0)
            {
                System.out.println("Enter the fileName   ");
                sc.nextLine();
                fileName = sc.nextLine();
                dir_files.add(fileName);
                collection.put(fileName, 0);
            }
            else
            {
                System.out.println("Enter the directory Name   ");
                sc.nextLine();
                fileName = sc.nextLine();
                HierarchyDirectory obj = new HierarchyDirectory(fileName);
                root.subdirectories = obj;
                collection.put(fileName, 1);
                hmapdirec.put(fileName, obj);
                addFiles_Recurse(obj);
            }
        }
        
    }
    
    public void GeneralGraphDirectory(String start, String end)
    {
        int i=0;
        HierarchyDirectory startdir = hmapdirec.get(start);
        HierarchyDirectory enddir = hmapdirec.get(end);
        startdir.subdirecarray[i++] = enddir;
    }
}
