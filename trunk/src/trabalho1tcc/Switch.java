/* Generated By:JavaCC: Do not edit this line. Switch.java */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import semantico.*;

public class Switch implements SwitchConstants {

    public static ArrayList<String>  allInformation = new ArrayList<String>();
    public static Set<String>  procedureInformation = new TreeSet<String>();
    public static Set<String>  variableDeclarationInformation =
                                new TreeSet<String>();

    private static TabelaSimbolos ts;

    public static void SaveLexicalInformation(Token t,String Vn){

        String string = ( "@(" + t.beginLine + "," + t.beginColumn + ")\u005ct"
                 + Vn + "\u005ct-\u005ct" + t.image );

        //System.out.println(string);

        boolean add = allInformation.add(string);
    }

    public static void ShowAllInformation(){
        Iterator it = allInformation.iterator();

        while( it.hasNext() ){
            //System.out.println(it.next());
        }
    }

    public static void main(String args[]) {
        Switch parser = new Switch(System.in);

        if( args.length > 1){

            System.out.println("Voc\u00ea n\u00e3o passou argumentos para o programa");
            System.out.println("Voc\u00ea possui duas escolhas: ");
            System.out.println("1 - L\u00e9xico");
            System.out.println("2 - L\u00e9xico com Sint\u00e1tico Semantico");

            System.exit(-1);
        }
        int opcao = Integer.parseInt(args[0]);
        //int opcao = 2;

        try {
            switch( opcao ){

                case 1:
                        parser.Trabalho2();
                        break;
                case 2:
                        parser.Program();
                        break;
                default:
                        System.out.println("Voc\u00ea s\u00f3  possui duas escolhas: ");
                        System.out.println("1 - L\u00e9xico");
                        System.out.println("2 - L\u00e9xico com Sint\u00e1tico");
            }
        }   catch (ParseException e) {
                System.out.println(e.getMessage());
                System.exit(-1);
        }   catch (TokenMgrError e) {
                System.out.println(e.getMessage());
                System.exit(-1);
        }


        System.out.println("");
        System.out.println(rot.toString());
        System.out.println("SUCESSO");

    }

    public static Rotinas rot = new Rotinas();

  static final public void Trabalho2() throws ParseException {
    TokenAnalyser();
    jj_consume_token(0);
            {if (true) return ;}
  }

  static final public void TokenAnalyser() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WHILE:
      case IF:
      case ELSE:
      case SWITCH:
      case CASE:
      case COLON:
      case DEFLT:
      case BREAK:
      case INT:
      case VOID:
      case IDENT:
      case NUMBER:
      case PLUS:
      case MINUS:
      case TIMES:
      case DIV:
      case PERCENT:
      case OPAR:
      case CPAR:
      case OBRA:
      case CBRA:
      case EQU:
      case LEQU:
      case GEQU:
      case LESS:
      case GREAT:
      case NEQU:
      case NOT:
      case AND:
      case OR:
      case ASSIGN:
      case COMMA:
      case SEMICOL:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENT:
        Ident();
        break;
      case NUMBER:
        Number();
        break;
      case SEMICOL:
        SemiCol();
        break;
      case COMMA:
        Comma();
        break;
      case ASSIGN:
        Assign();
        break;
      case OR:
        Or();
        break;
      case AND:
        And();
        break;
      case NOT:
        Not();
        break;
      case EQU:
        Equ();
        break;
      case LEQU:
        Lequ();
        break;
      case GEQU:
        Gequ();
        break;
      case LESS:
        Less();
        break;
      case GREAT:
        Great();
        break;
      case NEQU:
        Nequ();
        break;
      case PLUS:
        Plus();
        break;
      case MINUS:
        Minus();
        break;
      case TIMES:
        Times();
        break;
      case DIV:
        Div();
        break;
      case PERCENT:
        Percent();
        break;
      case OPAR:
        Opar();
        break;
      case CPAR:
        Cpar();
        break;
      case OBRA:
        Obra();
        break;
      case CBRA:
        Cbra();
        break;
      case IF:
        If();
        break;
      case ELSE:
        Else();
        break;
      case WHILE:
        While();
        break;
      case SWITCH:
        Switch();
        break;
      case CASE:
        Case();
        break;
      case COLON:
        Colon();
        break;
      case DEFLT:
        Deflt();
        break;
      case BREAK:
        Break();
        break;
      case INT:
        Type();
        break;
      case VOID:
        Void();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

    //Inicio Tokens - Análises
  static final public void Void() throws ParseException {
        Token t_void;
    t_void = jj_consume_token(VOID);
            SaveLexicalInformation(t_void,"VOID");
  }

  static final public void Type() throws ParseException {
        Token t_type;
    t_type = jj_consume_token(INT);
            SaveLexicalInformation(t_type,"INT");
  }

  static final public void While() throws ParseException {
        Token t_while;
    t_while = jj_consume_token(WHILE);
            SaveLexicalInformation(t_while,"WHILE");
  }

  static final public void Colon() throws ParseException {
        Token t_colon;
    t_colon = jj_consume_token(COLON);
            SaveLexicalInformation(t_colon,"COLON");
  }

  static final public void Deflt() throws ParseException {
        Token t_deflt;
    t_deflt = jj_consume_token(DEFLT);
            SaveLexicalInformation(t_deflt,"DEFLT");
  }

  static final public void Case() throws ParseException {
        Token t_case;
    t_case = jj_consume_token(CASE);
            SaveLexicalInformation(t_case,"CASE");
  }

  static final public void Switch() throws ParseException {
        Token t_switch;
    t_switch = jj_consume_token(SWITCH);
            SaveLexicalInformation(t_switch,"SWITCH");
  }

  static final public void Break() throws ParseException {
       Token t_break;
    t_break = jj_consume_token(BREAK);
            SaveLexicalInformation(t_break,"BREAK");
    SemiCol();
  }

  static final public void SemiCol() throws ParseException {
        Token t_semicol;
    t_semicol = jj_consume_token(SEMICOL);
             SaveLexicalInformation(t_semicol,"SEMICOL");
  }

  static final public void Cbra() throws ParseException {
        Token t_cbra;
    t_cbra = jj_consume_token(CBRA);
            SaveLexicalInformation(t_cbra,"CBRA");
  }

  static final public void Obra() throws ParseException {
        Token t_obra;
    t_obra = jj_consume_token(OBRA);
            SaveLexicalInformation(t_obra,"OBRA");
  }

  static final public void Else() throws ParseException {
        Token t_else;
    t_else = jj_consume_token(ELSE);
            SaveLexicalInformation(t_else,"ELSE");
  }

  static final public void If() throws ParseException {
        Token t_if;
    t_if = jj_consume_token(IF);
             SaveLexicalInformation(t_if,"IF");
  }

  static final public void Or() throws ParseException {
        Token t_or;
    t_or = jj_consume_token(OR);
            SaveLexicalInformation(t_or,"OR");
  }

  static final public void And() throws ParseException {
        Token t_and;
    t_and = jj_consume_token(AND);
            SaveLexicalInformation(t_and,"AND");
  }

  static final public void Nequ() throws ParseException {
        Token t_nequ;
    t_nequ = jj_consume_token(NEQU);
            SaveLexicalInformation(t_nequ,"NEQU");
  }

  static final public void Equ() throws ParseException {
        Token t_equ;
    t_equ = jj_consume_token(EQU);
            SaveLexicalInformation(t_equ,"EQU");
  }

  static final public void Gequ() throws ParseException {
        Token t_gequ;
    t_gequ = jj_consume_token(GEQU);
            SaveLexicalInformation(t_gequ,"GEQU");
  }

  static final public void Great() throws ParseException {
        Token t_great;
    t_great = jj_consume_token(GREAT);
            SaveLexicalInformation(t_great,"GREAT");
  }

  static final public void Lequ() throws ParseException {
        Token t_lequ;
    t_lequ = jj_consume_token(LEQU);
            SaveLexicalInformation(t_lequ,"LEQU");
  }

  static final public void Less() throws ParseException {
        Token t_less;
    t_less = jj_consume_token(LESS);
            SaveLexicalInformation(t_less,"LESS");
  }

  static final public void Minus() throws ParseException {
        Token t_minus;
    t_minus = jj_consume_token(MINUS);
            SaveLexicalInformation(t_minus,"MINUS");
  }

  static final public void Plus() throws ParseException {
        Token t_plus;
    t_plus = jj_consume_token(PLUS);
            SaveLexicalInformation(t_plus,"PLUS");
  }

  static final public void Percent() throws ParseException {
        String percent_;
        Token t_percent;
    t_percent = jj_consume_token(PERCENT);
            SaveLexicalInformation(t_percent,"PERCENT");
  }

  static final public void Times() throws ParseException {
        String times_;
        Token t_times;
    t_times = jj_consume_token(TIMES);
            SaveLexicalInformation(t_times,"TIMES");
  }

  static final public void Div() throws ParseException {
        String div_;
        Token t_div;
    t_div = jj_consume_token(DIV);
            SaveLexicalInformation(t_div,"DIV");
  }

  static final public void Opar() throws ParseException {
        String opar_;
        Token t_opar;
    t_opar = jj_consume_token(OPAR);
            SaveLexicalInformation(t_opar,"OPAR");
  }

  static final public void Cpar() throws ParseException {
        String cpar_;
        Token t_cpar;
    t_cpar = jj_consume_token(CPAR);
            SaveLexicalInformation(t_cpar,"CPAR");
  }

  static final public void Not() throws ParseException {
        Token t_not = null;
    t_not = jj_consume_token(NOT);
                SaveLexicalInformation(t_not,"NOT");
  }

  static final public String Ident() throws ParseException {
        String ident_;
        Token t_ident;
    t_ident = jj_consume_token(IDENT);
            ident_ = t_ident.image;
            SaveLexicalInformation(t_ident,"IDENT");
            {if (true) return ident_;}
    throw new Error("Missing return statement in function");
  }

  static final public int Number() throws ParseException {
        Integer number_;
        Token t_number;
        String s_number;
    t_number = jj_consume_token(NUMBER);
            try{
                s_number = t_number.image;
                number_ = Integer.parseInt(s_number);
                if( number_ > Integer.MAX_VALUE || number_ < Integer.MIN_VALUE)
                   {if (true) throw new NumberFormatException();}

                SaveLexicalInformation(t_number,"NUMBER");

                {if (true) return number_;}

            }
            catch(NumberFormatException n){
                System.out.println("Erro de estouro de tamanho de inteiro" + " "
                + Integer.MAX_VALUE + " eh o maior tamanho permitido"
                + Integer.MIN_VALUE + " eh o menor tamanho permitido");
            }
    throw new Error("Missing return statement in function");
  }

  static final public void Assign() throws ParseException {
        Token t_assign;
    t_assign = jj_consume_token(ASSIGN);
            SaveLexicalInformation(t_assign,"ASSIGN");
  }

  static final public void Comma() throws ParseException {
        Token t_comma;
    t_comma = jj_consume_token(COMMA);
            SaveLexicalInformation(t_comma,"COMMA");
  }

    //Fim Tokens - Análises

    // Precisamos montar as construções do compilador
    // a partir daqui
    // #INICIO | #inicio
  static final public void Program() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      VariableDeclaration();
    }
    ProcedureDeclaration();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOID:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      ProcedureDeclaration();
    }
    jj_consume_token(0);
  }

  static final public void ProcedureDeclaration() throws ParseException {
    Void();
    ProcedureHeading();
    Obra();
    ProcedureBody();
    Cbra();
            rot.rotina8();
  }

  static final public void ProcedureBody() throws ParseException {
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_4;
      }
      VariableDeclaration();
    }
    StatementSequence();
  }

  static final public void ProcedureHeading() throws ParseException {
        String ident;
    ident = Ident();
            rot.rotina5(ident);
    Opar();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      ParametersList();
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    Cpar();
            rot.rotina20();
  }

  static final public void ParametersList() throws ParseException {
    Parameter();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      Comma();
      ParametersList();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
  }

  static final public void Parameter() throws ParseException {
        String ident;
    Type();
            int posicao = rot.rotina9("int","tipo");
    ident = Ident();
            rot.rotina18(ident);
  }

  static final public void VariableDeclaration() throws ParseException {
    Type();
            int posicao = rot.rotina9("int","tipo");
    IdentList();
    SemiCol();
  }

  static final public void IdentList() throws ParseException {
        String ident;
    ident = Ident();
            rot.verificaEInsereID(ident);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ASSIGN:
      Assignment(ident);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }

    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      Comma();
      IdentList();
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
  }

  static final public void StatementSequence() throws ParseException {
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WHILE:
      case IF:
      case SWITCH:
      case IDENT:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_5;
      }
      Statement();
    }
  }

  static final public void LoopStatementSequence() throws ParseException {
    StatementSequence();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BREAK:
      Break();
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
  }

  static final public void Statement() throws ParseException {
        String ident;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENT:
      ident = Ident();
                    rot.rotina21(ident);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ASSIGN:
        Assignment(ident);
        break;
      case OPAR:
        ProcedureCall(ident);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_6:
      while (true) {
        SemiCol();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEMICOL:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_6;
        }
      }
      break;
    case WHILE:
      WhileStatement();
      break;
    case IF:
    case SWITCH:
      SelectionStatement();
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void WhileStatement() throws ParseException {
    While();
    Opar();
    Expression();
    Cpar();
    Obra();
    LoopStatementSequence();
    Cbra();
  }

  static final public void SelectionStatement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IF:
      IfStatement();
      break;
    case SWITCH:
      SwitchStatement();
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SwitchStatement() throws ParseException {
        int valor;
    Switch();
    Opar();
    Expression();
    Cpar();
    Obra();
    LoopStatementSequence();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CASE:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_7;
      }
      Case();
      valor = ConstantExpression();
                rot.rotina27(valor);
      Colon();
      LoopStatementSequence();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case DEFLT:
      Deflt();
      Colon();
      LoopStatementSequence();
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    Cbra();
            rot.rotina28();
  }

  static final public void IfStatement() throws ParseException {
    If();
    Opar();
    Expression();
    Cpar();
    Obra();
    LoopStatementSequence();
    Cbra();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      Else();
      Obra();
      LoopStatementSequence();
      Cbra();
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
  }

  static final public void ProcedureCall(String ident) throws ParseException {
    Opar();
            rot.rotina25(ident);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENT:
    case NUMBER:
    case PLUS:
    case MINUS:
    case OPAR:
    case NOT:
      ExpList();
      break;
    default:
      jj_la1[18] = jj_gen;
      ;
    }
    Cpar();
            rot.rotina24(ident);
  }

  static final public void ExpList() throws ParseException {
    Expression();
            rot.rotina23();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      Comma();
      ExpList();
      break;
    default:
      jj_la1[19] = jj_gen;
      ;
    }
  }

  static final public void Assignment(String ident) throws ParseException {
            rot.rotina25_l(ident);
    Assign();
    Expression();
  }

  static final public int ConstantExpression() throws ParseException {
        int valor;
    valor = ConstantOrExpr();
            {if (true) return valor;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantOrExpr() throws ParseException {
        int valor1, valor2;
    valor1 = ConstantAndExpr();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OR:
      Or();
      valor2 = ConstantAndExpr();
            if (valor1 != 0)
                {if (true) return 1;}
            else if (valor2 != 0)
                    {if (true) return 1;}
            else
                {if (true) return 0;}
      break;
    default:
      jj_la1[20] = jj_gen;
      ;
    }
            {if (true) return valor1;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantAndExpr() throws ParseException {
        int valor1, valor2;
    valor1 = ConstantEqualityExpr();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[21] = jj_gen;
        break label_8;
      }
      And();
      valor2 = ConstantEqualityExpr();
            if (valor1 == valor2 && valor1 != 0)
                {if (true) return 1;}
            else
                {if (true) return 0;}
    }
            {if (true) return valor1;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantEqualityExpr() throws ParseException {
        int valor1, valor2, operador;
    valor1 = ConstantInequationExpr();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQU:
    case NEQU:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQU:
        Equ();
                    operador = 1;
        break;
      case NEQU:
        Nequ();
                    operador = 2;
        break;
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      valor2 = ConstantInequationExpr();
                switch (operador) {
                    case 1:
                        if (valor1 == valor2)
                            {if (true) return 1;}
                        else
                            {if (true) return 0;}
                    case 2:
                        if (valor1 != valor2)
                            {if (true) return 1;}
                        else
                            {if (true) return 0;}
                }
      break;
    default:
      jj_la1[23] = jj_gen;
      ;
    }
            {if (true) return valor1;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantInequationExpr() throws ParseException {
        int valor1, valor2, operador;
    valor1 = ConstantSimpleExpr();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEQU:
    case GEQU:
    case LESS:
    case GREAT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LESS:
        Less();
                    operador = 1;
        break;
      case LEQU:
        Lequ();
                   operador = 2;
        break;
      case GREAT:
        Great();
                   operador = 3;
        break;
      case GEQU:
        Gequ();
                   operador = 4;
        break;
      default:
        jj_la1[24] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      valor2 = ConstantSimpleExpr();
                switch (operador) {
                    case 1:
                        if (valor1 < valor2)
                            {if (true) return 1;}
                        else
                            {if (true) return 0;}
                    case 2:
                        if (valor1 <= valor2)
                            {if (true) return 1;}
                        else
                            {if (true) return 0;}
                    case 3:
                        if (valor1 > valor2)
                            {if (true) return 1;}
                        else
                            {if (true) return 0;}
                    case 4:
                        if (valor1 >= valor2)
                            {if (true) return 1;}
                        else
                            {if (true) return 0;}
                }
      break;
    default:
      jj_la1[25] = jj_gen;
      ;
    }
            {if (true) return valor1;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantSimpleExpr() throws ParseException {
        int valor1, valor2, operador;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PLUS:
      Plus();
      break;
    default:
      jj_la1[26] = jj_gen;
      ;
    }
    valor1 = ConstantTerm();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[27] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        Plus();
                   operador = 1;
        break;
      case MINUS:
        Minus();
                    operador = 2;
        break;
      default:
        jj_la1[28] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      valor2 = ConstantTerm();
                switch (operador) {
                    case 1:
                        {if (true) return (valor1 + valor2);}
                    case 2:
                        {if (true) return (valor1 - valor2);}
                }
    }
            {if (true) return valor1;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantTerm() throws ParseException {
        int valor1, valor2, res;
        int operador;
    valor1 = ConstantUnary();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TIMES:
      case DIV:
      case PERCENT:
        ;
        break;
      default:
        jj_la1[29] = jj_gen;
        break label_10;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TIMES:
        Times();
                    operador = 1;
        break;
      case DIV:
        Div();
                    operador = 2;
        break;
      case PERCENT:
        Percent();
                    operador = 3;
        break;
      default:
        jj_la1[30] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      valor2 = ConstantUnary();
            switch (operador) {
                case 1:
                    {if (true) return valor1*valor2;}
                case 2:
                    {if (true) return valor1/valor2;}
                case 3:
                    {if (true) return valor1%valor2;}
            }
    }
            {if (true) return valor1;}
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantUnary() throws ParseException {
        int valor;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
    case NOT:
      UnaryOperator();
      valor = ConstantUnary();
            {if (true) return valor;}
      break;
    case NUMBER:
    case OPAR:
      valor = ConstantFactor();
            {if (true) return valor;}
      break;
    default:
      jj_la1[31] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public int ConstantFactor() throws ParseException {
        int valor;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
      valor = Number();
            {if (true) return valor;}
      break;
    case OPAR:
      Opar();
      valor = ConstantExpression();
            {if (true) return valor;}
      Cpar();
      break;
    default:
      jj_la1[32] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public void Expression() throws ParseException {
    OrExpr();
  }

  static final public void OrExpr() throws ParseException {
    AndExpr();
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OR:
        ;
        break;
      default:
        jj_la1[33] = jj_gen;
        break label_11;
      }
      Or();
      AndExpr();
    }
  }

  static final public void EqualityExpr() throws ParseException {
    InequationExpr();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQU:
    case NEQU:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQU:
        Equ();
        break;
      case NEQU:
        Nequ();
        break;
      default:
        jj_la1[34] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      InequationExpr();
      break;
    default:
      jj_la1[35] = jj_gen;
      ;
    }
  }

  static final public void AndExpr() throws ParseException {
    EqualityExpr();
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[36] = jj_gen;
        break label_12;
      }
      And();
      EqualityExpr();
    }
  }

  static final public void InequationExpr() throws ParseException {
    SimpleExpr();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEQU:
    case GEQU:
    case LESS:
    case GREAT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LESS:
        Less();
        break;
      case LEQU:
        Lequ();
        break;
      case GREAT:
        Great();
        break;
      case GEQU:
        Gequ();
        break;
      default:
        jj_la1[37] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      SimpleExpr();
      break;
    default:
      jj_la1[38] = jj_gen;
      ;
    }
  }

  static final public void SimpleExpr() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PLUS:
      Plus();
      break;
    default:
      jj_la1[39] = jj_gen;
      ;
    }
    Term();
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[40] = jj_gen;
        break label_13;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        Plus();
        break;
      case MINUS:
        Minus();
        break;
      default:
        jj_la1[41] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Term();
    }
  }

  static final public void Term() throws ParseException {
    Unary();
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TIMES:
      case DIV:
      case PERCENT:
        ;
        break;
      default:
        jj_la1[42] = jj_gen;
        break label_14;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TIMES:
        Times();
        break;
      case DIV:
        Div();
        break;
      case PERCENT:
        Percent();
        break;
      default:
        jj_la1[43] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Unary();
    }
  }

  static final public void Unary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
    case NOT:
      UnaryOperator();
      Unary();
      break;
    case IDENT:
    case NUMBER:
    case OPAR:
      Factor();
      break;
    default:
      jj_la1[44] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Factor() throws ParseException {
        String ident;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENT:
      ident = Ident();
            rot.rotina21(ident);
            rot.rotina25_l(ident);
      break;
    case NUMBER:
      Number();
      break;
    case OPAR:
      Opar();
      Expression();
      Cpar();
      break;
    default:
      jj_la1[45] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void UnaryOperator() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOT:
      Not();
      break;
    case MINUS:
      Minus();
      break;
    default:
      jj_la1[46] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SwitchTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[47];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xffaffc00,0xffaffc00,0x40000,0x80000,0x40000,0x40000,0x0,0x0,0x0,0x202c00,0x20000,0x20000000,0x0,0x202c00,0x2800,0x4000,0x10000,0x1000,0x23a00000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1000000,0x3000000,0x3000000,0x1c000000,0x1c000000,0x22800000,0x20800000,0x0,0x0,0x0,0x0,0x0,0x0,0x1000000,0x3000000,0x3000000,0x1c000000,0x1c000000,0x22a00000,0x20a00000,0x2000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x1fff,0x1fff,0x0,0x0,0x0,0x0,0x800,0x400,0x800,0x0,0x0,0x400,0x1000,0x0,0x0,0x0,0x0,0x0,0x80,0x800,0x200,0x100,0x42,0x42,0x3c,0x3c,0x0,0x0,0x0,0x0,0x0,0x80,0x0,0x200,0x42,0x42,0x100,0x3c,0x3c,0x0,0x0,0x0,0x0,0x0,0x80,0x0,0x80,};
   }

  /** Constructor with InputStream. */
  public Switch(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Switch(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SwitchTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Switch(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SwitchTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Switch(SwitchTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SwitchTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 47; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[45];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 47; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 45; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
