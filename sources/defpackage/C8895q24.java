package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q24, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8895q24 {
    public final C12157za2 a = new C12157za2();
    public final C8209o24 b = new C8209o24(new Runnable() { // from class: m24
        @Override // java.lang.Runnable
        public final void run() {
            C8895q24 c8895q24 = C8895q24.this;
            if (c8895q24.b.b != 2) {
                return;
            }
            if (c8895q24.d == null) {
                c8895q24.d = new C8552p24(c8895q24.b.j);
            }
            C8552p24 c8552p24 = c8895q24.d;
            if (!c8552p24.e) {
                c8552p24.a = c8895q24.b.j.a;
            }
            if (!c8895q24.e) {
                EI2.h(c8552p24.a, 7, "GoogleUpdate.StartUp.State");
                final C9923t24 c9923t24 = c8895q24.c;
                QU3 qu3 = c9923t24.a;
                qu3.getClass();
                MC2 mc2 = new MC2();
                qu3.a.b(new MU3(mc2));
                mc2.g(new Callback() { // from class: r24
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C7177l24 c7177l24 = (C7177l24) obj;
                        C9923t24 c9923t242 = C9923t24.this;
                        c9923t242.getClass();
                        if (c7177l24 == null) {
                            return;
                        }
                        boolean z = System.currentTimeMillis() - c7177l24.k > 172800000;
                        boolean z2 = !TextUtils.equals(c7177l24.l, "105.0.5195.136");
                        if (!c7177l24.o) {
                            EI2.b(T71.a(0, null), z2);
                            EI2.b(T71.a(0, c7177l24), z2);
                        }
                        if (z2 || z) {
                            EI2.b(T71.a(1, null), z2);
                            EI2.b(T71.a(1, c7177l24), z2);
                        }
                        QU3 qu32 = c9923t242.a;
                        if (z2 || z) {
                            qu32.a.b(new Runnable() { // from class: OU3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC2737Vb2.g().edit().remove("UpdateProtos_Tracking").apply();
                                }
                            });
                            return;
                        }
                        if (c7177l24.o) {
                            return;
                        }
                        JX0 jx0 = (JX0) c7177l24.l(PX0.NEW_BUILDER);
                        jx0.m(c7177l24);
                        C5803h24 c5803h24 = (C5803h24) jx0;
                        if (c5803h24.h) {
                            c5803h24.l();
                            c5803h24.h = false;
                        }
                        C7177l24 c7177l242 = (C7177l24) c5803h24.g;
                        c7177l242.j |= 16;
                        c7177l242.o = true;
                        C7177l24 c7177l243 = (C7177l24) c5803h24.j();
                        qu32.getClass();
                        qu32.a.b(new NU3(c7177l243));
                    }
                });
                c8895q24.e = true;
            }
            Iterator it = c8895q24.a.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                } else {
                    ((Callback) c11814ya2.next()).onResult(c8895q24.d);
                }
            }
        }
    });
    public final C9923t24 c = new C9923t24();
    public C8552p24 d;
    public boolean e;

    public final void a(Context context) {
        C8552p24 c8552p24 = this.d;
        if (c8552p24 == null || c8552p24.a != 1 || TextUtils.isEmpty(c8552p24.b)) {
            return;
        }
        try {
            final C9923t24 c9923t24 = this.c;
            QU3 qu3 = c9923t24.a;
            qu3.getClass();
            MC2 mc2 = new MC2();
            qu3.a.b(new MU3(mc2));
            mc2.g(new Callback() { // from class: s24
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C7177l24 c7177l24 = (C7177l24) obj;
                    C9923t24 c9923t242 = C9923t24.this;
                    c9923t242.getClass();
                    EI2.b("GoogleUpdate.StartingUpdateState", c7177l24 != null);
                    C5803h24 c5803h24 = (C5803h24) C7177l24.p.j();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (c5803h24.h) {
                        c5803h24.l();
                        c5803h24.h = false;
                    }
                    C7177l24 c7177l242 = (C7177l24) c5803h24.g;
                    c7177l242.j = 1 | c7177l242.j;
                    c7177l242.k = currentTimeMillis;
                    if (c5803h24.h) {
                        c5803h24.l();
                        c5803h24.h = false;
                    }
                    C7177l24 c7177l243 = (C7177l24) c5803h24.g;
                    c7177l243.getClass();
                    c7177l243.j |= 2;
                    c7177l243.l = "105.0.5195.136";
                    if (c5803h24.h) {
                        c5803h24.l();
                        c5803h24.h = false;
                    }
                    C7177l24 c7177l244 = (C7177l24) c5803h24.g;
                    c7177l244.getClass();
                    c7177l244.m = 0;
                    c7177l244.j |= 4;
                    if (c5803h24.h) {
                        c5803h24.l();
                        c5803h24.h = false;
                    }
                    C7177l24 c7177l245 = (C7177l24) c5803h24.g;
                    c7177l245.getClass();
                    c7177l245.n = 0;
                    c7177l245.j |= 8;
                    if (c5803h24.h) {
                        c5803h24.l();
                        c5803h24.h = false;
                    }
                    C7177l24 c7177l246 = (C7177l24) c5803h24.g;
                    c7177l246.j |= 16;
                    c7177l246.o = false;
                    C7177l24 c7177l247 = (C7177l24) c5803h24.j();
                    QU3 qu32 = c9923t242.a;
                    qu32.getClass();
                    qu32.a.b(new NU3(c7177l247));
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            });
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.d.b)));
        } catch (ActivityNotFoundException unused) {
        }
    }
}
