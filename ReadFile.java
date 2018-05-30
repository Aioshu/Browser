// basic web broweser
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.String;

public class ReadFile extends JFrame{
   private JTextField addressBar; // Address Bar
   private JEditorPane display; // Shows the address bar in the main window
   
   //constructor
   public ReadFile(){
      super("AshisH Ka Browser");                       // giving title to the browser
      addressBar = new JTextField("enter a UrL Hoss!"); // why  we wrote new here or why we made the object of the instance variable?
      addressBar.addActionListener(  	  // wait for the action listener
	    new ActionListener(){
	      public void actionPerformed(ActionEvent event){
		     loadCrap(event.getActionCommand());			 // load cramp methods is reading html files .convert the url into string
		  // next work on display addressBar and work on LOadCrap Method 
		  }
        }
	  );
      add(addressBar,BorderLayout.NORTH);   
	  
	  display = new JEditorPane();
      display.setEditable(false); // here we do'nt want to change the contents only need is serve the contents
	  display.addHyperlinkListener(
	    new HyperlinkListener(){ //new hyperlink is the class
		  public void hyperlinkUpdate(HyperlinkEvent event){  // it works when we roll the curser over the some link and a msg pop up.
			  if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){				  // Activated means the lnk is clicked
			    loadCrap(event.getURL().toString()); //returns a Url and converting here url objects to string objects
			  }
			  
		 }
		}	
      ); 
    // Making the new GUI
      add(new JScrollPane(display),BorderLayout.CENTER);
      setSize(500,300);
      setVisible(true);
      	  
   }
   // load crap to display on the Screen
   private void  loadCrap(String userText){
    	
     try{
		 
		display.setPage(userText); // very important class
        addressBar.setText(userText);		//this 
	 }catch(Exception e){
		 System.out.println("oh my Gosh!");
		 
	 }	 	
   }
} 