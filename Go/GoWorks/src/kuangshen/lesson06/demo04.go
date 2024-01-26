package main

import "fmt"

func main() {

	s1 := []int{1, 2, 3}

	fmt.Println(s1)

	fmt.Printf("len:%d,cap:%d\n", len(s1), cap(s1))

}
