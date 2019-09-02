package chapter2

class Test {
    static void main(String[] args) {
//        sample1()
//        sample2()

//        sample3(1,20)
//        sample3("hahahaha")

//        sample4("hahahaha")
//        sample4(10,"1","2","3")

//        spiltName("hello groovy")

        switchParama()
    }

    static void sample1() {
        Car car = new Car(10)
        println car.year
    }

    /**
     * 具名参数
     * 如果传递的有名值对,groovy会默认第一个形参为Map
     */
    static void sample2() {
        Robot robot = new Robot(type: '333', height: "222", width: "233333")
        robot.access(type: '333', height: "222", width: "233333", 50, true)
        robot.access(90, false, type: '333', height: "222", width: "233333")

        println "type=$robot.type,height=$robot.height,width=$robot.width"
    }

    /**
     * 可变形参
     * 定义可变形参,只需要在参数列表上给她赋予默认值
     * @param x
     * @param b
     * @return
     */
    static def sample3(x, b = 10) {
        println "x=$x,b=$b"
    }

    /**
     * 会把方法末尾的数组视为可选的,调用的时候类似Java的可变参数
     * 多余的将会被抛弃,差的将会补NULL,不能为空的会抛出异常
     * @param x
     * @param details
     */
    static def sample4(x, String[] details) {
        println "x=$x, details=$details"
    }

    /**
     * 多赋值,返回值可以同时赋值到多个参数
     * @param name
     * @return
     */
    static def spiltName(name){
        def (firstName, lastName) = name.split(" ")
        println "firstName=$firstName,lastName=$lastName"
    }

    /**
     * 交换变量不需要中间值
     * @return
     */
    static def switchParama(){
        def name1 = "22"
        def name2 = "33"
        println "name1=$name1, name2=$name2"

        (name1, name2) = [name2, name1]
        println "name1=$name1, name2=$name2"
    }

    /**
     * 布尔计算
     * @return
     */
    static def booleanCalc(){
        def str = "hello"
        if(str){
            println "in if"
        }
    }
}
