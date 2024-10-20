package org.chromium.components.translate;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC5609gV1;
import defpackage.BD2;
import defpackage.C5265fV1;
import defpackage.ED2;
import defpackage.HU1;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC4578dV1;
import defpackage.ND2;
import defpackage.OD2;
import defpackage.UW3;
import defpackage.VW3;
import defpackage.ZN3;
import java.lang.ref.WeakReference;
import org.chromium.base.Callback;
import org.chromium.components.translate.TranslateMessage;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TranslateMessage implements VW3 {
    public final Context a;
    public final InterfaceC4578dV1 b;
    public final WebContents c;
    public long d;
    public final int e;
    public PropertyModel f;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class MenuItem {
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;

        public MenuItem(int i, String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
        }
    }

    public TranslateMessage(Context context, InterfaceC4578dV1 interfaceC4578dV1, WebContents webContents, long j, int i) {
        this.a = context;
        this.b = interfaceC4578dV1;
        this.c = webContents;
        this.d = j;
        this.e = i;
    }

    public void clearNativePointer() {
        this.d = 0L;
    }

    public void showMessage(String str, String str2, String str3) {
        boolean z = this.f == null;
        if (z) {
            BD2 bd2 = new BD2(HU1.F);
            bd2.c(HU1.a, 29);
            bd2.c(HU1.m, R.drawable.f50960_resource_name_obfuscated_res_0x7f090364);
            bd2.c(HU1.p, 0);
            bd2.c(HU1.r, R.drawable.f53230_resource_name_obfuscated_res_0x7f090487);
            bd2.e(HU1.u, new UW3(this));
            bd2.c(HU1.v, 2);
            long j = this.e;
            OD2 od2 = HU1.w;
            ED2 ed2 = new ED2();
            ed2.a = j;
            bd2.a.put(od2, ed2);
            bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: SW3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    long j2 = TranslateMessage.this.d;
                    if (j2 != 0) {
                        N.M_ai6ZnE(j2);
                    }
                    return 0;
                }
            });
            bd2.e(HU1.x, new Callback() { // from class: TW3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int intValue = ((Integer) obj).intValue();
                    TranslateMessage translateMessage = TranslateMessage.this;
                    translateMessage.f = null;
                    long j2 = translateMessage.d;
                    if (j2 == 0) {
                        return;
                    }
                    N.MARFJEb_(j2, intValue);
                }
            });
            this.f = bd2.a();
        }
        this.f.o(HU1.f, str);
        this.f.o(HU1.h, str2);
        boolean isEmpty = TextUtils.isEmpty(str3);
        ND2 nd2 = HU1.b;
        if (isEmpty) {
            this.f.m(nd2, 1);
        } else {
            this.f.o(HU1.c, str3);
            this.f.m(nd2, 0);
        }
        if (z) {
            ((C5265fV1) this.b).b(this.f, this.c, 2, false);
        }
    }

    public void dismiss() {
        ((C5265fV1) this.b).a(9, this.f);
    }

    public static TranslateMessage create(WebContents webContents, long j, int i) {
        WeakReference k;
        InterfaceC4578dV1 a;
        WindowAndroid Q0 = webContents.Q0();
        Context context = (Q0 == null || (k = Q0.k()) == null) ? null : (Context) k.get();
        if (context == null || (a = AbstractC5609gV1.a(webContents.Q0())) == null) {
            return null;
        }
        return new TranslateMessage(context, a, webContents, j, i);
    }

    public static void showTranslateError(WebContents webContents) {
        WeakReference k;
        WindowAndroid Q0 = webContents.Q0();
        Context context = null;
        if (Q0 != null && (k = Q0.k()) != null) {
            context = (Context) k.get();
        }
        if (context == null) {
            return;
        }
        ZN3.b(R.string.f89420_resource_name_obfuscated_res_0x7f140b54, 0, context).d();
    }

    public static MenuItem[] constructMenuItemArray(String[] strArr, String[] strArr2, boolean[] zArr, int[] iArr, String[] strArr3) {
        MenuItem[] menuItemArr = new MenuItem[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            menuItemArr[i] = new MenuItem(iArr[i], strArr[i], strArr2[i], strArr3[i], zArr[i]);
        }
        return menuItemArr;
    }
}
