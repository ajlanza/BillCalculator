public class Calculator {
    public static void main(String[] args){
        int numberOfPersons = 4;

        double taxPercent = 8;
        double tipPercent = 15;
        double taxAmount = taxPercent / 100;

        double personOneAppetizerCost = 9.99;
        double personOneMainCost = 23.99;
        double personOneDessertCost = 10.29;
        double personOneDrinkCost = 8.50;
        double personOneSubTotal = personOneAppetizerCost + personOneMainCost + personOneDessertCost + personOneDrinkCost;
        double personOneTax = taxAmount * personOneSubTotal;
        double personOneTip = tipPercent / 100 * personOneSubTotal;
        double personOneTotal = personOneSubTotal + personOneTax + personOneTip;
        String personOneName = "Adeline";
        String personOneAppetizer = "Stuffed Ziti Fritta";
        String personOneMain = "Shrimp Scampi";
        String personOneDessert = "Sicilian Cheesecake";
        String personOneDrink = "Raspberry Lemonade x 2";

        double personTwoAppetizerCost = 12.99;
        double personTwoMainCost = 18.99;
        double personTwoDessertCost = 9.99;
        double personTwoDrinkCost = 4.25;
        double personTwoSubTotal = personTwoAppetizerCost + personTwoMainCost + personTwoDessertCost + personTwoDrinkCost;
        double personTwoTax = taxAmount * personTwoSubTotal;
        double personTwoTip = tipPercent / 100 * personTwoSubTotal;
        double personTwoTotal = personTwoSubTotal + personTwoTax + personTwoTip;
        String personTwoName = "Brixton";
        String personTwoAppetizer = "Lasagna Fritta";
        String personTwoMain = "Fettuccine Alfredo";
        String personTwoDessert = "Lemon Cream cake";
        String personTwoDrink = "Mango-Strawberry Iced Tea";

        double personThreeAppetizerCost = 10.49;
        double personThreeMainCost = 26.79;
        double personThreeDessertCost = 10.29;
        double personThreeDrinkCost = 3.75;
        double personThreeSubTotal = personThreeAppetizerCost + personThreeMainCost + personThreeDessertCost + personThreeDrinkCost;
        double personThreeTax = taxAmount * personThreeSubTotal;
        double personThreeTip = tipPercent / 100 * personThreeSubTotal;
        double personThreeTotal = personThreeSubTotal + personThreeTax + personThreeTip;
        String personThreeName = "Cora";
        String personThreeAppetizer = "Fried Mozzarella";
        String personThreeMain = "Tour of Italy";
        String personThreeDessert = "Zeppoli";
        String personThreeDrink = "Fresh Brewed Iced Tea";

        double personFourAppetizerCost = 13.79;
        double personFourMainCost = 25.99;
        double personFourDessertCost = 4.49;
        double personFourDrinkCost = 7.50;
        double personFourSubTotal = personFourAppetizerCost + personFourMainCost + personFourDessertCost + personFourDrinkCost;
        double personFourTax = taxAmount * personFourSubTotal;
        double personFourTip = tipPercent / 100 * personFourSubTotal;
        double personFourTotal = personFourSubTotal + personFourTax + personFourTip;
        String personFourName = "Dean";
        String personFourAppetizer = "Classic Shrimp Scampi Fritta";
        String personFourMain = "Seafood Alfredo";
        String personFourDessert = "Dolcini";
        String personFourDrink = "Coke x 2";

        boolean leaveTip = false;
        boolean splitBillEvenly = true;

        double mealSubTotal = personOneSubTotal + personTwoSubTotal + personThreeSubTotal + personFourSubTotal;
        double mealTax = taxAmount * mealSubTotal;
        double mealTip = 0;
        double totalMealCost = 0;
        if(leaveTip){
            mealTip = tipPercent / 100 * mealSubTotal;
            totalMealCost = mealSubTotal + mealTax + mealTip;
        }
        else{
            totalMealCost = mealSubTotal + mealTax;
        }
        double evenCostPerPerson = totalMealCost / numberOfPersons;

        System.out.println("The Bill Calculator!");
        System.out.println("--------------------");
        System.out.printf("Total cost of the meal: $%.2f (including $%.2f tax and $%.2f tip)\n", totalMealCost, mealTax, mealTip);
        System.out.printf("Amount each person pays if split evenly in %d: $%.2f\n", numberOfPersons, evenCostPerPerson);
        System.out.println("If not split evenly:");
        System.out.printf("%s's meal costs: $%.2f\n", personOneName, personOneTotal);
        System.out.printf("%s's meal costs: $%.2f\n", personTwoName, personTwoTotal);
        System.out.printf("%s's meal costs: $%.2f\n", personThreeName, personThreeTotal);
        System.out.printf("%s's meal costs: $%.2f\n", personFourName, personFourTotal);
    }
}
