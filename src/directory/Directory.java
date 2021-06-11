/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directory;


import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author TWICE
 */
public class Directory extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scanner sc = new Scanner(System.in);
      
        Pane hPane = hierarchyDirectory();
        
        HierarchyDirectory obj = new HierarchyDirectory("ROOT");
        
        
                
        Button hbtn = new Button();
        hbtn.setLayoutX(1200);
        hbtn.setLayoutY(50);
        hbtn.setText("Hierarchy Directory");
        hbtn.setOnAction((ActionEvent event) -> {
            
            System.out.println();
            System.out.println();
            System.out.println("You have entered the Hierarchy Directory");
            System.out.println();
            obj.addFiles_Recurse(obj);
            root.getChildren().add(hPane);
            root.getChildren().remove(hbtn);
            
        });
        
        //root.getChildren().add(hPane);
        root.getChildren().add(hbtn);
        
        Scene scene = new Scene(root, 1400, 700);
        
        primaryStage.setTitle("Directory");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    public Pane hierarchyDirectory()
    {
        Pane hPane = new Pane();
      
        Button rootButton = new Button("My Documents");
        rootButton.setLayoutX(400);
        rootButton.setLayoutY(0);
        rootButton.setPrefSize(200, 50);
        hPane.getChildren().add(rootButton);
        
        Line rootLine = new Line(500, 50, 900, 100);
        hPane.getChildren().add(rootLine);
        //Scanner sc = new Scanner(System.in);
        int y = 50;
        //String dirName = sc.next();
        String dirName[] = {"Maths", "Physics", "Chemistry", "Computer Science"};
        int nd1 = 4;
        for(int i =0; i<nd1; i++)
        {
            Button d1btn = new Button(dirName[i]);
            d1btn.setLayoutX(200 + 200*i);
            d1btn.setLayoutY(100);
            d1btn.setPrefSize(200, 50);
            
            hPane.getChildren().add(d1btn);
        }   
        
        String actressName[] = {"A-Level"};
        
        for(int i =0; i<1; i++)
        {
            Button d2btn = new Button(actressName[i]);
            d2btn.setLayoutX(840 + 120*i);
            d2btn.setLayoutY(y + 200);
            d2btn.setPrefSize(120, 40);
            
            hPane.getChildren().add(d2btn);
        }
        
        Line docToAlevel = new Line(900, 150, 900, 250);
        hPane.getChildren().add(docToAlevel);
        
       double r = 40;
       /* Button btnl2 = new Button("Samantha.jpg");
        btnl2.setShape(new Circle(r));
        btnl2.setMinSize(2*r, 2*r);
        btnl2.setMaxSize(2*r, 2*r);
        btnl2.setLayoutX(770);
        btnl2.setLayoutY(y + 190);
        hPane.getChildren().addAll(btnl2);*/
        
        /*Line l12a = new Line(300, 150,160,y+200);
        Line l12b = new Line(300 + 200, 150,530,y+200);
        Line l12c = new Line(300 + 400, 150,800,y+200-10);
        hPane.getChildren().addAll(l12a, l12b, l12c);*/
        
        
        
       /* Line l23a = new Line(100, 290, 50, 290 + 100);
        Line l23b = new Line(100, 290, 50+100, 290 + 100);
        
        Line l23c = new Line(350 + 60, 290,250 + 180, 300 + 100);
        
        Line l23d = new Line(350 + 2*120 + 60, 290, 650 +50, 290 + 100 + 20);
        Line l23e = new Line(350 + 2*120 + 60, 290, 750 + 50, 290 + 100 + 20);
        
        hPane.getChildren().addAll(l23a, l23b, l23c, l23d, l23e);*/
       
        Line alevelToUnit = new Line(900, 290, 710, 400);
        hPane.getChildren().add(alevelToUnit);
        
        String moviesLanguage[] = {"Unit 1", "Unit 2", "Unit 3", "Unit 4"};
        for(int i =0; i<4; i++)
        {
            Button d3btn = new Button(moviesLanguage[i]);
            d3btn.setLayoutX(650 + 120*i);
            d3btn.setLayoutY(2*y + 300);
            d3btn.setPrefSize(120, 40);
            
            hPane.getChildren().add(d3btn);
        }
        
        
        Line l34a = new Line(710, 440,    50+120,   2*y + 450);
        Line l34b = new Line(710, 440,    50+120*2, 2*y + 450);
        
        Line l34c = new Line(710, 440,    50+120*3, 2*y + 450);        
        Line l34d = new Line(710, 440,    50+120*4, 2*y + 450);
        
        Line l34e = new Line(710, 440,    50+120*5, 2*y + 450);
        Line l34f = new Line(710, 440,    50+120*6, 2*y + 450);
        Line l34g = new Line(710, 440,    50+120*7, 2*y + 450);
        Line l34h = new Line(710, 440,    50+120*8, 2*y + 450);
        
        hPane.getChildren().addAll(l34a, l34b, l34c, l34d, l34e, l34f, l34g, l34h);
        
        
        String southMovies[] = {"Operating  \r Systems", "I/O/S", "Utility \r Programs", "Translators", 
            "Low \r Level \r Languages", "High \r Level \r Languages", "Python 3", "IDE"};
        for(int i=0; i<8; i++)
        {
            Button btn = new Button(southMovies[i]);
            btn.setShape(new Circle(r));
            btn.setMinSize(2*r, 2*r);
            btn.setMaxSize(2*r, 2*r);
            btn.setLayoutX(120*(i+1) );
            btn.setLayoutY(2*y + 450);
            hPane.getChildren().addAll(btn);
        }

        /*
        String files[] = {"Samantha.jpg", "Kajal.png", "Anushka.jpg", "Keerthi.png", "Rakul.jpg", "MaheshBabu.jpg"};
        
            for(int j=0; j<a[i]; j++)
            {
                Button btn = new Button(files[cnt]);
                btn.setShape(new Circle(r));
                btn.setMinSize(2*r, 2*r);
                btn.setMaxSize(2*r, 2*r);
                btn.setLayoutX(50 + 120*(cnt) + 50*i );
                btn.setLayoutY(450);
                Line l1 = new Line(300 + 200*(i), 250,70 + 120*(cnt) + 70*i , 475);
                twoPane.getChildren().addAll(l1, btn);
                cnt++;
            }
           */     
              //  Line l1 = new Line(300 + 200*(i), 250,100*(i+2), 475);
                //twoPane.getChildren().addAll(l1);
            
               

        int n = 5, x = 100; 
        /*
        for(int i=0; i<n; i++)
        {
            Button btn = new Button(files[i]);
            btn.setShape(new Circle(r));
            btn.setMinSize(2*r, 2*r);
            btn.setMaxSize(2*r, 2*r);
            btn.setLayoutX(120*(i+1) );
            btn.setLayoutY(450);
            x = 0;
            Line l1 = new Line(400, 250,100*(i+2), 475);
            //twoPane.getChildren().addAll(btn);
        }
        */
        hPane.setPrefSize(1000,700);
        //singlePane.setStyle("-fx-background-color: black;");
        //twoPane.getChildren().add(rootButton);
        
        return hPane;
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
