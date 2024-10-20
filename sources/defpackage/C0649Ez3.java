package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ez3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649Ez3 extends L14 {
    public static final K14 k = new K14(C0649Ez3.class);

    public static Tab v(WindowAndroid windowAndroid) {
        InterfaceC7697ma2 u = u(windowAndroid);
        if (u != null) {
            C8385oa2 c8385oa2 = (C8385oa2) u;
            if (AbstractC12248zp3.a(c8385oa2)) {
                return ((AbstractC11276wz3) ((InterfaceC10590uz3) c8385oa2.g)).h();
            }
        }
        return null;
    }

    public C0649Ez3() {
        super(k);
    }

    public static InterfaceC7697ma2 u(WindowAndroid windowAndroid) {
        return (InterfaceC7697ma2) k.e(windowAndroid.t);
    }
}
