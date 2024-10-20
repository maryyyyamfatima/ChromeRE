package org.chromium.chrome.browser.keyboard_accessory.bar_component;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.C8510ov1;
import defpackage.LK2;
import defpackage.RunnableC3351Zu1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class h extends C8510ov1 {
    public final /* synthetic */ KeyboardAccessoryModernView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(KeyboardAccessoryModernView keyboardAccessoryModernView, int i) {
        super(i);
        this.g = keyboardAccessoryModernView;
    }

    @Override // defpackage.C8510ov1
    public final int j(View view, RecyclerView recyclerView, LK2 lk2) {
        boolean z = RecyclerView.J(view) == recyclerView.r.q() - 1;
        int i = this.a;
        if (!z) {
            return i;
        }
        if (view.getWidth() == 0 && lk2.f) {
            view.post(new RunnableC3351Zu1(recyclerView));
            return recyclerView.getWidth() - (this.g.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a7) * ((ViewGroup) view).getChildCount());
        }
        int width = recyclerView.getWidth();
        int i2 = 0;
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int width2 = childAt.getWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                width2 = width2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
            i2 += width2;
        }
        return Math.max(((width - i2) - ((recyclerView.getChildCount() - 1) * i)) - (recyclerView.getPaddingStart() + recyclerView.getPaddingEnd()), i);
    }
}
