package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7446lq extends C4733dw0 {
    public final PersonalDataManager.AutofillProfile p;
    public final Context q;
    public int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public String v;
    public String w;
    public String x;

    public C7446lq(Context context, PersonalDataManager.AutofillProfile autofillProfile, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        super(autofillProfile.getGUID(), null, null, null, null);
        this.q = context;
        this.p = autofillProfile;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.h = true;
        i(autofillProfile.getGUID(), str, str2, str3);
        j(i);
    }

    @Override // defpackage.C4733dw0
    public final boolean d() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:            if ((r2.r & 1) == 0) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g() {
        /*
            r2 = this;
            boolean r0 = r2.s
            if (r0 == 0) goto Lb
            int r0 = r2.r
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            boolean r0 = r2.t
            if (r0 == 0) goto L18
            int r0 = r2.r
            r0 = r0 & 2
            if (r0 != 0) goto L18
            int r1 = r1 + 1
        L18:
            boolean r0 = r2.u
            if (r0 == 0) goto L24
            int r0 = r2.r
            r0 = r0 & 4
            if (r0 != 0) goto L24
            int r1 = r1 + 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7446lq.g():int");
    }

    public final void i(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.v = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        }
        this.w = str3;
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        this.x = str4;
        String str5 = this.v;
        if (str5 == null) {
            String str6 = this.w;
            String str7 = str6 == null ? str4 : str6;
            if (str6 == null) {
                str4 = null;
            }
            f(str, str7, str4, null);
            return;
        }
        String str8 = this.w;
        f(str, str5, str8 == null ? str4 : str8, str8 != null ? str4 : null);
    }

    public final void j(int i) {
        this.r = i;
        this.a = i == 0;
        Context context = this.q;
        if (i == 0) {
            this.i = null;
            this.j = context.getString(R.string.f81370_resource_name_obfuscated_res_0x7f140816);
            return;
        }
        if (i == 1) {
            this.i = context.getString(R.string.f81470_resource_name_obfuscated_res_0x7f140820);
            this.j = context.getString(R.string.f81150_resource_name_obfuscated_res_0x7f1407ff);
        } else if (i == 2) {
            this.i = context.getString(R.string.f81510_resource_name_obfuscated_res_0x7f140824);
            this.j = context.getString(R.string.f81170_resource_name_obfuscated_res_0x7f140801);
        } else if (i == 4) {
            this.i = context.getString(R.string.f81390_resource_name_obfuscated_res_0x7f140818);
            this.j = context.getString(R.string.f81130_resource_name_obfuscated_res_0x7f1407fd);
        } else {
            this.i = context.getString(R.string.f81440_resource_name_obfuscated_res_0x7f14081d);
            this.j = context.getString(R.string.f81140_resource_name_obfuscated_res_0x7f1407fe);
        }
    }
}
