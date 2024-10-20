package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YR1 implements InterfaceC8030nY1 {
    public final Context a;

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        return AbstractC4563dS1.a((Uri) obj);
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri uri = (Uri) obj;
        return new C7686mY1(new R82(uri), new XR1(this.a, uri));
    }

    public YR1(Context context) {
        this.a = context;
    }
}
