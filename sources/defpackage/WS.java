package defpackage;

import J.N;
import android.app.Activity;
import android.widget.Button;
import androidx.preference.Preference;
import com.android.chrome.R;
import org.chromium.chrome.browser.browsing_data.BrowsingDataBridge;
import org.chromium.chrome.browser.browsing_data.BrowsingDataCounterBridge;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataCheckBoxPreference;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WS implements InterfaceC4829eD, InterfaceC9555ry2 {
    public final ClearBrowsingDataFragment a;
    public final int g;
    public final ClearBrowsingDataCheckBoxPreference h;
    public final BrowsingDataCounterBridge i;
    public boolean j;

    public WS(Activity activity, ClearBrowsingDataFragment clearBrowsingDataFragment, int i, ClearBrowsingDataCheckBoxPreference clearBrowsingDataCheckBoxPreference, boolean z, boolean z2) {
        int i2;
        this.a = clearBrowsingDataFragment;
        this.g = i;
        this.h = clearBrowsingDataCheckBoxPreference;
        this.i = new BrowsingDataCounterBridge(this, ClearBrowsingDataFragment.U0(i), clearBrowsingDataFragment.T0());
        clearBrowsingDataCheckBoxPreference.k = this;
        clearBrowsingDataCheckBoxPreference.G(z2);
        clearBrowsingDataCheckBoxPreference.W(z);
        if (clearBrowsingDataFragment.N().getConfiguration().smallestScreenWidthDp >= 360) {
            if (i == 0) {
                i2 = R.drawable.f50700_resource_name_obfuscated_res_0x7f09034a;
            } else if (i == 1) {
                i2 = R.drawable.f51990_resource_name_obfuscated_res_0x7f090400;
            } else if (i == 2) {
                i2 = R.drawable.f47210_resource_name_obfuscated_res_0x7f0901dd;
            } else if (i == 3) {
                i2 = R.drawable.f50650_resource_name_obfuscated_res_0x7f090345;
            } else if (i == 4) {
                i2 = R.drawable.f47430_resource_name_obfuscated_res_0x7f0901f3;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException();
                }
                i2 = R.drawable.f50500_resource_name_obfuscated_res_0x7f090333;
            }
            clearBrowsingDataCheckBoxPreference.J(L53.c(activity, i2));
        }
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        int i = ClearBrowsingDataFragment.o0;
        ClearBrowsingDataFragment clearBrowsingDataFragment = this.a;
        ((Button) clearBrowsingDataFragment.L.findViewById(R.id.clear_button)).setEnabled(!clearBrowsingDataFragment.X0().isEmpty());
        this.j = true;
        BrowsingDataBridge b = BrowsingDataBridge.b();
        int U0 = ClearBrowsingDataFragment.U0(this.g);
        int T0 = clearBrowsingDataFragment.T0();
        boolean z = this.h.T;
        b.getClass();
        N.MBI7g3zY(b, U0, T0, z);
        return true;
    }
}
