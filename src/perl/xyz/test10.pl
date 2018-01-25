#!/usr/bin/perl





my $file;
my $filename = "C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\perl\\xyz\\xyz.txt";
if (-f $filename){
    open ($file, "<",$filename) or die "file cant be open because of the permission";
}else{
    print "file doesn't exits";
    exit 1;

}

print for(<$file>);


close $file;