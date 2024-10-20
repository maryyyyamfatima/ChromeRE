package org.chromium.components.browser_ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C8586p82;
import defpackage.InterpolatorC0485Dt;
import java.text.NumberFormat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NumberRollView extends FrameLayout {
    public static final C8586p82 l = new C8586p82();
    public TextView a;
    public TextView g;
    public float h;
    public ObjectAnimator i;
    public int j;
    public int k;

    public NumberRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.up);
        this.g = (TextView) findViewById(R.id.down);
        b(this.h);
    }

    public final void a(int i, boolean z) {
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, l, i);
            ofFloat.setInterpolator(InterpolatorC0485Dt.c);
            ofFloat.start();
            this.i = ofFloat;
            return;
        }
        b(i);
    }

    public final void b(float f) {
        String format;
        String format2;
        this.h = f;
        int i = (int) f;
        int i2 = i + 1;
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        if (this.j != 0) {
            if (i2 == 0 && this.k != 0) {
                format = getResources().getString(this.k);
            } else {
                format = getResources().getQuantityString(this.j, i2, Integer.valueOf(i2));
            }
        } else {
            format = integerInstance.format(i2);
        }
        if (!format.equals(this.a.getText().toString())) {
            this.a.setText(format);
        }
        if (this.j != 0) {
            if (i == 0 && this.k != 0) {
                format2 = getResources().getString(this.k);
            } else {
                format2 = getResources().getQuantityString(this.j, i, Integer.valueOf(i));
            }
        } else {
            format2 = integerInstance.format(i);
        }
        if (!format2.equals(this.g.getText().toString())) {
            this.g.setText(format2);
        }
        float f2 = f % 1.0f;
        this.a.setTranslationY((f2 - 1.0f) * r1.getHeight());
        this.g.setTranslationY(r1.getHeight() * f2);
        this.a.setAlpha(f2);
        this.g.setAlpha(1.0f - f2);
    }
}
