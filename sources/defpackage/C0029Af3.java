package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.chrome.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Af3 */
/* loaded from: classes.dex */
public final class C0029Af3 extends AbstractC2969Ww {
    public static final int[] r = {R.attr.0_resource_name_obfuscated_res_0x7f050416, R.attr.0_resource_name_obfuscated_res_0x7f050418};
    public final AccessibilityManager q;

    public C0029Af3(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static C0029Af3 g(View view, String str) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? false : true ? R.layout.0_resource_name_obfuscated_res_0x7f0e01a3 : R.layout.0_resource_name_obfuscated_res_0x7f0e00c3, viewGroup, false);
        C0029Af3 c0029Af3 = new C0029Af3(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) c0029Af3.c.getChildAt(0)).a.setText(str);
        c0029Af3.e = -1;
        return c0029Af3;
    }

    public final void h() {
        C1199Jf3 b = C1199Jf3.b();
        int i = this.e;
        int i2 = -2;
        if (i != -2) {
            if (Build.VERSION.SDK_INT >= 29) {
                i = this.q.getRecommendedTimeoutMillis(i, 3);
            }
            i2 = i;
        }
        C1929Ow c1929Ow = this.m;
        synchronized (b.a) {
            if (b.c(c1929Ow)) {
                C0939Hf3 c0939Hf3 = b.c;
                c0939Hf3.b = i2;
                b.b.removeCallbacksAndMessages(c0939Hf3);
                b.d(b.c);
                return;
            }
            C0939Hf3 c0939Hf32 = b.d;
            boolean z = false;
            if (c0939Hf32 != null) {
                if (c1929Ow != null && c0939Hf32.a.get() == c1929Ow) {
                    z = true;
                }
            }
            if (z) {
                b.d.b = i2;
            } else {
                b.d = new C0939Hf3(i2, c1929Ow);
            }
            C0939Hf3 c0939Hf33 = b.c;
            if (c0939Hf33 == null || !b.a(c0939Hf33, 4)) {
                b.c = null;
                b.e();
            }
        }
    }
}
