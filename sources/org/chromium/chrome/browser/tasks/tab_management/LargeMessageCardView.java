package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import org.chromium.components.browser_ui.widget.MaterialCardViewNoShadow;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class LargeMessageCardView extends FrameLayout {
    public static WeakReference p;
    public final Context a;
    public final int g;
    public MaterialCardViewNoShadow h;
    public PriceCardView i;
    public ChromeImageView j;
    public TextView k;
    public TextView l;
    public ButtonCompat m;
    public ButtonCompat n;
    public ChromeImageView o;

    public LargeMessageCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        this.g = (int) context.getResources().getDimension(R.dimen.f41220_resource_name_obfuscated_res_0x7f080796);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (MaterialCardViewNoShadow) findViewById(R.id.large_message_card_view);
        this.i = (PriceCardView) findViewById(R.id.price_info_box);
        this.j = (ChromeImageView) findViewById(R.id.icon);
        this.k = (TextView) findViewById(R.id.title);
        this.l = (TextView) findViewById(R.id.description);
        this.m = (ButtonCompat) findViewById(R.id.action_button);
        this.n = (ButtonCompat) findViewById(R.id.secondary_action_button);
        this.o = (ChromeImageView) findViewById(R.id.close_button);
        WeakReference weakReference = p;
        if (weakReference == null || weakReference.get() == null) {
            int dimension = (int) getResources().getDimension(R.dimen.f41100_resource_name_obfuscated_res_0x7f08078a);
            p = new WeakReference(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5), dimension, dimension, true));
        }
        this.o.setImageBitmap((Bitmap) p.get());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a.getResources().getConfiguration().orientation == 1) {
            setPadding(0, 0, 0, 0);
        } else {
            int i3 = this.g;
            setPadding(i3, 0, i3, 0);
        }
        super.onMeasure(i, i2);
    }
}
