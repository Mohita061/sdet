package Groovy

class Activity7 {
	
	
		static void main(args) {
			File file = new File("resources/sample.txt");
			file.createNewFile();
			
			file.write("Hello\n")
			file.append("Hi\n")
			file.append("Th1\$ 1\$ v3ry c0nfu51ng")
			
			println "Match Operations: "
			
			file.eachLine { line ->
				if(line ==~ /^A.*Cow$/) {
					println "Line that ends with 'Cow' is: $line"
				}
			}
			
			
			file.eachLine { line ->
				if(line ==~ /^J.*/) {
					println "Line that starts with 'J' is: $line"
				}
			}
			
			
			file.eachLine { line ->
				if(line ==~ /.*\d\d.*/) {
					println "Line that has two adjacent numbers: $line"
				}
			}
			
		
			println "\n\nFind Operations:"
			def match1 = file.getText() =~ /\S+er/
			println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
			
			def match2 = file.getText() =~ /\S*\d\W/
			println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
		}
	
}