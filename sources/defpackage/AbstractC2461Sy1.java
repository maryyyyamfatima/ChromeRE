package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2461Sy1 {
    public static final Rect a = new Rect();

    public static void b(ImageView imageView, Integer num) {
        if (num != null) {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public static int a(ViewGroup viewGroup, View view, int i, int i2, View view2, View view3) {
        if (viewGroup == view) {
            throw new IllegalStateException("contentView should be the single child of containerViewGroup");
        }
        if (viewGroup.getChildCount() == 0) {
            return i2;
        }
        int i3 = 0;
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        Resources resources = view.getContext().getResources();
        Rect rect = a;
        view.getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f40550_resource_name_obfuscated_res_0x7f080750);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f40600_resource_name_obfuscated_res_0x7f080755);
        if (view3 != null) {
            Context context = OP0.b;
            ((R61) ((Q61) P61.g.a.get())).getClass();
            if (OP0.b(((Boolean) R61.a.a(context)).booleanValue())) {
                i3 = view3.getMeasuredHeight();
            } else {
                i3 = view3.getHeight();
            }
        }
        int i4 = (dimensionPixelSize2 * 2) + i3;
        int height2 = (height - view2.getHeight()) - i4;
        if (measuredHeight + i4 > height && height2 > dimensionPixelSize) {
            measuredHeight = height - i4;
        }
        return View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
    }
}
