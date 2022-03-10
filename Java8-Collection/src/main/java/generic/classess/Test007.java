package generic.classess;
class  Test007<T extends Runnable>
{
	Test007<Runnable> t1=new Test007<Runnable>();
	Test007<Thread> t2=new Test007<Thread>();
//	Test007<Integer> t3=new Test007<Integer>();//CE :- type argument Integer is not within bounds of type-variable T
}
