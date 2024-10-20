package defpackage;

import android.os.Looper;
import com.google.android.gms.cast.SessionState;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R43 {
    public static final C4856eI1 h = new C4856eI1("SessionTransController");
    public I43 e;
    public C6215iF f;
    public SessionState g;
    public final HashSet a = new HashSet();
    public int d = 0;
    public final HandlerC10413uU3 b = new HandlerC10413uU3(Looper.getMainLooper());
    public final O43 c = new Runnable() { // from class: O43
        @Override // java.lang.Runnable
        public final void run() {
            R43 r43 = R43.this;
            R43.h.f("transfer with type = %d has timed out", Integer.valueOf(r43.d));
            r43.b(101);
        }
    };

    public final void b(int i) {
        C6215iF c6215iF = this.f;
        if (c6215iF != null) {
            c6215iF.d = true;
            C7589mF c7589mF = c6215iF.b;
            if (c7589mF != null && c7589mF.g.cancel(true)) {
                c6215iF.a = null;
                c6215iF.b = null;
                c6215iF.c = null;
            }
        }
        h.a("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.d), Integer.valueOf(i));
        Iterator it = new HashSet(this.a).iterator();
        if (!it.hasNext()) {
            this.b.removeCallbacks(this.c);
            this.d = 0;
            this.g = null;
            a();
            return;
        }
        X5.a(it.next());
        throw null;
    }

    public final void a() {
        I43 i43 = this.e;
        C4856eI1 c4856eI1 = h;
        if (i43 == null) {
            c4856eI1.a("skip detaching as sessionManager is null", new Object[0]);
            return;
        }
        c4856eI1.a("detach from CastSession", new Object[0]);
        E43 c = this.e.c();
        QH qh = (c == null || !(c instanceof QH)) ? null : (QH) c;
        if (qh != null) {
            synchronized (qh) {
                qh.j = null;
            }
        }
    }
}
