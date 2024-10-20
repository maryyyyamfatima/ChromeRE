package org.chromium.chrome.browser.printing;

import J.N;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.V60;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.printing.Printable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabPrinter implements Printable {
    public final WeakReference a;
    public final String b = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f14063c);
    public final String c = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140478);

    public static TabPrinter getPrintable(Tab tab) {
        return new TabPrinter(tab);
    }

    public TabPrinter(Tab tab) {
        this.a = new WeakReference(tab);
    }

    @Override // org.chromium.printing.Printable
    public final boolean c(int i, int i2) {
        if (b()) {
            return N.MmYX7nWa(((Tab) this.a.get()).b(), i, i2);
        }
        return false;
    }

    @Override // org.chromium.printing.Printable
    public final String getTitle() {
        Tab tab = (Tab) this.a.get();
        String str = this.b;
        if (tab != null && tab.isInitialized()) {
            String title = tab.getTitle();
            if (!TextUtils.isEmpty(title)) {
                return title;
            }
            String i = tab.getUrl().i();
            if (!TextUtils.isEmpty(i)) {
                return i;
            }
        }
        return str;
    }

    @Override // org.chromium.printing.Printable
    public final boolean b() {
        Tab tab = (Tab) this.a.get();
        return tab != null && tab.isInitialized();
    }

    @Override // org.chromium.printing.Printable
    public final String a() {
        return this.c;
    }
}
