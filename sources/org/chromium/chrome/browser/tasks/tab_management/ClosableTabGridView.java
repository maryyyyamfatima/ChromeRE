package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClosableTabGridView extends ViewLookupCachingFrameLayout {
    public static WeakReference h;

    public ClosableTabGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) c(R.id.action_button);
        WeakReference weakReference = h;
        if (weakReference == null || weakReference.get() == null) {
            int dimension = (int) getResources().getDimension(R.dimen.f41100_resource_name_obfuscated_res_0x7f08078a);
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5);
            h = new WeakReference(Bitmap.createScaledBitmap(decodeResource, dimension, dimension, true));
            decodeResource.recycle();
        }
        imageView.setImageBitmap((Bitmap) h.get());
    }
}
