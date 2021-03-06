package avrohugger
package types

// fixed
sealed trait AvroScalaFixedType extends Product with Serializable
case object ScalaBinary extends AvroScalaFixedType
// record
sealed trait AvroScalaRecordType
case object ScalaCaseClass extends AvroScalaRecordType
// enum
sealed trait AvroScalaEnumType extends Product with Serializable
case object ScalaEnumeration extends AvroScalaEnumType
case object JavaEnum extends AvroScalaEnumType
case object ScalaCaseObjectEnum extends AvroScalaEnumType
case object EnumAsScalaString extends AvroScalaEnumType
// union
sealed trait AvroScalaUnionType extends Product with Serializable
case object OptionShapelessCoproduct extends AvroScalaUnionType
case object OptionEitherShapelessCoproduct extends AvroScalaUnionType
// array
sealed trait AvroScalaArrayType extends Product with Serializable
case object ScalaArray extends AvroScalaArrayType
case object ScalaList extends AvroScalaArrayType
case object ScalaVector extends AvroScalaArrayType
// map
sealed trait AvroScalaMapType extends Product with Serializable
case object ScalaMap extends AvroScalaMapType
// protocol
sealed trait AvroScalaProtocolType extends Product with Serializable
case object ScalaADT extends AvroScalaProtocolType
case object NoTypeGenerated extends AvroScalaProtocolType