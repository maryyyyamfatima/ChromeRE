package org.chromium.chrome.browser.keyboard_accessory;

import J.N;
import android.app.Activity;
import android.util.SparseArray;
import com.android.chrome.R;
import defpackage.AbstractC3736b2;
import defpackage.AbstractC8166nv1;
import defpackage.C10023tL1;
import defpackage.C1012Hu1;
import defpackage.C10709vL1;
import defpackage.C11052wL1;
import defpackage.C1142Iu1;
import defpackage.C12044zE;
import defpackage.C1272Ju1;
import defpackage.C1402Ku1;
import defpackage.C1531Lu1;
import defpackage.C1661Mu1;
import defpackage.C1791Nu1;
import defpackage.C5175fD1;
import defpackage.C7822mv1;
import defpackage.C8385oa2;
import defpackage.CL1;
import defpackage.EL1;
import defpackage.GL1;
import defpackage.InterfaceC7697ma2;
import defpackage.JD2;
import defpackage.JL1;
import defpackage.K14;
import defpackage.X1;
import defpackage.XD2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ManualFillingComponentBridge {
    public XD2 b;
    public final WindowAndroid c;
    public final WebContents d;
    public long e;
    public final SparseArray a = new SparseArray();
    public final C10023tL1 f = new C10023tL1(this);

    public ManualFillingComponentBridge(long j, WindowAndroid windowAndroid, WebContents webContents) {
        this.e = j;
        this.c = windowAndroid;
        this.d = webContents;
    }

    public static ManualFillingComponentBridge create(long j, WindowAndroid windowAndroid, WebContents webContents) {
        return new ManualFillingComponentBridge(j, windowAndroid, webContents);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a8, code lost:            if (J.N.M09VlOh_("AutofillEnableManualFallbackForVirtualCards") == false) goto L35;     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Type inference failed for: r10v2, types: [FL1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onItemsAvailable(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.onItemsAvailable(java.lang.Object):void");
    }

    public final void onAutomaticGenerationStatusChanged(boolean z) {
        Activity activity = (Activity) this.c.k().get();
        C1142Iu1[] c1142Iu1Arr = (!z || activity == null) ? new C1142Iu1[0] : new C1142Iu1[]{new C1142Iu1(0, activity.getString(R.string.f80590_resource_name_obfuscated_res_0x7f1407c6), new Callback() { // from class: qL1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ManualFillingComponentBridge manualFillingComponentBridge = ManualFillingComponentBridge.this;
                manualFillingComponentBridge.getClass();
                EI2.h(0, 8, "KeyboardAccessory.AccessoryActionSelected");
                N.MmIaCnPe(manualFillingComponentBridge.e, manualFillingComponentBridge, 0);
            }
        }, null)};
        if (this.b == null && a() != null) {
            this.b = new XD2(0);
            C11052wL1 a = a();
            XD2 xd2 = this.b;
            CL1 cl1 = a.a;
            if (cl1.a1()) {
                JL1 a2 = cl1.k.a(this.d);
                C12044zE c12044zE = new C12044zE(xd2, new C1142Iu1[0], new GL1(a2));
                a2.e = c12044zE;
                c12044zE.b(cl1.m.a);
            }
        }
        XD2 xd22 = this.b;
        if (xd22 != null) {
            xd22.c(c1142Iu1Arr);
        }
    }

    public void showWhenKeyboardIsVisible() {
        if (a() != null) {
            CL1 cl1 = a().a;
            if (cl1.a1()) {
                PropertyModel propertyModel = cl1.g;
                propertyModel.k(EL1.a, true);
                if (cl1.Z0(4)) {
                    propertyModel.m(EL1.c, 13);
                }
            }
        }
    }

    public void hide() {
        if (a() != null) {
            CL1 cl1 = a().a;
            PropertyModel propertyModel = cl1.g;
            propertyModel.k(EL1.a, false);
            if (cl1.a1()) {
                propertyModel.m(EL1.c, 4);
            }
        }
    }

    public final void closeAccessorySheet() {
        if (a() != null) {
            a().a.c1();
        }
    }

    public final void swapSheetWithKeyboard() {
        if (a() != null) {
            CL1 cl1 = a().a;
            if (cl1.a1()) {
                X1 x1 = cl1.n;
                if (x1.a.a.j(AbstractC3736b2.c)) {
                    cl1.c1();
                }
            }
        }
    }

    public final void destroy() {
        if (a() != null) {
            a().g.a(this.f);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i < sparseArray.size()) {
                ((XD2) sparseArray.valueAt(i)).c(null);
                i++;
            } else {
                this.e = 0L;
                return;
            }
        }
    }

    public static Object createAccessorySheetData(int i, String str, String str2) {
        return new C1012Hu1(i, str, str2);
    }

    public final void showAccessorySheetTab(int i) {
        if (a() != null) {
            CL1 cl1 = a().a;
            if (cl1.a1()) {
                PropertyModel propertyModel = cl1.g;
                propertyModel.k(EL1.a, true);
                if (cl1.Z0(4)) {
                    propertyModel.m(EL1.c, 3);
                }
                C7822mv1 c7822mv1 = cl1.m.b.b;
                JD2 jd2 = AbstractC8166nv1.a;
                PropertyModel propertyModel2 = c7822mv1.a;
                C5175fD1 c5175fD1 = (C5175fD1) propertyModel2.i(jd2);
                int i2 = 0;
                while (i2 < c5175fD1.size() && ((C1661Mu1) c5175fD1.get(i2)).f != i) {
                    i2++;
                }
                propertyModel2.o(AbstractC8166nv1.b, Integer.valueOf(i2));
            }
        }
    }

    public final void addOptionToggleToAccessorySheetData(Object obj, String str, boolean z, final int i) {
        ((C1012Hu1) obj).d = new C1402Ku1(str, z, i, new Callback() { // from class: sL1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                ManualFillingComponentBridge manualFillingComponentBridge = ManualFillingComponentBridge.this;
                N.M2tSygph(manualFillingComponentBridge.e, manualFillingComponentBridge, i, ((Boolean) obj2).booleanValue());
            }
        });
    }

    public final Object addUserInfoToAccessorySheetData(Object obj, String str, boolean z, GURL gurl) {
        C1791Nu1 c1791Nu1 = new C1791Nu1(str, gurl, z);
        ((C1012Hu1) obj).e.add(c1791Nu1);
        return c1791Nu1;
    }

    public final void addFieldToUserInfo(Object obj, final int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        ((C1791Nu1) obj).c.add(new UserInfoField(str, str2, str3, str4, z, z2 ? new Callback() { // from class: pL1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                UserInfoField userInfoField = (UserInfoField) obj2;
                ManualFillingComponentBridge manualFillingComponentBridge = ManualFillingComponentBridge.this;
                manualFillingComponentBridge.getClass();
                boolean isObfuscated = userInfoField.isObfuscated();
                int i2 = i;
                DL1.c(i2, isObfuscated);
                N.M6ME2$pd(manualFillingComponentBridge.e, manualFillingComponentBridge, i2, userInfoField);
            }
        } : null));
    }

    public final void addPromoCodeInfoToAccessorySheetData(Object obj, final int i, String str, String str2, String str3, String str4, boolean z, String str5) {
        C1531Lu1 c1531Lu1 = new C1531Lu1();
        ((C1012Hu1) obj).f.add(c1531Lu1);
        c1531Lu1.a = new UserInfoField(str, str2, str3, str4, z, new Callback() { // from class: uL1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                UserInfoField userInfoField = (UserInfoField) obj2;
                ManualFillingComponentBridge manualFillingComponentBridge = ManualFillingComponentBridge.this;
                manualFillingComponentBridge.getClass();
                boolean isObfuscated = userInfoField.isObfuscated();
                int i2 = i;
                DL1.c(i2, isObfuscated);
                N.M6ME2$pd(manualFillingComponentBridge.e, manualFillingComponentBridge, i2, userInfoField);
            }
        });
        c1531Lu1.b = str5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [rL1] */
    public final void addFooterCommandToAccessorySheetData(Object obj, String str, final int i) {
        ((C1012Hu1) obj).g.add(new C1272Ju1(new Callback() { // from class: rL1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                ManualFillingComponentBridge manualFillingComponentBridge = ManualFillingComponentBridge.this;
                N.MmIaCnPe(manualFillingComponentBridge.e, manualFillingComponentBridge, i);
            }
        }, str));
    }

    public final C11052wL1 a() {
        K14 k14 = C10709vL1.k;
        InterfaceC7697ma2 interfaceC7697ma2 = (InterfaceC7697ma2) C10709vL1.k.e(this.c.t);
        if (interfaceC7697ma2 == null) {
            return null;
        }
        C11052wL1 c11052wL1 = (C11052wL1) ((C8385oa2) interfaceC7697ma2).g;
        if (c11052wL1 != null) {
            c11052wL1.g.a(this.f);
        }
        return c11052wL1;
    }
}
