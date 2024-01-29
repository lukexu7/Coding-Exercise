package main

import "fmt"

func main() {

	var user1 = make(map[string]string)
	user1["name"] = "sss"
	user1["age"] = "343"
	user1["sex"] = "m"
	user1["addr"] = "cc"
	var user2 = make(map[string]string)
	user2["name"] = "b"
	user2["age"] = "2"
	user2["sex"] = "f"
	user2["addr"] = "abcLL"
	var user3 = make(map[string]string)
	user3["name"] = "c"
	user3["age"] = "3"
	user3["sex"] = "f"
	user3["addr"] = "abcd"

	userDatas := make([]map[string]string, 0, 3)
	userDatas = append(userDatas, user1, user2, user3)

	fmt.Println(userDatas)

	for i, data := range userDatas {

		fmt.Println(i, data["age"])

	}

}
