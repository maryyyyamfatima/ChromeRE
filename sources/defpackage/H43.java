package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabsSessionToken;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H43 {
    public final InterfaceC3241Yy1 a;
    public final SparseArray b = new SparseArray();
    public C3265Zd0 c;
    public F43 d;

    public H43(InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = interfaceC3241Yy1;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [F43] */
    public final void b(C3265Zd0 c3265Zd0) {
        this.c = c3265Zd0;
        CustomTabsSessionToken u = c3265Zd0.a.u();
        if (u == null) {
            return;
        }
        SparseArray sparseArray = this.b;
        Activity activity = c3265Zd0.m;
        sparseArray.append(activity.getTaskId(), new G43(u, activity.getClass()));
        if (this.d != null) {
            return;
        }
        this.d = new Callback() { // from class: F43
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
                H43 h43 = H43.this;
                if (customTabsSessionToken == null) {
                    h43.getClass();
                    return;
                }
                int i = 0;
                while (true) {
                    SparseArray sparseArray2 = h43.b;
                    if (i >= sparseArray2.size()) {
                        return;
                    }
                    if (customTabsSessionToken.equals(((G43) sparseArray2.valueAt(i)).a)) {
                        sparseArray2.removeAt(i);
                    }
                    i++;
                }
            }
        };
        ((CustomTabsConnection) this.a.get()).g = this.d;
    }

    public final C3265Zd0 a(CustomTabsSessionToken customTabsSessionToken) {
        CustomTabsSessionToken u;
        C3265Zd0 c3265Zd0 = this.c;
        if (c3265Zd0 == null || (u = c3265Zd0.a.u()) == null || !u.equals(customTabsSessionToken)) {
            return null;
        }
        return this.c;
    }
}
