<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aceofspades;

import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/**
 *
 * @author Wryxo
 */
public class LoadScript {
    LuaState luaState;
    /**
    * Constructor
    * @param fileName File name with Lua script.
    */
    LoadScript(final String fileName) {
        this.luaState = LuaStateFactory.newLuaState();
        this.luaState.openLibs();
        this.luaState.LdoFile(fileName);
    }
    /**
    * Ends the use of Lua environment.
    */
    void closeScript() {
        this.luaState.close();
    }
    /**
    * Call a Lua function inside the Lua script to insert
    * data into a Java object passed as parameter
    * @param functionName Name of Lua function.
    * @param obj A Java object.
    */
    void runScriptFunction(String functionName, Object obj) {
        this.luaState.getGlobal(functionName);
        this.luaState.pushJavaObject(obj);
        this.luaState.call(1, 0);
    }
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aceofspades;

import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/**
 *
 * @author Wryxo
 */
public class LoadScript {
    LuaState luaState;
    /**
    * Constructor
    * @param fileName File name with Lua script.
    */
    LoadScript(final String fileName) {
        this.luaState = LuaStateFactory.newLuaState();
        this.luaState.openLibs();
        this.luaState.LdoFile(fileName);
    }
    /**
    * Ends the use of Lua environment.
    */
    void closeScript() {
        this.luaState.close();
    }
    /**
    * Call a Lua function inside the Lua script to insert
    * data into a Java object passed as parameter
    * @param functionName Name of Lua function.
    * @param obj A Java object.
    */
    void runScriptFunction(String functionName, Object obj) {
        this.luaState.getGlobal(functionName);
        this.luaState.pushJavaObject(obj);
        this.luaState.call(1, 0);
    }
>>>>>>> c5644acce73a0b94e7c5be1adcbee7f17b7e2c45
}