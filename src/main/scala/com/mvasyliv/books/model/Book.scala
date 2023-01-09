package com.mvasyliv.books.model

import zio.dynamodb.{PrimaryKey, ProjectionExpression}
import zio.schema.DeriveSchema

final case class Book(id: Int, author: List[Author] = List.empty[Author], name: String, yearPublication: Int)
object Book{
  implicit val schemaBook = DeriveSchema.gen[Book]
  val (id, author, name, yearPublication) = ProjectionExpression.accessors[Book]
  def primaryKey(id: Int): PrimaryKey = PrimaryKey("id" -> id)
}
