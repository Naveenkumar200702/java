package assesment_feb_end;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mileage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of bikes");
		int n = input.nextInt();
		List<BikeDetail> mileage = new ArrayList();
		List<BikeDetail> mileageList = new ArrayList();

		input.nextLine();

		for (int i = 0; i < n; i++) {// getting input
			System.out.println("bike name");
			String bikeName = input.nextLine();
			System.out.println("bike kiloMeter runs");
			double kms = input.nextDouble();
			System.out.println("bike fuel taken");
			double fuel = input.nextDouble();
			input.nextLine();
			double mileage1 = kms / fuel;
			mileage.add(new BikeDetail(bikeName, kms, fuel, mileage1));
		}

		for (int i = 0; i < mileage.size(); i++) {
			BikeDetail temp1 = mileage.get(i);
			for (int j = i + 1; j < mileage.size(); j++) {
				BikeDetail temp2 = mileage.get(j);
				if (temp1.getMileage() < temp2.getMileage()) {
					BikeDetail temp3 = mileage.get(i);
					mileage.set(i, mileage.get(j));
					mileage.set(j, temp3);
				}
			}
		}
		for(BikeDetail var: mileage)
		{
			System.out.println(var.getName()+" |"+var.getKms()+" |"+var.getFuelconsumed()+"|  "+var.getMileage());
			System.out.println("------------------");
		}

	}
}

class BikeDetail {
	private String name;
	private double kms;
	private double fuelconsumed;
	private double mileage;

	public BikeDetail(String bikeName, double kms2, double fuel, double mileage2) {
		name = bikeName;
		kms = kms2;
		fuelconsumed = fuel;
		mileage = mileage2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public double getFuelconsumed() {
		return fuelconsumed;
	}

	public void setFuelconsumed(double fuelconsumed) {
		this.fuelconsumed = fuelconsumed;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

}