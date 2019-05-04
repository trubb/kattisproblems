package main

import (
	"fmt"
	"strings"
)

func main() {

	var month string
	var date int64
	var yup = "yup"
	var nope = "nope"

	fmt.Scanln( &month, &date)

	if strings.ToLower(month) == "oct" && date == 31 {
		fmt.Println( yup )
	} else if strings.ToLower(month) == "dec" && date == 25 {
		fmt.Println( yup )
	} else {
		fmt.Println( nope )
	}
}
