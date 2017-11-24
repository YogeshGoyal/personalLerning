
package Action;
use Exporter ;
#@ISA = qw(Exporter);
#@EXPORT = qw(hello);

sub new{
    my ($class) = @_;
    my $self = {};
    bless  $self,$class;
    return $self;
}

sub hello{
    my ($self) = @_;
    $self->hi();
    print "hello from OPC Action";
}

sub hi{
    my ($self) = @_;
    print "hi from action";
}


1;

