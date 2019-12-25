package main

import "fmt"
import "strings"

func main() {
	var str string
	var days int
	fmt.Scanln( &str )
	strarr := strings.Split( strings.ToLower(str), "" )

	for i := 0; i < len( str ); i += 3 {
		if strings.Compare( strarr[i], "p" ) == 0 {
		} else { days++ }
		if strings.Compare( strarr[i + 1], "e" ) == 0 {
		} else { days++ }
		if strings.Compare( strarr[i + 2], "r" ) == 0 {
		} else { days++ }
	}
	fmt.Println( days )
}
