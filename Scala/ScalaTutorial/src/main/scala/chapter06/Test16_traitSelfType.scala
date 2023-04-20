package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/1 19:29
 */
class Test16_traitSelfType {
   def main(args: Array[String]):Unit={

  val user=new RegisterUser("haha","ssfs34")
  user.insert()

}
}

class User(val name:String, val password:String)

trait UserDao{
  _: User =>
  def insert():Unit={
    println(s"insert into db: "+this.name)
  }
}


//定义注册用户
class RegisterUser(name:String, password:String) extends User(name, password) with UserDao