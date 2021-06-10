// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dotty.tools.dotc.semanticdb
import dotty.tools.dotc.semanticdb.internal._
import scala.annotation.internal.sharable


final case class TextDocuments(
    documents: _root_.scala.Seq[dotty.tools.dotc.semanticdb.TextDocument] = _root_.scala.Seq.empty
    )  extends SemanticdbGeneratedMessage  derives CanEqual {
    @sharable
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      documents.foreach { __item =>
        val __value = __item
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
      documents.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def clearDocuments = copy(documents = _root_.scala.Seq.empty)
    def addDocuments(__vs: dotty.tools.dotc.semanticdb.TextDocument*): TextDocuments = addAllDocuments(__vs)
    def addAllDocuments(__vs: Iterable[dotty.tools.dotc.semanticdb.TextDocument]): TextDocuments = copy(documents = documents ++ __vs)
    def withDocuments(__v: _root_.scala.Seq[dotty.tools.dotc.semanticdb.TextDocument]): TextDocuments = copy(documents = __v)
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.TextDocuments])
}

object TextDocuments  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.TextDocuments] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.TextDocuments] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.TextDocuments = {
    val __documents: _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.TextDocument] = new _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.TextDocument]
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __documents += LiteParser.readMessage[dotty.tools.dotc.semanticdb.TextDocument](_input__)
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.TextDocuments(
        documents = __documents.result()
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.TextDocuments(
    documents = _root_.scala.Seq.empty
  )
  final val DOCUMENTS_FIELD_NUMBER = 1
  def of(
    documents: _root_.scala.Seq[dotty.tools.dotc.semanticdb.TextDocument]
  ): _root_.dotty.tools.dotc.semanticdb.TextDocuments = _root_.dotty.tools.dotc.semanticdb.TextDocuments(
    documents
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.TextDocuments])
}
