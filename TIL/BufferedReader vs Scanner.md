#Scanner vs. BufferedReader
https://stackoverflow.com/questions/2231369/scanner-vs-bufferedreader


###Q
- Does Scanner perform as well as BufferedReader?
- Why would you choose Scanner over BufferedReader or vice versa?

###A
- Scanner is used for parsing tokens from the contents of the stream while BufferedReader just reads the stream and does not do any special parsing. Scanner cna parse the stream into primitive types of data, while BufferedReader can only read and store String.
- BufferedReader is synchronized and Scanner is not. Use BufferedReader if you're working with multiple threads.
- BufferedReader has significantly larger buffer memory than Scanner. Use BufferedReader if you want to get long Strings from a stream, and use Scanner if you want to parse specific type of token from a stream.

##Java SE 11 & JDK 11 API Doc
###BufferedReader
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedReader.html

