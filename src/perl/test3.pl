#!/usr/bin/perl


sub unique{
    my (@arr) = @_;
    my %hash;
    $hash{$_}++ for(@arr);
    
    return keys %hash;
}

my @arr = (1,2,6,5,4,3,2,1,4);

my @new = unique(@arr);
print "@new\n";


use LWP::Simple;
$url = get 'http://www.DevDaily.com/';



#sub hi{
#    print "hi\n";
#}
#
#my $ref_fun = \&hi;
#$ref_fun->();


#my %hash = (1=>2,3=>4);
#my $ref = \%hash;
#foreach (keys %$ref){
#    print "$_:". $ref->{$_} . "\n";
#}












#
#my @numbers = (1..10);
##print for(@numbers);
#
#my $regex =4;
#my $count= grep { $_ =~ m/$regex/ } @numbers;
#
#print "$count\n";  
#
#my @newarray = map {$_*2} @numbers;
#
#for(@newarray){
#    print "$_\n";
#}

#
#my $str = "this is main, file";
#
#$str =~ s/,/\\t/;
#
##print "$str";
#
#my @arr = (1,2,3,4);
#undef @arr;
#if($#arr <0 ){
#    print "array is empty <$#arr >\n";
#}
#
#for(@arr){
#print ;
#}
#




#
#my $count =0;
#my $total =0;
#print "Enter number:";
#my $num=<STDIN>;
#chomp($num);
#while($num >= 0){
#    $total = $total + $num;
#    $count++;
#    print "Enter another number:";
#    $num=<STDIN>;
#    chomp($num);
#
#}
#
#if($count >0){
#    print "avarage is:"+ $total/$count;
#}

#my $file = 'C:\Users\yokukuma\Documents\NetBeansProjects\personal\src\perl\data';
#open(FP,"<",$file) or die "cant open file $_";
#
#my %mails =();
#for(<FP>){
#    my $str = $_;
#    if($str =~ m/([A-Za-z0-9]{1,}@[A-Za-z0-9]{1,}.[A-Za-z0-9]{1,})/){
#        #print "matched string:" .  $1. "\n";
#        #print "key:$1\n";
#        if(defined $mails{$1}){
#            $mails{$1} = $mails{$1}+1;
#        }else{
#            $mails{$1} =1;
#        }
#    }
#}
#
#for (sort keys %mails){
#    print "$_:" . $mails{$_} . "\n";
#}
#
#
#package Parent1;
#
#sub foo1{
#    print "foo1\n";
#}
#
#package Parent2;
#
#sub foo2{
#    print "foo2\n";
#}
#package Child;
#
#@ISA = (Parent1,Parent2);
#
#sub boo{
#    print "boo\n";
#}
#
#package main;
#
#Child->boo();
#Child->foo1();
#Child->foo2();