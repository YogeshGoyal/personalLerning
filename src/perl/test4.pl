#!/usr/bin/perl


package Animal;

sub new{
    my ($class) = @_;
    my $ref = {};
    my $self = bless ($ref, $class);
    return $self;
}

sub speak{
    my $self = shift;
    print "hello: " . $self->sound() . "\n";
}

package Horse;
our @ISA=(Animal);
sub new{
    my ($class) = @_;
    my $ref = {};
    my $self = bless ($ref, $class);
    return $self;
}
sub speak{
    my $self = shift;
    # below way we can call parent method by using SUPER as qualification to method name
    $self->SUPER::speak;
    print "I AM ADDING SOME EXTRA PART\n";
}
sub sound{
    "HORSEEE";
}

package main;



my $obj = new Horse;
$obj->speak;


print for(@INC);
