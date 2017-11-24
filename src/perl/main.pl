#!/usr/bin/perl


#require lib::bmc::Action;
#lib::bmc::Action->hello();






BEGIN{
    push @INC,"lib/opc";
    push @INC,"lib/bmc";
    
}

use Action;

my $obj = new Action();
print "<obj=$obj>\n";
$obj->hello();

#sub hi{
#    print "Hi from main package or namespace\n";
#}
##hi();
#
#package Foo;
#
#sub hi{
#    print "Hi from Foo package or namespace\n";
#}
#
##hi();
##main::hi();
##Foo::hi();
#
#package main;
#
##hi();
##main::hi();
#Foo::hi();
