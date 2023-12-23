package main

import "fmt"

func main() {

	var f1 float64 = 3.23
	var f2 float32 = 5
	fmt.Printf("%T,%.3f", f1, f1)
	fmt.Printf("%T,%.1f", f2, f2)
}
