package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6373ij extends RJ3 implements InterfaceC10158tk1 {
    public final int k;
    public final int l;
    public C10501uk1 m;
    public InterfaceC1422Ky1 n;
    public final C6030hj o;
    public boolean p;
    public boolean q;
    public final Context r;

    public C6373ij(Context context) {
        super(context);
        this.r = context;
        this.k = AbstractC11746yN.a(context, false);
        this.l = AbstractC11746yN.a(context, true);
        this.o = new C6030hj(this);
    }

    @Override // defpackage.InterfaceC10158tk1
    public final void b(boolean z) {
        this.p = z;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:            if ((defpackage.C1096Il0.a(r1) || defpackage.AbstractC5177fD3.b(r1) || defpackage.AbstractC5241fQ2.d(r1)) != false) goto L16;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r6 = this;
            boolean r0 = r6.p
            android.content.Context r1 = r6.r
            r2 = 0
            if (r0 == 0) goto L25
            boolean r0 = r6.q
            r3 = 1
            if (r0 == 0) goto L26
            boolean r0 = defpackage.C1096Il0.a(r1)
            boolean r4 = defpackage.AbstractC5177fD3.b(r1)
            boolean r5 = defpackage.AbstractC5241fQ2.d(r1)
            if (r0 != 0) goto L21
            if (r4 != 0) goto L21
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L25
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 == 0) goto L2b
            int r0 = r6.l
            goto L2d
        L2b:
            int r0 = r6.k
        L2d:
            r6.a(r0, r2)
            if (r3 == 0) goto L34
            r0 = 2
            goto L35
        L34:
            r0 = 3
        L35:
            android.content.res.ColorStateList r1 = defpackage.AbstractC3494aK3.c(r1, r0)
            r6.c(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6373ij.e():void");
    }

    public final void d() {
        this.i.clear();
        this.j.clear();
        C10501uk1 c10501uk1 = this.m;
        if (c10501uk1 != null) {
            c10501uk1.a.d(this);
            this.m = null;
        }
        InterfaceC1422Ky1 interfaceC1422Ky1 = this.n;
        if (interfaceC1422Ky1 != null) {
            ((C9897sy1) interfaceC1422Ky1).L(this.o);
            this.n = null;
        }
    }
}
