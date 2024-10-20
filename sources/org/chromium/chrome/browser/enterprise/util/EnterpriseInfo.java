package org.chromium.chrome.browser.enterprise.util;

import J.N;
import defpackage.KB0;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EnterpriseInfo {
    public static KB0 a;

    public abstract void a(Callback callback);

    public abstract void c();

    public static EnterpriseInfo b() {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = new KB0();
        }
        return a;
    }

    public static void getManagedStateForNative() {
        b().a(new Callback() { // from class: EB0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                FB0 fb0 = (FB0) obj;
                if (fb0 == null) {
                    N.M2UZBg4a(false, false);
                } else {
                    N.M2UZBg4a(fb0.a, fb0.b);
                }
            }
        });
    }
}
