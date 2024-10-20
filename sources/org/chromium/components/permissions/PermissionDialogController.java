package org.chromium.components.permissions;

import J.N;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC0738Fr2;
import defpackage.AbstractC1878Ol3;
import defpackage.AbstractC3236Yx1;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC7378le3;
import defpackage.BD2;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C1359Kl3;
import defpackage.C1618Ml3;
import defpackage.InterfaceC0868Gr2;
import defpackage.InterfaceC1689Na;
import defpackage.InterfaceC3906bY1;
import defpackage.L53;
import defpackage.N50;
import defpackage.V60;
import defpackage.ZX1;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.permissions.PermissionDialogController;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PermissionDialogController implements InterfaceC1689Na, InterfaceC3906bY1 {
    public PropertyModel g;
    public PropertyModel h;
    public PermissionDialogDelegate i;
    public ZX1 j;
    public final LinkedList k = new LinkedList();
    public int l = 0;
    public final C12157za2 a = new C12157za2();

    public static void createDialog(PermissionDialogDelegate permissionDialogDelegate) {
        PermissionDialogController permissionDialogController = AbstractC0738Fr2.a;
        permissionDialogController.k.add(permissionDialogDelegate);
        permissionDialogDelegate.b = permissionDialogController;
        permissionDialogController.d();
    }

    public final void d() {
        if (this.l == 0) {
            LinkedList linkedList = this.k;
            if (linkedList.isEmpty()) {
                return;
            }
            PermissionDialogDelegate permissionDialogDelegate = (PermissionDialogDelegate) linkedList.remove(0);
            this.i = permissionDialogDelegate;
            final Context context = (Context) permissionDialogDelegate.c.j.get();
            if (V60.a(context) == null) {
                PermissionDialogDelegate permissionDialogDelegate2 = this.i;
                N.My1ZBTOK(permissionDialogDelegate2.a, permissionDialogDelegate2);
                b(0);
                return;
            }
            PermissionDialogDelegate permissionDialogDelegate3 = this.i;
            if (permissionDialogDelegate3 == null) {
                this.l = 0;
                d();
                return;
            }
            this.j = permissionDialogDelegate3.c.s();
            PermissionDialogDelegate permissionDialogDelegate4 = this.i;
            Runnable runnable = new Runnable() { // from class: Dr2
                @Override // java.lang.Runnable
                public final void run() {
                    final PermissionDialogController permissionDialogController = PermissionDialogController.this;
                    if (permissionDialogController.h != null) {
                        return;
                    }
                    C2998Xb3 c2998Xb3 = new C2998Xb3(permissionDialogController.j, new Callback() { // from class: Er2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            PropertyModel propertyModel;
                            PermissionDialogController permissionDialogController2 = PermissionDialogController.this;
                            permissionDialogController2.getClass();
                            if (((Integer) obj).intValue() == 1 && (propertyModel = permissionDialogController2.g) != null) {
                                permissionDialogController2.j.c(5, propertyModel);
                            }
                            permissionDialogController2.h = null;
                        }
                    });
                    BD2 bd2 = new BD2(AbstractC4249cY1.B);
                    bd2.e(AbstractC4249cY1.a, c2998Xb3);
                    PD2 pd2 = AbstractC4249cY1.c;
                    Object[] objArr = {AbstractC6547jD.a.a};
                    Context context2 = context;
                    bd2.e(pd2, context2.getString(R.string.0_resource_name_obfuscated_res_0x7f14073b, objArr));
                    bd2.e(AbstractC4249cY1.f, context2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14073a));
                    bd2.d(AbstractC4249cY1.j, context2.getResources(), R.string.0_resource_name_obfuscated_res_0x7f1402f4);
                    bd2.d(AbstractC4249cY1.n, context2.getResources(), R.string.0_resource_name_obfuscated_res_0x7f140b5f);
                    bd2.b(AbstractC4249cY1.r, true);
                    PropertyModel a = bd2.a();
                    permissionDialogController.h = a;
                    permissionDialogController.j.l(a, 1, true);
                }
            };
            View a = AbstractC3236Yx1.a(R.layout.0_resource_name_obfuscated_res_0x7f0e01f5, (Context) permissionDialogDelegate4.c.j.get(), null);
            TextView textView = (TextView) a.findViewById(R.id.text);
            String str = permissionDialogDelegate4.e;
            textView.setText(str);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(permissionDialogDelegate4.d, 0, 0, 0);
            BD2 bd2 = new BD2(AbstractC4249cY1.B);
            bd2.e(AbstractC4249cY1.a, this);
            bd2.e(AbstractC4249cY1.h, a);
            bd2.e(AbstractC4249cY1.j, permissionDialogDelegate4.f);
            bd2.e(AbstractC4249cY1.n, permissionDialogDelegate4.g);
            bd2.e(AbstractC4249cY1.b, str);
            bd2.b(AbstractC4249cY1.s, true);
            bd2.e(AbstractC4249cY1.t, runnable);
            PropertyModel a2 = bd2.a();
            this.g = a2;
            this.j.l(a2, 0, false);
            this.l = 2;
        }
    }

    @Override // defpackage.InterfaceC1689Na
    public final void f() {
        PermissionDialogDelegate permissionDialogDelegate = this.i;
        if (permissionDialogDelegate == null) {
            this.l = 0;
        } else {
            N.MoC5mife(permissionDialogDelegate.a, permissionDialogDelegate);
            b(1);
        }
        d();
    }

    @Override // defpackage.InterfaceC1689Na
    public final void h() {
        PermissionDialogDelegate permissionDialogDelegate = this.i;
        if (permissionDialogDelegate == null) {
            this.l = 0;
        } else {
            N.My1ZBTOK(permissionDialogDelegate.a, permissionDialogDelegate);
            b(0);
        }
        d();
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.g = null;
        PermissionDialogDelegate permissionDialogDelegate = this.i;
        if (permissionDialogDelegate == null) {
            this.l = 0;
            return;
        }
        int i2 = this.l;
        if (i2 == 3) {
            this.l = 5;
            if (AndroidPermissionRequester.a(permissionDialogDelegate.c, (int[]) permissionDialogDelegate.h.clone(), this)) {
                return;
            }
            f();
            return;
        }
        if (i2 == 4) {
            N.MG2fhXvZ(permissionDialogDelegate.a, permissionDialogDelegate);
            b(2);
        } else {
            N.My1ZBTOK(permissionDialogDelegate.a, permissionDialogDelegate);
            b(0);
        }
        d();
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            this.l = 3;
            this.j.c(1, propertyModel);
        } else {
            if (i != 1) {
                return;
            }
            this.l = 4;
            this.j.c(2, propertyModel);
        }
    }

    public final void b(int i) {
        int i2;
        if (i != 0) {
            WindowAndroid windowAndroid = this.i.c;
            Iterator it = this.a.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                }
                InterfaceC0868Gr2 interfaceC0868Gr2 = (InterfaceC0868Gr2) c11814ya2.next();
                int[] iArr = (int[]) ((int[]) this.i.h.clone()).clone();
                final C1359Kl3 c1359Kl3 = (C1359Kl3) interfaceC0868Gr2;
                if (windowAndroid == c1359Kl3.f11453J) {
                    int[] iArr2 = AbstractC7378le3.a;
                    int i3 = 0;
                    while (true) {
                        if (i3 < 23) {
                            int i4 = iArr2[i3];
                            int length = iArr.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                i2 = iArr[i5];
                                if (i4 == i2) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            int[] iArr3 = AbstractC7378le3.b;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= 2) {
                                    i2 = -1;
                                    break;
                                }
                                int i7 = iArr3[i6];
                                int length2 = iArr.length;
                                for (int i8 = 0; i8 < length2; i8++) {
                                    i2 = iArr[i8];
                                    if ((i2 != 52 || N.Mudil8Bg("WebBluetoothNewPermissionsBackend")) && i7 == i2) {
                                        break;
                                    }
                                }
                                i6++;
                            }
                        }
                    }
                    if (i2 != -1) {
                        c1359Kl3.a();
                        c1359Kl3.G = i2;
                        boolean isIncognito = c1359Kl3.C.isIncognito();
                        int i9 = c1359Kl3.G;
                        Integer valueOf = Integer.valueOf(i);
                        int i10 = isIncognito ? R.color.0_resource_name_obfuscated_res_0x7f070116 : R.color.0_resource_name_obfuscated_res_0x7f070113;
                        int i11 = N50.c(i9).a;
                        Context context = c1359Kl3.B;
                        Drawable b = L53.b(i11, i10, context);
                        if (valueOf != null && valueOf.intValue() == 2) {
                            b = N50.a(context.getResources(), b);
                        }
                        C1618Ml3 c1618Ml3 = new C1618Ml3(b, isIncognito);
                        c1618Ml3.e = 1;
                        c1618Ml3.f = new Runnable() { // from class: Gl3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1359Kl3 c1359Kl32 = C1359Kl3.this;
                                int i12 = c1359Kl32.P - 500;
                                C9798sh2 c9798sh2 = c1359Kl32.H;
                                c9798sh2.getClass();
                                LU3.a(Profile.d()).notifyEvent("permission_request_shown");
                                View view = c9798sh2.b;
                                C12180ze1 c12180ze1 = new C12180ze1(view.getContext().getResources(), "IPH_PageInfo", R.string.0_resource_name_obfuscated_res_0x7f140760, R.string.0_resource_name_obfuscated_res_0x7f140760);
                                c12180ze1.m = i12;
                                c12180ze1.h = view;
                                c9798sh2.a.a(c12180ze1.a());
                            }
                        };
                        Handler handler = c1359Kl3.E;
                        handler.removeCallbacksAndMessages(null);
                        c1359Kl3.a.o(AbstractC1878Ol3.j, c1618Ml3);
                        handler.postDelayed(new Runnable() { // from class: Hl3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1359Kl3.this.d(1);
                            }
                        }, c1359Kl3.P);
                        c1359Kl3.I.a(0);
                    }
                }
            }
        }
        PermissionDialogDelegate permissionDialogDelegate = this.i;
        N.MLMIuACo(permissionDialogDelegate.a, permissionDialogDelegate);
        permissionDialogDelegate.a = 0L;
        this.i = null;
        this.l = 0;
    }
}
