package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uq0 */
/* loaded from: classes.dex */
public final class C10536uq0 extends AbstractC10705vK2 {
    public static final int[] i = {R.attr.listDivider};
    public final Drawable a;
    public int g;
    public final Rect h = new Rect();

    public C10536uq0(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.g = i2;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.g == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // defpackage.AbstractC10705vK2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Drawable drawable;
        int height;
        int i2;
        int width;
        int i3;
        if (recyclerView.s == null || (drawable = this.a) == null) {
            return;
        }
        int i4 = this.g;
        Rect rect = this.h;
        int i5 = 0;
        if (i4 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i3 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i3, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i3 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i5 < childCount) {
                View childAt = recyclerView.getChildAt(i5);
                RecyclerView.M(rect, childAt);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                drawable.setBounds(i3, round - drawable.getIntrinsicHeight(), width, round);
                drawable.draw(canvas);
                i5++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i5 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i5);
            recyclerView.s.getClass();
            RecyclerView.M(rect, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            drawable.setBounds(round2 - drawable.getIntrinsicWidth(), i2, round2, height);
            drawable.draw(canvas);
            i5++;
        }
        canvas.restore();
    }
}
