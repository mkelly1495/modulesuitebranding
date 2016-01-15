/**
 * MyClassWithBrandableText.java
 * Date Created: Jan 15, 2016
 */

package mil.navy.cbrd.mycoolmodule;

import org.openide.util.NbBundle.Messages;

/**
 *
 * @author Michael Kelly
 */
@Messages({
    "# {0} - Name of Person",
    "LBL_MY_BRANDABLE_TEXT=Hello There {0}"
})
public class MyClassWithBrandableText
{

    public String getGreeting(String name)
    {
        return Bundle.LBL_MY_BRANDABLE_TEXT(name);
    }
}
