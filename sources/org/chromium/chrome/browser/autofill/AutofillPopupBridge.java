package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ListView;
import com.android.chrome.R;
import defpackage.AbstractC12248zp3;
import defpackage.C0649Ez3;
import defpackage.C10709vL1;
import defpackage.C10878vq;
import defpackage.C11052wL1;
import defpackage.C11907yq;
import defpackage.C4115c8;
import defpackage.C5390fr;
import defpackage.C5490g8;
import defpackage.C5734gr;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.DialogC5834h8;
import defpackage.InterfaceC0751Fu0;
import defpackage.InterfaceC10535uq;
import defpackage.InterfaceC7697ma2;
import defpackage.K14;
import defpackage.UN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.autofill.AutofillSuggestion;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillPopupBridge implements InterfaceC10535uq, DialogInterface.OnClickListener {
    public long a;
    public final C5734gr g;
    public DialogC5834h8 h;
    public final Activity i;
    public final WebContentsAccessibilityImpl j;

    public AutofillPopupBridge(View view, long j, WindowAndroid windowAndroid) {
        this.a = j;
        Activity activity = (Activity) windowAndroid.k().get();
        Tab v = C0649Ez3.v(windowAndroid);
        WebContents b = v != null ? v.b() : null;
        if (activity != null) {
            Configuration configuration = activity.getResources().getConfiguration();
            C7928nE c7928nE = UN.a;
            if (!(N.M09VlOh_("AutofillRefreshStyleAndroid") && configuration.orientation == 2 && !configuration.isLayoutSizeAtLeast(4)) && b != null) {
                C5734gr c5734gr = new C5734gr(activity, view, this);
                this.g = c5734gr;
                this.i = activity;
                K14 k14 = C10709vL1.k;
                InterfaceC7697ma2 interfaceC7697ma2 = (InterfaceC7697ma2) C10709vL1.k.e(windowAndroid.t);
                if (interfaceC7697ma2 != null) {
                    C8385oa2 c8385oa2 = (C8385oa2) interfaceC7697ma2;
                    if (AbstractC12248zp3.a(c8385oa2)) {
                        ((C11052wL1) c8385oa2.g).a.q = c5734gr;
                    }
                }
                this.j = WebContentsAccessibilityImpl.k(b);
                return;
            }
        }
        this.g = null;
        this.i = null;
    }

    public static AutofillPopupBridge create(View view, long j, WindowAndroid windowAndroid) {
        return new AutofillPopupBridge(view, j, windowAndroid);
    }

    @Override // defpackage.InterfaceC10535uq
    public final void d() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MOHZpjVa(j, this);
    }

    @Override // defpackage.InterfaceC10535uq
    public final void b(int i) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MD76PU5t(j, this, i);
    }

    @Override // defpackage.InterfaceC10535uq
    public final void a(int i) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.Mfhlibrm(j, this, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MlIbag6_(j, this);
    }

    public final void dismiss() {
        this.a = 0L;
        C5734gr c5734gr = this.g;
        if (c5734gr != null) {
            c5734gr.a.dismiss();
        }
        DialogC5834h8 dialogC5834h8 = this.h;
        if (dialogC5834h8 != null) {
            dialogC5834h8.dismiss();
        }
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = this.j;
        if (webContentsAccessibilityImpl.q()) {
            N.MdET073e(webContentsAccessibilityImpl.k);
            webContentsAccessibilityImpl.v = null;
        }
    }

    public final void show(AutofillSuggestion[] autofillSuggestionArr, boolean z) {
        C5734gr c5734gr = this.g;
        if (c5734gr != null) {
            C7928nE c7928nE = UN.a;
            boolean M09VlOh_ = N.M09VlOh_("AutofillRefreshStyleAndroid");
            c5734gr.i = new ArrayList(Arrays.asList(autofillSuggestionArr));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (AutofillSuggestion autofillSuggestion : autofillSuggestionArr) {
                int i = autofillSuggestion.f;
                if (i == -3) {
                    hashSet.add(Integer.valueOf(arrayList.size()));
                } else if (M09VlOh_ && (i == -13 || i == -9 || i == -7 || i == -5 || i == -4)) {
                    arrayList2.add(autofillSuggestion);
                } else {
                    arrayList.add(autofillSuggestion);
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            InterfaceC0751Fu0 interfaceC0751Fu0 = c5734gr.a;
            Context context = c5734gr.g;
            if (!isEmpty && !interfaceC0751Fu0.a()) {
                interfaceC0751Fu0.l(new C11907yq(context, arrayList2, c5734gr));
            }
            interfaceC0751Fu0.f(new C10878vq(context, arrayList, hashSet, M09VlOh_));
            interfaceC0751Fu0.h(z);
            interfaceC0751Fu0.b();
            interfaceC0751Fu0.d().setOnItemLongClickListener(c5734gr);
            interfaceC0751Fu0.d().setAccessibilityDelegate(new C5390fr(c5734gr));
            ListView d = interfaceC0751Fu0.d();
            WebContentsAccessibilityImpl webContentsAccessibilityImpl = this.j;
            if (webContentsAccessibilityImpl.q()) {
                webContentsAccessibilityImpl.v = d;
                N.MMiqVowe(webContentsAccessibilityImpl.k);
            }
        }
    }

    public final void confirmDeletion(String str, String str2) {
        C5490g8 c5490g8 = new C5490g8(this.i, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.d = str;
        c4115c8.f = str2;
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, null);
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140717, this);
        DialogC5834h8 a = c5490g8.a();
        this.h = a;
        a.show();
    }

    public final boolean wasSuppressed() {
        return this.g == null;
    }

    public static AutofillSuggestion[] createAutofillSuggestionArray(int i) {
        return new AutofillSuggestion[i];
    }

    public static void addToAutofillSuggestionArray(AutofillSuggestion[] autofillSuggestionArr, int i, String str, String str2, String str3, int i2, boolean z, int i3, boolean z2, boolean z3, boolean z4, GURL gurl) {
        autofillSuggestionArr[i] = new AutofillSuggestion(str, str2, str3, i2 == 0 ? 0 : i2, z, i3, z2, z3, z4, null, null, gurl != null ? PersonalDataManager.d().c(gurl) : null);
    }

    @Override // defpackage.InterfaceC10535uq
    public final void c() {
        int Mk31b3DX;
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = this.j;
        if (!webContentsAccessibilityImpl.q() || (Mk31b3DX = N.Mk31b3DX(webContentsAccessibilityImpl.k)) == 0) {
            return;
        }
        webContentsAccessibilityImpl.u(Mk31b3DX);
        webContentsAccessibilityImpl.z(webContentsAccessibilityImpl.t);
    }
}
