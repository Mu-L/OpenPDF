package org.openpdf.renderer.function.postscript.operation;

import java.util.Stack;

final class IfElse implements PostScriptOperation {
	@Override
	/**
	 * <i>bool {expr1} {expr2}</i> <b>ifelse</b> - <p>
	 *
	 * removes all three operands from the stack, then
	 * executes proc1 if bool is true or proc2 if bool is false.
	 * The ifelse operator pushes no results of its own on the
	 * operand stack, but the procedure it executes may do so
	 * (see Section 3.5, "Execution"). <p>
	 *
	 * Examples <p>
	 * 4 3 lt {(TruePart)} {(FalsePart)} ifelse <br>
	 * results in FalsePart, since 4 is not less than 3 <p>
	 *
	 * errors: stackunderflow, typecheck
	 */
    public void eval(Stack<Object> environment) {
        // Pop boolean condition, discard it
        environment.pop();
        // Pop result of true/false expression
        environment.pop();
    }

}
