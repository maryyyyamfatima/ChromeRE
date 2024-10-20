package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hp0 */
/* loaded from: classes.dex */
public abstract class AbstractC0986Hp0 extends AbstractRunnableC4843eF3 {
    public int h;

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract InterfaceC8927q80 c();

    public Object f(Object obj) {
        return obj;
    }

    public abstract Object h();

    public Throwable e(Object obj) {
        OZ oz = obj instanceof OZ ? (OZ) obj : null;
        if (oz == null) {
            return null;
        }
        return oz.a;
    }

    public AbstractC0986Hp0(int i) {
        super(0L, VF3.f);
        this.h = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:            r5 = (defpackage.InterfaceC10555ut1) r5.b(defpackage.C10212tt1.a);     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            p14 r0 = defpackage.C8546p14.a
            lF3 r1 = r12.g
            q80 r2 = r12.c()     // Catch: java.lang.Throwable -> L84
            Fp0 r2 = (defpackage.C0726Fp0) r2     // Catch: java.lang.Throwable -> L84
            q80 r3 = r2.j     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.l     // Catch: java.lang.Throwable -> L84
            E90 r4 = r3.getContext()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = defpackage.AbstractC9334rK3.b(r4, r2)     // Catch: java.lang.Throwable -> L84
            Vs3 r5 = defpackage.AbstractC9334rK3.a     // Catch: java.lang.Throwable -> L84
            if (r2 == r5) goto L1d
            defpackage.I90.b(r3, r4)     // Catch: java.lang.Throwable -> L84
        L1d:
            E90 r5 = r3.getContext()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r12.h()     // Catch: java.lang.Throwable -> L59
            java.lang.Throwable r7 = r12.e(r6)     // Catch: java.lang.Throwable -> L59
            r8 = 0
            if (r7 != 0) goto L41
            int r9 = r12.h     // Catch: java.lang.Throwable -> L59
            r10 = 1
            if (r9 == r10) goto L36
            r11 = 2
            if (r9 != r11) goto L35
            goto L36
        L35:
            r10 = 0
        L36:
            if (r10 == 0) goto L41
            tt1 r9 = defpackage.C10212tt1.a     // Catch: java.lang.Throwable -> L59
            B90 r5 = r5.b(r9)     // Catch: java.lang.Throwable -> L59
            ut1 r5 = (defpackage.InterfaceC10555ut1) r5     // Catch: java.lang.Throwable -> L59
            goto L42
        L41:
            r5 = r8
        L42:
            if (r5 == 0) goto L5b
            boolean r9 = r5.c()     // Catch: java.lang.Throwable -> L59
            if (r9 != 0) goto L5b
            java.util.concurrent.CancellationException r5 = r5.i()     // Catch: java.lang.Throwable -> L59
            r12.a(r6, r5)     // Catch: java.lang.Throwable -> L59
            OP2 r5 = defpackage.SP2.a(r5)     // Catch: java.lang.Throwable -> L59
            r3.d(r5)     // Catch: java.lang.Throwable -> L59
            goto L6c
        L59:
            r3 = move-exception
            goto L80
        L5b:
            if (r7 == 0) goto L65
            OP2 r5 = defpackage.SP2.a(r7)     // Catch: java.lang.Throwable -> L59
            r3.d(r5)     // Catch: java.lang.Throwable -> L59
            goto L6c
        L65:
            java.lang.Object r5 = r12.f(r6)     // Catch: java.lang.Throwable -> L59
            r3.d(r5)     // Catch: java.lang.Throwable -> L59
        L6c:
            defpackage.AbstractC9334rK3.a(r4, r2)     // Catch: java.lang.Throwable -> L84
            r1.getClass()     // Catch: java.lang.Throwable -> L73
            goto L78
        L73:
            r0 = move-exception
            OP2 r0 = defpackage.SP2.a(r0)
        L78:
            java.lang.Throwable r0 = defpackage.PP2.a(r0)
            r12.g(r8, r0)
            goto L95
        L80:
            defpackage.AbstractC9334rK3.a(r4, r2)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L84:
            r2 = move-exception
            r1.getClass()     // Catch: java.lang.Throwable -> L89
            goto L8e
        L89:
            r0 = move-exception
            OP2 r0 = defpackage.SP2.a(r0)
        L8e:
            java.lang.Throwable r0 = defpackage.PP2.a(r0)
            r12.g(r2, r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0986Hp0.run():void");
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC4492dE0.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC0087Ar1.b(th);
        O90.a(c().getContext(), new S90("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}
