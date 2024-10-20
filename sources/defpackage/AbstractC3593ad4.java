package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.android.chrome.R;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ad4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3593ad4 {
    public static void b(View view, Yc4 yc4) {
        C4499dF2 c4499dF2;
        if (view == null) {
            return;
        }
        if (yc4.a == 1) {
            int i = yc4.c;
            boolean z = yc4.b;
            YE2 ye2 = yc4.d;
            Context context = view.getContext();
            Zc4 zc4 = i > 0 ? new Zc4(view, i) : null;
            if (ye2 != null) {
                c4499dF2 = C4499dF2.c(context, ye2, zc4);
            } else {
                c4499dF2 = C4499dF2.b(context, zc4);
            }
            if (z) {
                WeakHashMap weakHashMap = Ec4.a;
                c4499dF2.d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
            }
        } else {
            int i2 = yc4.c;
            boolean z2 = yc4.b;
            int i3 = yc4.e;
            int i4 = yc4.f;
            Context context2 = view.getContext();
            c4499dF2 = i2 != 0 ? new C4499dF2(context2, AbstractC8142nr1.e, new VE2(i4, i3), new Zc4(view, i2)) : new C4499dF2(context2, AbstractC8142nr1.e, new VE2(i4, i3), new ZE2());
            if (z2) {
                WeakHashMap weakHashMap2 = Ec4.a;
                c4499dF2.d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
            }
        }
        if (view.getTag(R.id.highlight_state) != null ? ((Boolean) view.getTag(R.id.highlight_state)).booleanValue() : false) {
            return;
        }
        view.getContext().getResources();
        Drawable background = view.getBackground();
        if (background != null) {
            background = background.getConstantState().newDrawable();
        }
        view.setBackground(new LayerDrawable(background == null ? new Drawable[]{c4499dF2} : new Drawable[]{background, c4499dF2}));
        view.setTag(R.id.highlight_state, Boolean.TRUE);
        c4499dF2.start();
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        if (view.getTag(R.id.highlight_state) != null ? ((Boolean) view.getTag(R.id.highlight_state)).booleanValue() : false) {
            view.setTag(R.id.highlight_state, Boolean.FALSE);
            Resources resources = V60.a.getResources();
            Drawable background = view.getBackground();
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                if (layerDrawable.getNumberOfLayers() >= 2) {
                    view.setBackground(layerDrawable.getDrawable(0).getConstantState().newDrawable(resources));
                } else {
                    view.setBackground(null);
                }
            }
        }
    }
}
