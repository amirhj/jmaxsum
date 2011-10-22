/*
 *  Copyright (C) 2011 Michele Roncalli <roncallim at gmail dot com>
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package test;

/**
 *
 * @author Michele Roncalli <roncallim at gmail dot com>
 */
public class DebugVerbosity {

    public static final int debug = 0;

    public static final int debugNodeVariable = 0
            + DebugVerbosity.debug;
    public static final int debugNodeFunction = 0
            + DebugVerbosity.debug;

    public static final int debugFunctionEvaluator = 0
            + DebugVerbosity.debug;

    public static final int debugTabularFunction = 3
            + DebugVerbosity.debug;

    public static final int debugAgent = 0
            + DebugVerbosity.debug;

    public static final int debugMessageArrayDouble = 0
            + DebugVerbosity.debug;

    public static final int debugMessageFactoryArrayDouble = 0
            + DebugVerbosity.debug;

    public static final int debugMessageQArrayDouble = 0
            + DebugVerbosity.debug;

    public static final int debugMessageRArrayDouble = 0
            + DebugVerbosity.debug;

    public static final int debugMaxSumOperator = 0
            + DebugVerbosity.debug;

    public static final int debugOPlus_MaxSum = 0
            + DebugVerbosity.debug;

    public static final int debugOTimes_MaxSum = 0
            + DebugVerbosity.debug;

    public static final int debugCerbero = 0
            + DebugVerbosity.debug;

    public static final int debugCore = 0
            + DebugVerbosity.debug;

    public static final int debugMain = 1
            + DebugVerbosity.debug;
    
    public static final int debugRMessageList = 0
            + DebugVerbosity.debug;

    public static final int debugScrewerUp = 0
            + DebugVerbosity.debug;

    public static final int debugClonedMSInstance = 0
            + DebugVerbosity.debug;
    public static final int debugInstanceCloner = 3
            + DebugVerbosity.debug;
}
