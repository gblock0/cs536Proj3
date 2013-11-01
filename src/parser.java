
//----------------------------------------------------
// The following code was generated by CUP v0.10f
// Thu Sep 19 11:14:03 CDT 2013
//----------------------------------------------------

import java_cup.runtime.*;

public class parser extends java_cup.runtime.lr_parser {

  /** constructor */
  public parser() {super();}

  /** production table */
  protected static final short _production_table[][] = {
        {0, 2},     {1, 4},     {7, 2},     {7, 0},     {8, 3}, 
        {9, 1},     {9, 1},     {2, 2},     {2, 0},     {3, 4}, 
        {3, 5},     {3, 5},     {4, 3},     {4, 3},     {4, 3}, 
        {4, 3},     {4, 1},     {5, 3},     {5, 1},     {5, 1}, 
        {6, 1},     {11, 1},     {10, 1},     {10, 0}  };

  /** access to production table */
  public short[][] production_table() {return _production_table;}

  /** parse action table */
  protected static final short[][] _action_table = {
    /*0*/{8,2,-1,0},
    /*1*/{2,-4,8,-4,9,-4,14,-4,15,9,16,6,-1,0},
    /*2*/{0,4,-1,0},
    /*3*/{0,-1,-1,0},
    /*4*/{2,-4,8,-4,9,-4,14,-4,15,9,16,6,-1,0},
    /*5*/{2,-7,-1,0},
    /*6*/{2,13,-1,0},
    /*7*/{2,13,8,12,9,-9,14,11,-1,0},
    /*8*/{2,-6,-1,0},
    /*9*/{9,44,-1,0},
    /*10*/{5,40,-1,0},
    /*11*/{2,-4,8,-4,9,-4,14,-4,15,9,16,6,-1,0},
    /*12*/{4,-21,6,-21,7,-21,10,-21,11,-21,12,-21,13,-21,-1,0},
    /*13*/{7,17,-1,0},
    /*14*/{2,13,8,12,9,-9,14,11,-1,0},
    /*15*/{9,-8,-1,0},
    /*16*/{2,13,3,18,5,22,-1,0},
    /*17*/{4,-22,6,-22,10,-22,11,-22,12,-22,13,-22,-1,0},
    /*18*/{4,-20,6,-20,10,-20,11,-20,12,-20,13,-20,-1,0},
    /*19*/{4,-17,6,-17,10,-17,11,-17,12,31,13,32,-1,0},
    /*20*/{4,-19,6,-19,10,-19,11,-19,12,-19,13,-19,-1,0},
    /*21*/{2,13,3,18,5,22,-1,0},
    /*22*/{4,25,10,24,11,26,-1,0},
    /*23*/{2,13,3,18,5,22,-1,0},
    /*24*/{2,-10,8,-10,9,-10,14,-10,-1,0},
    /*25*/{2,13,3,18,5,22,-1,0},
    /*26*/{4,-14,6,-14,10,-14,11,-14,-1,0},
    /*27*/{4,-13,6,-13,10,-13,11,-13,-1,0},
    /*28*/{6,30,10,24,11,26,-1,0},
    /*29*/{4,-18,6,-18,10,-18,11,-18,12,-18,13,-18,-1,0},
    /*30*/{2,13,3,18,5,22,-1,0},
    /*31*/{2,13,3,18,5,22,-1,0},
    /*32*/{4,-16,6,-16,10,-16,11,-16,-1,0},
    /*33*/{4,-15,6,-15,10,-15,11,-15,-1,0},
    /*34*/{2,13,8,12,9,-9,14,11,-1,0},
    /*35*/{9,37,-1,0},
    /*36*/{2,-24,4,39,8,-24,9,-24,14,-24,-1,0},
    /*37*/{2,-12,8,-12,9,-12,14,-12,-1,0},
    /*38*/{2,-23,8,-23,9,-23,14,-23,-1,0},
    /*39*/{2,13,3,18,5,22,-1,0},
    /*40*/{6,42,10,24,11,26,-1,0},
    /*41*/{2,13,8,12,14,11,-1,0},
    /*42*/{2,-11,8,-11,9,-11,14,-11,-1,0},
    /*43*/{0,-2,-1,0},
    /*44*/{4,46,-1,0},
    /*45*/{2,-5,8,-5,9,-5,14,-5,15,-5,16,-5,-1,0},
    /*46*/{2,-3,8,-3,9,-3,14,-3,-1,0},
  };

  /** access to parse action table */
  public short[][] action_table() {return _action_table;}

  /** reduce_goto table */
  protected static final short[][] _reduce_table = {
    /*0*/{1,2,-1,-1},
    /*1*/{7,7,8,4,9,6,-1,-1},
    /*2*/{-1,-1},
    /*3*/{-1,-1},
    /*4*/{7,46,8,4,9,6,-1,-1},
    /*5*/{-1,-1},
    /*6*/{6,44,-1,-1},
    /*7*/{2,9,3,14,6,13,-1,-1},
    /*8*/{-1,-1},
    /*9*/{-1,-1},
    /*10*/{-1,-1},
    /*11*/{7,34,8,4,9,6,-1,-1},
    /*12*/{-1,-1},
    /*13*/{-1,-1},
    /*14*/{2,15,3,14,6,13,-1,-1},
    /*15*/{-1,-1},
    /*16*/{4,22,5,19,6,20,11,18,-1,-1},
    /*17*/{-1,-1},
    /*18*/{-1,-1},
    /*19*/{-1,-1},
    /*20*/{-1,-1},
    /*21*/{4,28,5,19,6,20,11,18,-1,-1},
    /*22*/{-1,-1},
    /*23*/{5,27,6,20,11,18,-1,-1},
    /*24*/{-1,-1},
    /*25*/{5,26,6,20,11,18,-1,-1},
    /*26*/{-1,-1},
    /*27*/{-1,-1},
    /*28*/{-1,-1},
    /*29*/{-1,-1},
    /*30*/{5,33,6,20,11,18,-1,-1},
    /*31*/{5,32,6,20,11,18,-1,-1},
    /*32*/{-1,-1},
    /*33*/{-1,-1},
    /*34*/{2,35,3,14,6,13,-1,-1},
    /*35*/{-1,-1},
    /*36*/{10,37,-1,-1},
    /*37*/{-1,-1},
    /*38*/{-1,-1},
    /*39*/{4,40,5,19,6,20,11,18,-1,-1},
    /*40*/{-1,-1},
    /*41*/{3,42,6,13,-1,-1},
    /*42*/{-1,-1},
    /*43*/{-1,-1},
    /*44*/{-1,-1},
    /*45*/{-1,-1},
    /*46*/{-1,-1},
  };

  /** access to reduce_goto table */
  public short[][] reduce_table() {return _reduce_table;}

  /** instance of action encapsulation class */
  protected CUP$actions action_obj;

  /** action encapsulation object initializer */
  protected void init_actions()
    {
      action_obj = new CUP$actions();
    }

  /** invoke a user supplied parse action */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$do_action(act_num, parser, stack, top);
  }

  /** start state */
  public int start_state() {return 0;}
  /** start production */
  public int start_production() {return 0;}

  /** EOF Symbol index */
  public int EOF_sym() {return 0;}

  /** error Symbol index */
  public int error_sym() {return 1;}


  /** user initialization */
  public void user_init() throws java.lang.Exception
    {
              
    }

  /** scan to get the next Symbol */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return Scanner.next_token(); 
    }


 public void syntax_error(Symbol cur_token)
     {
 	  report_error("CSX syntax error at line "+
			String.valueOf(((CSXToken)cur_token.value).linenum),  
			null);
     }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$actions {

  /** Constructor */
  CUP$actions() { }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$do_action(
    int                        CUP$act_num,
    java_cup.runtime.lr_parser CUP$parser,
    java.util.Stack            CUP$stack,
    int                        CUP$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$result;

      /* select the action based on the action number */
      switch (CUP$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // optionalSemi ::= 
            {
              Symbol RESULT = null;

              CUP$result = new java_cup.runtime.Symbol(10/*optionalSemi*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // optionalSemi ::= SEMI 
            {
              Symbol RESULT = null;

              CUP$result = new java_cup.runtime.Symbol(10/*optionalSemi*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // intliteral ::= INTLIT 
            {
              intLitNode RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		CSXIntLitToken i = (CSXIntLitToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT = new intLitNode(i.intValue, i.linenum,i.colnum);
         
              CUP$result = new java_cup.runtime.Symbol(11/*intliteral*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ident ::= IDENTIFIER 
            {
              identNode RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		CSXIdentifierToken i = (CSXIdentifierToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT = new identNode(i.identifierText,
									   i.linenum,i.colnum); 
              CUP$result = new java_cup.runtime.Symbol(6/*ident*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // unit ::= intliteral 
            {
              exprNode RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		intLitNode l = (intLitNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT = l; 
              CUP$result = new java_cup.runtime.Symbol(5/*unit*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // unit ::= ident 
            {
              exprNode RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		identNode i = (identNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT = i; 
              CUP$result = new java_cup.runtime.Symbol(5/*unit*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // unit ::= LPAREN exp RPAREN 
            {
              exprNode RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		exprNode e = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		 RESULT = e; 
              CUP$result = new java_cup.runtime.Symbol(5/*unit*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp ::= unit 
            {
              exprNode RESULT = null;
		int uleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int uright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		exprNode u = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT = u; 
              CUP$result = new java_cup.runtime.Symbol(4/*exp*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= unit NOTEQ unit 
            {
              exprNode RESULT = null;
		int leftvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int leftvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		exprNode leftval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		CSXToken op = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		int rightvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int rightvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		exprNode rightval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT=new binaryOpNode(leftval,sym.NOTEQ,rightval,op.linenum,op.colnum); 
              CUP$result = new java_cup.runtime.Symbol(4/*exp*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= unit EQ unit 
            {
              exprNode RESULT = null;
		int leftvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int leftvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		exprNode leftval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		CSXToken op = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		int rightvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int rightvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		exprNode rightval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT=new binaryOpNode(leftval,sym.EQ,rightval,op.linenum,op.colnum); 
              CUP$result = new java_cup.runtime.Symbol(4/*exp*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= exp MINUS unit 
            {
              exprNode RESULT = null;
		int leftvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int leftvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		exprNode leftval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		CSXToken op = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		int rightvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int rightvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		exprNode rightval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT=new binaryOpNode(leftval,sym.MINUS,rightval,op.linenum,op.colnum); 
              CUP$result = new java_cup.runtime.Symbol(4/*exp*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= exp PLUS unit 
            {
              exprNode RESULT = null;
		int leftvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int leftvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		exprNode leftval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		CSXToken op = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		int rightvalleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int rightvalright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		exprNode rightval = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT=new binaryOpNode(leftval,sym.PLUS,rightval,op.linenum,op.colnum); 
              CUP$result = new java_cup.runtime.Symbol(4/*exp*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // stmt ::= LBRACE fielddecls stmts RBRACE optionalSemi 
            {
              stmtNode RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-4)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-4)).right;
		CSXToken l = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-4)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).right;
		fieldDeclsOption f = (fieldDeclsOption)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		stmtsOption s = (stmtsOption)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		
	  			 RESULT=new blockNode(f,s, l.linenum, l.colnum);
        	 
              CUP$result = new java_cup.runtime.Symbol(3/*stmt*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-4)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // stmt ::= rw_IF LPAREN exp RPAREN stmt 
            {
              stmtNode RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-4)).right;
		CSXToken i = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		exprNode e = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		stmtNode s = (stmtNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		
			 RESULT=new ifThenNode(e,s, i.linenum,i.colnum); 
              CUP$result = new java_cup.runtime.Symbol(3/*stmt*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-4)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= ident ASG exp SEMI 
            {
              stmtNode RESULT = null;
		int idleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).right;
		identNode id = (identNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		exprNode e = (exprNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		 RESULT=
			new asgNode(new nameNode(id,id.linenum,id.colnum),e,id.linenum,id.colnum);
			 
              CUP$result = new java_cup.runtime.Symbol(3/*stmt*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmts ::= 
            {
              stmtsOption RESULT = null;
		 RESULT= stmtsNode.NULL; 
              CUP$result = new java_cup.runtime.Symbol(2/*stmts*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmts ::= stmt stmts 
            {
              stmtsOption RESULT = null;
		int s1left = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		stmtNode s1 = (stmtNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		stmtsOption s2 = (stmtsOption)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT=
			new stmtsNode(s1,s2,s1.linenum,s1.colnum);
			 
              CUP$result = new java_cup.runtime.Symbol(2/*stmts*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // type ::= rw_BOOL 
            {
              typeNode RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		CSXToken t = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		
	  				 RESULT=new boolTypeNode(t.linenum, t.colnum);
         		
              CUP$result = new java_cup.runtime.Symbol(9/*type*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // type ::= rw_INT 
            {
              typeNode RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		CSXToken t = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		
	  				 RESULT=new intTypeNode(t.linenum, t.colnum);
         		
              CUP$result = new java_cup.runtime.Symbol(9/*type*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // fielddecl ::= type ident SEMI 
            {
              declNode RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		typeNode t = (typeNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		identNode i = (identNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		 RESULT=
					new varDeclNode(i,t,exprNode.NULL, t.linenum,t.colnum); 
              CUP$result = new java_cup.runtime.Symbol(8/*fielddecl*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // fielddecls ::= 
            {
              fieldDeclsOption RESULT = null;
		 RESULT=
					fieldDeclsNode.NULL; 
              CUP$result = new java_cup.runtime.Symbol(7/*fielddecls*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // fielddecls ::= fielddecl fielddecls 
            {
              fieldDeclsOption RESULT = null;
		int f1left = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		declNode f1 = (declNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right;
		fieldDeclsOption f2 = (fieldDeclsOption)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-0)).value;
		 RESULT=
					new fieldDeclsNode(f1,f2, f1.linenum,f1.colnum); 
              CUP$result = new java_cup.runtime.Symbol(7/*fielddecls*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= LBRACE fielddecls stmts RBRACE 
            {
              csxLiteNode RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).right;
		CSXToken l = (CSXToken)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-3)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-2)).right;
		fieldDeclsOption f = (fieldDeclsOption)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		stmtsOption s = (stmtsOption)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		 RESULT=
				new csxLiteNode(f, s, l.linenum, l.colnum); 
              CUP$result = new java_cup.runtime.Symbol(1/*prog*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-3)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).right;
		csxLiteNode start_val = (csxLiteNode)((java_cup.runtime.Symbol) CUP$stack.elementAt(CUP$top-1)).value;
		RESULT = start_val;
              CUP$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-1)).left, ((java_cup.runtime.Symbol)CUP$stack.elementAt(CUP$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser.done_parsing();
          return CUP$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

