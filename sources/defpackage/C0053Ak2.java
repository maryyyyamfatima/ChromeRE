package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ak2 */
/* loaded from: classes.dex */
public final class C0053Ak2 extends AbstractC10705vK2 {
    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        int indexOfChild;
        super.g(rect, view, recyclerView, lk2);
        if (view.getId() == R.id.footer_command && recyclerView.indexOfChild(view) - 1 >= 0 && recyclerView.getChildAt(indexOfChild).getId() != R.id.footer_command) {
            rect.top = view.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801c5) + view.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a5);
        }
    }

    @Override // defpackage.AbstractC10705vK2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount - 1) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getId() == R.id.footer_command) {
                return;
            }
            i++;
            View childAt2 = recyclerView.getChildAt(i);
            if (childAt2.getId() == R.id.footer_command) {
                B91 a = B91.a(childAt2.getContext());
                int dimensionPixelOffset = (childAt.getContext().getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0803a5) / 2) + childAt.getBottom();
                a.setBounds(recyclerView.getPaddingLeft() + recyclerView.getLeft(), dimensionPixelOffset, recyclerView.getRight() - recyclerView.getPaddingRight(), a.getIntrinsicHeight() + dimensionPixelOffset);
                a.draw(canvas);
            }
        }
    }
}
