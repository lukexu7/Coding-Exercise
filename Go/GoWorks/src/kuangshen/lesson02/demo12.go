package main

import "fmt"

func main() {

	for i := 1; i < 6; i++ {
		for j := 1; j <= 5; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}

	NineNineTable()
}

func NineNineTable() {
	for i := 1; i < 10; i++ {
		for j := 1; j <= i; j++ {
			fmt.Print(i, "*", j, "=", i*j, " ")
		}
		fmt.Println()
	}
}
