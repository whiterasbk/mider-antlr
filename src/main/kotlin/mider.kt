import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.mider.code.antlr.g4.MiderCodeLexer
import org.mider.code.antlr.g4.MiderCodeParser
import org.mider.code.antlr.g4.MiderCodeParserBaseListener
import org.mider.code.antlr.g4.MiderCodeParserBaseVisitor


data class TrackConfiguration(
    var enableScript: Boolean = true
)


class Visitor: MiderCodeParserBaseVisitor<String>() {
    override fun visitChord(ctx: MiderCodeParser.ChordContext?): String {
        return ">" + ctx?.chord()
    }
}


class Listener : MiderCodeParserBaseListener() {

    val list = mutableListOf<String>()

    override fun exitNoteExperssion(ctx: MiderCodeParser.NoteExperssionContext) {
        val name = ctx.note()//.NoteName()
        val lyric = ctx.lyric()?.LyricContent()
        println(name)
        println(lyric)
    }
}

fun main() {
    val lexer = MiderCodeLexer(CharStreams.fromString("a:A~vv"))
    val tokens = CommonTokenStream(lexer)
    val parser = MiderCodeParser(tokens)
    val tree = parser.track()

//    val walker = ParseTreeWalker()
//    walker.walk(Listener(), tree)
    tree.accept(Visitor())

    for (child in tree.children) {
        if (child is MiderCodeParser.ChordExperssionContext) {
            val lst = child.chord().children.last()
            if (lst is MiderCodeParser.NoteBaseContext) {
                println(134)
            }
        }
    }


    println(tree.toInfoString(parser))
    println(tree.toStringTree(parser))
}