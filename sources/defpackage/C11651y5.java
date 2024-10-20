package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11651y5 extends WeakReference {
    public final InterfaceC6098hu1 a;
    public final boolean b;
    public JO2 c;

    public C11651y5(InterfaceC6098hu1 interfaceC6098hu1, C12030zB0 c12030zB0, ReferenceQueue referenceQueue, boolean z) {
        super(c12030zB0, referenceQueue);
        JO2 jo2;
        AbstractC6464iy2.b(interfaceC6098hu1);
        this.a = interfaceC6098hu1;
        if (c12030zB0.a && z) {
            jo2 = c12030zB0.h;
            AbstractC6464iy2.b(jo2);
        } else {
            jo2 = null;
        }
        this.c = jo2;
        this.b = c12030zB0.a;
    }
}
