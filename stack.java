class stack
{
  int top=-1;
  int size;
  
  stack(int s){
      size=s;
  }
  int ar[] = new int[size];
  
  boolean isEmpty ()
  {
    if (top == -1)
      {
	return true;
      }
    else
      {
	return false;
      }
  }
  boolean isFull ()
  {
    if (top == size-1 )
      {
	return true;
      }
    else
      {
	return false;
      }
  }
  void push (int data)
  {
    if (isFull ())
      {
	System.out.println ("cannot be added ,since its full");
      }
    else
      {
    top++;
	ar[top] = data;
	
      }
  }

  void pop ()
  {
    if (isEmpty ())
      {
	System.out.println ("cannot be deleted further ,since its empty");
      }
    else
      {

	System.out.println (ar[top] + " is deleted");
	top--;
      }
  }
  int peek ()
  {
    return ar[top];

  }








  public static void main (String[]args)
  {
    stack s = new stack (10);
    
    for (int i = 0; i <s.size; i++)
      {
	s.push (i);
      }
    for (int i = 0; i <= s.top; i++)
      {
	System.out.print (" " + s.ar[i]);
      }
      System.out.println ();
      
    s.pop (); System.out.println ();
    for (int i = 0; i <= s.top; i++)
      {
	System.out.print (" " + s.ar[i]);
      } System.out.println ();
    System.out.println (s.isEmpty ());
    System.out.println (s.isFull ());
     System.out.println (s.peek());
  }
}
