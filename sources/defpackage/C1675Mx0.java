package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1675Mx0 implements InterfaceC1286Jx0 {
    public static final AtomicBoolean g = new AtomicBoolean(true);
    public final C4763e12 b;
    public final Vr4 c;
    public final SM3 d;
    public final Executor e;
    public String f;

    public C1675Mx0(Vr4 vr4, SM3 sm3, Executor executor) {
        this.c = vr4;
        this.d = sm3;
        this.b = new C4763e12(sm3, executor);
        this.e = executor;
    }

    @Override // defpackage.InterfaceC1286Jx0
    public final int b() {
        return this.d.c();
    }

    @Override // defpackage.InterfaceC1286Jx0
    public final InterfaceC7260lI a() {
        if (TextUtils.isEmpty(this.f)) {
            SM3 sm3 = this.d;
            String d = sm3.d();
            this.f = d;
            sm3.b(0, d);
        }
        return new C1545Lx0(this);
    }

    @Override // defpackage.InterfaceC1286Jx0
    public final InterfaceC11372xG3 c(final int i) {
        if (TextUtils.isEmpty(this.f)) {
            SM3 sm3 = this.d;
            String d = sm3.d();
            this.f = d;
            sm3.b(0, d);
        }
        return new InterfaceC11372xG3() { // from class: Kx0
            @Override // defpackage.InterfaceC11372xG3
            public final InterfaceC12058zG3 a() {
                int i2 = i;
                C1675Mx0 c1675Mx0 = C1675Mx0.this;
                c1675Mx0.getClass();
                return new CG3(0, c1675Mx0.f, i2, c1675Mx0.c, c1675Mx0.d, c1675Mx0.e, InterfaceC5862hD0.a);
            }
        };
    }
}
