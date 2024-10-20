package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.GoogleServiceAuthError;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7522m3 implements InterfaceC9238r3, F4, InterfaceC9979tC2 {
    public final WindowAndroid a;
    public final Activity g;
    public final InterfaceC9924t3 h;
    public final C10322uC2 i;
    public final PropertyModel j;
    public final AccountManagerFacade k;
    public String l;
    public String m;
    public String n;
    public final C6490j3 o;
    public final C8385oa2 p = new C8385oa2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [g3] */
    /* JADX WARN: Type inference failed for: r1v0, types: [h3] */
    /* JADX WARN: Type inference failed for: r8v3, types: [VD2, j3] */
    public C7522m3(WindowAndroid windowAndroid, InterfaceC9924t3 interfaceC9924t3, final Z2 z2) {
        this.a = windowAndroid;
        Activity activity = (Activity) windowAndroid.k().get();
        this.g = activity;
        this.h = interfaceC9924t3;
        C10322uC2 b = C10322uC2.b(activity);
        this.i = b;
        final ?? r0 = new Runnable() { // from class: g3
            @Override // java.lang.Runnable
            public final void run() {
                C7522m3.this.j.m(AbstractC8553p3.e, 2);
            }
        };
        final ?? r1 = new Runnable() { // from class: h3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v4, types: [l3] */
            @Override // java.lang.Runnable
            public final void run() {
                final C7522m3 c7522m3 = C7522m3.this;
                PropertyModel propertyModel = c7522m3.j;
                ND2 nd2 = AbstractC8553p3.e;
                int h = propertyModel.h(nd2);
                if (h != 1 && h != 4) {
                    if (h == 0) {
                        c7522m3.s();
                        return;
                    } else {
                        if (h == 5) {
                            c7522m3.k.g(B4.c(c7522m3.l), c7522m3.g, new Callback() { // from class: k3
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    C7522m3 c7522m32 = C7522m3.this;
                                    c7522m32.getClass();
                                    if (((Boolean) obj).booleanValue()) {
                                        c7522m32.j.m(AbstractC8553p3.e, 1);
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                propertyModel.m(nd2, 3);
                if (TextUtils.equals(c7522m3.l, c7522m3.n)) {
                    AbstractC9763sb3.a(8);
                } else if (TextUtils.equals(c7522m3.l, c7522m3.m)) {
                    AbstractC9763sb3.a(4);
                } else {
                    AbstractC9763sb3.a(5);
                }
                if (c7522m3.j.h(AbstractC8553p3.f) == 0) {
                    C10106tb3.b.a.m("Chrome.AccountPickerBottomSheet.ConsecutiveActiveDismissalCount");
                }
                c7522m3.h.b(new Callback() { // from class: l3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        int i;
                        int i2;
                        C7522m3 c7522m32 = C7522m3.this;
                        c7522m32.getClass();
                        if (((GoogleServiceAuthError) obj).a == 1) {
                            i = 12;
                            i2 = 5;
                        } else {
                            i = 13;
                            i2 = 4;
                        }
                        AbstractC9763sb3.a(i);
                        c7522m32.j.m(AbstractC8553p3.e, i2);
                    }
                }, c7522m3.l);
            }
        };
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z2.run();
            }
        };
        int a = interfaceC9924t3.a();
        HashMap e = PropertyModel.e(AbstractC8553p3.g);
        JD2 jd2 = AbstractC8553p3.a;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.run();
            }
        };
        GD2 gd2 = new GD2();
        gd2.a = onClickListener2;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC8553p3.b;
        GD2 gd22 = new GD2();
        gd22.a = null;
        e.put(pd2, gd22);
        JD2 jd22 = AbstractC8553p3.c;
        View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: o3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.run();
            }
        };
        GD2 gd23 = new GD2();
        gd23.a = onClickListener3;
        e.put(jd22, gd23);
        JD2 jd23 = AbstractC8553p3.d;
        GD2 gd24 = new GD2();
        gd24.a = onClickListener;
        e.put(jd23, gd24);
        ND2 nd2 = AbstractC8553p3.e;
        DD2 dd2 = new DD2();
        dd2.a = 0;
        e.put(nd2, dd2);
        ID2 id2 = AbstractC8553p3.f;
        DD2 dd22 = new DD2();
        dd22.a = a;
        e.put(id2, dd22);
        PropertyModel propertyModel = new PropertyModel(e);
        this.j = propertyModel;
        ?? r8 = new VD2() { // from class: j3
            @Override // defpackage.VD2
            public final void d(WD2 wd2, Object obj) {
                FD2 fd2 = (FD2) obj;
                ND2 nd22 = AbstractC8553p3.e;
                C7522m3 c7522m3 = C7522m3.this;
                if (nd22 == fd2) {
                    c7522m3.p.p(Boolean.valueOf(c7522m3.j.h(nd22) == 2));
                } else {
                    c7522m3.getClass();
                }
            }
        };
        this.o = r8;
        propertyModel.a(r8);
        b.a(this);
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        this.k = accountManagerFacadeProvider;
        accountManagerFacadeProvider.b(this);
        this.n = null;
        a(B4.e(accountManagerFacadeProvider.a()));
    }

    @Override // defpackage.InterfaceC9238r3
    public final void k(String str) {
        PropertyModel propertyModel = this.j;
        propertyModel.m(AbstractC8553p3.e, 1);
        this.l = str;
        if (TextUtils.equals(str, str)) {
            propertyModel.o(AbstractC8553p3.b, this.i.c(str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e3] */
    @Override // defpackage.InterfaceC9238r3
    public final void s() {
        AbstractC9763sb3.a(2);
        final ?? r0 = new InterfaceC4352cp4() { // from class: e3
            @Override // defpackage.InterfaceC4352cp4
            public final void b(Intent intent, int i) {
                C7522m3 c7522m3 = C7522m3.this;
                c7522m3.getClass();
                if (i != -1) {
                    return;
                }
                AbstractC9763sb3.a(15);
                String stringExtra = intent.getStringExtra("authAccount");
                c7522m3.n = stringExtra;
                c7522m3.k(stringExtra);
            }
        };
        this.k.f(new Callback() { // from class: f3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Intent intent = (Intent) obj;
                C7522m3 c7522m3 = C7522m3.this;
                if (intent == null) {
                    AbstractC0399Db3.a(c7522m3.g);
                } else {
                    c7522m3.a.B(intent, r0, null);
                }
            }
        });
    }

    @Override // defpackage.F4
    public final void E() {
        this.k.a().g(new Callback() { // from class: d3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C7522m3.this.a((List) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }

    public final void a(List list) {
        boolean isEmpty = list.isEmpty();
        ND2 nd2 = AbstractC8553p3.e;
        PropertyModel propertyModel = this.j;
        PD2 pd2 = AbstractC8553p3.b;
        if (isEmpty) {
            propertyModel.m(nd2, 0);
            this.l = null;
            this.m = null;
            propertyModel.o(pd2, null);
            return;
        }
        this.m = ((Account) list.get(0)).name;
        int h = propertyModel.h(nd2);
        C10322uC2 c10322uC2 = this.i;
        if (h == 0) {
            String str = this.m;
            this.l = str;
            if (TextUtils.equals(str, str)) {
                propertyModel.o(pd2, c10322uC2.c(str));
            }
            propertyModel.m(nd2, 1);
            return;
        }
        if (h == 1 && B4.d(this.l, list) == null) {
            String str2 = this.m;
            this.l = str2;
            if (TextUtils.equals(str2, str2)) {
                propertyModel.o(pd2, c10322uC2.c(str2));
            }
        }
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        if (TextUtils.equals(this.l, str)) {
            this.j.o(AbstractC8553p3.b, this.i.c(str));
        }
    }
}
