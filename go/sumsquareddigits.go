package main

import "fmt"

func main() {
	var p, k, b, n int
	fmt.Scanln( &p )

	for i := 0; i < p; i++ {
		fmt.Scanln( &k, &b, &n )
		fmt.Printf("%d %d\n", k, ssd( b, n ) )
	}
}

func ssd(b int, n int) int {
	var result int
	for n > 0 {
		d := ( n % b )
		result += d*d
		n /= b
	}
	return result
}
