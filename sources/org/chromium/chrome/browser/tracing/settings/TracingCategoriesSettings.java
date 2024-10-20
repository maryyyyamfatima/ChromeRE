package org.chromium.chrome.browser.tracing.settings;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import defpackage.AbstractC0123Ay2;
import defpackage.C1293Jy2;
import defpackage.C9727sU3;
import defpackage.InterfaceC9213qy2;
import defpackage.O83;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TracingCategoriesSettings extends AbstractC0123Ay2 implements InterfaceC9213qy2 {
    public int j0;
    public HashSet k0;
    public ArrayList l0;
    public ChromeBaseCheckBoxPreference m0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle("Select categories");
        C1293Jy2 c1293Jy2 = this.c0;
        PreferenceScreen a = c1293Jy2.a(c1293Jy2.a);
        a.W = true;
        this.j0 = this.l.getInt("type");
        this.k0 = new HashSet(TracingSettings.R0(this.j0));
        this.l0 = new ArrayList();
        ArrayList arrayList = new ArrayList(C9727sU3.a().d);
        Collections.sort(arrayList);
        ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference = new ChromeBaseCheckBoxPreference(this.c0.a, null);
        this.m0 = chromeBaseCheckBoxPreference;
        chromeBaseCheckBoxPreference.K("select-all");
        this.m0.R("Select all");
        Preference preference = this.m0;
        preference.x = false;
        preference.j = this;
        a.W(preference);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("disabled-by-default-") == this.j0) {
                ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference2 = new ChromeBaseCheckBoxPreference(this.c0.a, null);
                chromeBaseCheckBoxPreference2.K(str2);
                chromeBaseCheckBoxPreference2.R(str2.startsWith("disabled-by-default-") ? str2.substring(20) : str2);
                chromeBaseCheckBoxPreference2.W(this.k0.contains(str2));
                chromeBaseCheckBoxPreference2.x = false;
                chromeBaseCheckBoxPreference2.j = this;
                this.l0.add(chromeBaseCheckBoxPreference2);
                a.W(chromeBaseCheckBoxPreference2);
            }
        }
        this.m0.W(this.k0.size() == this.l0.size());
        Q0(a);
    }

    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!TextUtils.equals("select-all", preference.q)) {
            if (booleanValue) {
                this.k0.add(preference.q);
            } else {
                this.k0.remove(preference.q);
            }
            this.m0.W(this.k0.size() == this.l0.size());
            int i = this.j0;
            HashSet hashSet = this.k0;
            LinkedHashMap linkedHashMap = TracingSettings.p0;
            HashSet hashSet2 = new HashSet(hashSet);
            for (String str : TracingSettings.S0()) {
                if (i != str.startsWith("disabled-by-default-")) {
                    hashSet2.add(str);
                }
            }
            O83.a.u("tracing_categories", hashSet2);
            return true;
        }
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            ChromeBaseCheckBoxPreference chromeBaseCheckBoxPreference = (ChromeBaseCheckBoxPreference) it.next();
            chromeBaseCheckBoxPreference.W(booleanValue);
            chromeBaseCheckBoxPreference.f(Boolean.valueOf(chromeBaseCheckBoxPreference.T));
        }
        return true;
    }
}
