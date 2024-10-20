package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import com.google.android.youtube.player.internal.bj;
import com.google.android.youtube.player.internal.bl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6781jt4 {
    public static final Cv4 r = new Cv4(Is4.class);
    public final c a;
    public final InterfaceC4719dt4 c;
    public final Js4 d;
    public final Es4 e;
    public final Gs4 f;
    public final Xt4 g;
    public C8844pt4 h;
    public FrameLayout i;
    public String j;
    public View k;
    public Aw4 m;
    public Cv4 b = r;
    public Qv4 l = Qv4.a;
    public boolean n = false;
    public Ds4 o = Ds4.a;
    public final Kw4 p = new Kw4(this);
    public final Mw4 q = new Mw4(this);

    public C6781jt4(c cVar, InterfaceC4719dt4 interfaceC4719dt4, Js4 js4, Es4 es4, Gs4 gs4) {
        this.a = cVar;
        this.c = interfaceC4719dt4;
        this.d = js4;
        this.e = es4;
        this.f = gs4;
        boolean isInstance = C7831mw4.class.isInstance(cVar);
        BinderC6095ht4 binderC6095ht4 = new BinderC6095ht4(this);
        IInterface queryLocalInterface = binderC6095ht4.queryLocalInterface("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
        this.g = new Xt4(isInstance, queryLocalInterface instanceof Ew4 ? (Ew4) queryLocalInterface : new Cw4(binderC6095ht4));
    }

    public final void a(Bundle bundle) {
        bundle.putString("dev_key", this.j);
        Xt4 xt4 = this.g;
        xt4.getClass();
        Bundle bundle2 = null;
        try {
            Aw4 aw4 = xt4.f;
            if (aw4 != null) {
                ww4 ww4Var = (ww4) aw4;
                Parcel e = ww4Var.e(9, ww4Var.a());
                Parcelable.Creator creator = Bundle.CREATOR;
                int i = AbstractC5419fv4.a;
                Bundle bundle3 = (Bundle) (e.readInt() != 0 ? (Parcelable) creator.createFromParcel(e) : null);
                e.recycle();
                bundle2 = bundle3;
            }
        } catch (RemoteException unused) {
            Pu4.a("Problem saving state of embed.", new Object[0]);
        }
        if (bundle2 == null) {
            bundle2 = xt4.a;
        }
        bundle.putBundle("forwarding_state", bundle2);
    }

    public final void b(String str) {
        if (this.m != null || this.l.d()) {
            return;
        }
        if (str == null || TextUtils.equals("", str)) {
            Pu4.a("Please supply a valid developer key.", new Object[0]);
            return;
        }
        if (e() == null) {
            Pu4.a("No activity attached, cannot connect.", new Object[0]);
            return;
        }
        C8844pt4 c8844pt4 = this.h;
        if (c8844pt4 != null) {
            c8844pt4.a.setVisibility(0);
            c8844pt4.g.setVisibility(8);
        }
        VS0 e = e();
        Kw4 kw4 = this.p;
        Mw4 mw4 = this.q;
        String packageName = e.getPackageName();
        String[] strArr = Ru4.a;
        try {
            C9529rt4 c9529rt4 = new C9529rt4(e, str, packageName, e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName, kw4, mw4);
            this.l = c9529rt4;
            c9529rt4.g();
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:            if ((r1.g != defpackage.Tt4.a) == false) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.os.Bundle r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L45
            java.lang.String r0 = "dev_key"
            java.lang.String r0 = r4.getString(r0)
            r3.j = r0
            java.lang.Class<mw4> r0 = defpackage.C7831mw4.class
            androidx.fragment.app.c r1 = r3.a
            boolean r0 = r0.isInstance(r1)
            Xt4 r1 = r3.g
            if (r0 != 0) goto L21
            Tt4 r0 = r1.g
            Qt4 r2 = defpackage.Tt4.a
            if (r0 == r2) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L3c
        L21:
            java.lang.String r0 = "forwarding_state"
            android.os.Bundle r4 = r4.getBundle(r0)
            if (r4 == 0) goto L39
            r1.a = r4
            r1.d()
            vt4 r4 = new vt4
            r4.<init>(r1)
            r1.g = r4
            r1.c()
            goto L3c
        L39:
            r1.getClass()
        L3c:
            boolean r4 = r3.n
            if (r4 == 0) goto L45
            java.lang.String r4 = r3.j
            r3.b(r4)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6781jt4.c(android.os.Bundle):void");
    }

    public final void d() {
        this.n = true;
        String str = this.j;
        if (str != null) {
            b(str);
        }
        this.g.a(1);
    }

    public final VS0 e() {
        Context K;
        c cVar = this.a;
        if (((VS0) cVar.getActivity()) != null) {
            K = cVar.getActivity();
        } else {
            if (!(cVar.K() instanceof Activity)) {
                return null;
            }
            K = cVar.K();
        }
        return (VS0) K;
    }

    public final void f() {
        Eu4 eu4;
        if (this.n) {
            if (this.h == null) {
                C8844pt4 c8844pt4 = new C8844pt4(e());
                this.h = c8844pt4;
                c8844pt4.a.setVisibility(0);
                c8844pt4.g.setVisibility(8);
            }
            Aw4 aw4 = this.m;
            if (aw4 != null && this.k == null) {
                try {
                    ww4 ww4Var = (ww4) aw4;
                    Parcel e = ww4Var.e(1, ww4Var.a());
                    eu4 = bj.a(e.readStrongBinder());
                    e.recycle();
                } catch (RemoteException unused) {
                    Pu4.a("Problem getting remote controlled view.", new Object[0]);
                    eu4 = null;
                    this.k = null;
                    C8844pt4 c8844pt42 = this.h;
                    c8844pt42.a.setVisibility(8);
                    c8844pt42.g.setVisibility(0);
                }
                if (eu4 != null) {
                    this.k = (View) bl.a(eu4);
                }
            }
            if (this.i == null) {
                this.i = new FrameLayout(e());
            }
            this.i.removeAllViews();
            FrameLayout frameLayout = this.i;
            View view = this.k;
            if (view == null) {
                view = this.h;
            }
            frameLayout.addView(view);
        }
    }
}
