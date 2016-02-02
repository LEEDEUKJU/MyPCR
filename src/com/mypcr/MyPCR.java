package com.mypcr;
import java.util.ArrayList;
import com.mypcr.emulator.Protocol;

public class MyPCR {
	public ArrayList<Protocol> makeProtocolList(String pcr)
	{
		
		String[] pcrs1 = pcr.split("\n"); // ���� ��  \n���� ¥����
		
		ArrayList<Protocol> list1 = new ArrayList<Protocol>();
		
		
		try{
			for(int i=0; i<pcrs1.length; ++i)
			{
				String[] pcrss1 = pcrs1[i].split("\t");
			
				int temp = Integer.parseInt(pcrss1[1]);
				int time = Integer.parseInt(pcrss1[2]);
			
			
				Protocol p1 = new Protocol(pcrss1[0], temp, time);
				list1.add(p1);
			
			}
		}catch(NumberFormatException e){
			System.out.println("�߸� �� PCR �����Դϴ�");
			return null;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�߸� �� PCR ������ ����Ϸ� �߽��ϴ�");
			return null;
		}
		return list1;
	}

	public void showProtocolList(ArrayList<Protocol> list){
		
		
		ArrayList<Protocol> list2 = new ArrayList<Protocol>();

		
		System.out.println("======Protocol======");
		System.out.println("label	temp	Time");
		for(int i=0; i<list2.size(); ++i){
			Protocol p = list2.get(i);
		
			System.out.println(p.getLabel() + "\t" + p.getTemp() + "\t" + p.getTime());
		}
	}
}
