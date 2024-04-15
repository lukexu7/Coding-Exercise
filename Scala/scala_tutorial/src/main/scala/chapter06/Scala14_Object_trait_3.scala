package chapter06

object Scala14_Object_trait_3 {

  def main(args: Array[String]): Unit = {


    val mysql = new MySQL()

    mysql.operateData()



  }

  trait Operate{
    def operateData():Unit={
      println("operateData")
    }
  }

  trait DataBase extends Operate{
    override def operateData(): Unit = {
      println("向数据库中")
      super.operateData()
    }
  }

  trait log extends Operate{

    override def operateData(): Unit = {

      println("向日志中")
      super.operateData()
    }

  }

  class MySQL extends DataBase with log{

  }



}