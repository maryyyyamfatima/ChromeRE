package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JN0 implements InterfaceC3999bo0 {
    public final InterfaceC10590uz3 a;
    public final C3511aO0 b;

    public JN0(InterfaceC10590uz3 interfaceC10590uz3, C3511aO0 c3511aO0) {
        this.a = interfaceC10590uz3;
        this.b = c3511aO0;
    }

    @Override // defpackage.InterfaceC3999bo0
    public final boolean a(String str, Bundle bundle, C2925Wn0 c2925Wn0) {
        if (!"find_in_page".equals(str)) {
            return false;
        }
        Tab h = ((AbstractC11276wz3) this.a).h();
        if (!((h == null || h.isNativePage() || h.b() == null) ? false : true)) {
            return false;
        }
        C3511aO0 c3511aO0 = this.b;
        c3511aO0.b();
        String string = bundle.getString("SEARCH_QUERY", "");
        if (!TextUtils.isEmpty(string)) {
            c3511aO0.a.g.setText(string);
        }
        c2925Wn0.onResult(Bundle.EMPTY);
        return true;
    }

    @Override // defpackage.InterfaceC3999bo0
    public final void b(C3185Yn0 c3185Yn0) {
        Tab h = ((AbstractC11276wz3) this.a).h();
        if ((h == null || h.isNativePage() || h.b() == null) ? false : true) {
            c3185Yn0.a("find_in_page").a("SEARCH_QUERY", 0, true);
        }
    }
}
