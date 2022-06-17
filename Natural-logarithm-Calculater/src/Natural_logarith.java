import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Natural_logarith extends JFrame implements ActionListener
{
	private final JButton total = new JButton(" = ");
	private static final String[] numList1 = {"1","2","3","4","5","6","7","8","9"};
	private static final String[] numList2 = {"0","1","2","3","4","5","6","7","8","9"};
	private static final String[] numList3 = {"0","1","2","3","4","5","6","7","8","9"};
	private final JComboBox jcbNL1 = new JComboBox(numList1);
	private final JComboBox jcbNL2 = new JComboBox(numList2);
	private final JComboBox jcbNL3 = new JComboBox(numList3);
	private final JTextField showLog = new JTextField("Log1.00",3);
	private final JTextField totalAmt = new JTextField("0.0000",3);
	public Natural_logarith()
	{
		super("Natural Logarith Calculate");
		super.setSize(420, 100);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLayout(new GridLayout(2,3,10,10));
		
		add(jcbNL1);add(jcbNL2);add(jcbNL3);
		add(showLog);add(total);add(totalAmt);

		total.addActionListener(this);
		showLog.setEditable(false);
		totalAmt.setEditable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int FN = 0;
		double TN = 0,SN = 0;
		double totalNumber;
		double totalLogNumber;
		
		FN = Integer.parseInt((String)jcbNL1.getSelectedItem());
		SN = Double.parseDouble((String)jcbNL2.getSelectedItem());
		TN = Double.parseDouble((String)jcbNL3.getSelectedItem());
		
		totalNumber = FN + SN * 0.1 + TN * 0.01;
		showLog.setText(String.format("%s%.2f", "Log",totalNumber));
		totalAmt.setText(String.format("%.4f",Math.log10(totalNumber)));
	}
}
