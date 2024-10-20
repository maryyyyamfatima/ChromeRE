package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10285u6 extends WindowAndroid implements InterfaceC11179wj, InterfaceC12208zj {
    public final boolean C;
    public C1861Oi1 D;

    public C10285u6(Context context, C2021Po1 c2021Po1) {
        this(context, new H5(new WeakReference(V60.a(context))), c2021Po1);
    }

    public C10285u6(Context context, H5 h5, C2021Po1 c2021Po1) {
        super(context, c2021Po1);
        Activity a = V60.a(context);
        if (a == null) {
            throw new IllegalArgumentException("Context is not and does not wrap an Activity");
        }
        this.C = true;
        ApplicationStatus.e(this, a);
        ApplicationStatus.g(this);
        C7240lE c7240lE = new C7240lE(new WeakReference(a));
        this.g = h5;
        C11939yv1.g = h5;
        this.q = c7240lE;
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final WeakReference k() {
        if (this.D == null) {
            this.D = new C1861Oi1(V60.a((Context) this.j.get()));
        }
        return this.D;
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final int q() {
        if (this.C) {
            return ApplicationStatus.c((Activity) k().get());
        }
        return 6;
    }

    @Override // defpackage.InterfaceC12208zj
    public final void d(Activity activity, boolean z) {
        if (k().get() == activity) {
            this.v = z;
            if (!z) {
                j(0.0f);
            } else {
                j(this.u);
            }
        }
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 5) {
            long j = this.h;
            if (j == 0) {
                return;
            }
            N.MMLuxHp6(j, this);
            return;
        }
        if (i != 2) {
            C12157za2 c12157za2 = this.w;
            if (i == 4) {
                AndroidPermissionDelegate androidPermissionDelegate = this.q;
                if (androidPermissionDelegate instanceof C7240lE) {
                    C7240lE c7240lE = (C7240lE) androidPermissionDelegate;
                    if (c7240lE.a()) {
                        c7240lE.k.clear();
                        c7240lE.j.clear();
                    }
                }
                Iterator it = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        return;
                    } else {
                        ((InterfaceC4009bp4) c11814ya2.next()).b();
                    }
                }
            } else {
                if (i != 3) {
                    if (i == 6) {
                        Iterator it2 = c12157za2.iterator();
                        while (true) {
                            C11814ya2 c11814ya22 = (C11814ya2) it2;
                            if (!c11814ya22.hasNext()) {
                                break;
                            } else {
                                ((InterfaceC4009bp4) c11814ya22.next()).d();
                            }
                        }
                        C12157za2 c12157za22 = ApplicationStatus.g;
                        if (c12157za22 == null) {
                            return;
                        }
                        c12157za22.d(this);
                        return;
                    }
                    return;
                }
                Iterator it3 = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya23 = (C11814ya2) it3;
                    if (!c11814ya23.hasNext()) {
                        return;
                    } else {
                        ((InterfaceC4009bp4) c11814ya23.next()).a();
                    }
                }
            }
        } else {
            long j2 = this.h;
            if (j2 == 0) {
                return;
            }
            N.MbyUPhMo(j2, this);
        }
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public C11939yv1 r() {
        return (H5) this.g;
    }
}
