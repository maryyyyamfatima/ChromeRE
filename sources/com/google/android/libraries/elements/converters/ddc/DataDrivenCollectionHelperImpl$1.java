package com.google.android.libraries.elements.converters.ddc;

import com.google.android.libraries.elements.interfaces.Fetcher;
import com.google.android.libraries.elements.interfaces.FetcherFactory;
import defpackage.C1127Ir1;
import defpackage.C2254Rj;
import defpackage.C5563gM0;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.EnumC11438xU;
import defpackage.GL0;
import defpackage.InterfaceC2625Uf0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.VF0;
import defpackage.XF0;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class DataDrivenCollectionHelperImpl$1 extends FetcherFactory {
    final /* synthetic */ b this$0;
    final /* synthetic */ VF0 val$extension;
    final /* synthetic */ InterfaceC2625Uf0 val$factory;

    public DataDrivenCollectionHelperImpl$1(b bVar, VF0 vf0, InterfaceC2625Uf0 interfaceC2625Uf0) {
        this.this$0 = bVar;
        this.val$extension = vf0;
    }

    @Override // com.google.android.libraries.elements.interfaces.FetcherFactory
    public Fetcher create(int i, byte[] bArr) {
        try {
            XF0 d = XF0.d();
            GL0 gl0 = GL0.l;
            int length = bArr.length;
            GL0 gl02 = GL0.l;
            GL0 gl03 = new GL0();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(gl03.getClass());
                    b.f(gl03, bArr, 0, length + 0, new C2254Rj(d));
                    b.b(gl03);
                    if (gl03.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(gl03);
                    VF0 vf0 = this.val$extension;
                    vf0.getClass();
                    OX0 ox0 = (OX0) vf0;
                    gl03.v(ox0);
                    C5563gM0 c5563gM0 = gl03.j;
                    NX0 nx0 = ox0.d;
                    Object c = c5563gM0.c(nx0);
                    if (c == null) {
                        throw null;
                    }
                    nx0.getClass();
                    ox0.a(c);
                    throw null;
                } catch (IOException e) {
                    if (e.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e.getCause());
                    }
                    throw new C1127Ir1(e);
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (C1127Ir1 e2) {
                if (e2.g) {
                    throw new C1127Ir1(e2);
                }
                throw e2;
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            this.this$0.a.b(EnumC11438xU.z, "Error parsing Fetcher configuration", e4);
            return null;
        }
    }
}
