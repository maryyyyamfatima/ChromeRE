package org.chromium.chrome.browser.password_manager;

import J.N;
import defpackage.AF3;
import defpackage.AO2;
import defpackage.AbstractC10681vF3;
import defpackage.AbstractC2012Pm2;
import defpackage.AbstractC3989bm2;
import defpackage.AbstractC4676dm2;
import defpackage.AbstractC9095qe2;
import defpackage.B4;
import defpackage.C0713Fm2;
import defpackage.C2142Qm2;
import defpackage.C31;
import defpackage.C3242Yy2;
import defpackage.C3312Zm2;
import defpackage.C5785h;
import defpackage.InterfaceC2872Wc2;
import defpackage.InterfaceC7371ld2;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.password_manager.PasswordSettingsUpdaterBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordSettingsUpdaterBridge {
    public final C31 a;
    public long b;

    public static boolean canCreateAccessor() {
        Object obj = ThreadUtils.a;
        if (AbstractC2012Pm2.a == null) {
            AbstractC2012Pm2.a = new C2142Qm2();
        }
        AbstractC2012Pm2.a.getClass();
        return AbstractC4676dm2.a();
    }

    public PasswordSettingsUpdaterBridge(long j, C31 c31) {
        this.b = j;
        this.a = c31;
    }

    public static PasswordSettingsUpdaterBridge create(long j) {
        Object obj = ThreadUtils.a;
        if (AbstractC2012Pm2.a == null) {
            AbstractC2012Pm2.a = new C2142Qm2();
        }
        AbstractC2012Pm2.a.getClass();
        return new PasswordSettingsUpdaterBridge(j, new C31());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.chromium.base.Callback, Wm2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.chromium.base.Callback, Ym2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Vm2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Xm2] */
    public void getSettingValue(String str, int i) {
        final C3312Zm2 c3312Zm2 = new C3312Zm2(i, "GetSettingValue");
        C31 c31 = this.a;
        if (i == 0) {
            AbstractC9095qe2 a = a(str);
            final ?? r5 = new Callback() { // from class: Vm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    PasswordSettingsUpdaterBridge.this.d(0, (AbstractC9095qe2) obj, c3312Zm2);
                }
            };
            final ?? r2 = new Callback() { // from class: Wm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    PasswordSettingsUpdaterBridge.this.b(0, (Exception) obj, c3312Zm2);
                }
            };
            c31.getClass();
            C0713Fm2 a2 = C31.a(a, r2);
            if (a2 == null) {
                return;
            }
            AF3 f = a2.f("credentials_enable_service");
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: A31
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    r5.onResult((AbstractC9095qe2) obj);
                }
            };
            f.getClass();
            f.f(AbstractC10681vF3.a, interfaceC7371ld2);
            f.c(new InterfaceC2872Wc2() { // from class: B31
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    r2.onResult(exc);
                }
            });
            return;
        }
        if (i != 1) {
            return;
        }
        AbstractC9095qe2 a3 = a(str);
        final ?? r52 = new Callback() { // from class: Xm2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordSettingsUpdaterBridge.this.d(1, (AbstractC9095qe2) obj, c3312Zm2);
            }
        };
        final ?? r22 = new Callback() { // from class: Ym2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordSettingsUpdaterBridge.this.b(1, (Exception) obj, c3312Zm2);
            }
        };
        c31.getClass();
        C0713Fm2 a4 = C31.a(a3, r22);
        if (a4 == null) {
            return;
        }
        AF3 f2 = a4.f("credentials_enable_autosignin");
        InterfaceC7371ld2 interfaceC7371ld22 = new InterfaceC7371ld2() { // from class: y31
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r52.onResult((AbstractC9095qe2) obj);
            }
        };
        f2.getClass();
        f2.f(AbstractC10681vF3.a, interfaceC7371ld22);
        f2.c(new InterfaceC2872Wc2() { // from class: z31
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r22.onResult(exc);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Sm2, org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.chromium.base.Callback, Um2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Rm2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Tm2] */
    public void setSettingValue(String str, int i, boolean z) {
        final C3312Zm2 c3312Zm2 = new C3312Zm2(i, "SetSettingValue");
        C31 c31 = this.a;
        if (i == 0) {
            AbstractC9095qe2 a = a(str);
            final ?? r5 = new Callback() { // from class: Rm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    PasswordSettingsUpdaterBridge passwordSettingsUpdaterBridge = PasswordSettingsUpdaterBridge.this;
                    passwordSettingsUpdaterBridge.getClass();
                    c3312Zm2.b(null);
                    long j = passwordSettingsUpdaterBridge.b;
                    if (j == 0) {
                        return;
                    }
                    N.Monl0EPH(j, 0);
                }
            };
            final ?? r2 = new Callback() { // from class: Sm2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    PasswordSettingsUpdaterBridge.this.c(0, (Exception) obj, c3312Zm2);
                }
            };
            c31.getClass();
            C0713Fm2 a2 = C31.a(a, r2);
            if (a2 == null) {
                return;
            }
            AF3 g = a2.g("credentials_enable_service", z);
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: u31
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    r5.onResult((Void) obj);
                }
            };
            g.getClass();
            g.f(AbstractC10681vF3.a, interfaceC7371ld2);
            g.c(new InterfaceC2872Wc2() { // from class: v31
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    r2.onResult(exc);
                }
            });
            return;
        }
        if (i != 1) {
            return;
        }
        AbstractC9095qe2 a3 = a(str);
        final ?? r52 = new Callback() { // from class: Tm2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordSettingsUpdaterBridge passwordSettingsUpdaterBridge = PasswordSettingsUpdaterBridge.this;
                passwordSettingsUpdaterBridge.getClass();
                c3312Zm2.b(null);
                long j = passwordSettingsUpdaterBridge.b;
                if (j == 0) {
                    return;
                }
                N.Monl0EPH(j, 1);
            }
        };
        final ?? r22 = new Callback() { // from class: Um2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordSettingsUpdaterBridge.this.c(1, (Exception) obj, c3312Zm2);
            }
        };
        c31.getClass();
        C0713Fm2 a4 = C31.a(a3, r22);
        if (a4 == null) {
            return;
        }
        AF3 g2 = a4.g("credentials_enable_autosignin", z);
        InterfaceC7371ld2 interfaceC7371ld22 = new InterfaceC7371ld2() { // from class: w31
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r52.onResult((Void) obj);
            }
        };
        g2.getClass();
        g2.f(AbstractC10681vF3.a, interfaceC7371ld22);
        g2.c(new InterfaceC2872Wc2() { // from class: x31
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r22.onResult(exc);
            }
        });
    }

    public final void d(int i, AbstractC9095qe2 abstractC9095qe2, C3312Zm2 c3312Zm2) {
        c3312Zm2.b(null);
        if (this.b == 0) {
            return;
        }
        if (abstractC9095qe2.c()) {
            N.M0nLBf5_(this.b, i, ((Boolean) abstractC9095qe2.b()).booleanValue());
        } else {
            N.MN7vNHNV(this.b, i);
        }
    }

    public final void b(int i, Exception exc, C3312Zm2 c3312Zm2) {
        c3312Zm2.b(exc);
        if (this.b == 0) {
            return;
        }
        int b = AbstractC3989bm2.b(exc);
        int a = AbstractC3989bm2.a(exc);
        if (exc instanceof AO2) {
            AbstractC3989bm2.c((AO2) exc);
        }
        N.MuZSgbL6(this.b, i, b, a);
    }

    public final void c(int i, Exception exc, C3312Zm2 c3312Zm2) {
        c3312Zm2.b(exc);
        if (this.b == 0) {
            return;
        }
        int b = AbstractC3989bm2.b(exc);
        int a = AbstractC3989bm2.a(exc);
        if (exc instanceof AO2) {
            AbstractC3989bm2.c((AO2) exc);
        }
        N.MUgThRTH(this.b, i, b, a);
    }

    public final void destroy() {
        this.b = 0L;
    }

    public static AbstractC9095qe2 a(String str) {
        if (str != null) {
            return new C3242Yy2(B4.c(str));
        }
        return C5785h.a;
    }
}
