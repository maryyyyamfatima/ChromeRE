package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4249cY1;
import defpackage.JG;
import defpackage.KG;
import defpackage.ZX1;
import org.chromium.chrome.browser.autofill.CardUnmaskBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CardUnmaskBridge {
    public final long a;
    public final KG b;

    public CardUnmaskBridge(long j, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j2, WindowAndroid windowAndroid) {
        this.a = j;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            this.b = null;
            new Handler().post(new Runnable() { // from class: CG
                @Override // java.lang.Runnable
                public final void run() {
                    CardUnmaskBridge cardUnmaskBridge = CardUnmaskBridge.this;
                    N.Mek0Fv7c(cardUnmaskBridge.a, cardUnmaskBridge);
                }
            });
        } else {
            this.b = new KG(activity, this, str, str2, str3, i, i2, z, z2, z4, z5, j2);
        }
    }

    public static CardUnmaskBridge create(long j, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j2, WindowAndroid windowAndroid) {
        return new CardUnmaskBridge(j, str, str2, str3, i, i2, z, z2, z3, z4, z5, j2, windowAndroid);
    }

    public final void show(WindowAndroid windowAndroid) {
        final KG kg = this.b;
        if (kg != null) {
            Activity activity = (Activity) windowAndroid.k().get();
            ZX1 s = windowAndroid.s();
            if (activity == null || s == null) {
                return;
            }
            kg.D = activity;
            kg.C = s;
            s.l(kg.g, 1, false);
            kg.f();
            kg.g.k(AbstractC4249cY1.m, true);
            EditText editText = kg.m;
            editText.addTextChangedListener(kg);
            editText.post(new Runnable() { // from class: IG
                @Override // java.lang.Runnable
                public final void run() {
                    KG.this.d();
                }
            });
        }
    }

    public final void update(String str, String str2, boolean z) {
        KG kg = this.b;
        if (kg != null) {
            if (kg.z) {
                kg.g.o(AbstractC4249cY1.c, str);
            } else {
                kg.g(kg.D, str);
                kg.g.o(AbstractC4249cY1.h, kg.i);
            }
            kg.j.setText(str2);
            kg.h = z;
            if (z && (kg.A == -1 || kg.B == -1)) {
                new JG(kg).c(AbstractC0185Bl.e);
            }
            kg.f();
        }
    }

    public final void dismiss() {
        KG kg = this.b;
        if (kg != null) {
            kg.C.c(4, kg.g);
        }
    }

    public final void disableAndWaitForVerification() {
        KG kg = this.b;
        if (kg != null) {
            kg.m.setEnabled(false);
            kg.n.setEnabled(false);
            kg.o.setEnabled(false);
            kg.g.k(AbstractC4249cY1.m, true);
            kg.e(0);
            kg.v.setVisibility(0);
            TextView textView = kg.w;
            textView.setText(R.string.0_resource_name_obfuscated_res_0x7f140217);
            textView.announceForAccessibility(textView.getText());
            kg.b();
        }
    }

    public final void verificationFinished(String str, boolean z) {
        final KG kg = this.b;
        if (kg != null) {
            if (str != null) {
                kg.e(8);
                if (z) {
                    TextView textView = kg.r;
                    textView.setText(str);
                    textView.setVisibility(0);
                    textView.announceForAccessibility(str);
                    kg.m.setEnabled(true);
                    kg.n.setEnabled(true);
                    kg.o.setEnabled(true);
                    kg.g.k(AbstractC4249cY1.m, false);
                    kg.d();
                    if (kg.h) {
                        return;
                    }
                    kg.q.setVisibility(0);
                    return;
                }
                kg.b();
                TextView textView2 = kg.l;
                textView2.setText(str);
                textView2.setVisibility(0);
                textView2.announceForAccessibility(str);
                return;
            }
            Runnable runnable = new Runnable() { // from class: HG
                @Override // java.lang.Runnable
                public final void run() {
                    KG kg2 = KG.this;
                    kg2.C.c(3, kg2.g);
                }
            };
            long j = kg.x;
            if (j > 0) {
                kg.v.setVisibility(8);
                kg.i.findViewById(R.id.verification_success).setVisibility(0);
                TextView textView3 = kg.w;
                textView3.setText(R.string.0_resource_name_obfuscated_res_0x7f140218);
                textView3.announceForAccessibility(textView3.getText());
                new Handler().postDelayed(runnable, j);
                return;
            }
            new Handler().post(runnable);
        }
    }
}
