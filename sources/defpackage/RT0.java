package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.c;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RT0 {
    public static final QT0 a = QT0.c;

    public static QT0 a(c cVar) {
        while (cVar != null) {
            if (cVar.W()) {
                cVar.M();
            }
            cVar = cVar.A;
        }
        return a;
    }

    public static final void c(c cVar, String str) {
        AbstractC0087Ar1.e(cVar, "fragment");
        AbstractC0087Ar1.e(str, "previousFragmentId");
        C12120zT0 c12120zT0 = new C12120zT0(cVar, str);
        QT0 a2 = a(cVar);
        if (a2.a.contains(PT0.DETECT_FRAGMENT_REUSE) && d(a2, cVar.getClass(), C12120zT0.class)) {
            b(a2, c12120zT0);
        }
    }

    public static boolean d(QT0 qt0, Class cls, Class cls2) {
        Set set = (Set) qt0.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC0087Ar1.a(cls2.getSuperclass(), AbstractC5667gf4.class) || !AbstractC11791yW.a(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    public static void b(QT0 qt0, final AbstractC5667gf4 abstractC5667gf4) {
        c cVar = abstractC5667gf4.a;
        final String name = cVar.getClass().getName();
        PT0 pt0 = PT0.PENALTY_LOG;
        Set set = qt0.a;
        set.contains(pt0);
        if (set.contains(PT0.PENALTY_DEATH)) {
            Runnable runnable = new Runnable() { // from class: OT0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC5667gf4 abstractC5667gf42 = abstractC5667gf4;
                    AbstractC0087Ar1.e(abstractC5667gf42, "$violation");
                    Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + name, abstractC5667gf42);
                    throw abstractC5667gf42;
                }
            };
            if (cVar.W()) {
                Handler handler = cVar.M().u.h;
                AbstractC0087Ar1.d(handler, "fragment.parentFragmentManager.host.handler");
                if (AbstractC0087Ar1.a(handler.getLooper(), Looper.myLooper())) {
                    runnable.run();
                    throw null;
                }
                handler.post(runnable);
                return;
            }
            runnable.run();
            throw null;
        }
    }
}
