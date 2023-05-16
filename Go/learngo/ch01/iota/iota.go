package main

import "fmt"

var name = "haha"

func main() {

	//匿名变量
	var _ int

	const (
		ERR1  = iota
		ERR2  = iota
		ERR3  = iota
		ERR25 = iota
	)

	const (
		Err1 = iota + 1
		Err2
		Err25 = "ha"
		Err3
		Err21
		Err22
		Err4 = iota + 1
	)

	const (
		err1 = iota
	)
	fmt.Println(ERR1, ERR2, ERR3, ERR25)
	fmt.Println(Err1, Err2, Err25, Err3, Err21, Err22, Err4)
	fmt.Println(err1)

	if true {
		name := "hahanidie"
		println(name)
	} else {
		name := "hahanima"
		print(name)
	}

	fmt.Println(name)
}
