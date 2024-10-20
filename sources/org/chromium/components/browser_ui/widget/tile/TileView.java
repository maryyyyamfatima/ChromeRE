package org.chromium.components.browser_ui.widget.tile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C6278iR2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TileView extends FrameLayout {
    public ImageView a;
    public TextView g;
    public Runnable h;
    public ImageView i;
    public C6278iR2 j;

    public TileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ImageView) findViewById(R.id.tile_view_icon);
        this.a = (ImageView) findViewById(R.id.offline_badge);
        this.g = (TextView) findViewById(R.id.tile_view_title);
        C6278iR2 c6278iR2 = new C6278iR2(0);
        this.j = c6278iR2;
        this.i.setOutlineProvider(c6278iR2);
        this.i.setClipToOutline(true);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        Runnable runnable;
        super.setSelected(z);
        if (!z || (runnable = this.h) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return super.isFocused() || (isSelected() && !isInTouchMode());
    }
}
