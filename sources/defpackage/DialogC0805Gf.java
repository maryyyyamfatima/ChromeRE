package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0805Gf extends DialogC8536p00 implements InterfaceC4631df {
    public LayoutInflaterFactory2C0545Ef h;
    public final C0675Ff i;

    @Override // defpackage.InterfaceC4631df
    public final void J() {
    }

    @Override // defpackage.InterfaceC4631df
    public final void T() {
    }

    @Override // defpackage.InterfaceC4631df
    public final void x() {
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().d();
        super.onCreate(bundle);
        c().f();
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public final void setContentView(int i) {
        c().j(i);
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public final void setContentView(View view) {
        c().k(view);
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) c();
        layoutInflaterFactory2C0545Ef.w();
        return layoutInflaterFactory2C0545Ef.k.findViewById(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().n(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        c().n(getContext().getString(i));
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) c();
        layoutInflaterFactory2C0545Ef.B();
        J4 j4 = layoutInflaterFactory2C0545Ef.n;
        if (j4 != null) {
            j4.p(false);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        c().g();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().e();
    }

    public final Cif c() {
        if (this.h == null) {
            int i = Cif.a;
            this.h = new LayoutInflaterFactory2C0545Ef(getContext(), getWindow(), this, this);
        }
        return this.h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ff] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0805Gf(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2131034527(0x7f05019f, float:1.7679574E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            Ff r2 = new Ff
            r2.<init>()
            r4.i = r2
            if r2 = r4.c()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            Ef r5 = (defpackage.LayoutInflaterFactory2C0545Ef) r5
            r5.T = r6
            r2.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC0805Gf.<init>(android.content.Context, int):void");
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC6784ju1.b(this.i, getWindow().getDecorView(), this, keyEvent);
    }
}
