package org.omg.PortableServer.POAManagerPackage;


/**
* org/omg/PortableServer/POAManagerPackage/AdapterInactive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u121/8372/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, December 12, 2016 8:41:13 PM PST
*/

public final class AdapterInactive extends org.omg.CORBA.UserException
{

  public AdapterInactive ()
  {
    super(AdapterInactiveHelper.id());
  } // ctor


  public AdapterInactive (String $reason)
  {
    super(AdapterInactiveHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterInactive
