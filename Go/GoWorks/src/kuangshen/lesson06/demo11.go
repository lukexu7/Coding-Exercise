package main

import "fmt"

func main() {

	var map1 map[int]string

	map1 = make(map[int]string)
	map1[100] = "学相伴"
	map1[100] = "学相伴1111"
	map1[200] = "狂神说"

	fmt.Println(map1)
	fmt.Println(map1[200])
	fmt.Println(map1[1])

}
