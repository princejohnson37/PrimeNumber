import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class PrimeNumber extends Applet implements ActionListener{
	private Label l1;
	private Label l2;
	private TextField t1,t2;
	private Button b1;
	public void start()
	{
		l1=new Label("Value");
		l2= new Label("Result");
		t2= new TextField(); 
		t1 = new TextField();
		b1 = new Button("prime or not ");

		l1.setBounds(100,40,50,30);
		l2.setBounds(100,150,50,30);
		t1.setBounds(200,40,100,20);
		t2.setBounds(200,150,100,20);
		b1.setBounds(150,100,100,30);
		setLayout(null);
		add(l1);add(l2);
		add(b1);
		add(t1);add(t2);
		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		int flag=0;
		int n=Integer.parseInt(t1.getText());
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				flag=1;
				break;
			}

		}
	if(flag==0){
		t2.setText("True");
	}
	else{
		t2.setText("False");
	}


	}
}
