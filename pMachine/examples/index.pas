program example :

type
    Zarb = record
                taille : integer;
                indexcourant : integer;
                liste : array [10] of integer;
             end;
end

var b : Zarb;
var tmp : integer;


procedure getindex(var liste : array [10] of integer, taille : integer, elem : integer, var index : integer) :
    var tmp : integer;

    begin
        index := -1;

        for tmp := 0 to taille do
            begin
                if(elem = liste[tmp]) then
                    begin
                        index := tmp;
                    end;
             end;
    end;



begin
    b.taille := 10;
    tmp := -1;

    while( tmp < 0 || tmp >= b.taille ) do
        begin
            read(tmp);
        end;

     b.liste[tmp] := 1;

     getindex(b.liste, b.taille, 1, b.indexcourant);

     write(b.indexcourant);

end.