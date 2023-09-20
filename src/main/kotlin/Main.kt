import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.mider.code.antlr.g4.MiderCodeLexer
import org.mider.code.antlr.g4.MiderCodeParser

fun main() {
    val lexer = MiderCodeLexer(CharStreams.fromString(">g>a:c:eaaa"))
    val tk = CommonTokenStream(lexer)

    val p = MiderCodeParser(tk)

    val s =  p.track()

    println(s.toStringTree(p))
}