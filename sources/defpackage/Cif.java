package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: if, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class Cif {
    public static int a = -100;
    public static final C5348fk g = new C5348fk(0);
    public static final Object h = new Object();

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i);

    public abstract void j(int i);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);

    public static void m(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && a != i) {
            a = i;
            synchronized (h) {
                C5348fk c5348fk = g;
                c5348fk.getClass();
                C5004ek c5004ek = new C5004ek(c5348fk);
                while (c5004ek.hasNext()) {
                    Cif cif = (Cif) ((WeakReference) c5004ek.next()).get();
                    if (cif != null) {
                        ((LayoutInflaterFactory2C0545Ef) cif).o(true);
                    }
                }
            }
        }
    }

    public static void h(Cif cif) {
        synchronized (h) {
            C5348fk c5348fk = g;
            c5348fk.getClass();
            C5004ek c5004ek = new C5004ek(c5348fk);
            while (c5004ek.hasNext()) {
                Cif cif2 = (Cif) ((WeakReference) c5004ek.next()).get();
                if (cif2 == cif || cif2 == null) {
                    c5004ek.remove();
                }
            }
        }
    }
}
