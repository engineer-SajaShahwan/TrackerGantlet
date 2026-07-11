//problem 1
fun main() {
    for (packageindex in 1..50)
        if (packageindex % 3 == 0 && packageindex % 5 == 0) {
            println("priorityExpress")
        } else if (packageindex % 3 == 0) {

            println("Express")

        } else if (packageindex % 5 == 0) {

            println("freight")

        } else {

            println(packageindex)

        }
    println("======================================================================================")
// Problem 2: Waypoints Reverser

    println("\nProblem 2: Waypoints Reverser")
    val routePath = "HubA -> HubB -> HubC"

    val routePoints = routePath.split(" -> ")

    for (routeIndex in routePoints.size - 1 downTo 0) {

        print(routePoints[routeIndex])

        if (routeIndex != 0) {
            print(" -> ")
        }
    }
    println("=====================================================")

    println("\nProblem 3: Max Weight Filter")

    val packageWeights = doubleArrayOf(
        12.5,
        8.0,
        -1.0,
        20.5,
        15.0
    )

    var highestWeight = 0.0

    for (weight in packageWeights) {

        if (weight != -1.0 && weight > highestWeight) {
            highestWeight = weight
        }
    }

    println("Highest valid weight: $highestWeight")
println("==============================================================")

    println("\nProblem 4: Palindrome Transit Code")

    val transitCode = "TR808RT"

    val lowerCode = transitCode.lowercase()

    var reversedCode = ""

    for (index in lowerCode.length - 1 downTo 0) {

        reversedCode += lowerCode[index]
    }


    if (lowerCode == reversedCode) {

        println("Is Palindrome: true")

    } else {

        println("Is Palindrome: false")
    }
    println("==============================================================")
    println("\nProblem 5: Binary Search Lookup")

    val trackingIds = intArrayOf(
        101,
        205,
        309,
        410,
        550
    )

    val targetTrackingId = 410

    var startIndex = 0
    var endIndex = trackingIds.size - 1

    var foundIndex = -1


    while (startIndex <= endIndex) {

        val middleIndex = (startIndex + endIndex) / 2

        println("Checking index: $middleIndex, value: ${trackingIds[middleIndex]}")


        if (trackingIds[middleIndex] == targetTrackingId) {

            foundIndex = middleIndex
            break

        } else if (trackingIds[middleIndex] < targetTrackingId) {

            println("Search right side")
            startIndex = middleIndex + 1

        } else {

            println("Search left side")
            endIndex = middleIndex - 1
        }
    }


    if (foundIndex != -1) {

        println("Tracking ID found at index: $foundIndex")

    } else {

        println("Tracking ID not found")
    }


    println("Big O Complexity: O(log n)")
    }



