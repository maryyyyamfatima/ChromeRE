package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fk3 */
/* loaded from: classes.dex */
public final class C5352fk3 {
    public static final C7569mB e = new C7569mB("PaintPreviewShowOnStartup", "has_accessibility_support", true);
    public static boolean f;
    public final long a;
    public final CC b;
    public final InterfaceC0079Ap3 c;
    public final C12157za2 d = new C12157za2();

    public C5352fk3(C10285u6 c10285u6, long j, CC cc, AbstractC11276wz3 abstractC11276wz3, boolean z, FQ fq) {
        this.a = j;
        this.b = cc;
        this.c = fq;
        C7851n02 c7851n02 = C7851n02.i;
        Context context = (Context) c10285u6.j.get();
        c7851n02.getClass();
        if (C7851n02.a(context) || z) {
            f = false;
        }
        abstractC11276wz3.c(new C4665dk3(abstractC11276wz3, c10285u6));
    }
}
