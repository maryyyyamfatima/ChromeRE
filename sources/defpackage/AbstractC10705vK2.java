package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vK2 */
/* loaded from: classes.dex */
public abstract class AbstractC10705vK2 {
    public void h(Canvas canvas, RecyclerView recyclerView) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView) {
    }

    public void f(Rect rect, int i, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        f(rect, ((AK2) view.getLayoutParams()).c(), recyclerView);
    }
}
