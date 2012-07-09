package org.lunifera.metamodel.dsl.entity.jvmmodel;

import org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.lentity.LowerBound;
import org.lunifera.metamodel.dsl.entity.lentity.UpperBound;

/**
 * Keeps lower and upper bound
 */
public class Bounds {

	private final LowerBound lower;
	private final UpperBound upper;

	public static Bounds createFor(LMultiplicity multiplicity) {
		if (multiplicity == null) {
			return new Bounds(LowerBound.ZERO, UpperBound.ONE);
		}

		LowerBound lbS = multiplicity.getLower();
		UpperBound ubS = multiplicity.getUpper();
		LowerBound lower = null;
		UpperBound upper = null;
		if (ubS == null || ubS.equals("")) {
			if (lbS == LowerBound.OPTIONAL) {
				lower = LowerBound.ZERO;
				upper = UpperBound.ONE;
			} else if (lbS == LowerBound.ATLEASTONE) {
				lower = LowerBound.ONE;
				upper = UpperBound.ONE;
			} else if (lbS == LowerBound.MANY) {
				lower = LowerBound.ZERO;
				upper = UpperBound.MANY;
			} else {
				lower = LowerBound.ZERO;
				upper = UpperBound.MANY;
			}
		} else {
			boolean ignoreUpper = false;
			if (lbS == LowerBound.ZERO) {
				lower = LowerBound.ZERO;
			} else if (lbS == LowerBound.ONE) {
				lower = LowerBound.ONE;
			} else if (lbS == LowerBound.OPTIONAL) {
				ignoreUpper = true;
				lower = LowerBound.ZERO;
				upper = UpperBound.ONE;
			} else if (lbS == LowerBound.ATLEASTONE) {
				ignoreUpper = true;
				lower = LowerBound.ONE;
				upper = UpperBound.MANY;
			} else if (lbS == LowerBound.MANY) {
				ignoreUpper = true;
				lower = LowerBound.ZERO;
				upper = UpperBound.MANY;
			} else {
				lower = LowerBound.ZERO;
			}

			if (!ignoreUpper) {
				if (ubS == UpperBound.ONE) {
					upper = UpperBound.ONE;
				} else if (ubS == UpperBound.MANY) {
					upper = UpperBound.MANY;
				} else {
					upper = UpperBound.MANY;
				}
			}
		}

		return new Bounds(lower, upper);
	}

	public Bounds(LowerBound lower, UpperBound upper) {
		super();
		this.lower = lower;
		this.upper = upper;
	}

	public LowerBound getLower() {
		return lower;
	}

	public UpperBound getUpper() {
		return upper;
	}

	/**
	 * Returns true if the upper bound is many.
	 * 
	 * @return
	 */
	public boolean isToMany() {
		return upper == UpperBound.MANY;
	}

	/**
	 * Returns true if the lower bound is one.
	 * 
	 * @return
	 */
	public boolean isRequired() {
		return lower == LowerBound.ONE;
	}

	/**
	 * Returns true if the lower bound is zero.
	 * 
	 * @return
	 */
	public boolean isOptional() {
		return lower == LowerBound.ZERO;
	}
}
