package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.bumptech.glide.a;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2288Rp3 extends c {
    public final F5 b0;
    public final C2158Qp3 c0;
    public final HashSet d0;
    public C2288Rp3 e0;
    public ComponentCallbacks2C5575gO2 f0;
    public c g0;

    public C2288Rp3() {
        F5 f5 = new F5();
        this.c0 = new C2158Qp3(this);
        this.d0 = new HashSet();
        this.b0 = f5;
    }

    public final void L0(Context context, h hVar) {
        C2288Rp3 c2288Rp3 = this.e0;
        if (c2288Rp3 != null) {
            c2288Rp3.d0.remove(this);
            this.e0 = null;
        }
        C2288Rp3 e = a.b(context).j.e(hVar);
        this.e0 = e;
        if (equals(e)) {
            return;
        }
        this.e0.d0.add(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.c] */
    @Override // androidx.fragment.app.c
    public final void f0(Context context) {
        super.f0(context);
        C2288Rp3 c2288Rp3 = this;
        while (true) {
            ?? r0 = c2288Rp3.A;
            if (r0 == 0) {
                break;
            } else {
                c2288Rp3 = r0;
            }
        }
        h hVar = c2288Rp3.x;
        if (hVar == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                L0(K(), hVar);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.c
    public final String toString() {
        String cVar = super.toString();
        c cVar2 = this.A;
        if (cVar2 == null) {
            cVar2 = this.g0;
        }
        return cVar + "{parent=" + String.valueOf(cVar2) + "}";
    }

    @Override // androidx.fragment.app.c
    public final void t0() {
        this.f11484J = true;
        this.b0.d();
    }

    @Override // androidx.fragment.app.c
    public final void u0() {
        this.f11484J = true;
        this.b0.e();
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        this.b0.c();
        C2288Rp3 c2288Rp3 = this.e0;
        if (c2288Rp3 != null) {
            c2288Rp3.d0.remove(this);
            this.e0 = null;
        }
    }

    @Override // androidx.fragment.app.c
    public final void l0() {
        this.f11484J = true;
        this.g0 = null;
        C2288Rp3 c2288Rp3 = this.e0;
        if (c2288Rp3 != null) {
            c2288Rp3.d0.remove(this);
            this.e0 = null;
        }
    }
}
