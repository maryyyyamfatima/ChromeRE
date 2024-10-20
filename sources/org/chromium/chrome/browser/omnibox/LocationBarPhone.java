package org.chromium.chrome.browser.omnibox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;
import defpackage.AbstractC4159cG1;
import org.chromium.base.TraceEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LocationBarPhone extends AbstractC4159cG1 {
    public View q;
    public View r;
    public View s;

    public LocationBarPhone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.AbstractC4159cG1, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.r = findViewById(R.id.url_bar);
        this.s = findViewById(R.id.location_bar_status);
        Rect rect = new Rect();
        LinearLayout linearLayout = this.o;
        linearLayout.getHitRect(rect);
        rect.left -= 15;
        this.p.a.add(new TouchDelegate(rect, linearLayout));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = false;
        if (view == this.r) {
            LinearLayout linearLayout = this.o;
            if (linearLayout.getVisibility() == 0) {
                canvas.save();
                if (this.r.getLeft() < linearLayout.getLeft()) {
                    canvas.clipRect(0, 0, (int) linearLayout.getX(), getBottom());
                } else {
                    canvas.clipRect(linearLayout.getX() + linearLayout.getWidth(), 0.0f, getWidth(), getBottom());
                }
                z = true;
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // defpackage.AbstractC4159cG1
    public final void d(boolean z) {
        this.q = z ? this.s : this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceEvent i5 = TraceEvent.i("LocationBarPhone.onLayout", null);
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (i5 != null) {
                i5.close();
            }
        } catch (Throwable th) {
            if (i5 != null) {
                try {
                    i5.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC4159cG1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TraceEvent i3 = TraceEvent.i("LocationBarPhone.onMeasure", null);
        try {
            super.onMeasure(i, i2);
            if (i3 != null) {
                i3.close();
            }
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
