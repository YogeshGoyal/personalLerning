
#$\="\n";

my $dir = "C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\perl";
my @files;

readDir($dir,\@files);
my $sevenday = 7*24*60*60;
my $now = time();
for my $file (@files){
    my @stat = stat($file);
    if($now-$stat[9] > $sevenday){
        print "$file\n";
    }
}


sub readDir{
    my ($dir,$arr) = @_;
    print "dir=$dir\n";
    opendir(my $glob, $dir) or die $!;
    while(readdir($glob)){
        next if ($_ =~ m/^\./);
        if(-d "$dir\\" . $_){
            readDir("$dir\\" . $_,$arr);
        }
        if(-f "$dir\\" . $_){
            
            push @$arr,"$dir\\" . $_;
        }

    }
    closedir $glob;
}
