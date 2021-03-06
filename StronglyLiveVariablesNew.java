

import java.util.List;

import soot.Unit;

/**
 * Provides an interface for querying the expressions that are very busy
 * before and after a unit in a method.
 *
 */
public interface StronglyLiveVariablesNew {    
    /**
     *   Returns the list of expressions that are very busy before the specified
     *   Unit. 
     *   @param s the Unit that defines this query.
     *   @return a list of expressions that are busy before the specified unit in the method.
     */
    public List getLiveVariablesBefore(Unit s);

    /**
     *   Returns the list of expressions that are very busy after the specified
     *   Unit. 
     *   @param s the Unit that defines this query.
     *   @return a list of expressions that are very busy after the specified unit in the method.
     */
    public List getLiveVariablesAfter(Unit s);
}
