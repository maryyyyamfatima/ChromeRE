package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.chromium.base.ApplicationStatus;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: If3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC1069If3 implements View.OnClickListener, InterfaceC11179wj, H14 {
    public final Activity a;
    public C1978Pf3 g;
    public boolean j;
    public final ViewGroup k;
    public ViewGroup l;
    public final WindowAndroid m;
    public final C0289Cf3 i = new C0289Cf3();
    public final RunnableC0419Df3 n = new RunnableC0419Df3(this);
    public final Handler h = new Handler();

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public ViewOnClickListenerC1069If3(Activity activity, ViewGroup viewGroup, C10285u6 c10285u6) {
        this.a = activity;
        this.k = viewGroup;
        this.m = c10285u6;
        ApplicationStatus.e(this, activity);
        if (ApplicationStatus.c(activity) == 2 || ApplicationStatus.c(activity) == 3) {
            this.j = true;
        }
    }

    public final void a(InterfaceC0679Ff3 interfaceC0679Ff3) {
        C0289Cf3 c0289Cf3 = this.i;
        if (C0289Cf3.c(c0289Cf3.a, interfaceC0679Ff3) || C0289Cf3.c(c0289Cf3.b, interfaceC0679Ff3)) {
            d();
        }
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 2) {
            this.j = true;
            return;
        }
        if (i != 5) {
            return;
        }
        while (true) {
            C0289Cf3 c0289Cf3 = this.i;
            if (!(c0289Cf3.a.isEmpty() && c0289Cf3.b.isEmpty())) {
                c0289Cf3.b(false);
            } else {
                d();
                this.j = false;
                return;
            }
        }
    }

    public final void b(InterfaceC0679Ff3 interfaceC0679Ff3, Object obj) {
        C0289Cf3 c0289Cf3 = this.i;
        if (C0289Cf3.d(c0289Cf3.a, interfaceC0679Ff3, obj) || C0289Cf3.d(c0289Cf3.b, interfaceC0679Ff3, obj)) {
            d();
        }
    }

    public final void c(C12188zf3 c12188zf3) {
        if (this.j) {
            EI2.m(c12188zf3.m, "Snackbar.Shown");
            C0289Cf3 c0289Cf3 = this.i;
            c0289Cf3.getClass();
            int i = c12188zf3.l;
            boolean z = i == 0;
            LinkedList linkedList = c0289Cf3.a;
            if (z) {
                if (c0289Cf3.a() != null) {
                    if (!(c0289Cf3.a().l == 0)) {
                        c0289Cf3.b(false);
                    }
                }
                linkedList.addFirst(c12188zf3);
            } else {
                if (i == 2) {
                    c0289Cf3.b.addFirst(c12188zf3);
                } else {
                    linkedList.addLast(c12188zf3);
                }
            }
            d();
            this.g.a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1978Pf3 c1978Pf3 = this.g;
        if (!TextUtils.isEmpty(c1978Pf3.k.f)) {
            c1978Pf3.b.announceForAccessibility(c1978Pf3.k.f);
        }
        this.i.b(true);
        d();
    }

    public final void d() {
        boolean g;
        if (this.j) {
            C12188zf3 a = this.i.a();
            Handler handler = this.h;
            RunnableC0419Df3 runnableC0419Df3 = this.n;
            if (a == null) {
                handler.removeCallbacks(runnableC0419Df3);
                C1978Pf3 c1978Pf3 = this.g;
                if (c1978Pf3 != null) {
                    c1978Pf3.b();
                    this.g = null;
                    return;
                }
                return;
            }
            C1978Pf3 c1978Pf32 = this.g;
            if (c1978Pf32 != null) {
                g = c1978Pf32.g(a, true);
            } else {
                C1978Pf3 c1978Pf33 = new C1978Pf3(this.a, this, a, this.k, this.m);
                this.g = c1978Pf33;
                ViewGroup viewGroup = c1978Pf33.j;
                ViewGroup viewGroup2 = c1978Pf33.b;
                viewGroup.addView(viewGroup2);
                c1978Pf33.l.addOnLayoutChangeListener(c1978Pf33.p);
                viewGroup2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1718Nf3(c1978Pf33));
                ViewGroup viewGroup3 = this.l;
                if (viewGroup3 != null) {
                    this.g.e(viewGroup3);
                }
                g = true;
            }
            if (g) {
                handler.removeCallbacks(runnableC0419Df3);
                if (!(a.l == 2)) {
                    int i = a.j;
                    if (i == 0) {
                        i = 3000;
                    }
                    if (C10021tL.f().c()) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            C10021tL.f().getClass();
                            i = H1.b().getRecommendedTimeoutMillis(i, 7);
                        } else {
                            i *= 2;
                            if (i < 30000) {
                                i = 30000;
                            }
                        }
                    }
                    handler.postDelayed(runnableC0419Df3, i);
                }
                this.g.a();
            }
        }
    }
}
