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
        String personFourName = "Dean";
        String personFourAppetizer = "Classic Shrimp Scampi Fritta";
        String personFourMain = "Seafood Alfredo";
        String personFourDessert = "Dolcini";
        String personFourDrink = "Coke x 2";

        boolean leaveTip = false;

        double mealSubTotal = personOneSubTotal + personTwoSubTotal + personThreeSubTotal + personFourSubTotal;
        double mealTax = taxAmount * mealSubTotal;
        double mealTip = 0;
        double personOneTip = 0;
        double personTwoTip = 0;
        double personThreeTip = 0;
        double personFourTip = 0;


        if(leaveTip){
            mealTip = tipPercent / 100 * mealSubTotal;
            personOneTip = tipPercent / 100 * personOneSubTotal;
            personTwoTip = tipPercent / 100 * personTwoSubTotal;
            personThreeTip = tipPercent / 100 * personThreeSubTotal;
            personFourTip = tipPercent / 100 * personFourSubTotal;


        }
        double totalMealCost = mealSubTotal + mealTax + mealTip;
        double personOneTotal = personOneSubTotal + personOneTip + personOneTax;
        double personTwoTotal = personTwoSubTotal + personTwoTip + personTwoTax;
        double personThreeTotal = personThreeSubTotal + personThreeTip + personThreeTax;
        double personFourTotal = personFourSubTotal + personFourTip + personFourTax;

        double evenCostPerPerson = totalMealCost / numberOfPersons;
        double diffPersonOne = Math.abs(personOneTotal - evenCostPerPerson);
        double diffPersonTwo = Math.abs(personTwoTotal - evenCostPerPerson);
        double diffPersonThree = Math.abs(personThreeTotal - evenCostPerPerson);
        double diffPersonFour = Math.abs(personFourTotal - evenCostPerPerson);
        boolean splitBillEvenly = (diffPersonOne < 5) && (diffPersonTwo < 5) && (diffPersonThree < 5) && (diffPersonFour < 5);

        System.out.println("The Bill Calculator!");
        System.out.println("--------------------\n");
        if(leaveTip){
            System.out.println("The service was good, tip will be paid");
        }
        else{
            System.out.println("The service was bad, no tip will be added");
        }
        System.out.printf("%s had \n%s\t %.2f\n", personOneName, personOneAppetizer, personOneAppetizerCost);
        System.out.printf("%s\t $%.2f\n", personOneMain, personOneMainCost);
        System.out.printf("%s\t $%.2f\n", personOneDessert, personOneDessertCost);
        System.out.printf("%s\t $%.2f\n", personOneDrink, personOneDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n\n", personOneName, personOneTotal);

        System.out.printf("%s had \n%s\t %.2f\n", personTwoName, personTwoAppetizer, personTwoAppetizerCost);
        System.out.printf("%s\t $%.2f\n", personTwoMain, personTwoMainCost);
        System.out.printf("%s\t $%.2f\n", personTwoDessert, personTwoDessertCost);
        System.out.printf("%s\t $%.2f\n", personTwoDrink, personTwoDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n\n", personTwoName, personTwoTotal);

        System.out.printf("%s had \n%s\t %.2f\n", personThreeName, personThreeAppetizer, personThreeAppetizerCost);
        System.out.printf("%s\t $%.2f\n", personThreeMain, personThreeMainCost);
        System.out.printf("%s\t $%.2f\n", personThreeDessert, personThreeDessertCost);
        System.out.printf("%s\t $%.2f\n", personThreeDrink, personThreeDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n\n", personThreeName, personThreeTotal);

        System.out.printf("%s had \n%s\t %.2f\n", personFourName, personFourAppetizer, personFourAppetizerCost);
        System.out.printf("%s\t $%.2f\n", personFourMain, personFourMainCost);
        System.out.printf("%s\t $%.2f\n", personFourDessert, personFourDessertCost);
        System.out.printf("%s\t $%.2f\n", personFourDrink, personFourDrinkCost);
        System.out.printf("%s's meal costs: $%.2f\n\n", personFourName, personFourTotal);

        System.out.printf("Total cost of the meal: $%.2f (including $%.2f tax and $%.2f tip)\n\n", totalMealCost, mealTax, mealTip);
        System.out.printf("Amount each person pays if split evenly in %d: $%.2f\n\n", numberOfPersons, evenCostPerPerson);
        if(splitBillEvenly) {
            System.out.println("The bill should be split evenly.");
        }
        else{
            System.out.println("The bill should not be split evenly.");
        }
    }
}
