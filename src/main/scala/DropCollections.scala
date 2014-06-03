import com.mongodb.casbah.Imports._

/*
Zook Collections
----------------
bookings
businesses
employees
payments
services
subscriptions
tokens
users
 */

// TODO: Should this be an object with a main method, ie. not extend App
object DropCollections extends App {

  val mongoClient = MongoClient("localhost", 27017)

  val db = mongoClient("zook")

  val zookCollections = db.collectionNames.filter(name => name != "system.indexes")

  println("Zook collections to be dropped:")
  zookCollections.foreach(println(_))

  zookCollections.foreach(db(_).drop())
  println("Zook collections dropped")
}
