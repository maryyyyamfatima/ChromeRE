package org.chromium.chrome.browser.keyboard_accessory.bar_component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.Ec4;
import defpackage.RunnableC3351Zu1;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.base.Callback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class KeyboardAccessoryModernView extends KeyboardAccessoryView {
    public static final /* synthetic */ int p = 0;
    public ImageView l;
    public TextView m;
    public Callback n;
    public final g o;

    public KeyboardAccessoryModernView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new g(this);
    }

    @Override // org.chromium.chrome.browser.keyboard_accessory.bar_component.KeyboardAccessoryView, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.m = (TextView) findViewById(R.id.sheet_title);
        ImageView imageView = (ImageView) findViewById(R.id.show_keyboard);
        this.l = imageView;
        imageView.setImageDrawable(AbstractC2884Wf.a(getContext(), R.drawable.f46940_resource_name_obfuscated_res_0x7f0901be));
        this.a.g(new h(this, getResources().getDimensionPixelSize(R.dimen.f34440_resource_name_obfuscated_res_0x7f080394)));
        this.a.i(this.o);
        RecyclerView recyclerView = this.a;
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView.setPaddingRelative(0, 0, 0, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RecyclerView recyclerView = this.a;
        Objects.requireNonNull(recyclerView);
        recyclerView.post(new RunnableC3351Zu1(recyclerView));
    }

    @Override // org.chromium.chrome.browser.keyboard_accessory.bar_component.KeyboardAccessoryView
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            RecyclerView recyclerView = this.a;
            Objects.requireNonNull(recyclerView);
            recyclerView.post(new RunnableC3351Zu1(recyclerView));
            if (getVisibility() == 0 || this.j) {
                return;
            }
            int i = getLayoutDirection() == 1 ? 1 : -1;
            float x = this.a.getX();
            float f = x - ((i * 200.0f) * getContext().getResources().getDisplayMetrics().density);
            this.a.setTranslationX(f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationX", f, x);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            ofFloat.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.chrome.browser.keyboard_accessory.bar_component.KeyboardAccessoryView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r4 = this;
            android.view.View r0 = r4.c()
            androidx.recyclerview.widget.RecyclerView r1 = r4.a
            oK2 r2 = r1.r
            if (r0 == 0) goto L3f
            if (r2 != 0) goto Ld
            goto L3f
        Ld:
            int r1 = r1.indexOfChild(r0)
            int r2 = r2.q()
            r3 = 1
            if (r1 >= r2) goto L19
            goto L40
        L19:
            int r1 = r4.getLayoutDirection()
            if (r1 != r3) goto L29
            float r0 = r0.getX()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3f
            goto L40
        L29:
            float r1 = r0.getX()
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r1 = r1 + r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.a
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3f
            goto L40
        L3f:
            r3 = 0
        L40:
            if (r3 == 0) goto L55
            org.chromium.base.Callback r0 = r4.n
            androidx.recyclerview.widget.RecyclerView r1 = r4.a
            android.view.View r2 = r4.c()
            int r1 = r1.indexOfChild(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.onResult(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.keyboard_accessory.bar_component.KeyboardAccessoryModernView.a():void");
    }

    public final View c() {
        for (int childCount = this.a.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.a.getChildAt(childCount);
            if (childAt != null) {
                return childAt;
            }
        }
        return null;
    }
}
