package org.chromium.components.page_info;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.Window;
import com.android.chrome.R;
import defpackage.AbstractC2242Rg2;
import defpackage.AbstractC6832k23;
import defpackage.C0813Gg2;
import defpackage.C10827vh2;
import defpackage.C11164wg2;
import defpackage.C11170wh2;
import defpackage.C12193zg2;
import defpackage.C12199zh2;
import defpackage.C1517Lr2;
import defpackage.C1647Mr2;
import defpackage.C2112Qg2;
import defpackage.C3152Yg2;
import defpackage.C7739mh2;
import defpackage.Ec4;
import defpackage.FI2;
import defpackage.InterfaceC0558Eh2;
import defpackage.InterfaceC10141th2;
import defpackage.InterfaceC11521xi4;
import defpackage.InterfaceC3906bY1;
import defpackage.RG1;
import defpackage.ViewOnClickListenerC0818Gh2;
import defpackage.WO;
import defpackage.XO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.components.content_settings.CookieControlsBridge;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.permissions.AndroidPermissionRequester;
import org.chromium.components.permissions.nfc.NfcSystemLevelSetting;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PageInfoController implements InterfaceC10141th2, InterfaceC3906bY1 {
    public Context a;
    public final WindowAndroid g;
    public final WebContents h;
    public final AbstractC2242Rg2 i;
    public long j;
    public final ViewOnClickListenerC0818Gh2 k;
    public final C0813Gg2 l;
    public C7739mh2 m;
    public final GURL n;
    public final int o;
    public C2112Qg2 p;
    public Runnable q;
    public final C1647Mr2 r;
    public InterfaceC0558Eh2 s;
    public final C12193zg2 t;
    public final C11170wh2 u;
    public C3152Yg2 v;
    public final ArrayList w;

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
    }

    public final void addPermissionSection(String str, String str2, int i, int i2) {
        this.r.a.add(new C1517Lr2(i, str, i2, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x038a A[LOOP:0: B:78:0x0384->B:80:0x038a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03cf  */
    /* JADX WARN: Type inference failed for: r0v52, types: [Og2] */
    /* JADX WARN: Type inference failed for: r1v23, types: [Lg2] */
    /* JADX WARN: Type inference failed for: r1v24, types: [Mg2] */
    /* JADX WARN: Type inference failed for: r2v28, types: [Ng2] */
    /* JADX WARN: Type inference failed for: r2v30, types: [TO] */
    /* JADX WARN: Type inference failed for: r3v13, types: [UO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PageInfoController(org.chromium.content_public.browser.WebContents r25, int r26, java.lang.String r27, final defpackage.WO r28, defpackage.XO r29) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.page_info.PageInfoController.<init>(org.chromium.content_public.browser.WebContents, int, java.lang.String, WO, XO):void");
    }

    public static void b(PageInfoController pageInfoController) {
        C7739mh2 c7739mh2 = pageInfoController.m;
        if (c7739mh2 != null) {
            c7739mh2.b(false);
            pageInfoController.m = null;
        }
        C3152Yg2 c3152Yg2 = pageInfoController.v;
        if (c3152Yg2 != null) {
            CookieControlsBridge cookieControlsBridge = c3152Yg2.l;
            long j = cookieControlsBridge.a;
            if (j != 0) {
                N.MupWWV0Q(j, cookieControlsBridge);
                cookieControlsBridge.a = 0L;
            }
            c3152Yg2.l = null;
            pageInfoController.v = null;
        }
    }

    public final void updatePermissionDisplay() {
        String quantityString;
        C1647Mr2 c1647Mr2 = this.r;
        c1647Mr2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1647Mr2.a.iterator();
        while (it.hasNext()) {
            C1517Lr2 c1517Lr2 = (C1517Lr2) it.next();
            C10827vh2 c10827vh2 = new C10827vh2();
            c10827vh2.a = c1517Lr2.c;
            int i = c1517Lr2.d;
            if (i == 1) {
                RG1 b = RG1.b();
                int i2 = c1517Lr2.c;
                if (i2 == 4 && !b.d()) {
                    c10827vh2.e = R.string.f79410_resource_name_obfuscated_res_0x7f14074b;
                } else if (i2 == 51 && !NfcSystemLevelSetting.isNfcAccessPossible()) {
                    c10827vh2.e = R.string.f79420_resource_name_obfuscated_res_0x7f14074c;
                } else if (i2 == 51 && !NfcSystemLevelSetting.isNfcSystemLevelSettingEnabled()) {
                    c10827vh2.e = R.string.f79430_resource_name_obfuscated_res_0x7f14074d;
                } else if (!AndroidPermissionRequester.hasRequiredAndroidPermissionsForContentSetting(c1647Mr2.c, i2)) {
                    if (i2 == 57) {
                        c10827vh2.e = R.string.f79400_resource_name_obfuscated_res_0x7f14074a;
                    } else {
                        c10827vh2.e = R.string.f79430_resource_name_obfuscated_res_0x7f14074d;
                    }
                }
            }
            SpannableString spannableString = new SpannableString(c1517Lr2.a);
            SpannableString spannableString2 = new SpannableString(c1517Lr2.b);
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(c1647Mr2.b, R.style.f102870_resource_name_obfuscated_res_0x7f15045c);
            spannableString.setSpan(textAppearanceSpan, 0, spannableString.length(), 17);
            c10827vh2.b = spannableString;
            spannableString2.setSpan(textAppearanceSpan, 0, spannableString2.length(), 17);
            c10827vh2.c = spannableString2;
            if (i == 1) {
                c10827vh2.d = true;
            } else if (i == 2) {
                c10827vh2.d = false;
            }
            arrayList.add(c10827vh2);
        }
        final C11170wh2 c11170wh2 = this.u;
        PageInfoRowView pageInfoRowView = c11170wh2.i;
        Resources resources = pageInfoRowView.getContext().getResources();
        C12199zh2 c12199zh2 = new C12199zh2();
        c12199zh2.d = c11170wh2.j;
        c12199zh2.b = R.drawable.f50480_resource_name_obfuscated_res_0x7f090331;
        c12199zh2.g = true;
        c12199zh2.f = new Runnable() { // from class: uh2
            @Override // java.lang.Runnable
            public final void run() {
                C11170wh2 c11170wh22 = C11170wh2.this;
                if (c11170wh22.n != -1) {
                    c11170wh22.p.a(2);
                }
                PageInfoController pageInfoController = (PageInfoController) c11170wh22.h;
                pageInfoController.g(14);
                pageInfoController.f(c11170wh22);
            }
        };
        int size = arrayList.size();
        if (size == 0) {
            quantityString = null;
        } else {
            C10827vh2 c10827vh22 = (C10827vh2) arrayList.get(0);
            Iterator it2 = arrayList.iterator();
            loop2: while (true) {
                boolean z = true;
                while (true) {
                    if (it2.hasNext()) {
                        C10827vh2 c10827vh23 = (C10827vh2) it2.next();
                        if (c10827vh23.e != 0) {
                            quantityString = resources.getString(R.string.f79640_resource_name_obfuscated_res_0x7f140766, c10827vh23.b.toString(), resources.getString(c10827vh23.e));
                            break loop2;
                        } else if (!z || c10827vh22.d != c10827vh23.d) {
                            z = false;
                        }
                    } else if (size == 1) {
                        quantityString = resources.getString(c10827vh22.d ? R.string.f79680_resource_name_obfuscated_res_0x7f14076a : R.string.f79690_resource_name_obfuscated_res_0x7f14076b, c10827vh22.b.toString());
                    } else {
                        C10827vh2 c10827vh24 = (C10827vh2) arrayList.get(1);
                        if (size == 2) {
                            if (z) {
                                quantityString = resources.getString(c10827vh22.d ? R.string.f79700_resource_name_obfuscated_res_0x7f14076c : R.string.f79710_resource_name_obfuscated_res_0x7f14076d, c10827vh22.b.toString(), c10827vh24.c.toString());
                            } else {
                                Object[] objArr = new Object[2];
                                objArr[0] = (c10827vh22.d ? c10827vh22.b : c10827vh24.b).toString();
                                objArr[1] = c10827vh22.d ? c10827vh24.c.toString() : c10827vh22.c.toString();
                                quantityString = resources.getString(R.string.f79720_resource_name_obfuscated_res_0x7f14076e, objArr);
                            }
                        } else if (z) {
                            int i3 = size - 2;
                            quantityString = resources.getQuantityString(c10827vh22.d ? R.plurals.f62600_resource_name_obfuscated_res_0x7f120027 : R.plurals.f62610_resource_name_obfuscated_res_0x7f120028, i3, c10827vh22.b.toString(), c10827vh24.c.toString(), Integer.valueOf(i3));
                        } else {
                            int i4 = size - 2;
                            quantityString = resources.getQuantityString(R.plurals.f62620_resource_name_obfuscated_res_0x7f120029, i4, c10827vh22.b.toString(), c10827vh24.c.toString(), Integer.valueOf(i4));
                        }
                    }
                }
            }
        }
        c12199zh2.e = quantityString;
        c12199zh2.a = c11170wh2.a.c && quantityString != null;
        if (c11170wh2.n != -1) {
            c12199zh2.i = c11170wh2.o;
        }
        pageInfoRowView.a(c12199zh2);
        c11170wh2.l = false;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (((C10827vh2) it3.next()).a == 30) {
                c11170wh2.l = true;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setSecurityDescription(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.page_info.PageInfoController.setSecurityDescription(java.lang.String, java.lang.String):void");
    }

    public final void setAdPersonalizationInfo(boolean z, String[] strArr) {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            InterfaceC0558Eh2 interfaceC0558Eh2 = (InterfaceC0558Eh2) it.next();
            if (interfaceC0558Eh2 instanceof C11164wg2) {
                final C11164wg2 c11164wg2 = (C11164wg2) interfaceC0558Eh2;
                List asList = Arrays.asList(strArr);
                c11164wg2.k = z;
                c11164wg2.l = asList;
                asList.isEmpty();
                C12199zh2 c12199zh2 = new C12199zh2();
                c12199zh2.a = z || !c11164wg2.l.isEmpty();
                c12199zh2.d = c11164wg2.b();
                c12199zh2.b = R.drawable.f46440_resource_name_obfuscated_res_0x7f09018a;
                c12199zh2.g = true;
                c12199zh2.f = new Runnable() { // from class: vg2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11164wg2 c11164wg22 = C11164wg2.this;
                        PageInfoController pageInfoController = (PageInfoController) c11164wg22.h;
                        pageInfoController.g(30);
                        pageInfoController.f(c11164wg22);
                    }
                };
                c11164wg2.i.a(c12199zh2);
            }
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        InterfaceC0558Eh2 interfaceC0558Eh2 = this.s;
        if (interfaceC0558Eh2 != null) {
            interfaceC0558Eh2.g();
            this.s = null;
        }
        this.p.destroy();
        this.p = null;
        N.Mz6XBRgf(this.j, this);
        this.j = 0L;
        this.a = null;
        Runnable runnable = this.q;
        if (runnable != null) {
            runnable.run();
            this.q = null;
        }
    }

    public final void g(int i) {
        long j = this.j;
        if (j != 0) {
            N.M5DCRkGK(j, this, i);
        }
    }

    public final boolean e(Context context) {
        InterfaceC11521xi4 interfaceC11521xi4;
        return !DeviceFormFactor.a(context) && ((interfaceC11521xi4 = this.i.b) == null || !interfaceC11521xi4.a());
    }

    public static void h(Activity activity, WebContents webContents, String str, int i, WO wo, XO xo) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        WeakHashMap weakHashMap = Ec4.a;
        if (decorView.isAttachedToWindow()) {
            if (i == 1) {
                FI2.a("MobileWebsiteSettingsOpenedFromMenu");
            } else if (i == 2) {
                FI2.a("MobileWebsiteSettingsOpenedFromToolbar");
            } else if (i == 3) {
                FI2.a("MobileWebsiteSettingsOpenedFromVR");
            }
            new WeakReference(new PageInfoController(webContents, AbstractC6832k23.a(webContents), str, wo, xo));
        }
    }

    public final void f(InterfaceC0558Eh2 interfaceC0558Eh2) {
        if (this.s != null) {
            return;
        }
        this.s = interfaceC0558Eh2;
        String b = interfaceC0558Eh2.b();
        InterfaceC0558Eh2 interfaceC0558Eh22 = this.s;
        C0813Gg2 c0813Gg2 = this.l;
        View d = interfaceC0558Eh22.d(c0813Gg2);
        if (d != null) {
            c0813Gg2.b(d, b, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Pg2] */
    public final void d() {
        if (this.s == null) {
            return;
        }
        ?? r0 = new Runnable() { // from class: Pg2
            @Override // java.lang.Runnable
            public final void run() {
                PageInfoController pageInfoController = PageInfoController.this;
                InterfaceC0558Eh2 interfaceC0558Eh2 = pageInfoController.s;
                if (interfaceC0558Eh2 == null) {
                    return;
                }
                interfaceC0558Eh2.g();
                pageInfoController.s.f();
                pageInfoController.s = null;
            }
        };
        this.l.b(this.k, null, r0);
    }
}
