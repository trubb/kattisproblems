package main

import "fmt"

func main() {

	for i := 10; i > 0; i-- {
		var n, s, t, sum, ta, tb int

		fmt.Scan( &n )
		if n == -1 { break }

		for j := 0; j < n; j++ {
			fmt.Scan( &s, &t)
			tb = t
			t -= ta
			sum += t * s
			ta = tb
		}
		fmt.Printf( "%d miles\n", sum)
	}
}
