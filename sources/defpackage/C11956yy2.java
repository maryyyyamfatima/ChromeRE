package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yy2 */
/* loaded from: classes.dex */
public final class C11956yy2 extends AbstractC10705vK2 {
    public Drawable a;
    public int g;
    public boolean h = true;
    public final /* synthetic */ AbstractC0123Ay2 i;

    public C11956yy2(AbstractC0123Ay2 abstractC0123Ay2) {
        this.i = abstractC0123Ay2;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (j(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.g + height);
                this.a.draw(canvas);
            }
        }
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        if (j(view, recyclerView)) {
            rect.bottom = this.g;
        }
    }

    public final boolean j(View view, RecyclerView recyclerView) {
        d K = recyclerView.K(view);
        boolean z = false;
        if (!((K instanceof C1812Ny2) && ((C1812Ny2) K).D)) {
            return false;
        }
        boolean z2 = this.h;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z2;
        }
        d K2 = recyclerView.K(recyclerView.getChildAt(indexOfChild + 1));
        if ((K2 instanceof C1812Ny2) && ((C1812Ny2) K2).C) {
            z = true;
        }
        return z;
    }
}
