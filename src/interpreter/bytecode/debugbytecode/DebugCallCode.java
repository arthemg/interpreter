/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter.bytecode.debugbytecode;

import interpreter.VirtualMachine;
import interpreter.debugger.DebuggerVM;
import interpreter.bytecode.CallCode;

/**
 *
 * @author Artsem
 */
public class DebugCallCode extends CallCode
{

    public DebugCallCode() 
    {
        this.byteCodeName = "DebugCallCode";
    }

    @Override
    public void execute(VirtualMachine vm) 
    {
        super.execute(vm);
        
        //Cast VirtualMachine into DebuggerVM
        DebuggerVM debugVM = (DebuggerVM) vm;
        
        //DebuggerVM execute
        debugVM.newFctEnvRecord();
        debugVM.setCurrentFct();
    }    
}
