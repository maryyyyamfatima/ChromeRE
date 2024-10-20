package com.google.android.libraries.elements.converters.ddc;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.AbstractC9095qe2;
import defpackage.AbstractC9896sy0;
import defpackage.C0806Gf0;
import defpackage.C2202Qy2;
import defpackage.C2755Vf0;
import defpackage.C9183qt0;
import defpackage.EnumC11438xU;
import defpackage.InterfaceC9738sX;
import defpackage.InterfaceC9989tE2;
import defpackage.RP0;
import defpackage.U80;
import defpackage.WV;
import defpackage.XV;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b {
    public final AbstractC9896sy0 a;
    public final C2755Vf0 b;
    public final InterfaceC9989tE2 c;
    public final XV d;
    public final InterfaceC9738sX e;

    public b(C0806Gf0 c0806Gf0, C2755Vf0 c2755Vf0, AbstractC9896sy0 abstractC9896sy0, XV xv, InterfaceC9738sX interfaceC9738sX) {
        this.c = c0806Gf0;
        this.b = c2755Vf0;
        this.a = abstractC9896sy0;
        this.d = xv;
        this.e = interfaceC9738sX;
    }

    public final CollectionDataSource a(WV wv, U80 u80, AbstractC9095qe2 abstractC9095qe2, String str) {
        C2202Qy2 c2202Qy2;
        C9183qt0 c9183qt0;
        if (wv == null) {
            return null;
        }
        boolean c = abstractC9095qe2.c();
        EnumC11438xU enumC11438xU = EnumC11438xU.z;
        AbstractC9896sy0 abstractC9896sy0 = this.a;
        if (!c) {
            abstractC9896sy0.a(enumC11438xU, "Error getting ByteStore");
            return null;
        }
        if (str == null) {
            abstractC9896sy0.a(enumC11438xU, "Unique collection key is required");
            return null;
        }
        ByteBuffer f = wv.f(4);
        byte[] bArr = new byte[f.remaining()];
        f.get(bArr);
        CompositeDataSourceListener compositeDataSourceListener = (CompositeDataSourceListener) this.c.get();
        ByteStore byteStore = (ByteStore) ((InterfaceC9989tE2) abstractC9095qe2.b()).get();
        this.b.getClass();
        StatusOr delegate = DataSourceDelegate.getDelegate(bArr, compositeDataSourceListener, byteStore, str);
        if (!delegate.a()) {
            abstractC9896sy0.d(enumC11438xU, "Error getting DataSourceDelegate", u80, delegate.b().asException());
            return null;
        }
        DataSourceDelegate dataSourceDelegate = (DataSourceDelegate) delegate.c();
        if (dataSourceDelegate == null) {
            abstractC9896sy0.d(EnumC11438xU.A, "Received null DataSourceDelegate from JNI", u80, null);
            return null;
        }
        C2202Qy2 c2202Qy22 = new C2202Qy2();
        int b = wv.b(6);
        if (b != 0) {
            c2202Qy22.c(wv.a(b + wv.a), wv.b);
            c2202Qy2 = c2202Qy22;
        } else {
            c2202Qy2 = null;
        }
        C9183qt0 c9183qt02 = new C9183qt0();
        int b2 = wv.b(8);
        if (b2 != 0) {
            c9183qt02.c(wv.a(b2 + wv.a), wv.b);
            c9183qt0 = c9183qt02;
        } else {
            c9183qt0 = null;
        }
        RP0 rp0 = (RP0) this.d.a.get();
        XV.a(1, rp0);
        XV.a(4, compositeDataSourceListener);
        return new CollectionDataSourceImpl(rp0, u80, dataSourceDelegate, compositeDataSourceListener, c2202Qy2, c9183qt0);
    }
}
