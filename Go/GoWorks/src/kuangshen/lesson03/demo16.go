package main

import "fmt"

func main() {

	s1 := []int{1, 2, 3, 4}
	fmt.Println("s1 before", s1)
	update3(s1)
	fmt.Println("s1 after", s1)

}

func update3(s2 []int) {

	fmt.Println("s2 before", s2)
	s2[0] = 100
	fmt.Println("s2 after", s2)

}
