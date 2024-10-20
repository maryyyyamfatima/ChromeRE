package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import org.chromium.base.task.PostTask;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Em1 */
/* loaded from: classes2.dex */
public final class C0582Em1 implements InterfaceC0322Cm1 {
    public final Context a;
    public WindowAndroid b;
    public final InterfaceC0192Bm1 c;
    public RunnableC0452Dm1 d;

    public C0582Em1(Context context, WindowAndroid windowAndroid, InterfaceC0192Bm1 interfaceC0192Bm1) {
        this.a = context;
        this.b = windowAndroid;
        this.c = interfaceC0192Bm1;
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void a(WindowAndroid windowAndroid) {
        this.b = windowAndroid;
    }

    public final InputMethodManager k() {
        WeakReference k;
        WindowAndroid windowAndroid = this.b;
        Context context = null;
        if (windowAndroid != null && (k = windowAndroid.k()) != null) {
            context = (Activity) k.get();
        }
        if (context == null) {
            context = this.a;
        }
        return (InputMethodManager) context.getSystemService("input_method");
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void j(View view) {
        InputMethodManager k = k();
        if (k == null) {
            return;
        }
        k.restartInput(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Type inference failed for: r0v7, types: [Dm1] */
    @Override // defpackage.InterfaceC0322Cm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final android.view.View r7, final android.os.ResultReceiver r8) {
        /*
            r6 = this;
            r0 = 0
            r6.d = r0
            org.chromium.ui.base.WindowAndroid r1 = r6.b
            if (r1 != 0) goto L8
            goto L15
        L8:
            java.lang.ref.WeakReference r1 = r1.k()
            if (r1 != 0) goto Lf
            goto L15
        Lf:
            java.lang.Object r0 = r1.get()
            android.app.Activity r0 = (android.app.Activity) r0
        L15:
            r1 = 0
            if (r0 == 0) goto L68
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 1
            if (r2 >= r3) goto L20
            goto L48
        L20:
            android.content.Context r2 = r6.a
            Op0 r2 = defpackage.AbstractC1895Op0.b(r2)
            Op0 r3 = defpackage.AbstractC1895Op0.b(r0)
            int r2 = r2.b
            int r3 = r3.b
            if (r3 == r2) goto L48
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r1] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r4] = r2
            java.lang.String r2 = "IMM"
            java.lang.String r3 = "Activity's display ID(%d) does not match context's display ID(%d). Using a workaround to show soft input on the correct display..."
            defpackage.AbstractC4851eH1.f(r2, r3, r5)
            r2 = r1
            goto L49
        L48:
            r2 = r4
        L49:
            if (r2 != 0) goto L68
            android.view.Window r0 = r0.getWindow()
            r0.setLocalFocus(r4, r4)
            Bm1 r0 = r6.c
            if (r0 == 0) goto L68
            org.chromium.content.browser.input.ImeAdapterImpl r0 = (org.chromium.content.browser.input.ImeAdapterImpl) r0
            UR r0 = r0.h
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 != 0) goto L68
            Dm1 r0 = new Dm1
            r0.<init>()
            r6.d = r0
            return
        L68:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            android.view.inputmethod.InputMethodManager r2 = r6.k()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L75
            r2.showSoftInput(r7, r1, r8)     // Catch: java.lang.Throwable -> L79
        L75:
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L79:
            r7 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0582Em1.c(android.view.View, android.os.ResultReceiver):void");
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final boolean e(View view) {
        InputMethodManager k = k();
        return k != null && k.isActive(view);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final boolean b(IBinder iBinder) {
        this.d = null;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            InputMethodManager k = k();
            boolean z = false;
            if (k != null) {
                if (k.hideSoftInputFromWindow(iBinder, 0, null)) {
                    z = true;
                }
            }
            return z;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void g(View view, int i, int i2, int i3, int i4) {
        InputMethodManager k = k();
        if (k == null) {
            return;
        }
        k.updateSelection(view, i, i2, i3, i4);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void d(View view, CursorAnchorInfo cursorAnchorInfo) {
        InputMethodManager k = k();
        if (k == null) {
            return;
        }
        k.updateCursorAnchorInfo(view, cursorAnchorInfo);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void i(View view, int i, ExtractedText extractedText) {
        InputMethodManager k = k();
        if (k == null) {
            return;
        }
        k.updateExtractedText(view, i, extractedText);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void f() {
        InputMethodManager k;
        if (Build.VERSION.SDK_INT <= 23 && (k = k()) != null) {
            try {
                InputMethodManager.class.getMethod("notifyUserAction", new Class[0]).invoke(k, new Object[0]);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void h() {
        RunnableC0452Dm1 runnableC0452Dm1 = this.d;
        if (runnableC0452Dm1 == null) {
            return;
        }
        this.d = null;
        PostTask.c(AbstractC5103f04.a, runnableC0452Dm1);
    }
}
