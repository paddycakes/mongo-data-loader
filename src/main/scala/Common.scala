import com.mongodb.casbah.Imports._

import scala.collection.immutable.Seq

case class Employee(id: String, user: User, business: Business, roles: Seq[String])
case class User(id: String)
case class Business(id: String)

object Common {

  /*
{ "_id" : "697ce603-b1c2-47c3-9aa4-12fce56de66a", "roles" : [  "business-admin" ], "business-id" : "72946f77-1729-4213-b9a4-d6d4d4fc06dc", "user-id" : "68e1dc5f-7cd8-4209-bae4-487e7823ecff", "id" : "697ce603-b1c2-47c3-9aa4-12fce56de66a" }
 */
  // TODO: Create case class objects with associated objects and use these to provide FKs
  def buildMongoDbObject(employee: Employee): MongoDBObject = {
    val builder = MongoDBObject.newBuilder
    builder += "id" -> employee.id
    builder += "user-id" -> employee.user.id
    builder += "business-id" -> employee.business.id
    builder.result
  }

}
