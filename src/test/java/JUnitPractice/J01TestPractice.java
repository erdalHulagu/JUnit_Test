package JUnitPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J01TestPractice {
        //task length i test eden test method yaziniz
        @Test
        void testLenght(){
                int actualLenght="merhaba".length();
                int expectedLenght=7;
                assertEquals(expectedLenght,actualLenght,"test gecti");
        }
        // Yukaridaki ayni kodu yanlis yaptik

//        public class J01TestPractice {
//                //task length i test eden test method yaziniz
//                @Test
//                void testLenght(){
//                        int actualLenght="merhaba".length();
//                        int expectedLenght=9;
//                        assertEquals(expectedLenght,actualLenght,"test gecmedi");
//                }
        @Test
        void testUpperCase (){
                String actualValue="merhaba".toUpperCase();//MERHABA
                String expectedValue="MERHABA";
                Assertions.assertEquals(expectedValue,actualValue,"Test gecmedi");

        }
        //Task contains methidu ile test yaziniz
        @Test
        void testContais(){
                assertEquals(true,"JUnit".contains("U"));
        }
        @Test
        void testFindMin(){
                assertEquals(15.8,Math.min(15.8,25.6));

        }
        //String bir objeyi array'e cevirip Stringin yeni create ettiginiz array ile uyusup uyusamadigini kontrol ediniz
        @Test
        void testArray(){
                String str="hibernate mvc boot junit mongodb";
                String[] actualArr=str.split(" ");
                String[] expextedArr={"hibernate", "mvc" ,"boot", "junit" ,"mongodb"};

                assertTrue(Arrays.equals(expextedArr, actualArr));


        }



        }


