package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xj2 */
/* loaded from: classes.dex */
public final class C11525xj2 implements InterfaceC0322Cm1 {
    public final C0582Em1 a;
    public final Runnable b;

    public C11525xj2(Context context, WindowAndroid windowAndroid, Runnable runnable) {
        this.a = new C0582Em1(context, windowAndroid, null);
        this.b = runnable;
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void j(View view) {
        this.a.j(view);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void c(View view, ResultReceiver resultReceiver) {
        this.a.c(view, resultReceiver);
        this.b.run();
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final boolean e(View view) {
        return this.a.e(view);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final boolean b(IBinder iBinder) {
        return this.a.b(iBinder);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void g(View view, int i, int i2, int i3, int i4) {
        this.a.g(view, i, i2, i3, i4);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void d(View view, CursorAnchorInfo cursorAnchorInfo) {
        this.a.d(view, cursorAnchorInfo);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void i(View view, int i, ExtractedText extractedText) {
        this.a.i(view, i, extractedText);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void a(WindowAndroid windowAndroid) {
        this.a.b = windowAndroid;
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void h() {
        this.a.h();
    }
}
