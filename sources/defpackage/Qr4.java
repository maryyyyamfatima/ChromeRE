package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.v;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Qr4 {
    public final C11146wd2 a;

    public Qr4(final Context context, final InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1) {
        AbstractC3733b12.e = new InterfaceC8940qA1() { // from class: Nr4
            /* JADX WARN: Code restructure failed: missing block: B:76:0x021e, code lost:            if (r0 == false) goto L62;     */
            /* JADX WARN: Removed duplicated region for block: B:40:0x011d A[Catch: Exception -> 0x01b1, TRY_LEAVE, TryCatch #3 {Exception -> 0x01b1, blocks: (B:28:0x00ec, B:30:0x00f2, B:32:0x00f6, B:34:0x0102, B:36:0x0110, B:40:0x011d, B:44:0x0127, B:46:0x0130, B:48:0x0138, B:50:0x015c, B:54:0x0167, B:56:0x016d, B:59:0x0189), top: B:27:0x00ec }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
            @Override // defpackage.InterfaceC8940qA1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.String r23) {
                /*
                    Method dump skipped, instructions count: 609
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Nr4.a(java.lang.String):void");
            }
        };
        this.a = new C11146wd2(new InterfaceC2909Wk() { // from class: Or4
            @Override // defpackage.InterfaceC2909Wk
            public final RD1 call() {
                try {
                    AbstractC0901Gy0.a();
                    return C9803si1.g;
                } catch (Throwable th) {
                    Runnable runnable = new Runnable() { // from class: Pr4
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj = AbstractC10711vL3.a;
                            Throwable th2 = th;
                            if (th2 instanceof RuntimeException) {
                                throw ((RuntimeException) th2);
                            }
                            if (!(th2 instanceof Error)) {
                                throw new AssertionError(th2);
                            }
                            throw ((Error) th2);
                        }
                    };
                    int i = AbstractC4575dU3.a;
                    interfaceScheduledExecutorServiceC4493dE1.execute(new XT3(AbstractC6294iU3.g(), runnable));
                    return new v(th);
                }
            }
        }, interfaceScheduledExecutorServiceC4493dE1);
    }
}
