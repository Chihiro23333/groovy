package chapter2

class GreetingImprove {
    public static void main(String[] args) {
//       sample0()
//        sample1()
//        sample3()
//        smaple4()
//        sample5()
//        sample6()

        println foo("haha")
        println foo(null)
    }

    static void sample0(){
        for (i in 1..3) {
            println("ho ")
        }
        println "Hello Groovy"
    }

    static void sample1(){
        0.upto(2){
            println "$it"
        }
    }

    static void sample3(){
        3.times {
            println "$it"
        }
    }

    static void smaple4(){
        0.step(10, 2){
            println "$it"
        }
    }

    static void sample5(){
        println "groovy -v".execute().text
    }

    static void sample6(){
        println "cmd /c dir".execute().text
    }

    static def foo(String str){
        str?.reverse()
    }
}
