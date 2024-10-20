package org.chromium.chrome.browser.sync.settings;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC2308Rt3;
import defpackage.C10322uC2;
import defpackage.C9636sC2;
import defpackage.InterfaceC10214tt3;
import defpackage.InterfaceC1528Lt3;
import defpackage.InterfaceC9979tC2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncErrorCardPreference extends Preference implements InterfaceC1528Lt3, InterfaceC9979tC2 {
    public final C10322uC2 T;
    public InterfaceC10214tt3 U;
    public int V;

    public SyncErrorCardPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = new C10322uC2(context, context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08082b), new C9636sC2(context, R.drawable.0_resource_name_obfuscated_res_0x7f090327));
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e01fb;
        this.V = -1;
    }

    @Override // androidx.preference.Preference
    public final void s() {
        super.s();
        this.T.a(this);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            b.a(this);
        }
        W();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    @Override // androidx.preference.Preference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.C1812Ny2 r9) {
        /*
            r8 = this;
            super.v(r9)
            int r0 = r8.V
            r1 = -1
            if (r0 != r1) goto L9
            return
        L9:
            r0 = 2130773749(0x7f0106f5, float:1.7150653E38)
            android.view.View r9 = r9.v(r0)
            org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView r9 = (org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView) r9
            Jg1 r0 = defpackage.C1202Jg1.a()
            org.chromium.chrome.browser.profiles.Profile r1 = org.chromium.chrome.browser.profiles.Profile.d()
            r0.getClass()
            org.chromium.components.signin.identitymanager.IdentityManager r0 = defpackage.C1202Jg1.b(r1)
            r1 = 1
            org.chromium.components.signin.base.CoreAccountInfo r0 = r0.b(r1)
            java.lang.String r0 = org.chromium.components.signin.base.CoreAccountInfo.b(r0)
            if (r0 != 0) goto L2e
            goto Ld5
        L2e:
            uC2 r2 = r8.T
            hq0 r0 = r2.c(r0)
            android.widget.ImageView r2 = r9.g
            android.graphics.drawable.Drawable r0 = r0.b
            r2.setImageDrawable(r0)
            android.widget.ImageView r0 = r9.a
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r9.h
            r0.setVisibility(r2)
            int r0 = r8.V
            r3 = 0
            r4 = 7
            if (r0 != r4) goto L53
            android.widget.TextView r0 = r9.i
            r0.setVisibility(r2)
            goto L58
        L53:
            android.widget.TextView r0 = r9.i
            r0.setVisibility(r3)
        L58:
            android.widget.TextView r0 = r9.i
            int r5 = r8.V
            android.content.Context r6 = r8.a
            java.lang.String r5 = defpackage.AbstractC2308Rt3.b(r6, r5)
            r0.setText(r5)
            android.widget.TextView r0 = r9.j
            int r5 = r8.V
            java.lang.String r5 = defpackage.AbstractC2308Rt3.c(r6, r5)
            r0.setText(r5)
            org.chromium.ui.widget.ButtonCompat r0 = r9.k
            int r5 = r8.V
            r7 = 128(0x80, float:1.8E-43)
            if (r5 == r7) goto La5
            switch(r5) {
                case 0: goto La5;
                case 1: goto L9d;
                case 2: goto L95;
                case 3: goto L95;
                case 4: goto L95;
                case 5: goto L95;
                case 6: goto L85;
                case 7: goto L7d;
                default: goto L7b;
            }
        L7b:
            r1 = 0
            goto Lac
        L7d:
            r1 = 2132019972(0x7f140b04, float:1.9678294E38)
            java.lang.String r1 = r6.getString(r1)
            goto Lac
        L85:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            org.chromium.base.BuildInfo r5 = defpackage.AbstractC6547jD.a
            java.lang.String r5 = r5.a
            r1[r3] = r5
            r3 = 2132018016(0x7f140360, float:1.9674327E38)
            java.lang.String r1 = r6.getString(r3, r1)
            goto Lac
        L95:
            r1 = 2132020062(0x7f140b5e, float:1.9678477E38)
            java.lang.String r1 = r6.getString(r1)
            goto Lac
        L9d:
            r1 = 2132019088(0x7f140790, float:1.96765E38)
            java.lang.String r1 = r6.getString(r1)
            goto Lac
        La5:
            r1 = 2132017659(0x7f1401fb, float:1.9673603E38)
            java.lang.String r1 = r6.getString(r1)
        Lac:
            r0.setText(r1)
            org.chromium.ui.widget.ButtonCompat r0 = r9.k
            rt3 r1 = new rt3
            r1.<init>()
            r0.setOnClickListener(r1)
            int r0 = r8.V
            if (r0 != r4) goto Ld0
            android.widget.Button r0 = r9.l
            st3 r1 = new st3
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.Button r9 = r9.l
            r0 = 2132017908(0x7f1402f4, float:1.9674108E38)
            r9.setText(r0)
            goto Ld5
        Ld0:
            android.widget.Button r9 = r9.l
            r9.setVisibility(r2)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.sync.settings.SyncErrorCardPreference.v(Ny2):void");
    }

    public final void W() {
        int a = AbstractC2308Rt3.a();
        this.V = a;
        boolean z = a == 7 && ((ManageSyncSettings) this.U).k0;
        if (a == -1 || z) {
            S(false);
        } else {
            S(true);
            q();
        }
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        W();
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        W();
    }

    @Override // androidx.preference.Preference
    public final void y() {
        V();
        this.T.e(this);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b != null) {
            b.l(this);
        }
    }
}
