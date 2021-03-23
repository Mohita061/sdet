package Groovy

class Activity4 {
	

		static void main(def args) {
			def str = "This is a Groovy Language"
			
			
			def revStr = str.reverse()
			println "Reversed string: " + revStr
			
			
			def subStr = str.substring(10)
			println "Sub string: " + subStr
			
		
			def splitStr = str.split(" ")
			println "Split string: " + splitStr
			
			
			def minusStr = str.minus("Groovy")
			println "String after removal: " + minusStr
			
			
			def lowerStr = str.toLowerCase()
			def upperStr = str.toUpperCase()
			println "Lower case string: " + lowerStr
			println "Upper case string: " + upperStr
		
			def matchStatus = str.matches("(.*)Groovy(.*)")
			if(matchStatus) { println "String matches" }
			
			
			def replaceWith = "very Groovy"
			println(str.replaceAll("Groovy", replaceWith))
		
			println str
		}
	}