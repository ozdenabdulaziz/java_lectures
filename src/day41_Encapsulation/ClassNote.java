package day41_Encapsulation;

public class ClassNote {

    /*
Topics: Access Modifiers:
				public, default, private

		OOP Encapsulation:
				getter & setter

Package Name: day41_Encapsulation

Warmup task:
	create a class called Item
			instance variables:
				name, unitPrice, quantity

			add a constructor that can initialize the fields

			instance methods:
				calcCost(): returns the total cost as double

							hint: totalCost = quantity * unitPrice

				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()


	create a class called ShoppingList
			create 5 objects of Item and store them into ArrayList of Items

			calculate the total cost of all Items in the list



aceess modifiers: determins if the method or variable is reachable

		public: ALWAYS reachable

		default: reachable within the same package
				outside the package, impossible to reach

		private: ONLY reachable within the same class

					outside the class, impossible to reach



OOP: Object Oriented Programming

		1. Encapsulation
		2. Inheritance: extends
		3. Abstraction: abstract, implmenets, interface
		4. Polymorphism: instanceOf


Encapsulation: hiding data, fields (instance variable)
						hiding the data by private.

						user the getters & settering to read and write the data

				Getter(Read ONLY): public instance method. return method
									does not pass any parameter
									returnType MUST match with filed (instance)



				Setter(Write ONLY): public isntance method. returns nothing
									returnType is void
									passes a parameter (MUST match with instance variable)

									final variables cannot have setter


final: constant. cannot be changed

come back at: 2:15 pm


Task:
	create a custom class called Circle
		private variables:
			radius, diameter, PI, area, perimeter

		add a constructor to set all fields

		generate getter for all private fields

		private methods:
			calculateArea, calculatePerimeter

		public methods:
			toString
			equals(): accepts a circle object and returns true if the given argument circle is equal to the current circle object


WarmUp tasks:
    create costum class called BankAccount for Bank of America

            public variables:  bankName, firstName, lastName

            private variables: accountHolder, accountNumber, balance

            encapsulate all the private data
                    (DO NOT USE SHORTCUT)

            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)

            public methods:
                    deposit
                    withdraw
                    availableBalance















     */
}
