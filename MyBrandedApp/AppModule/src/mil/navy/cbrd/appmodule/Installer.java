/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mil.navy.cbrd.appmodule;

import mil.navy.cbrd.mycoolmodule.MyClassWithBrandableText;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.modules.ModuleInstall;
import org.openide.windows.WindowManager;

public class Installer extends ModuleInstall
{

    @Override
    public void restored()
    {
//        WindowManager.getDefault().invokeWhenUIReady(() -> {
//            MyClassWithBrandableText obj = new MyClassWithBrandableText();
//
//            DialogDescriptor dd = new DialogDescriptor(null, obj.getGreeting("Mike Kelly"));
//
//            DialogDisplayer.getDefault().notifyLater(dd);
//        });
    }

}
