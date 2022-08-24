package com.mos.core



val list = listOf(0,1,2,3,4,5,6,7,8,9)

fun main(args: Array<String>) {
    actionSum()
    actionFilter()
    actionMapping()
    actionElement()
    actionProduct()
    actionSort()
}

/**
 * 总数操作
 */
fun actionSum(){
    //集合中至少有一个元素满足条件,则返回true
    println(list.any { it % 2 == 1 })
    //集合中所有元素满足条件,则返回true
    println(list.all { it % 2 == 1 })
    //返回集合中满足条件的元素个数
    println(list.count { it % 2 == 1 })
    //在给定初始值的基础上,从第一项到最后一项进行累加
    println(list.fold(7){total,next -> total + next})
    //在给定初始值的基础上,从最后一项到第一项进行累加,与fold只是方向不同
    println(list.foldRight(5){total,next -> total + next})
    //循环遍历元素,元素为it,可对每个元素进行相关操作
    list.forEach { it -> if (it > 7) println(it) }
    //循环遍历元素以及下标
    list.forEachIndexed{index, it -> if (it > 7) println("it of index $index is $it") }
    //返回最大值,没有则返回null
    println(list.maxOrNull())
    //根据条件得到新的集合,再取最大值,返回这个最大值的初始值(原来集合的那个元素)
    println(list.maxByOrNull { -it })//取负之后新的元素为{0,-1,-2,-3,-4,-5,-6,-7,-8,-9},新的集合最大值是0,原来集合那个元素是0.则返回0
    //返回最小值,没有则返回null
    println(list.minOrNull())
    //获取方法处理后返回结果最小值对应那个元素的初始值，如果没有则返回null
    println(list.minByOrNull { -it })
    //集合中的元素都不满足条件,返回true,换句话就是只要满足条件就返回false
    println(list.none{it % 2 == 10})
    //累加,与fold相比就是没有初始值
    println(list.reduce{total,next -> total + next})
    //倒过来累积
    println(list.reduceRight{total,next -> total + next})
    //根据条件得到新的集合,再进行累加
    println(list.sumBy { it % 2 })

}

/**
 * 过滤操作
 */
fun actionFilter(){
    //返回去掉前n个元素后的集合
    println(list.drop(4)) //删掉0,1,2,3 这四个元素
    //从第一项开始,去掉满足条件的元素,直到不满足条件,返回剩下的元素的集合
    println(list.dropWhile { it < 6 }) //返回[6,7,8,9]  //从第一项开始直到it=6时不满足条件
    println(list.dropWhile { it > 6 }) //返回[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] //从第一项开始直到it=0时不满足条件(第一项就不满足条件)
    //从最后一项开始,去掉满足条件的元素,直到不满足条件,返回剩下的元素的集合
    println(list.dropLastWhile { it > 7 })//返回[0, 1, 2, 3, 4, 5, 6, 7] //从最后一项开始直到it=7时不满足条件
    //返回去掉后面n个元素后的集合
    println(list.dropLast(5))

    println("------------------------")
    //过滤掉所有不满足条件的元素
    println(list.filter { it % 2 == 0 }) //也就是说满足条件的留下
    //与filter相反  过滤掉所有满足条件的元素
    println(list.filterNot { it % 2 == 0 })
    //过滤掉所有为null的元素
    println(list.filterNotNull())

    println("------------------------")
    //过滤掉非指定下标的元素，即保留下标对应的元素过滤List中指定下标的元素
    println(list.slice(listOf(0, 1, 8)))//得到下标为0的元素,下标为1的元素,下标为8的元素组成的集合
    println(list.slice(3..6))//获取集合中某个下标区间的元素 返回[3,4,5,6]
    //println(list.slice(listOf(0, 4, 80)))  //java.lang.ArrayIndexOutOfBoundsException: 80

    println("------------------------")
    //返回从第一个开始的n个元素的集合
    println(list.take(2))
    //返回从最后一个开始的n个元素的集合
    println(list.takeLast(2))
    //返回满足条件的集合
    println(list.takeWhile { it < 4 })
}

/**
 * 映射操作
 */
fun actionMapping(){
    //合并两个集合,可以在合并的时候对迭代的元素it进行操作
    println(list.flatMap { listOf(it, it + 2) })
    println(listOf("a","b","c").flatMap { listOf(it+"d","e") }) //[ad, e, bd, e, cd, e]
    //将集合中的元素按照某个条件分组,返回个map
    println(list.groupBy { if (it % 2 ==0) "even" else "odd" })
    println(list.groupBy {
        when(it){
            in 0..2 -> "one"
            in 3..6 -> "two"
            in 7..9 -> "three"
            else -> "four"
        }
    })

    println("------------------------")
    //将集合中的元素通过给定的方法转换为新的元素并组成新的集合
    println(list.map { it*2 })
    //将集合中的元素与下标通过给定的方法转换为新的元素并组成新的集合
    println(list.mapIndexed { index, it -> index * it })
    //与map相同,但是需要过滤掉为null的元素
    println(list.mapNotNull { it * 3 })
}

/**
 * 元素操作
 */
fun actionElement(){
    //判断集合中是否有指定元素,有就返回true
    println(list.contains(2))

    //查找下标对应的元素,注意不要越界
    println(list.elementAt(3))
    //查找下标对应的元素,如果越界则返回给定下标的经方法的值
    println(list.elementAtOrElse(20){it -> it *10})//越界了,所以返回的是给定下标20 *10
    println(list.elementAtOrElse(2){it -> it *3}) //没有越界,所以返回下标2对应的元素
    println(list.elementAtOrNull(20)) //越界返回null

    println("----------------")
    //返回符合条件的第一个元素,没有则抛找不到元素的异常(NoSuchElementException)
    println(list.first{it / 3 == 1})
    //返回符合条件的第一个元素,没有则返回null
    println(list.firstOrNull{it / 3 == 10})

    println("----------------")
    //返回指定元素的下标,没有返回-1
    println(list.indexOf(3))
    //返回符合条件的第一个元素的下标,没有则返回-1
    println(list.indexOfFirst { it / 3 == 10 })
    //返回符合条件的最后一个元素的下标,没有则返回-1
    println(list.indexOfLast { it % 3 == 0 })

    println("----------------")
    //返回符合条件的最后一个元素,没有则抛找不到元素的异常(NoSuchElementException)
    println(list.last{it / 3 == 1})
    //返回最后一个元素
    println(list.last())
    //返回符合条件的最后一个元素的下标,没有返回-1
    println(list.indexOfLast { it / 3 == 2 })
    //返回列表中指定元素最后一次出现的下标，如果指定，则返回-1
    println(list.lastIndexOf(8) )

    println("----------------")
    //返回符合条件的单个元素,如果没有或者超过一个则抛异常
    println(list.single{it % 7 == 5})
    //返回符合条件的单个元素,如果没有或者超过一个则返回null
    println(list.singleOrNull{it % 7 == 5})


}

/**
 * 生产操作
 */
fun actionProduct(){
    //将原始集合拆分为一个包含两个集合的Pair，
    //其中* first * list包含[predicate]产生`true`的元素，
    //而* second * list包含[predicate]产生`false`的元素。
    println(list.partition { it % 2 ==0 }) //([0, 2, 4, 6, 8], [1, 3, 5, 7, 9])
    //合并两个list
    println(list + listOf(14,18))
    println(list.plus(listOf(14,18)))//与上面的一样

    //两个集合按照下标组成一个个的Pair放入新的集合
    println(list.zip(listOf(7,8,17))) //[(0, 7), (1, 8), (2, 17)]
    //将包含多个Pair的List转换成含List的Pair；
    println(listOf(Pair(5,7), Pair(6,8),Pair(10,32),Pair(15,18)).unzip())//([5, 6, 10, 15], [7, 8, 32, 18])
    /**
     *  Pair 表示一对通用的两个值。
     * 此类中的值没有任何附加含义，可用于任何目的。
     * 对展示了值语义，即如果两个组件相等，则两对相等。
     * Pair对象的数据组成形式为(first, secord)，即Pair(1, 2).first可以取出数据1
     */

}

/**
 * 排序操作
 */
fun actionSort(){
    //相反顺序
    println(list.reversed())
    //自然排序(升序)
    println(list.sorted())
    //根据条件处理结果进行升序
    println(list.sortedBy {it % 3})
    //降序
    println(list.sortedDescending())
    //根据方法处理的结果进行降序
    println(list.sortedByDescending { it % 3 })

    /**
     * list没有改变,所以上面的方法会返回新的list
     */
    println(list)

}