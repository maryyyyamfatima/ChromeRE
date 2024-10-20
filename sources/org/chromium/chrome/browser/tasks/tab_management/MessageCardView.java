package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import org.chromium.components.browser_ui.widget.text.TemplatePreservingTextView;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class MessageCardView extends LinearLayout {
    public static WeakReference j;
    public ChromeImageView a;
    public TemplatePreservingTextView g;
    public ButtonCompat h;
    public ChromeImageView i;

    public MessageCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ChromeImageView) findViewById(R.id.icon);
        this.g = (TemplatePreservingTextView) findViewById(R.id.description);
        this.h = (ButtonCompat) findViewById(R.id.action_button);
        this.i = (ChromeImageView) findViewById(R.id.close_button);
        WeakReference weakReference = j;
        if (weakReference == null || weakReference.get() == null) {
            int dimension = (int) getResources().getDimension(R.dimen.f41100_resource_name_obfuscated_res_0x7f08078a);
            j = new WeakReference(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5), dimension, dimension, true));
        }
        this.i.setImageBitmap((Bitmap) j.get());
    }
}
