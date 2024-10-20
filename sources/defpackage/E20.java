package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E20 extends AbstractC7590mF0 {
    public final float o;
    public final ArrayList p;
    public final Rect q;
    public final RectF r;
    public final Rect s;
    public final /* synthetic */ CompositorViewHolder t;

    @Override // defpackage.AbstractC7590mF0
    public final void o(ArrayList arrayList) {
        CompositorViewHolder compositorViewHolder = this.t;
        if (compositorViewHolder.k == null) {
            return;
        }
        ArrayList arrayList2 = this.p;
        arrayList2.clear();
        compositorViewHolder.k.F(arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E20(CompositorViewHolder compositorViewHolder, View view) {
        super(view);
        this.t = compositorViewHolder;
        this.p = new ArrayList();
        this.q = new Rect(0, 0, 1, 1);
        this.r = new RectF();
        this.s = new Rect();
        this.o = compositorViewHolder.getContext().getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.AbstractC7590mF0
    public final int n(float f, float f2) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC7041kf4 interfaceC7041kf4 = (InterfaceC7041kf4) arrayList.get(i);
            float f3 = this.o;
            if (interfaceC7041kf4.c(f / f3, f2 / f3)) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC7590mF0
    public final boolean r(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ((InterfaceC7041kf4) this.p.get(i)).a(SystemClock.uptimeMillis());
        return true;
    }

    @Override // defpackage.AbstractC7590mF0
    public final void s(int i, AccessibilityEvent accessibilityEvent) {
        ArrayList arrayList = this.p;
        if (arrayList == null || arrayList.size() <= i) {
            accessibilityEvent.setContentDescription("");
        } else {
            accessibilityEvent.setContentDescription(((InterfaceC7041kf4) arrayList.get(i)).d());
            accessibilityEvent.setClassName(CompositorViewHolder.class.getName());
        }
    }

    @Override // defpackage.AbstractC7590mF0
    public final void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        ArrayList arrayList = this.p;
        if (arrayList == null || arrayList.size() <= i) {
            accessibilityNodeInfoCompat.l(this.q);
            accessibilityNodeInfoCompat.o("");
            return;
        }
        InterfaceC7041kf4 interfaceC7041kf4 = (InterfaceC7041kf4) arrayList.get(i);
        RectF rectF = this.r;
        interfaceC7041kf4.b(rectF);
        Rect rect = this.s;
        rectF.roundOut(rect);
        float f = rect.left;
        float f2 = this.o;
        rect.left = (int) (f * f2);
        rect.top = (int) (rect.top * f2);
        rect.right = (int) (rect.right * f2);
        rect.bottom = (int) (rect.bottom * f2);
        if (rect.width() == 0) {
            rect.right = rect.left + 1;
        }
        if (rect.height() == 0) {
            rect.bottom = rect.top + 1;
        }
        accessibilityNodeInfoCompat.l(rect);
        accessibilityNodeInfoCompat.o(interfaceC7041kf4.d());
        accessibilityNodeInfoCompat.a(16);
        accessibilityNodeInfoCompat.a(1);
        accessibilityNodeInfoCompat.a(32);
    }
}
