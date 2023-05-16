package main

import (
	"fmt"
	"strconv"
)

func main() {

	var a int8 = 12
	var b = uint8(8)
	fmt.Println(b)

	var f float32 = 3.13
	var c = int32(f)

	fmt.Println(c)

	type IT int
	var d IT = IT(a)
	fmt.Println(d)

	//字符串转数字
	var itsr = "12"
	atoi, err := strconv.Atoi(itsr)
	if err != nil {
		fmt.Println("error")
	}
	fmt.Println(atoi)
	//数字转字符串
	var myi = 32
	fmt.Println(strconv.Itoa(myi) + "哈哈")

	i, err := strconv.ParseInt("12", 8, 64)
	fmt.Println(i)

	parseBool, err := strconv.ParseBool("0")
	fmt.Println(parseBool)

	formatInt := strconv.FormatInt(64, 2)
	fmt.Println(formatInt)

	formatFloat := strconv.FormatFloat(3.2323, 'f', -1, 64)
	fmt.Println(formatFloat)
}
