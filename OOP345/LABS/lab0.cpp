
#include "lab0.h"


namespace sdds {

	//empty constructor
	EvenNumber::EvenNumber() {
		val = 0;
	}

	//one arg con

	EvenNumber::EvenNumber(int x) {
		val = x;

	}

	int EvenNumber::getValue() {
		return val;
	}

	EvenNumber EvenNumber::getNext() {
		EvenNumber e;
		e.val = val + 2;
		return e;
		
	}
	EvenNumber EvenNumber::getPrevious() {
		EvenNumber e;
		e.val = val - 2;
		return e;
	}


}