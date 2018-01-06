#!/usr/bin/perl

#print "Hello!\n";
#
#my @arr = (4,5,3);
#
## print for(@arr);
#
#my %hash;
#    $hash{0}=1;
#    $hash{1}=2;
#    $hash{@arr}=4;
#
#my @out = keys %hash;
#for(@out){
#    print "key:$_ value: $hash{$_}\n";
#}

#our $ls = "outer";
#print " outer $ls\n";
#{
#    local $ls = "inner";
#    print " inner $ls\n";
#&test;
#}
#
#
#sub test{
#    print "method:$ls\n";
#}
#print "outer $ls\n";

#!/usr/bin/perl

#sub makeone {
#    my @a = ( 1 .. 10 );
#    return \@a;
#}
#
#my $ref  = makeone;
#print for(@$ref);

#sub func
#{
#die "dieing in subroutine func\n";
#}
#eval { func(); };
#print "Error captured : $@\n";



my $name = " 123 yogesh goyal 123 yogesh kumar";

if ($name =~ m/(.*)(kumar)/) {
# print "Prematch: <$`>\n";
# print "Match: <$&>\n";
# print "Postmatch: <$'>\n";
print "froup1: <$1>\n";
print "froup1: <$2>\n";
} else {
 print "no match\n";
}

$name =~ s/(.*)(kumar)/\2\1/;

print "OUT:<$name>";