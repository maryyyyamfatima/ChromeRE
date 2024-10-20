package org.chromium.chrome.browser.toolbar.top;

import android.content.Context;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewStub;
import com.android.chrome.R;
import defpackage.B80;
import defpackage.DO3;
import defpackage.Ge4;
import defpackage.UN;
import defpackage.ViewOnLayoutChangeListenerC10125te4;
import defpackage.XO3;
import defpackage.YO3;
import org.chromium.base.TraceEvent;
import org.chromium.components.browser_ui.widget.ViewResourceFrameLayout;
import org.chromium.ui.widget.OptimizedFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ToolbarControlContainer extends OptimizedFrameLayout implements B80 {
    public static final /* synthetic */ int k = 0;
    public final float g;
    public DO3 h;
    public ToolbarViewResourceFrameLayout i;
    public XO3 j;

    public ToolbarControlContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807b5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        float translationY = getTranslationY();
        setTranslationY(0.0f);
        int[] iArr = Ge4.a;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        setTranslationY(translationY);
        return true;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class ToolbarViewResourceFrameLayout extends ViewResourceFrameLayout {
        public boolean i;

        public ToolbarViewResourceFrameLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // org.chromium.components.browser_ui.widget.ViewResourceFrameLayout
        public final ViewOnLayoutChangeListenerC10125te4 c() {
            return new YO3(this, Build.VERSION.SDK_INT >= 29 ? UN.V.a() : false);
        }

        @Override // org.chromium.components.browser_ui.widget.ViewResourceFrameLayout
        public final boolean e() {
            return this.i && getVisibility() == 0;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j == null) {
            return false;
        }
        if (!(Float.compare(0.0f, getTranslationY()) == 0 && this.i.getVisibility() == 0)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            if (!(motionEvent.getY() <= this.g)) {
                return true;
            }
        }
        return this.j.a(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!(Float.compare(0.0f, getTranslationY()) == 0 && this.i.getVisibility() == 0)) {
            return true;
        }
        if (this.j != null) {
            if (!(motionEvent.getY() <= this.g)) {
                return this.j.a(motionEvent);
            }
        }
        return false;
    }

    public final void c(int i) {
        TraceEvent i2 = TraceEvent.i("ToolbarControlContainer.initWithToolbar", null);
        try {
            this.i = (ToolbarViewResourceFrameLayout) findViewById(R.id.toolbar_container);
            ViewStub viewStub = (ViewStub) findViewById(R.id.toolbar_stub);
            viewStub.setLayoutResource(i);
            viewStub.inflate();
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
