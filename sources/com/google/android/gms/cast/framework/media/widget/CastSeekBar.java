package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.chrome.R;
import defpackage.FH;
import defpackage.GH;
import defpackage.JG2;
import defpackage.X5;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CastSeekBar extends View {
    public static final /* synthetic */ int o = 0;
    public final FH a;
    public final ArrayList g;
    public final float h;
    public final float i;
    public final float j;
    public final Paint k;
    public final int l;
    public final int m;
    public final int n;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new ArrayList();
        setAccessibilityDelegate(new GH(this));
        Paint paint = new Paint(1);
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.h = context.getResources().getDimension(R.dimen.f28830_resource_name_obfuscated_res_0x7f0800cc);
        this.i = context.getResources().getDimension(R.dimen.f28820_resource_name_obfuscated_res_0x7f0800cb);
        this.j = context.getResources().getDimension(R.dimen.f28840_resource_name_obfuscated_res_0x7f0800cd) / 2.0f;
        context.getResources().getDimension(R.dimen.f28850_resource_name_obfuscated_res_0x7f0800ce);
        context.getResources().getDimension(R.dimen.f28810_resource_name_obfuscated_res_0x7f0800ca);
        FH fh = new FH();
        this.a = fh;
        fh.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, JG2.z, R.attr.f3860_resource_name_obfuscated_res_0x7f0500af, R.style.f96000_resource_name_obfuscated_res_0x7f1501a3);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.l = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.m = context.getResources().getColor(resourceId3);
        this.n = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.h + getPaddingLeft() + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.i + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        FH fh = this.a;
        fh.getClass();
        int save2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        fh.getClass();
        int max = Math.max(0, 0);
        if (max > 0) {
            a(canvas, 0, max, fh.a, measuredWidth, this.m);
        }
        if (max < 0) {
            a(canvas, max, 0, fh.a, measuredWidth, this.l);
        }
        int i = fh.a;
        if (i > 0) {
            a(canvas, 0, i, i, measuredWidth, this.m);
        }
        canvas.restoreToCount(save2);
        ArrayList arrayList = this.g;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.k.setColor(this.n);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int save3 = canvas.save();
            canvas.translate(0.0f, measuredHeight2 / 2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                X5.a(it.next());
            }
            canvas.restoreToCount(save3);
        }
        isEnabled();
        canvas.restoreToCount(save);
    }

    public final void a(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        Paint paint = this.k;
        paint.setColor(i5);
        float f = i3;
        float f2 = i4;
        float f3 = ((i * 1.0f) / f) * f2;
        float f4 = ((i2 * 1.0f) / f) * f2;
        float f5 = this.j;
        canvas.drawRect(f3, -f5, f4, f5, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.a.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
