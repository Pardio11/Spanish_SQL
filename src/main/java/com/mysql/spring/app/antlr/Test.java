package com.mysql.spring.app.antlr;
import org.antlr.runtime.*;
import java.io.*;


public class Test {
     public String compile(String sentencia) throws Exception 
	 {
       // create a CharStream that reads from standard input
       ANTLRInputStream input = null;
        StringBufferInputStream str = new StringBufferInputStream(sentencia);

        try {
            input = new ANTLRInputStream(str);
            
        } catch (IOException ex) {
            
        }
     
	  // create a lexer that feeds off of input CharStream
       RecognizerLexer lexer = new RecognizerLexer(input);
       // create a buffer of tokens pulled from the lexer
       CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
       RecognizerParser parser = new RecognizerParser(tokens);
        // begin parsing at rule r
	   try {   
          return parser.inicio();
      } catch (RecognitionException ex) {
        return "Error";
      }
     }
}