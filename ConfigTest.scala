package ConfigTest



object ConfigTest extends App {
  import scala.io.Source
  val filename = "Weapon_Autocannon_AC2_0-STOCK.json"

  for (line <- Source.fromFile(filename).getLines) {
    println(line)
  }

}
