package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ImageProxyImplFbs;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CZ0 implements InterfaceC1915Ot0 {
    public final HashSet b = new HashSet();

    @Override // defpackage.InterfaceC1915Ot0
    public final void a(Context context, ImageProxyImplFbs imageProxyImplFbs, ImageProxyImplFbs imageProxyImplFbs2, ImageProxyImplFbs imageProxyImplFbs3, int i, int i2, C6386il0 c6386il0, AbstractC9896sy0 abstractC9896sy0, boolean z) {
        IN2 a = AbstractC3286Zh1.a(context, imageProxyImplFbs, imageProxyImplFbs2, imageProxyImplFbs3, i, i2, z);
        if (a != null) {
            C11414xP0 c11414xP0 = new C11414xP0(imageProxyImplFbs, c6386il0, i, i2, AbstractC3286Zh1.b(imageProxyImplFbs.contentMode()), abstractC9896sy0);
            a.H(c11414xP0, null, a, DE0.a);
            GN2 gn2 = c11414xP0.h;
            if (gn2 == null) {
                abstractC9896sy0.a(EnumC11438xU.v, "Unexpected null requester");
            } else {
                this.b.add(gn2);
            }
        }
    }

    @Override // defpackage.InterfaceC1915Ot0
    public final void clear() {
        HashSet hashSet = this.b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((GN2) it.next()).clear();
        }
        hashSet.clear();
    }
}
