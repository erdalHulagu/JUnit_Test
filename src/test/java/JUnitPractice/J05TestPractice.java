package JUnitPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05TestPractice {


        @ParameterizedTest
        @ValueSource(strings  = {"qwert","wert","null","qwe"}) // burada yazilan strings parametresi anotationlar kendiligiden
        void  testLenght(String str){                          // methodda olusturdugumuz parametreye otomotik ataniyor
                Assertions.assertTrue(str.length()>0);

        }
        @ParameterizedTest
        @CsvSource(value = {"true,junit,u","false,mvc,z"}) //Comma-separated values annotations
        //csv annotu 3. degeri contains methodu mantigi ile test eder(u, junit icinde true(varmi))
        void testCsvSource(Boolean b,String s1,String s2){
                assertEquals(b,s1.contains(s2));
        }

        @RepeatedTest(10)
        @Disabled
        void testRepeat(){
                String[] arr={"hibernate", "hibernate" ,"wdw", "wdwq" ,"dwqd"};
                // assertEquals("mvc","mvc spring bir framework".substring(0,3));
                for (int i = 0; i < arr.length; i++) {
                        assertEquals(arr[0],arr[i]);
                }

        }
}

