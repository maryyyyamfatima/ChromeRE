package defpackage;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class V6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox a;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ Z6 h;

    public V6(Z6 z6, CheckBox checkBox, EditText editText) {
        this.h = z6;
        this.a = checkBox;
        this.g = editText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:            if ((((org.chromium.components.browser_ui.site_settings.FourStateCookieSettingsPreference) r9.N0().X("four_state_cookie_toggle")).X() == defpackage.GS0.ALLOW) != false) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:            r3 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:            r3 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:            if (J.N.MJSt3Ocq(r2, r9.m0.f()) != false) goto L145;     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.content.DialogInterface r9, int r10) {
        /*
            r8 = this;
            r0 = -1
            if (r10 != r0) goto Lb4
            android.widget.CheckBox r9 = r8.a
            boolean r9 = r9.isChecked()
            android.widget.EditText r10 = r8.g
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.trim()
            java.lang.String r0 = "*"
            if (r9 == 0) goto L1d
            r1 = r0
            goto L1e
        L1d:
            r1 = r10
        L1e:
            if (r9 != 0) goto L21
            r10 = r0
        L21:
            Z6 r9 = r8.h
            Y6 r9 = r9.T
            org.chromium.components.browser_ui.site_settings.SingleCategorySettings r9 = (org.chromium.components.browser_ui.site_settings.SingleCategorySettings) r9
            GP r2 = r9.j0
            org.chromium.chrome.browser.profiles.Profile r2 = r2.b
            ke3 r3 = r9.m0
            r4 = 8
            boolean r3 = r3.o(r4)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L56
            boolean r3 = r9.v0
            if (r3 == 0) goto L56
            androidx.preference.PreferenceScreen r3 = r9.N0()
            java.lang.String r7 = "four_state_cookie_toggle"
            androidx.preference.Preference r3 = r3.X(r7)
            org.chromium.components.browser_ui.site_settings.FourStateCookieSettingsPreference r3 = (org.chromium.components.browser_ui.site_settings.FourStateCookieSettingsPreference) r3
            GS0 r3 = r3.X()
            GS0 r7 = defpackage.GS0.ALLOW
            if (r3 != r7) goto L52
            r3 = r5
            goto L53
        L52:
            r3 = r4
        L53:
            if (r3 == 0) goto L64
            goto L62
        L56:
            ke3 r3 = r9.m0
            int r3 = r3.f()
            boolean r3 = J.N.MJSt3Ocq(r2, r3)
            if (r3 == 0) goto L64
        L62:
            r3 = r6
            goto L65
        L64:
            r3 = r5
        L65:
            ke3 r7 = r9.m0
            int r7 = r7.f()
            if (r7 == 0) goto L6e
            goto L71
        L6e:
            r10.equals(r0)
        L71:
            J.N.M2hAJhrO(r2, r7, r1, r10, r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7b
            r1 = r10
        L7b:
            android.content.Context r10 = r9.K()
            android.content.Context r0 = r9.K()
            r2 = 2132020212(0x7f140bf4, float:1.967878E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r1
            java.lang.String r0 = java.lang.String.format(r0, r2)
            ZN3 r10 = defpackage.ZN3.c(r10, r0, r4)
            r10.d()
            r9.T0()
            ke3 r9 = r9.m0
            r10 = 18
            boolean r9 = r9.o(r10)
            if (r9 == 0) goto Lb7
            if (r3 != r6) goto Lae
            java.lang.String r9 = "SoundContentSetting.MuteBy.PatternException"
            defpackage.FI2.a(r9)
            goto Lb7
        Lae:
            java.lang.String r9 = "SoundContentSetting.UnmuteBy.PatternException"
            defpackage.FI2.a(r9)
            goto Lb7
        Lb4:
            r9.dismiss()
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V6.onClick(android.content.DialogInterface, int):void");
    }
}
