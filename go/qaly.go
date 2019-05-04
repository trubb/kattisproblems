package main

import (
	"fmt"
)

func main() {
	var inputs int
	var total, quality, years float64

	fmt.Scanln( &inputs )
	for i := 0; i < inputs; i++  {
		fmt.Scanln( &quality, &years )
		total += qaly( quality, years )
	}

	fmt.Printf( "%.3f", total )
}

func qaly(quality float64, years float64) float64 {
	return quality * years
}