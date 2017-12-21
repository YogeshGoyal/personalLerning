#!/usr/bin/perl



# my @files = glob("./*");

#my @files = grep {-d "$root/$_" && ! /^\.{1,2}$/} readdir("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\os");
#print "$_\n" for(@files);


#use File::Slurp qw(read_dir);
#my $root = "C:\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\os";
#for my $dir (grep { -d "$root/$_" } read_dir($root)) {
#    print "$dir\n";
#}


#opendir(FP,"C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\os");
#my @files = readdir(FP);
#closedir(FP);
#
#for(@files){
#    next if($_ =~ m/^\./);
#    next if($_ =~ m/^\.\./);
#    print "$_\n";
#}



my $sentence = "the america is now stable";
if($sentence =~ m/The+/i){
    print "matches\n";
}