package defpackage;

import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t73 */
/* loaded from: classes2.dex */
public final class C9952t73 implements InterfaceC8474op1 {
    public final WebContents a;
    public final InterfaceC7697ma2 b;

    public C9952t73(WebContents webContents) {
        this.a = webContents;
        WindowAndroid Q0 = webContents.Q0();
        K14 k14 = K63.k;
        this.b = (InterfaceC7697ma2) K63.k.e(Q0.t);
    }

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        return new C9266r73(this.a, new C9609s73(this));
    }
}
