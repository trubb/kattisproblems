package main

import (
	"fmt"
	"time"
)

func main() {

	const year = 2009
	var day, month int64

	fmt.Scanln( &day, &month )

	output := time.Date( year, time.Month(month), int(day), 1, 1, 1, 1, time.UTC).Weekday()

	fmt.Println(output)
}
