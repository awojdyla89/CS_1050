public class Reservation {
	int guestCount;
	int restaurantCapacity;
	boolean isRestaurantOpen;
	boolean isConfirmed;

	public Reservation(int count, int capacity, boolean open) {
		guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
	}

	public void confirmReservation() {
		if (restaurantCapacity >= guestCount && isRestaurantOpen) {
			System.out.println("Reservation confirmed");
			isConfirmed = true;
		} else {
			System.out.println("Reservation denied");
			isConfirmed = false;
		}
	}

	public void informUser() {
		if (isConfirmed) {
			System.out.println("Please enjoy your meal!");
		} else {
			System.out.println("Cannot accomodate!");
		}
	}

	public static void main(String[] args) {
		Reservation partyOfThree = new Reservation(3, 12, true);
		Reservation partyOfFour = new Reservation(4, 3, true);
		partyOfThree.confirmReservation();
		partyOfThree.informUser();
		partyOfFour.confirmReservation();
		partyOfFour.informUser();
	}
}