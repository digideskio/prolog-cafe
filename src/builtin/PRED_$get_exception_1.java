package jp.ac.kobe_u.cs.prolog.builtin;
import  jp.ac.kobe_u.cs.prolog.lang.*;
/**
 * <code>'$get_exception'/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class PRED_$get_exception_1 extends Predicate {
     Term arg1;

    public PRED_$get_exception_1(Term a1, Operation cont) {
	arg1 = a1;
	this.cont = cont;
    }

    public String toString() { return "$get_exception(" + arg1 + ")"; }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1;
	a1 = arg1;

	if (! a1.unify(engine.getException(), engine.trail))
	    return engine.fail();
	return cont;
    }
}
