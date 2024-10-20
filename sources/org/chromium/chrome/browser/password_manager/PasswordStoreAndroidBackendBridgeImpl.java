package org.chromium.chrome.browser.password_manager;

import J.N;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.android.chrome.R;
import com.google.android.gms.chromesync.firstparty.ListOptions;
import com.google.android.gms.common.Feature;
import defpackage.AF3;
import defpackage.AbstractC10681vF3;
import defpackage.AbstractC3989bm2;
import defpackage.AbstractC4676dm2;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9095qe2;
import defpackage.AbstractC9491rn2;
import defpackage.B4;
import defpackage.C0848Gn2;
import defpackage.C1127Ir1;
import defpackage.C1228Jl2;
import defpackage.C2017Pn2;
import defpackage.C2254Rj;
import defpackage.C3242Yy2;
import defpackage.C3651an2;
import defpackage.C5531gF3;
import defpackage.C5785h;
import defpackage.C6827k14;
import defpackage.C6861k72;
import defpackage.C7893n72;
import defpackage.C7931nE2;
import defpackage.C9149qn2;
import defpackage.GI0;
import defpackage.InterfaceC2872Wc2;
import defpackage.InterfaceC5565gM2;
import defpackage.InterfaceC7371ld2;
import defpackage.K62;
import defpackage.PO;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.V60;
import defpackage.W72;
import defpackage.X72;
import defpackage.XF0;
import java.io.IOException;
import java.util.Date;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.password_manager.PasswordStoreAndroidBackendBridgeImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordStoreAndroidBackendBridgeImpl {
    public final C0848Gn2 a;
    public long b;

    public static boolean canCreateBackend() {
        Object obj = ThreadUtils.a;
        if (AbstractC9491rn2.a == null) {
            AbstractC9491rn2.a = new C9149qn2();
        }
        AbstractC9491rn2.a.getClass();
        return AbstractC4676dm2.a();
    }

    public PasswordStoreAndroidBackendBridgeImpl(long j, C0848Gn2 c0848Gn2) {
        this.b = j;
        this.a = c0848Gn2;
    }

    public static PasswordStoreAndroidBackendBridgeImpl create(long j) {
        Object obj = ThreadUtils.a;
        if (AbstractC9491rn2.a == null) {
            AbstractC9491rn2.a = new C9149qn2();
        }
        AbstractC9491rn2.a.getClass();
        return new PasswordStoreAndroidBackendBridgeImpl(j, new C0848Gn2());
    }

    public final void showErrorUi() {
        Context context = V60.a;
        if (context == null) {
            return;
        }
        String string = context.getString(R.string.f89800_resource_name_obfuscated_res_0x7f140b7a);
        String string2 = context.getString(R.string.f89790_resource_name_obfuscated_res_0x7f140b79);
        C6861k72 c6861k72 = new C6861k72(context);
        PO a = X72.a("browser", new C7893n72(37, null, 17));
        a.a.d(false);
        K62 k62 = a.a;
        k62.f(string);
        k62.e(string2);
        a.l(R.drawable.f49900_resource_name_obfuscated_res_0x7f0902f3);
        k62.E.tickerText = K62.c(string2);
        k62.t = true;
        W72 e = a.e(string2);
        Notification notification = e.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = e.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cn2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.chromium.base.Callback, hn2] */
    public void subscribe(final int i, String str) {
        Date date = new Date(1L);
        Date date2 = new Date(2L);
        AbstractC9095qe2 a = a(str);
        final ?? r2 = new Callback() { // from class: cn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.M5R2qkNy(j, i);
            }
        };
        final ?? r3 = new Callback() { // from class: hn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Exception exc = (Exception) obj;
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MELXzqxp(j, i, AbstractC3989bm2.b(exc), AbstractC3989bm2.a(exc));
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r3);
        if (a2 == null) {
            return;
        }
        ListOptions listOptions = new ListOptions(0);
        listOptions.j = date;
        listOptions.i = date2;
        AF3 f = a2.f(listOptions);
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: En2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r2.onResult(((C9297rD1) obj).toByteArray());
            }
        };
        f.getClass();
        f.f(AbstractC10681vF3.a, interfaceC7371ld2);
        f.c(new InterfaceC2872Wc2() { // from class: Fn2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r3.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fn2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gn2, org.chromium.base.Callback] */
    public void getAllLogins(final int i, String str) {
        AbstractC9095qe2 a = a(str);
        final ?? r0 = new Callback() { // from class: fn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                byte[] bArr = (byte[]) obj;
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MAO3UVMv(j, i, bArr);
            }
        };
        final ?? r1 = new Callback() { // from class: gn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordStoreAndroidBackendBridgeImpl.this.b(i, (Exception) obj);
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r1);
        if (a2 == null) {
            return;
        }
        AF3 f = a2.f(new ListOptions(0));
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: sn2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r0.onResult(((C9297rD1) obj).toByteArray());
            }
        };
        f.getClass();
        f.f(AbstractC10681vF3.a, interfaceC7371ld2);
        f.c(new InterfaceC2872Wc2() { // from class: xn2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r1.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [on2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [pn2, org.chromium.base.Callback] */
    public void getAutofillableLogins(final int i, String str) {
        AbstractC9095qe2 a = a(str);
        final ?? r0 = new Callback() { // from class: on2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                byte[] bArr = (byte[]) obj;
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MAO3UVMv(j, i, bArr);
            }
        };
        final ?? r1 = new Callback() { // from class: pn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordStoreAndroidBackendBridgeImpl.this.b(i, (Exception) obj);
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r1);
        if (a2 == null) {
            return;
        }
        ListOptions listOptions = new ListOptions(0);
        listOptions.g = 1;
        AF3 f = a2.f(listOptions);
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: Cn2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r0.onResult(((C9297rD1) obj).toByteArray());
            }
        };
        f.getClass();
        f.f(AbstractC10681vF3.a, interfaceC7371ld2);
        f.c(new InterfaceC2872Wc2() { // from class: Dn2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r1.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [in2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.chromium.base.Callback, jn2] */
    public void getLoginsForSignonRealm(final int i, String str, String str2) {
        AbstractC9095qe2 a = a(str2);
        final ?? r0 = new Callback() { // from class: in2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                byte[] bArr = (byte[]) obj;
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MAO3UVMv(j, i, bArr);
            }
        };
        final ?? r1 = new Callback() { // from class: jn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordStoreAndroidBackendBridgeImpl.this.b(i, (Exception) obj);
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r1);
        if (a2 == null) {
            return;
        }
        ListOptions listOptions = new ListOptions(0);
        listOptions.a = str;
        AF3 f = a2.f(listOptions);
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: An2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r0.onResult(((C9297rD1) obj).toByteArray());
            }
        };
        f.getClass();
        f.f(AbstractC10681vF3.a, interfaceC7371ld2);
        f.c(new InterfaceC2872Wc2() { // from class: Bn2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r1.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mn2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [nn2, org.chromium.base.Callback] */
    public void addLogin(final int i, byte[] bArr, String str) {
        C2017Pn2 b;
        AbstractC9095qe2 a = a(str);
        final ?? r0 = new Runnable() { // from class: mn2
            @Override // java.lang.Runnable
            public final void run() {
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MvFamNgw(j, i);
            }
        };
        final ?? r1 = new Callback() { // from class: nn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordStoreAndroidBackendBridgeImpl.this.b(i, (Exception) obj);
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r1);
        if (a2 == null || (b = C0848Gn2.b(r1, bArr)) == null) {
            return;
        }
        AF3 g = a2.g(b);
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: tn2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r0.run();
            }
        };
        g.getClass();
        g.f(AbstractC10681vF3.a, interfaceC7371ld2);
        g.c(new InterfaceC2872Wc2() { // from class: un2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r1.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dn2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [en2, org.chromium.base.Callback] */
    public void updateLogin(final int i, byte[] bArr, String str) {
        C2017Pn2 b;
        AbstractC9095qe2 a = a(str);
        final ?? r0 = new Runnable() { // from class: dn2
            @Override // java.lang.Runnable
            public final void run() {
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MvFamNgw(j, i);
            }
        };
        final ?? r1 = new Callback() { // from class: en2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordStoreAndroidBackendBridgeImpl.this.b(i, (Exception) obj);
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r1);
        if (a2 == null || (b = C0848Gn2.b(r1, bArr)) == null) {
            return;
        }
        AF3 g = a2.g(b);
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: vn2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r0.run();
            }
        };
        g.getClass();
        g.f(AbstractC10681vF3.a, interfaceC7371ld2);
        g.c(new InterfaceC2872Wc2() { // from class: wn2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r1.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kn2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ln2, org.chromium.base.Callback] */
    public void removeLogin(final int i, byte[] bArr, String str) {
        AbstractC9095qe2 a = a(str);
        final ?? r0 = new Runnable() { // from class: kn2
            @Override // java.lang.Runnable
            public final void run() {
                long j = PasswordStoreAndroidBackendBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.MvFamNgw(j, i);
            }
        };
        final ?? r1 = new Callback() { // from class: ln2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordStoreAndroidBackendBridgeImpl.this.b(i, (Exception) obj);
            }
        };
        this.a.getClass();
        C1228Jl2 a2 = C0848Gn2.a(a, r1);
        if (a2 == null) {
            return;
        }
        try {
            C3651an2 c3651an2 = C3651an2.u;
            int length = bArr.length;
            XF0 c = XF0.c();
            final C3651an2 c3651an22 = new C3651an2();
            try {
                try {
                    try {
                        try {
                            QW2 a3 = C7931nE2.c.a(c3651an22);
                            a3.f(c3651an22, bArr, 0, length + 0, new C2254Rj(c));
                            a3.b(c3651an22);
                            if (c3651an22.a != 0) {
                                throw new RuntimeException();
                            }
                            QX0.i(c3651an22);
                            C5531gF3 c5531gF3 = new C5531gF3();
                            c5531gF3.c = new Feature[]{GI0.a};
                            c5531gF3.d = 1002;
                            c5531gF3.a = new InterfaceC5565gM2() { // from class: Hl2
                                @Override // defpackage.InterfaceC5565gM2
                                public final void accept(Object obj, Object obj2) {
                                    Bundle bundle = new Bundle();
                                    bundle.putByteArray("entity", C3651an2.this.toByteArray());
                                    InterfaceC2861Wa1 interfaceC2861Wa1 = (InterfaceC2861Wa1) ((C6612jQ) obj).m();
                                    BinderC11460xY1 binderC11460xY1 = new BinderC11460xY1((C6905kF3) obj2);
                                    C2601Ua1 c2601Ua1 = (C2601Ua1) interfaceC2861Wa1;
                                    Parcel a4 = c2601Ua1.a();
                                    AbstractC11786yV.c(a4, binderC11460xY1);
                                    AbstractC11786yV.b(a4, bundle);
                                    c2601Ua1.h(4, a4);
                                }
                            };
                            AF3 b = a2.b(1, c5531gF3.a());
                            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: yn2
                                @Override // defpackage.InterfaceC7371ld2
                                public final void a(Object obj) {
                                    r0.run();
                                }
                            };
                            b.getClass();
                            b.f(AbstractC10681vF3.a, interfaceC7371ld2);
                            b.c(new InterfaceC2872Wc2() { // from class: zn2
                                @Override // defpackage.InterfaceC2872Wc2
                                public final void c(Exception exc) {
                                    r1.onResult(exc);
                                }
                            });
                        } catch (C1127Ir1 e) {
                            if (!e.g) {
                                throw e;
                            }
                            throw new C1127Ir1(e);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (!(e2.getCause() instanceof C1127Ir1)) {
                        throw new C1127Ir1(e2);
                    }
                    throw ((C1127Ir1) e2.getCause());
                }
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (Exception e4) {
            r1.onResult(e4);
        }
    }

    public final void b(int i, Exception exc) {
        if (this.b == 0) {
            return;
        }
        N.MzDgwXmx(this.b, i, AbstractC3989bm2.b(exc), AbstractC3989bm2.a(exc));
    }

    public static AbstractC9095qe2 a(String str) {
        if (str != null) {
            return new C3242Yy2(B4.c(str));
        }
        return C5785h.a;
    }

    public final void destroy() {
        this.b = 0L;
    }
}
