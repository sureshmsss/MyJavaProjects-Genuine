package generic.classess;
//class Test006<T extends Number>
class Test006<T extends Number>
{
	Test006<Number> t1=new Test006<Number>();
	Test006<Integer> t2=new Test006<Integer>();
	//Test006<byte> t3=new Test006<byte>();//CE :- unexpected type required: reference found:    byte
	Test006<Integer> t4=new Test006<Integer>();
	//Test006<String> t5=new Test006<String>();//CE :- type argument String is not within bounds of type-variable T
}
