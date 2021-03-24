grammar Cool;

program:
(c1 = classdec)*
 mainclass = entryClassDeclaration
(c3= classdec)* EOF
    ;

classdec:
    'class';

entryClassDeclaration:
    'entry';