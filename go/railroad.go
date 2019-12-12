package main

import "fmt"

func main() {
    var x, y int // number of test cases
	/*
        x == 4 edges
        y == 3 edges
        if number of edges == even
            - > if (x*4 + y*3) % 2 == 0 -> possible
        else -> impossible
	*/
	fmt.Scanln( &x, &y )	// get x and y values

    if ( (x*4 + y*3) %2 == 0 ) {
        fmt.Printf("possible")
    } else {
        fmt.Printf("impossible")
    }
}
