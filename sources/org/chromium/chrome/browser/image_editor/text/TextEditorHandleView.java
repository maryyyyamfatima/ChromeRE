package org.chromium.chrome.browser.image_editor.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC2884Wf;
import defpackage.C11996z51;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class TextEditorHandleView extends TextView {
    public static final /* synthetic */ int n = 0;
    public final LayerDrawable a;
    public final LayerDrawable g;
    public final LayerDrawable h;
    public final int i;
    public final int j;
    public C11996z51 k;
    public PointF l;
    public boolean m;

    public TextEditorHandleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = getResources().getDimensionPixelSize(R.dimen.f33730_resource_name_obfuscated_res_0x7f08034b);
        this.j = getResources().getDimensionPixelSize(R.dimen.f33720_resource_name_obfuscated_res_0x7f08034a);
        LayerDrawable layerDrawable = (LayerDrawable) AbstractC2884Wf.a(context, R.drawable.f45630_resource_name_obfuscated_res_0x7f090120);
        this.a = layerDrawable;
        this.g = (LayerDrawable) AbstractC2884Wf.a(context, R.drawable.f45640_resource_name_obfuscated_res_0x7f090121);
        this.h = (LayerDrawable) AbstractC2884Wf.a(context, R.drawable.f45680_resource_name_obfuscated_res_0x7f090125);
        ((VectorDrawable) layerDrawable.findDrawableByLayerId(R.id.icon)).mutate().setTint(getResources().getColor(R.color.f22180_resource_name_obfuscated_res_0x7f07058a));
        this.m = getVisibility() == 0;
    }

    public final void a() {
        setX(this.l.x - (getWidth() / 2));
        setY(this.l.y - (getHeight() / 2));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = !LocalizationUtils.isLayoutRtl();
        int i = this.i;
        int i2 = this.j;
        int width = z ? i2 : (getWidth() - i) - i2;
        int i3 = width + i;
        int width2 = z ? (getWidth() - i) - i2 : i2;
        int i4 = width2 + i;
        int i5 = i2 + i;
        int height = (getHeight() - i) - i2;
        int i6 = i + height;
        LayerDrawable layerDrawable = this.a;
        layerDrawable.setBounds(width, height, i3, i6);
        layerDrawable.draw(canvas);
        LayerDrawable layerDrawable2 = this.g;
        layerDrawable2.setBounds(width2, i2, i4, i5);
        layerDrawable2.draw(canvas);
        LayerDrawable layerDrawable3 = this.h;
        layerDrawable3.setBounds(width2, height, i4, i6);
        layerDrawable3.draw(canvas);
        a();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean d;
        C11996z51 c11996z51 = this.k;
        if (c11996z51 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int b = AbstractC2373Sg3.b(c11996z51.k);
        if (b == 0) {
            if (motionEvent.getAction() == 0) {
                if (c11996z51.e(this, motionEvent)) {
                    d = c11996z51.a(this, motionEvent);
                } else if (!c11996z51.f(this, motionEvent)) {
                    boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
                    int i = c11996z51.g;
                    if (c11996z51.g(motionEvent.getX(), motionEvent.getY(), isLayoutRtl ? 0.0f : getWidth() - i, getHeight() - i)) {
                        d = c11996z51.c(this, motionEvent);
                    } else {
                        d = c11996z51.d(this, motionEvent);
                    }
                } else {
                    d = c11996z51.b(this, motionEvent);
                }
            }
            d = false;
        } else if (b == 1) {
            d = c11996z51.d(this, motionEvent);
        } else if (b == 2) {
            d = c11996z51.c(this, motionEvent);
        } else if (b != 3) {
            if (b == 4) {
                d = c11996z51.b(this, motionEvent);
            }
            d = false;
        } else {
            d = c11996z51.a(this, motionEvent);
        }
        if (d) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
