package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AF2 implements InterfaceC8030nY1 {
    public final Context a;
    public final InterfaceC8030nY1 b;
    public final InterfaceC8030nY1 c;
    public final Class d;

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC4563dS1.a((Uri) obj);
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri uri = (Uri) obj;
        return new C7686mY1(new R82(uri), new C12052zF2(this.a, this.b, this.c, uri, i, i2, c0543Ee2, this.d));
    }

    public AF2(Context context, InterfaceC8030nY1 interfaceC8030nY1, InterfaceC8030nY1 interfaceC8030nY12, Class cls) {
        this.a = context.getApplicationContext();
        this.b = interfaceC8030nY1;
        this.c = interfaceC8030nY12;
        this.d = cls;
    }
}
