package defpackage;

import android.content.Context;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class RR {
    public static InterfaceC11522xj a;

    public static void c() {
        byte[] bArr = SR.a;
        byte[] bArr2 = SR.b;
        if (AbstractC3641al4.a == null) {
            AbstractC3641al4.a = bArr;
        }
        if (AbstractC3641al4.b == null) {
            AbstractC3641al4.b = bArr2;
        }
        if (AX.e().g("skip-webapk-verification")) {
            AbstractC3641al4.d = true;
        }
    }

    public static void a(String str, InterfaceC4322ck4 interfaceC4322ck4) {
        Object obj = ThreadUtils.a;
        if (a == null) {
            QR qr = new QR();
            a = qr;
            ApplicationStatus.d(qr);
        }
        QF3 qf3 = AbstractC5103f04.a;
        if (C4666dk4.b == null) {
            C4666dk4.b = new C4666dk4(qf3);
        }
        C4666dk4 c4666dk4 = C4666dk4.b;
        Context context = V60.a;
        c4666dk4.getClass();
        c4666dk4.a.a(context, str, new C3979bk4(context, str, interfaceC4322ck4));
    }

    public static void b(boolean z) {
        boolean z2;
        if (z) {
            C11876yk4 c11876yk4 = C11876yk4.b;
            boolean z3 = false;
            if (c11876yk4 != null) {
                Iterator it = c11876yk4.a.f.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    } else if (!((Fk4) it.next()).g.isEmpty()) {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    z3 = true;
                }
            }
            if (z3) {
                PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: PR
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = V60.a;
                        C4666dk4 c4666dk4 = C4666dk4.b;
                        if (c4666dk4 != null) {
                            c4666dk4.a.b(context);
                        }
                        C11876yk4 c11876yk42 = C11876yk4.b;
                        if (c11876yk42 == null) {
                            return;
                        }
                        c11876yk42.a.b(V60.a);
                    }
                }, 1000L);
                return;
            }
        }
        Context context = V60.a;
        C4666dk4 c4666dk4 = C4666dk4.b;
        if (c4666dk4 != null) {
            c4666dk4.a.b(context);
        }
        C11876yk4 c11876yk42 = C11876yk4.b;
        if (c11876yk42 == null) {
            return;
        }
        c11876yk42.a.b(V60.a);
    }
}
