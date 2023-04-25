fun main() {
    var getLength =longestString(arrayOf("Jane","Magdaline","Caramel"))
    println(getLength)

    var getSum = sumOfArray(arrayOf(10,20,39,40))
    println(getSum)

    var getVowels = countVowels("students")
    println(getVowels)






}
//Write a function that takes an array of strings as a parameter and returns the length of the longest string.
fun longestString(strings: Array<String>): Int {
    var maxLength = 0
    for (str in strings) {
        val length = str.length
        if (length > maxLength) {
            maxLength = length
        }
    }
    return maxLength
}

//Write a function that takes an array of integers as a parameter and returns the sum of all the elements.
fun sumOfArray(nums:Array<Int>):Int{
    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum
}

//Write a function that takes a string as a parameter and returns the number of vowels in the string.
fun countVowels(str: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in str) {
        if (char in vowels) {
            count++
        }
    }
    return count


}

