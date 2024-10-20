package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tq2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2552Tq2 extends ViewGroup {
    public final C8170nw a;
    public final C3072Xq2 g;

    public C2552Tq2(Context context) {
        super(context);
        C8170nw c8170nw = new C8170nw(context, R.layout.f59190_resource_name_obfuscated_res_0x7f0e01ca);
        this.a = c8170nw;
        addView(c8170nw);
        C3072Xq2 c3072Xq2 = new C3072Xq2(getContext());
        this.g = c3072Xq2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f37660_resource_name_obfuscated_res_0x7f08061d);
        c3072Xq2.setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.f37840_resource_name_obfuscated_res_0x7f08062f), 0, 0, 0);
        c3072Xq2.a.setMinimumHeight(dimensionPixelSize);
        addView(c3072Xq2);
        setPaddingRelative(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.f37880_resource_name_obfuscated_res_0x7f080633));
    }

    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingTop = childAt.getMeasuredHeight() + paddingTop;
            }
        }
    }

    public final void b(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.getLayoutParams();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i3 += childAt.getMeasuredHeight();
        }
        setMeasuredDimension(size, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + i3, 1073741824));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.g.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.a.a;
        int i3 = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i3 += ((ImageView) it.next()).getMeasuredWidth();
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(i3);
        this.g.setLayoutParams(marginLayoutParams);
        b(i, i2);
    }
}
