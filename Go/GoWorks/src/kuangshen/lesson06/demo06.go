package main

import "fmt"

func main() {

	arr := [10]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

	s1 := arr[:5]

	fmt.Println(s1)

	//数组切片【start,end)

	s1 = append(s1, 111, 22, 333)
	fmt.Println(s1)

	//查看容量和长度
	fmt.Printf("s1 len:%d,cap")

}
