package scorex.transaction

/**
  * reason to change account balance
  */
trait StateChangeReason extends Serializable {
  /**
    * A transaction could be serialized into binary form
    */
  def bytes: Array[Byte]

  val signature: Array[Byte]
}
