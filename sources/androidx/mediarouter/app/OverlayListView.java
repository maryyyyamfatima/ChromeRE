package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.AbstractC2277Rn2;
import defpackage.C11758yP1;
import defpackage.C7727mf2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C7727mf2 c7727mf2 = (C7727mf2) it.next();
                BitmapDrawable bitmapDrawable = c7727mf2.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (c7727mf2.l) {
                    z = false;
                } else {
                    float max = c7727mf2.k ? Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - c7727mf2.j)) / ((float) c7727mf2.e))) : 0.0f;
                    Interpolator interpolator = c7727mf2.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i = (int) (c7727mf2.g * interpolation);
                    Rect rect = c7727mf2.f;
                    int i2 = rect.top + i;
                    Rect rect2 = c7727mf2.c;
                    rect2.top = i2;
                    rect2.bottom = rect.bottom + i;
                    float f = c7727mf2.h;
                    float a = AbstractC2277Rn2.a(c7727mf2.i, f, interpolation, f);
                    c7727mf2.b = a;
                    BitmapDrawable bitmapDrawable2 = c7727mf2.a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (a * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (c7727mf2.k && max >= 1.0f) {
                        c7727mf2.l = true;
                        C11758yP1 c11758yP1 = c7727mf2.m;
                        if (c11758yP1 != null) {
                            d dVar = c11758yP1.b;
                            dVar.N.remove(c11758yP1.a);
                            dVar.f11486J.notifyDataSetChanged();
                        }
                    }
                    z = !c7727mf2.l;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
