package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ti1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2511Ti1 {
    public final InterfaceC10590uz3 a;
    public final C2381Si1 b;
    public final C3063Xo3 c;

    public C2511Ti1(InterfaceC10590uz3 interfaceC10590uz3, C3063Xo3 c3063Xo3) {
        this.c = c3063Xo3;
        this.a = interfaceC10590uz3;
        C2381Si1 c2381Si1 = new C2381Si1(this);
        this.b = c2381Si1;
        ((AbstractC11276wz3) interfaceC10590uz3).j(false).g(c2381Si1);
    }

    public static void a(final C2511Ti1 c2511Ti1, Tab tab) {
        boolean z = false;
        TabModel j = ((AbstractC11276wz3) c2511Ti1.a).j(false);
        int i = 0;
        while (true) {
            if (i >= j.getCount()) {
                z = true;
                break;
            }
            Tab tabAt = j.getTabAt(i);
            if (tabAt.getId() != tab.getId() && tabAt.z().i().equals(tab.z().i())) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C10307u93.o(new C2251Ri1(new Callback() { // from class: Qi1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str = (String) obj;
                    C2511Ti1 c2511Ti12 = C2511Ti1.this;
                    c2511Ti12.getClass();
                    if (str == null) {
                        return;
                    }
                    c2511Ti12.c.g(new CommerceSubscription(str, "CHROME_MANAGED", "OFFER_ID"), new C2327Rx2());
                }
            }), tab);
        }
    }
}
