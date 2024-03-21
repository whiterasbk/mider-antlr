import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.mider.code.antlr.g4.MiderCodeLexer
import org.mider.code.antlr.g4.MiderCodeParser
import org.mider.code.antlr.listener.MiderCodeListener
import org.mider.code.antlr.stave.Note
import whiter.music.mider.MidiFile
import whiter.music.mider.MidiInstrument
import whiter.music.mider.dsl.MiderDSL
import whiter.music.mider.dsl.fromDsl
import whiter.music.mider.dsl.play
import whiter.music.mider.dsl.playDslInstance
import whiter.music.mider.noteBaseOffset
import java.io.File
import java.util.*
import javax.sound.midi.MidiSystem
import javax.sound.sampled.AudioSystem
import kotlin.concurrent.timerTask


fun main() {
    `ONE OK ROCK LISTEN`()
}

fun `ONE OK ROCK LISTEN`() {
    val main: MiderDSL.() -> Unit =  {
        bpm = 200
        velocity = 108
        "#C" {
            +"e"
            +"gee+ gee+ cded&d+ o" // u always call me full of regret
            +"c cdeC+ ba e&e++ o++" // u want me to save you again
            +"g-a-g-a- C-a-C g-a-g-a- C-a-C"
            +"C. D-&D EE+ G+"
            +"g-a-g-a- C-a-C g-a-g-a- C-a-C"
            +"C. D-&D ED+ b+"
            +"EEE.D- EEE+" // all these years the days go by
            +"EEE.E- E-D- DD+" // ive seen u fall a million times
            +"EEC↑ ~+ AG&G++" // everybody makes mistakes
            +"o+oo."
            +"D- EEE.D- EEE+" // it feels so hard to watch u hurt
            +"EEE.E- ED D.C-" // from that pain a lesson learned
            +"EEC↑ ~+ A.G-&G++" // this is how u find ur way
            +"o++o"
            +"g-a-g-a- C-a-C g-a-g-a- C-a-C"
            +"C. D-&D EE+ G+"
            +"g-a-g-a- C-a-C g-a-g-a- C-a-C"
            +"C. D-&D ED+ b+"
            +"EEE.D- EEE+" // u feel so lost ive been there 2
            +"EEE.E- E-D- DD+" // skies so derk no way through
            +"EEC↑ ~+ A.G-&G++" // stories only scars can tell
            +"o+oo-"
            +"C-C EEE.D- EEE+" // ive got so much love 4 u my friend
            +"EEE.E- ED D.C-" // rider or die until the end
            +"EEC↑ ~+ A.G-&G++&G" // but only u can save yourself
            +"D E D C" // you just have to
            +"ED-E-EED-E.&E o-" // listen, listen
            +"C- C D E D&D oo+" // i hope that u know
            +"ED-E-EED-E.&E o-" // listen, listen
            +"C- C D E D oo-o+" // i wont let u go
            +"C- CDE C↑&~ BAG CDE D&D+ o." // i wish i could save u from the pain uve been through
            +"C- CDE C↑&~ BAG CDE D&D oo" // and all i can tell u is the best thing to do
            +"C DE+ DE++"  // u gotta listen, listen
            +"G.A- G.A- G.A- G-F-E"
            +"DE+ DE++" // listen, listen
            +"G.A- G.A- G.A- G-F-E"
            +"DE+ DE++" // listen, listen
            +"G.A- G.A- G.A- G-F-E C+.o"
            +"C-D-C-D-E-D-E" // to ur heart
            +"G.A- G.A- G.A- G-F-E"
            +"DE+ DD-E.&E+" // listen, listen
            +"EEG+&G Cb+"
            +"DE+ DE.D- C+" // listen, listen
            +"CEG+&G gC+"
            +"DE+DE+. o-" // listen, listen
            +"C- CDE D&D+ o+" // 信じよう
            +"DE+DE+.&E-C-" // listen, listen
            +"CDE D:G C↑ C↑ A C↑:C  CDE C↑ ~ BAG CDE D" // 降り止まない雨などない
            +"C↑C↑BC↑"
            +"CDE C↑ ~ BAG CDE D+" // and all i can tell u is the best thing to do
            +"C↑D↑C↑" // u gotta
            +"DE+DE++" // listen, listen
            +"G.A- G.A- G.A- G-F-E"
            +"C+.EC++"
            +"E.F- E.F- E D↑~~"
            +"DE+DE++" // listen, listen
            +"G.A- G.A- G.A- G-F-E"
            +"g-a-g-a- C-a-C g-a-g-a- C-a-C"
            +"G.A- G.A- G.A- G-F-E"
        }
        track {
            velocity = 80
            "#C" {
                +"o"
                +"A2 E3 A3+ F2 C3 F3+ C3 G3 C4+ G2 D3 G3+"
                +"A2. E3- A3+  F2 C3 F3+ C3 G3 C4+ G2 D3 G3+"

                repeat(30) {
                    +"A2 E3 A3 E3"
                    +"F2 C3 F3 C3"
                    +"C3 G3 C4 G3"
                    +"G2 D3 G3 D3"
                }
            }
        }
    }
    play(block = main)
}

fun `HAPPY BIRTHDAY`() {
    val dsl: MiderDSL.() -> Unit = {
        bpm = (bpm * 1.5).toInt()
        program = MidiInstrument.recorder
        velocity = 128
        // F♯、C♯、 G♯、D♯
        val main = mutableListOf<String>().apply {
                this += "bG E.-F-- GE"
                this += "Fbb o-.g--"
                this += "EC.-D--EC"
                this += "DBBo"
                this += "AA-.G-- F G-.A--"
                this += "GFEC"
                this += "EE-.C--EG"
                this += "b.:E:F D. b"
                this += "G E-.F-- G E-E-"
                this += "F bb o-. g-- E C-.D-- E C-.C-- DBBo"
                this += "AA-.G--FG-.A--"
                this += "GFEC EE-C-EG F.E- EF g++:b:E↟"
            }.joinToString("|").toCminor()
        val chord = mutableListOf<String>().apply {
            this += "o e g:b e g:b b3 d:f d:f o"
            this += "c e:g c e:g g3 d:f:b d:f:b o"
            this += "a3 c:e a3 c:e e:g:b d:f:b c:e:g b3:e:g"
            this += "a2 c:e a3 c:e"
            this += "b3-:f b3-:f o- b2- b2 b3"
            this += "f3 g:b e g:b"
            this += "b3 d:f d:f o"
            this += "c3 e:g c e:g"
            this += "g3 d:f:b d:f:b o"
            this += "a3 c:e a3 c:e"
            this += "e:g:b d:f:b c:e:g b3:e:g"
            this += "f3 f:a c f:a"
            this += "b3+:f b2 b3"
            this += "e3++"
        }.joinToString("|").toCminor()

        +main
        println(">${bpm}b;i=$program;$velocity%>$main")

        track {
            program = MidiInstrument.musicbox
            velocity = 128
            +chord
            println(">g;i=$program;$velocity%>$chord")
        }
    }

    play(block = dsl)
}

fun String.toCminor(): String = this
    .replace("F", "#F")
    .replace("f", "#f")
    .replace("G", "#G")
    .replace("g", "#g")
    .replace("C", "#C")
    .replace("c", "#c")
    .replace("D", "#D")
    .replace("d", "#d")
fun mainb() {
    val code = """
    a:b:C
"""
// a+ w-. #~. ~ m ^ #^ $~
    play { +code }

    val lexer = MiderCodeLexer(CharStreams.fromString(code))
    val tokens = CommonTokenStream(lexer)
    val parser = MiderCodeParser(tokens)
    val tree = parser.tracks()

    val walker = ParseTreeWalker()

    val l = MiderCodeListener()
    val c = System.currentTimeMillis()
    walker.walk(l, tree)
    println("runs: " + (System.currentTimeMillis() - c) + "ms")

    l.list.forEach {
        println("  $it")
    }

    val wholeTicks = 960 * 2 * 2

    println("aaaa")

    val j = MidiFile().apply {
        track {
            tempo(120)
            end()
        }

        track {

            l.list.forEach { note ->
//                note as Note
//                val d = note.duration.value(.5f * wholeTicks).toInt()
//                val cc = note.code()
//                note(cc.toByte(), d, note.velocity.on.toByte(), note.expectChannel.toByte())
            }
            end()
        }
    }.inStream()

//    val sequencer = MidiSystem.getSequencer()
//    sequencer.setSequence(j)
//    sequencer.open()
//    sequencer.start()
//
//    Thread.sleep(10_000)
//
//    sequencer.close()
//    j.close()




//    tree.accept(Visitor())
//    val a = org.mider.code.antlr.visitor.MidercodeVisitor(org.mider.code.antlr.TrackConfigContext()).visit(tree)
//    println(a)

    println(tree.toInfoString(parser))
    println(tree.toStringTree(parser))
}