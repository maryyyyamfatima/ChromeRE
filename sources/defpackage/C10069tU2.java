package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.common.Feature;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.lang.ref.WeakReference;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.password_manager.PasswordStoreBridge;
import org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tU2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10069tU2 implements InterfaceC0833Gk2 {
    public PropertyModel a;
    public C11441xU2 b;
    public final SettingsLauncher c;
    public final C3083Xs3 d;
    public boolean e;
    public final PasswordStoreBridge f;
    public boolean g;
    public boolean h;
    public final InterfaceC7697ma2 i;
    public int j;
    public Handler k;
    public Runnable l;
    public Runnable m;
    public Runnable n;
    public long o;
    public Integer p;
    public final Q83 q;
    public final C3887bU2 r;

    @Override // defpackage.InterfaceC0833Gk2
    public final void d(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [bU2] */
    public C10069tU2(PropertyModel propertyModel, C11441xU2 c11441xU2, final SettingsLauncher settingsLauncher, C3083Xs3 c3083Xs3, InterfaceC7697ma2 interfaceC7697ma2) {
        Handler handler = new Handler();
        this.o = -1L;
        this.p = 0;
        this.r = new Callback() { // from class: bU2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final Integer num = (Integer) obj;
                final C10069tU2 c10069tU2 = C10069tU2.this;
                Handler handler2 = c10069tU2.k;
                if (handler2 == null) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: iU2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        C10069tU2 c10069tU22 = C10069tU2.this;
                        if (c10069tU22.a != null) {
                            Integer num2 = num;
                            int intValue = num2.intValue();
                            if (intValue != 0) {
                                i = 1;
                                if (intValue == 1) {
                                    i = 0;
                                } else if (intValue != 2) {
                                    if (intValue == 3) {
                                        i = 8;
                                    } else if (intValue == 4) {
                                        i = 5;
                                    }
                                }
                                EI2.h(i, 9, "Settings.SafetyCheck.UpdatesResult");
                                c10069tU22.a.m(AbstractC10412uU2.d, num2.intValue());
                            }
                            i = 6;
                            EI2.h(i, 9, "Settings.SafetyCheck.UpdatesResult");
                            c10069tU22.a.m(AbstractC10412uU2.d, num2.intValue());
                        }
                    }
                };
                Runnable runnable2 = c10069tU2.n;
                if (runnable2 != null) {
                    handler2.removeCallbacks(runnable2);
                }
                c10069tU2.n = runnable;
                c10069tU2.k.postDelayed(runnable, c10069tU2.f());
            }
        };
        this.a = propertyModel;
        this.b = c11441xU2;
        this.c = settingsLauncher;
        this.d = c3083Xs3;
        this.k = handler;
        Q83 q83 = O83.a;
        this.q = q83;
        propertyModel.o(AbstractC10412uU2.g, new InterfaceC9555ry2() { // from class: cU2
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                String packageName = V60.a.getPackageName();
                preference.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                return true;
            }
        });
        this.a.o(AbstractC10412uU2.f, new InterfaceC9555ry2() { // from class: dU2
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                FI2.a("Settings.SafetyCheck.ManageSafeBrowsing");
                EI2.h(3, 10, "Settings.SafetyCheck.Interactions");
                String name = SafeBrowsingSettingsFragment.class.getName();
                Context context = preference.a;
                int i = SafeBrowsingSettingsFragment.n0;
                Bundle bundle = new Bundle();
                bundle.putInt("SafeBrowsingSettingsFragment.AccessPoint", 2);
                context.startActivity(SettingsLauncher.this.a(context, name, bundle));
                return true;
            }
        });
        k();
        this.a.o(AbstractC10412uU2.h, new View.OnClickListener() { // from class: eU2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10069tU2.this.i();
            }
        });
        this.a.n(AbstractC10412uU2.i, q83.g(0L, "Chrome.SafetyCheck.LastRunTimestamp"));
        this.f = new PasswordStoreBridge();
        this.i = interfaceC7697ma2;
    }

    @Override // defpackage.InterfaceC0833Gk2
    public final void b() {
        this.h = true;
        this.p = Integer.valueOf(N.Mu_fY_2N(((C2392Sk2) AbstractC1872Ok2.b(this.c)).a.a));
        if (this.g) {
            e();
        }
    }

    @Override // defpackage.InterfaceC0833Gk2
    public final void c() {
        h();
    }

    @Override // defpackage.InterfaceC0833Gk2
    public final void a(final int i) {
        if (i == 1 || this.j != 1 || this.a == null) {
            return;
        }
        if (i != 0) {
            j(new Runnable() { // from class: kU2
                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    C10069tU2 c10069tU2 = C10069tU2.this;
                    if (c10069tU2.a != null) {
                        switch (i) {
                            case 2:
                            case 8:
                                i2 = 8;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                i2 = 4;
                                break;
                            case 4:
                                i2 = 5;
                                break;
                            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                                i2 = 6;
                                break;
                            case 6:
                            case 7:
                                i2 = 7;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        EI2.h(AbstractC10412uU2.a(i2), 10, "Settings.SafetyCheck.PasswordsResult");
                        c10069tU2.a.m(AbstractC10412uU2.a, i2);
                        c10069tU2.k();
                    }
                }
            });
            return;
        }
        this.j = 3;
        if (this.g && this.h) {
            e();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [rU2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [zm2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [sU2] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ym2] */
    public final void i() {
        j(null);
        Runnable runnable = this.m;
        if (runnable != null) {
            this.k.removeCallbacks(runnable);
        }
        this.m = null;
        Runnable runnable2 = this.n;
        if (runnable2 != null) {
            this.k.removeCallbacks(runnable2);
        }
        this.n = null;
        FI2.a("Settings.SafetyCheck.Start");
        EI2.h(0, 10, "Settings.SafetyCheck.Interactions");
        this.o = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        this.a.n(AbstractC10412uU2.i, currentTimeMillis);
        Q83 q83 = this.q;
        q83.s(currentTimeMillis, "Chrome.SafetyCheck.LastRunTimestamp");
        q83.d("Chrome.SafetyCheck.RunCounter");
        this.a.m(AbstractC10412uU2.a, 1);
        this.a.m(AbstractC10412uU2.c, 1);
        this.a.m(AbstractC10412uU2.d, 1);
        RunnableC5261fU2 runnableC5261fU2 = new RunnableC5261fU2(this);
        Runnable runnable3 = this.m;
        if (runnable3 != null) {
            this.k.removeCallbacks(runnable3);
        }
        this.m = runnableC5261fU2;
        this.k.postDelayed(runnableC5261fU2, f());
        this.j = 1;
        if (!AbstractC0193Bm2.a()) {
            SettingsLauncher settingsLauncher = this.c;
            ((C2392Sk2) AbstractC1872Ok2.b(settingsLauncher)).a(this, false);
            N.MqdzTSiP(((C2392Sk2) AbstractC1872Ok2.b(settingsLauncher)).a.a);
        } else {
            final WeakReference weakReference = new WeakReference(this);
            AbstractC9095qe2 g = g();
            final ?? r4 = new Callback() { // from class: rU2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C10069tU2 c10069tU2 = (C10069tU2) weakReference.get();
                    if (c10069tU2 == null || c10069tU2.a == null) {
                        return;
                    }
                    final WeakReference weakReference2 = new WeakReference(c10069tU2);
                    AbstractC0193Bm2.b(C10069tU2.g(), new Callback() { // from class: gU2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            Integer num = (Integer) obj2;
                            C10069tU2 c10069tU22 = (C10069tU2) weakReference2.get();
                            if (c10069tU22 == null || c10069tU22.a == null) {
                                return;
                            }
                            c10069tU22.j = 3;
                            c10069tU22.p = num;
                            c10069tU22.h = true;
                            if (c10069tU22.g) {
                                c10069tU22.e();
                            }
                        }
                    }, new Callback() { // from class: hU2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            Exception exc = (Exception) obj2;
                            C10069tU2 c10069tU22 = (C10069tU2) weakReference2.get();
                            if (c10069tU22 == null || c10069tU22.a == null) {
                                return;
                            }
                            c10069tU22.j(new RunnableC6635jU2(c10069tU22, exc));
                        }
                    });
                }
            };
            final ?? r5 = new Callback() { // from class: sU2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Exception exc = (Exception) obj;
                    C10069tU2 c10069tU2 = (C10069tU2) weakReference.get();
                    if (c10069tU2 == null || c10069tU2.a == null) {
                        return;
                    }
                    c10069tU2.j(new RunnableC6635jU2(c10069tU2, exc));
                }
            };
            final C0578El2 c0578El2 = new C0578El2(0);
            try {
                C9240r31 d = AbstractC0193Bm2.d();
                final ?? r7 = new Callback() { // from class: ym2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C0578El2.this.b(C5785h.a);
                        r4.onResult((Void) obj);
                    }
                };
                final ?? r42 = new Callback() { // from class: zm2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Exception exc = (Exception) obj;
                        C0578El2.this.b(new C3242Yy2(exc));
                        r5.onResult(exc);
                    }
                };
                final CredentialManagerAccount a = C9240r31.a(g);
                final CallerInfo callerInfo = new CallerInfo("chrome", "android", C9240r31.b(1), "");
                C0448Dl2 c0448Dl2 = (C0448Dl2) d.a;
                c0448Dl2.getClass();
                C5531gF3 c5531gF3 = new C5531gF3();
                c5531gF3.d = 26751;
                c5531gF3.c = new Feature[]{JI0.b};
                c5531gF3.a = new InterfaceC5565gM2() { // from class: Bl2
                    @Override // defpackage.InterfaceC5565gM2
                    public final void accept(Object obj, Object obj2) {
                        InterfaceC0932He1 interfaceC0932He1 = (InterfaceC0932He1) ((C0708Fl2) obj).m();
                        BinderC3043Xk3 binderC3043Xk3 = new BinderC3043Xk3((C6905kF3) obj2);
                        CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(CredentialManagerAccount.this, callerInfo);
                        C0672Fe1 c0672Fe1 = (C0672Fe1) interfaceC0932He1;
                        Parcel a2 = c0672Fe1.a();
                        AbstractC11786yV.c(a2, binderC3043Xk3);
                        AbstractC11786yV.b(a2, credentialManagerInvocationParams);
                        c0672Fe1.h(2, a2);
                    }
                };
                AF3 b = c0448Dl2.b(0, c5531gF3.a());
                InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: p31
                    @Override // defpackage.InterfaceC7371ld2
                    public final void a(Object obj) {
                        r7.onResult((Void) obj);
                    }
                };
                b.getClass();
                b.f(AbstractC10681vF3.a, interfaceC7371ld2);
                b.c(new InterfaceC2872Wc2() { // from class: q31
                    @Override // defpackage.InterfaceC2872Wc2
                    public final void c(Exception exc) {
                        r42.onResult(exc);
                    }
                });
            } catch (Exception e) {
                r5.onResult(e);
            }
        }
        C11441xU2 c11441xU2 = this.b;
        WeakReference weakReference2 = new WeakReference(this.r);
        c11441xU2.getClass();
        PostTask.c(QF3.i, new RunnableC10755vU2(c11441xU2, weakReference2));
    }

    public final void j(Runnable runnable) {
        Runnable runnable2 = this.l;
        if (runnable2 != null) {
            this.k.removeCallbacks(runnable2);
        }
        this.l = runnable;
        if (runnable != null) {
            this.k.postDelayed(runnable, f());
        }
    }

    public final void e() {
        if (this.j == 1) {
            return;
        }
        if (!AbstractC0193Bm2.a()) {
            ((C2392Sk2) AbstractC1872Ok2.b(this.c)).b.d(this);
        } else {
            this.f.b.d(this);
        }
        if (this.j == 2) {
            l();
        } else {
            j(new Runnable() { // from class: aU2
                @Override // java.lang.Runnable
                public final void run() {
                    C10069tU2.this.l();
                }
            });
        }
    }

    public final void l() {
        int intValue = this.p.intValue();
        ND2 nd2 = AbstractC10412uU2.a;
        if (intValue != 0) {
            this.a.m(AbstractC10412uU2.b, this.p.intValue());
            this.a.m(nd2, 3);
            EI2.h(2, 10, "Settings.SafetyCheck.PasswordsResult");
        } else {
            boolean z = false;
            if (this.j == 2 && !this.e) {
                this.a.m(nd2, 0);
            } else {
                if (AbstractC0193Bm2.a() ? N.MrzpchgE(this.f.a) > 0 : N.MDe7TasX(((C2392Sk2) AbstractC1872Ok2.b(this.c)).a.a) > 0) {
                    z = true;
                }
                if (!z) {
                    this.a.m(nd2, 5);
                    EI2.h(4, 10, "Settings.SafetyCheck.PasswordsResult");
                } else {
                    this.a.m(nd2, 2);
                    EI2.h(1, 10, "Settings.SafetyCheck.PasswordsResult");
                }
            }
        }
        this.j = 1;
        k();
    }

    public final long f() {
        return Math.max(0L, (this.o + 1000) - SystemClock.elapsedRealtime());
    }

    public final void k() {
        InterfaceC9555ry2 interfaceC9555ry2;
        int h = this.a.h(AbstractC10412uU2.a);
        if (h == 6) {
            interfaceC9555ry2 = new InterfaceC9555ry2() { // from class: lU2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    C10069tU2 c10069tU2 = C10069tU2.this;
                    c10069tU2.getClass();
                    Context context = preference.a;
                    c10069tU2.d.getClass();
                    C3083Xs3.b(context, 32);
                    return true;
                }
            };
        } else if (h == 3 || h == 2) {
            interfaceC9555ry2 = new InterfaceC9555ry2() { // from class: mU2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    C10069tU2 c10069tU2 = C10069tU2.this;
                    c10069tU2.getClass();
                    FI2.a("Settings.SafetyCheck.ManagePasswords");
                    EI2.h(2, 10, "Settings.SafetyCheck.Interactions");
                    if (!AbstractC0193Bm2.a()) {
                        ((C2392Sk2) AbstractC1872Ok2.b(c10069tU2.c)).b(preference.a, 1);
                    } else {
                        AbstractC0193Bm2.j(preference.a, 1, AbstractC1658Mt3.b(), c10069tU2.i);
                    }
                    return true;
                }
            };
        } else if (h == 9) {
            interfaceC9555ry2 = new InterfaceC9555ry2() { // from class: nU2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    AbstractC0193Bm2.f(preference.a);
                    return true;
                }
            };
        } else {
            interfaceC9555ry2 = new InterfaceC9555ry2() { // from class: oU2
                @Override // defpackage.InterfaceC9555ry2
                public final boolean p(Preference preference) {
                    C10069tU2 c10069tU2 = C10069tU2.this;
                    c10069tU2.getClass();
                    AbstractC0193Bm2.k(preference.a, 10, c10069tU2.c, AbstractC1658Mt3.b(), c10069tU2.i);
                    return true;
                }
            };
        }
        this.a.o(AbstractC10412uU2.e, interfaceC9555ry2);
    }

    public final void h() {
        if (this.a == null) {
            return;
        }
        this.g = true;
        if (this.h) {
            e();
        }
    }

    public static AbstractC9095qe2 g() {
        if (AbstractC0193Bm2.e(AbstractC1658Mt3.b())) {
            return new C3242Yy2(CoreAccountInfo.b(AbstractC1658Mt3.b().c()));
        }
        return C5785h.a;
    }
}
