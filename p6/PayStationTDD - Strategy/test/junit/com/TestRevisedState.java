package junit.com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Testcases for the progressive rate strategy.
 
   This source code is from the book 
     "Flexible, Reliable Software:
       Using Patterns and Agile Development"
     published 2010 by CRC Press.
   Author: 
     Henrik B Christensen 
     Department of Computer Science
     Aarhus University
   
   Please visit http://www.baerbak.com/ for further information.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
       http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/
public class TestRevisedState {
  RateStrategy rs;
  RevisedStatePayStation state;

  @Before public void setUp() {
    rs = new ProgressiveRateStrategy();
  }
  
  @Test public void revisedDate() {

    assertEquals( 4 * 60 /*minutes*/ , rs.calculateTime(950) );
  }
} 
