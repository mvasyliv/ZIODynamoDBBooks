package com.mvasyliv.books.model

import zio.dynamodb.{PrimaryKey, ProjectionExpression}
import zio.schema.DeriveSchema

final case class Author(id: Int, firstName: String, lastName: String, email: String)
object Author{
  implicit val schemaAuthor = DeriveSchema.gen[Author]
  val (id, firstName, lastName, email) = ProjectionExpression.accessors[Author]
  def primaryKey(id: Int): PrimaryKey = PrimaryKey("id" -> id)

}
