package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hf3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6010hf3 {
    public final C10614v33 a;
    public WindowAndroid b;
    public C5666gf3 c;
    public final Handler d;
    public final RunnableC2883We3 e;
    public final C2493Te3 f;

    public C6010hf3(C10614v33 c10614v33, WebContents webContents, C2493Te3 c2493Te3) {
        this.a = c10614v33;
        this.b = webContents.Q0();
        C10191tp4 e = C10191tp4.e(webContents);
        if (e != null) {
            e.b(new C2753Ve3(this));
        }
        this.d = new Handler();
        this.e = new RunnableC2883We3(this);
        this.f = c2493Te3;
    }

    public final TextClassifier a() {
        Context context;
        TextClassifier textClassifier;
        WindowAndroid windowAndroid = this.b;
        if (windowAndroid == null || (context = (Context) windowAndroid.j.get()) == null) {
            return null;
        }
        textClassifier = ((TextClassificationManager) context.getSystemService("textclassification")).getTextClassifier();
        return textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:            if (r2 != false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r11, int r12, int r13, java.lang.CharSequence r14) {
        /*
            r10 = this;
            org.chromium.ui.base.WindowAndroid r0 = r10.b
            r1 = 0
            if (r0 != 0) goto L6
            goto L10
        L6:
            Oi1 r0 = r0.j
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L12
        L10:
            r4 = r1
            goto L31
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto L2c
            Te3 r0 = r10.f
            if (r0 != 0) goto L1d
            goto L2c
        L1d:
            android.view.textclassifier.TextClassifier r0 = r0.b
            if (r0 == 0) goto L27
            boolean r2 = defpackage.AbstractC1973Pe3.a(r0)
            if (r2 == 0) goto L30
        L27:
            android.view.textclassifier.TextClassifier r0 = r10.a()
            goto L30
        L2c:
            android.view.textclassifier.TextClassifier r0 = r10.a()
        L30:
            r4 = r0
        L31:
            if (r4 == 0) goto L60
            android.view.textclassifier.TextClassifier r0 = android.view.textclassifier.TextClassifier.NO_OP
            if (r4 != r0) goto L38
            goto L60
        L38:
            gf3 r0 = r10.c
            if (r0 == 0) goto L42
            r2 = 0
            r0.a(r2)
            r10.c = r1
        L42:
            gf3 r0 = new gf3
            org.chromium.ui.base.WindowAndroid r1 = r10.b
            Oi1 r1 = r1.j
            java.lang.Object r1 = r1.get()
            r9 = r1
            android.content.Context r9 = (android.content.Context) r9
            r2 = r0
            r3 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.c = r0
            g43 r11 = defpackage.AbstractC0185Bl.f
            r0.c(r11)
            return
        L60:
            android.os.Handler r11 = r10.d
            We3 r12 = r10.e
            r11.post(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6010hf3.b(int, int, int, java.lang.CharSequence):void");
    }
}
