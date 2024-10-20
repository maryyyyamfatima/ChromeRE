package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6252iM1 extends C5490g8 {
    public final DM1 c;
    public final Rect d;

    @Override // defpackage.C5490g8
    public final C5490g8 b(int i) {
        throw null;
    }

    @Override // defpackage.C5490g8
    public final C5490g8 c(CharSequence charSequence) {
        throw null;
    }

    @Override // defpackage.C5490g8
    public final C5490g8 e(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // defpackage.C5490g8
    public final C5490g8 f(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // defpackage.C5490g8
    public final C5490g8 i(int i) {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6252iM1(android.view.ContextThemeWrapper r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6252iM1.<init>(android.view.ContextThemeWrapper):void");
    }

    @Override // defpackage.C5490g8
    public final DialogC5834h8 a() {
        DialogC5834h8 a = super.a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        DM1 dm1 = this.c;
        if (dm1 instanceof DM1) {
            WeakHashMap weakHashMap = Ec4.a;
            dm1.i(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) dm1, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC1362Km1(a, rect));
        return a;
    }

    @Override // defpackage.C5490g8
    public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.g(null, null);
    }

    @Override // defpackage.C5490g8
    public final void d(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterfaceOnMultiChoiceClickListenerC4414d02 dialogInterfaceOnMultiChoiceClickListenerC4414d02) {
        super.d(charSequenceArr, zArr, dialogInterfaceOnMultiChoiceClickListenerC4414d02);
    }

    @Override // defpackage.C5490g8
    public final void h(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequenceArr, i, onClickListener);
    }

    @Override // defpackage.C5490g8
    public final C5490g8 j(View view) {
        this.a.q = view;
        return this;
    }
}
