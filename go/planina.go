package main

import (
	"fmt"
	"math"
)

func main() {
	var n float64

	fmt.Scanln(&n)

	output := math.Pow( math.Pow(2, n) + 1, 2 )

	fmt.Println(int(output))
}
