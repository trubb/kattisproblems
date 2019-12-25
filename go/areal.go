package main

import (
	"fmt"
	"math"
)

func main() {
	var a float64
	fmt.Scanln( &a )
	fmt.Printf("%.20f" ,math.Sqrt(a)*4 )
}
