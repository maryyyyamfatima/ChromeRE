package defpackage;

import android.view.View;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ss3 */
/* loaded from: classes.dex */
public final class C9865ss3 implements S1 {
    public final /* synthetic */ C2579Tw a;

    public C9865ss3(C2579Tw c2579Tw) {
        this.a = c2579Tw;
    }

    @Override // defpackage.S1
    public final boolean a(View view) {
        C2579Tw c2579Tw = this.a;
        c2579Tw.h.getClass();
        boolean z = false;
        if (!(view instanceof Snackbar$SnackbarLayout)) {
            return false;
        }
        WeakHashMap weakHashMap = Ec4.a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = c2579Tw.d;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        C2189Qw c2189Qw = c2579Tw.b;
        if (c2189Qw != null) {
            c2189Qw.a(view);
        }
        return true;
    }
}
