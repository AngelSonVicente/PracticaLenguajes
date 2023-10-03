// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/main/java/AnalizadorLexico/Lexico.flex

package AnalizadorLexico;
import ModeloLexico.*;


@SuppressWarnings("fallthrough")
class Lexico {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\1\6\1\7\1\0\1\10\1\0\1\11\1\12\1\13"+
    "\1\14\1\10\1\15\1\16\1\17\1\20\12\21\1\22"+
    "\1\23\1\24\1\25\1\24\2\0\5\26\1\27\7\26"+
    "\1\30\5\26\1\31\6\26\1\32\1\33\1\34\1\0"+
    "\1\26\1\0\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\26\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\26\1\54\1\55\1\56\1\57\1\26"+
    "\1\60\1\61\1\62\1\26\1\63\1\1\1\64\7\0"+
    "\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\1\1\5"+
    "\1\6\1\4\1\7\2\4\1\10\1\11\1\12\1\13"+
    "\1\14\4\15\1\16\1\17\20\15\1\20\1\21\1\13"+
    "\1\0\1\22\1\23\2\0\1\22\4\0\1\24\4\15"+
    "\1\25\11\15\1\25\3\15\1\26\7\15\3\0\1\10"+
    "\24\15\1\0\1\10\1\27\22\15";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\65\0\152\0\237\0\324\0\65\0\u0109"+
    "\0\u013e\0\65\0\u0173\0\65\0\u01a8\0\u01dd\0\u0212\0\65"+
    "\0\65\0\152\0\152\0\u0247\0\u027c\0\u02b1\0\u02e6\0\65"+
    "\0\65\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459"+
    "\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc\0\u0601"+
    "\0\u0636\0\65\0\65\0\65\0\237\0\237\0\65\0\u066b"+
    "\0\u0109\0\u0109\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774\0\u07a9"+
    "\0\u07de\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951"+
    "\0\u0986\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0247\0\u0a8f\0\u0ac4"+
    "\0\u0af9\0\u0247\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\u0c02\0\u0c37"+
    "\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b\0\u073f\0\u0d40\0\u0d75\0\u0daa"+
    "\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52"+
    "\0\u0f87\0\u0fbc\0\u0ff1\0\u1026\0\u105b\0\u1090\0\u10c5\0\u10fa"+
    "\0\u112f\0\u1164\0\65\0\u0247\0\u1199\0\u11ce\0\u1203\0\u1238"+
    "\0\u126d\0\u12a2\0\u12d7\0\u130c\0\u1341\0\u1376\0\u13ab\0\u13e0"+
    "\0\u1415\0\u144a\0\u147f\0\u14b4\0\u14e9\0\u151e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\2\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\2\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\24\1\41\1\24\1\42\1\24"+
    "\1\43\1\44\1\45\1\46\1\24\1\47\1\24\1\50"+
    "\1\24\1\51\1\52\1\53\112\0\1\54\37\0\2\55"+
    "\1\56\3\55\1\57\24\55\1\60\31\55\2\6\1\0"+
    "\62\6\2\61\1\62\6\61\1\57\21\61\1\63\31\61"+
    "\16\0\1\64\62\0\1\7\71\0\1\65\63\0\1\7"+
    "\63\0\1\66\1\0\1\17\4\0\4\67\3\0\26\67"+
    "\23\0\1\24\4\0\4\24\3\0\26\24\23\0\1\24"+
    "\4\0\4\24\3\0\1\70\25\24\23\0\1\24\4\0"+
    "\4\24\3\0\15\24\1\71\10\24\23\0\1\24\4\0"+
    "\4\24\3\0\17\24\1\72\6\24\23\0\1\24\4\0"+
    "\4\24\3\0\14\24\1\73\3\24\1\74\5\24\23\0"+
    "\1\24\4\0\4\24\3\0\17\24\1\75\6\24\23\0"+
    "\1\24\4\0\4\24\3\0\12\24\1\45\2\24\1\76"+
    "\10\24\23\0\1\24\4\0\4\24\3\0\4\24\1\77"+
    "\21\24\23\0\1\24\4\0\4\24\3\0\12\24\1\100"+
    "\11\24\1\101\1\24\23\0\1\24\4\0\4\24\3\0"+
    "\10\24\1\102\4\24\1\103\1\24\1\104\6\24\23\0"+
    "\1\24\4\0\4\24\3\0\12\24\1\105\13\24\23\0"+
    "\1\24\4\0\4\24\3\0\5\24\1\106\5\24\1\107"+
    "\1\106\3\24\1\106\5\24\23\0\1\24\4\0\4\24"+
    "\3\0\1\110\25\24\23\0\1\24\4\0\4\24\3\0"+
    "\15\24\1\111\10\24\23\0\1\24\4\0\4\24\3\0"+
    "\17\24\1\112\6\24\23\0\1\24\4\0\4\24\3\0"+
    "\1\113\25\24\23\0\1\24\4\0\4\24\3\0\1\114"+
    "\3\24\1\115\21\24\23\0\1\24\4\0\4\24\3\0"+
    "\17\24\1\116\6\24\23\0\1\24\4\0\4\24\3\0"+
    "\7\24\1\117\1\120\15\24\23\0\1\24\4\0\4\24"+
    "\3\0\10\24\1\121\15\24\35\0\1\122\64\0\1\123"+
    "\52\0\1\124\62\0\1\66\1\0\1\65\64\0\1\125"+
    "\71\0\4\67\3\0\26\67\23\0\1\24\4\0\4\24"+
    "\3\0\12\24\1\126\13\24\23\0\1\24\4\0\4\24"+
    "\3\0\14\24\1\127\11\24\23\0\1\24\4\0\4\24"+
    "\3\0\22\24\1\130\3\24\23\0\1\24\4\0\4\24"+
    "\3\0\3\24\1\112\22\24\23\0\1\24\4\0\4\24"+
    "\3\0\20\24\1\131\5\24\23\0\1\24\4\0\4\24"+
    "\3\0\4\24\1\132\21\24\23\0\1\24\4\0\4\24"+
    "\3\0\14\24\1\133\11\24\23\0\1\24\4\0\4\24"+
    "\3\0\5\24\1\106\4\24\1\106\13\24\23\0\1\24"+
    "\4\0\4\24\3\0\10\24\1\134\7\24\1\127\5\24"+
    "\23\0\1\24\4\0\4\24\3\0\2\24\1\135\23\24"+
    "\23\0\1\24\4\0\4\24\3\0\14\24\1\136\11\24"+
    "\23\0\1\24\4\0\4\24\3\0\17\24\1\106\6\24"+
    "\23\0\1\24\4\0\4\24\3\0\15\24\1\137\10\24"+
    "\23\0\1\24\4\0\4\24\3\0\15\24\1\140\10\24"+
    "\23\0\1\24\4\0\4\24\3\0\16\24\1\141\7\24"+
    "\23\0\1\24\4\0\4\24\3\0\13\24\1\142\12\24"+
    "\23\0\1\24\4\0\4\24\3\0\14\24\1\143\4\24"+
    "\1\112\4\24\23\0\1\24\4\0\4\24\3\0\20\24"+
    "\1\144\5\24\23\0\1\24\4\0\4\24\3\0\10\24"+
    "\1\145\15\24\23\0\1\24\4\0\4\24\3\0\21\24"+
    "\1\146\4\24\23\0\1\24\4\0\4\24\3\0\25\24"+
    "\1\106\23\0\1\24\4\0\4\24\3\0\10\24\1\147"+
    "\15\24\23\0\1\24\4\0\4\24\3\0\21\24\1\150"+
    "\4\24\23\0\1\24\4\0\4\24\3\0\4\24\1\151"+
    "\21\24\2\0\2\55\3\0\60\55\2\152\3\0\60\152"+
    "\13\0\1\153\5\0\1\124\64\0\1\24\4\0\4\24"+
    "\3\0\20\24\1\130\5\24\23\0\1\24\4\0\4\24"+
    "\3\0\4\24\1\106\21\24\23\0\1\24\4\0\4\24"+
    "\3\0\4\24\1\154\21\24\23\0\1\24\4\0\4\24"+
    "\3\0\4\24\1\155\21\24\23\0\1\24\4\0\4\24"+
    "\3\0\1\156\25\24\23\0\1\24\4\0\4\24\3\0"+
    "\21\24\1\157\4\24\23\0\1\24\4\0\4\24\3\0"+
    "\5\24\1\106\20\24\23\0\1\24\4\0\4\24\3\0"+
    "\4\24\1\160\21\24\23\0\1\24\4\0\4\24\3\0"+
    "\1\161\25\24\23\0\1\24\4\0\4\24\3\0\13\24"+
    "\1\106\12\24\23\0\1\24\4\0\4\24\3\0\1\24"+
    "\1\162\24\24\23\0\1\24\4\0\4\24\3\0\15\24"+
    "\1\155\10\24\23\0\1\24\4\0\4\24\3\0\1\24"+
    "\1\163\24\24\23\0\1\24\4\0\4\24\3\0\12\24"+
    "\1\164\13\24\23\0\1\24\4\0\4\24\3\0\20\24"+
    "\1\106\5\24\23\0\1\24\4\0\4\24\3\0\20\24"+
    "\1\127\5\24\23\0\1\24\4\0\4\24\3\0\22\24"+
    "\1\165\3\24\23\0\1\24\4\0\4\24\3\0\12\24"+
    "\1\127\13\24\23\0\1\24\4\0\4\24\3\0\7\24"+
    "\1\106\16\24\23\0\1\24\4\0\4\24\3\0\12\24"+
    "\1\166\13\24\2\0\11\152\1\57\21\152\1\63\31\152"+
    "\21\0\1\24\4\0\4\24\3\0\17\24\1\167\6\24"+
    "\23\0\1\24\4\0\4\24\3\0\11\24\1\106\14\24"+
    "\23\0\1\24\4\0\4\24\3\0\10\24\1\170\15\24"+
    "\23\0\1\24\4\0\4\24\3\0\16\24\1\167\7\24"+
    "\23\0\1\24\4\0\4\24\3\0\12\24\1\171\13\24"+
    "\23\0\1\24\4\0\4\24\3\0\1\172\25\24\23\0"+
    "\1\24\4\0\4\24\3\0\3\24\1\173\22\24\23\0"+
    "\1\24\4\0\4\24\3\0\15\24\1\174\10\24\23\0"+
    "\1\24\4\0\4\24\3\0\17\24\1\175\6\24\23\0"+
    "\1\24\4\0\4\24\3\0\3\24\1\106\22\24\23\0"+
    "\1\24\4\0\4\24\3\0\21\24\1\106\4\24\23\0"+
    "\1\24\4\0\4\24\3\0\14\24\1\176\11\24\23\0"+
    "\1\24\4\0\4\24\3\0\12\24\1\116\13\24\23\0"+
    "\1\24\4\0\4\24\3\0\12\24\1\106\13\24\23\0"+
    "\1\24\4\0\4\24\3\0\1\106\25\24\23\0\1\24"+
    "\4\0\4\24\3\0\2\24\1\162\23\24\23\0\1\24"+
    "\4\0\4\24\3\0\14\24\1\106\11\24\23\0\1\24"+
    "\4\0\4\24\3\0\22\24\1\127\3\24\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5459];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\2\1\1\11\1\1\1\11"+
    "\3\1\2\11\6\1\2\11\20\1\3\11\1\0\1\1"+
    "\1\11\2\0\1\1\4\0\33\1\3\0\25\1\1\0"+
    "\1\11\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Token(TipoToken.Error, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 24: break;
          case 2:
            { /*Ignore*/
            }
          // fall through
          case 25: break;
          case 3:
            { lexeme=yytext(); return new Token(TipoToken.Comentario, yyline+1, yycolumn+1, lexeme);
            }
          // fall through
          case 26: break;
          case 4:
            { return new Token(TipoToken.Operador_Aritmetico, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 27: break;
          case 5:
            { return new Token(TipoToken.ParentesisA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 28: break;
          case 6:
            { return new Token(TipoToken.ParentesisC, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 29: break;
          case 7:
            { return new Token(TipoToken.Coma, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 30: break;
          case 8:
            { lexeme=yytext(); return new Token(TipoToken.Constante, yyline+1, yycolumn+1, lexeme);
            }
          // fall through
          case 31: break;
          case 9:
            { return new Token(TipoToken.DosPuntos, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 32: break;
          case 10:
            { return new Token(TipoToken.PuntoComa, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 33: break;
          case 11:
            { return new Token(TipoToken.Operador_Comparacion, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 34: break;
          case 12:
            { return new Token(TipoToken.Asignacion, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 35: break;
          case 13:
            { lexeme = yytext();
    return new Token(TipoToken.Identificador, yyline + 1, yycolumn + 1, lexeme);
            }
          // fall through
          case 36: break;
          case 14:
            { return new Token(TipoToken.CorchetesA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 37: break;
          case 15:
            { return new Token(TipoToken.CorchetesC, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 38: break;
          case 16:
            { return new Token(TipoToken.LlavesA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 39: break;
          case 17:
            { return new Token(TipoToken.LlavesC, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 40: break;
          case 18:
            { lexeme=yytext(); return new Token(TipoToken.Error, yyline+1, yycolumn+1, lexeme);
            }
          // fall through
          case 41: break;
          case 19:
            { lexeme=yytext(); return new Token(TipoToken.Cadena, yyline+1, yycolumn+1, lexeme);
            }
          // fall through
          case 42: break;
          case 20:
            { lexeme = yytext();
    return new Token(TipoToken.Error, yyline + 1, yycolumn + 1,  lexeme);
            }
          // fall through
          case 43: break;
          case 21:
            { lexeme=yytext(); return new Token(TipoToken.Palabra_Reservada, yyline+1, yycolumn+1, lexeme);
            }
          // fall through
          case 44: break;
          case 22:
            { return new Token(TipoToken.Operador_Logico, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 45: break;
          case 23:
            { return new Token(TipoToken.Boolean, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 46: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}