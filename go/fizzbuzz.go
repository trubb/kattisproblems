package main

import "fmt"

func main() {

	/*
		x = fizz divisor
		y = buzz divisor
		n = upper bound of range to print
	 */
	var x, y, n int

	fmt.Scanln(&x, &y, &n)

	for i := 1; i <= n; i++ {

		if (i % x == 0 && i % y == 0) {
			fmt.Println( "fizzbuzz")
		} else if (i % x == 0) {
			fmt.Println( "fizz")
		} else if (i % y == 0) {
			fmt.Println( "buzz")
		} else {
			fmt.Println(i)
		}

	}

}
