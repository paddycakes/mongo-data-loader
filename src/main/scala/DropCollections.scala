import com.mongodb.casbah.Imports._

object DropCollections extends App {

  val mongoClient = MongoClient("localhost", 27017)

  val db = mongoClient("zook")

  db.collectionNames.foreach(collection => println(collection))

}
