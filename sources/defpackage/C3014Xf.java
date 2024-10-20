package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3014Xf extends SeekBar {
    public final C3144Yf a;

    public C3014Xf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f12160_resource_name_obfuscated_res_0x7f0503ed);
        AbstractC3838bK3.a(getContext(), this);
        C3144Yf c3144Yf = new C3144Yf(this);
        this.a = c3144Yf;
        c3144Yf.a(attributeSet, R.attr.f12160_resource_name_obfuscated_res_0x7f0503ed);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.d(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3144Yf c3144Yf = this.a;
        Drawable drawable = c3144Yf.e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c3144Yf.d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
