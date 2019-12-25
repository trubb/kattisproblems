package main

import "fmt"

func main() {
	var n, m int
	fmt.Scanln( &n, &m )

	if m < n {
		n, m = m, n
	}

	for i := n+1; i < m+2; i++ {
		fmt.Println(i)
	}
}
