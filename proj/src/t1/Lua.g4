/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="<<Digite os RAs do grupo aqui>>";
}

chunk
    : block EOF
    ;

block
    : stat* retstat?
    ;

stat
    : ';'
    ;

retstat
    : 'return'
    ;

