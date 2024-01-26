package main

import "fmt"

func main() {

	s1 := make([]int, 5, 10)

	fmt.Println(s1)

	fmt.Println(len(s1), cap(s1))

}
