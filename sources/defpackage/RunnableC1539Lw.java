package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1539Lw implements Runnable {
    public final /* synthetic */ AbstractC2969Ww a;

    public RunnableC1539Lw(AbstractC2969Ww abstractC2969Ww) {
        this.a = abstractC2969Ww;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        AbstractC2969Ww abstractC2969Ww = this.a;
        if (abstractC2969Ww.c == null || (context = abstractC2969Ww.b) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = abstractC2969Ww.c;
        snackbar$SnackbarLayout.getLocationOnScreen(iArr);
        int height = (i - (snackbar$SnackbarLayout.getHeight() + iArr[1])) + ((int) abstractC2969Ww.c.getTranslationY());
        if (height >= abstractC2969Ww.j) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = abstractC2969Ww.c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(AbstractC2969Ww.p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (abstractC2969Ww.j - height) + marginLayoutParams.bottomMargin;
        abstractC2969Ww.c.requestLayout();
    }
}
