package org.chromium.chrome.browser.tasks.tab_management;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC2348Sb3;
import defpackage.C9537rv0;
import defpackage.InterfaceC1034Hy3;
import defpackage.InterfaceC1943Oy3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabListRecyclerView extends RecyclerView implements InterfaceC1034Hy3 {
    public static final /* synthetic */ int b1 = 0;
    public final int P0;
    public ValueAnimator Q0;
    public ValueAnimator R0;
    public InterfaceC1943Oy3 S0;
    public C9537rv0 T0;
    public f U0;
    public boolean V0;
    public long W0;
    public ImageView X0;
    public int Y0;
    public h Z0;
    public AbstractC2348Sb3 a1;

    public TabListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P0 = toString().hashCode();
    }

    public final void x0(boolean z) {
        if (this.X0 == null) {
            Context context = getContext();
            this.X0 = new ImageView(context);
            this.X0.setImageDrawable(context.getDrawable(R.drawable.f53880_resource_name_obfuscated_res_0x7f0904ca));
            this.X0.setScaleType(ImageView.ScaleType.FIT_XY);
            this.X0.setTag("TabListViewShadow");
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f42280_resource_name_obfuscated_res_0x7f080801);
            if (getParent() instanceof FrameLayout) {
                this.X0.setLayoutParams(new FrameLayout.LayoutParams(-1, dimensionPixelSize, 48));
                this.X0.setTranslationY(this.Y0);
                ((FrameLayout) getParent()).addView(this.X0);
            } else if (getParent() instanceof RelativeLayout) {
                RelativeLayout relativeLayout = (RelativeLayout) getParent();
                View childAt = relativeLayout.getChildAt(0);
                if (!(childAt instanceof TabGroupUiToolbarView)) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, dimensionPixelSize);
                layoutParams.addRule(3, childAt.getId());
                relativeLayout.addView(this.X0, layoutParams);
            }
        }
        if (z && this.X0.getVisibility() != 0) {
            this.X0.setVisibility(0);
        } else {
            if (z || this.X0.getVisibility() == 8) {
                return;
            }
            this.X0.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        f fVar = this.U0;
        if (fVar != null) {
            fVar.f(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        ViewParent invalidateChildInParent = super.invalidateChildInParent(iArr, rect);
        f fVar = this.U0;
        if (fVar != null) {
            fVar.f(rect);
        }
        return invalidateChildInParent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = new h(this);
        this.Z0 = hVar;
        i(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.X0;
        if (imageView != null) {
            removeViewInLayout(imageView);
            this.X0 = null;
        }
        h hVar = this.Z0;
        if (hVar != null) {
            h0(hVar);
            this.Z0 = null;
        }
    }
}
